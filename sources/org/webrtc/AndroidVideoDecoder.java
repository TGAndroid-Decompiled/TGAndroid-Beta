package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.view.Surface;
import j3.r0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.FileLog;
import org.webrtc.EglBase;
import org.webrtc.EncodedImage;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoFrame;
class AndroidVideoDecoder implements VideoDecoder, VideoSink {
    private static final int DEQUEUE_INPUT_TIMEOUT_US = 500000;
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final String TAG = "AndroidVideoDecoder";
    private VideoDecoder.Callback callback;
    private MediaCodecWrapper codec;
    private final String codecName;
    private final VideoCodecMimeType codecType;
    private int colorFormat;
    private ThreadUtils.ThreadChecker decoderThreadChecker;
    private final BlockingDeque<FrameInfo> frameInfos;
    private boolean hasDecodedFirstFrame;
    private int height;
    private boolean keyFrameRequired;
    private final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    private Thread outputThread;
    private ThreadUtils.ThreadChecker outputThreadChecker;
    private DecodedTextureMetadata renderedTextureMetadata;
    private volatile boolean running;
    private final EglBase.Context sharedContext;
    private volatile Exception shutdownException;
    private int sliceHeight;
    private int stride;
    private Surface surface;
    private SurfaceTextureHelper surfaceTextureHelper;
    private int width;
    private final Object dimensionLock = new Object();
    private final Object renderedTextureMetadataLock = new Object();

    public static class DecodedTextureMetadata {
        final Integer decodeTimeMs;
        final long presentationTimestampUs;

        public DecodedTextureMetadata(long j10, Integer num) {
            this.presentationTimestampUs = j10;
            this.decodeTimeMs = num;
        }
    }

    public static class FrameInfo {
        final long decodeStartTimeMs;
        final int rotation;

        public FrameInfo(long j10, int i9) {
            this.decodeStartTimeMs = j10;
            this.rotation = i9;
        }
    }

    public AndroidVideoDecoder(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, VideoCodecMimeType videoCodecMimeType, int i9, EglBase.Context context) {
        if (isSupportedColorFormat(i9)) {
            Logging.d("AndroidVideoDecoder", "ctor name: " + str + " type: " + videoCodecMimeType + " color format: " + i9 + " context: " + context);
            this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
            this.codecName = str;
            this.codecType = videoCodecMimeType;
            this.colorFormat = i9;
            this.sharedContext = context;
            this.frameInfos = new LinkedBlockingDeque();
            return;
        }
        throw new IllegalArgumentException(r0.l(i9, "Unsupported color format: "));
    }

    private VideoFrame.Buffer copyI420Buffer(ByteBuffer byteBuffer, int i9, int i10, int i11, int i12) {
        int i13;
        if (i9 % 2 == 0) {
            int i14 = (i11 + 1) / 2;
            if (i10 % 2 == 0) {
                i13 = (i12 + 1) / 2;
            } else {
                i13 = i12 / 2;
            }
            int i15 = i13;
            int i16 = i9 / 2;
            int i17 = i9 * i12;
            int i18 = i9 * i10;
            int i19 = i16 * i15;
            int i20 = i18 + i19;
            int i21 = ((i16 * i10) / 2) + i18;
            int i22 = i21 + i19;
            VideoFrame.I420Buffer allocateI420Buffer = allocateI420Buffer(i11, i12);
            try {
                byteBuffer.limit(i17);
                byteBuffer.position(0);
                copyPlane(byteBuffer.slice(), i9, allocateI420Buffer.getDataY(), allocateI420Buffer.getStrideY(), i11, i12);
                byteBuffer.limit(i20);
                byteBuffer.position(i18);
                copyPlane(byteBuffer.slice(), i16, allocateI420Buffer.getDataU(), allocateI420Buffer.getStrideU(), i14, i15);
                if (i10 % 2 == 1) {
                    byteBuffer.position(((i15 - 1) * i16) + i18);
                    ByteBuffer dataU = allocateI420Buffer.getDataU();
                    dataU.position(allocateI420Buffer.getStrideU() * i15);
                    dataU.put(byteBuffer);
                }
                byteBuffer.limit(i22);
                byteBuffer.position(i21);
                copyPlane(byteBuffer.slice(), i16, allocateI420Buffer.getDataV(), allocateI420Buffer.getStrideV(), i14, i15);
                if (i10 % 2 == 1) {
                    byteBuffer.position(((i15 - 1) * i16) + i21);
                    ByteBuffer dataV = allocateI420Buffer.getDataV();
                    dataV.position(allocateI420Buffer.getStrideV() * i15);
                    dataV.put(byteBuffer);
                }
                return allocateI420Buffer;
            } catch (Throwable th) {
                FileLog.e(th);
                return allocateI420Buffer;
            }
        }
        throw new AssertionError(r0.l(i9, "Stride is not divisible by two: "));
    }

    private VideoFrame.Buffer copyNV12ToI420Buffer(ByteBuffer byteBuffer, int i9, int i10, int i11, int i12) {
        return new NV12Buffer(i11, i12, i9, i10, byteBuffer, null).toI420();
    }

    private Thread createOutputThread() {
        return new Thread("AndroidVideoDecoder.outputThread") {
            @Override
            public void run() {
                AndroidVideoDecoder.this.outputThreadChecker = new ThreadUtils.ThreadChecker();
                while (AndroidVideoDecoder.this.running) {
                    AndroidVideoDecoder.this.deliverDecodedFrame();
                }
                AndroidVideoDecoder.this.releaseCodecOnOutputThread();
            }
        };
    }

    private void deliverByteFrame(int i9, MediaCodec.BufferInfo bufferInfo, int i10, Integer num) {
        int i11;
        int i12;
        int i13;
        int i14;
        AndroidVideoDecoder androidVideoDecoder;
        VideoFrame.Buffer copyNV12ToI420Buffer;
        synchronized (this.dimensionLock) {
            try {
                i11 = this.width;
                i12 = this.height;
                i13 = this.stride;
                i14 = this.sliceHeight;
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        break;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                throw th;
            }
        }
        int i15 = bufferInfo.size;
        if (i15 < ((i11 * i12) * 3) / 2) {
            Logging.e("AndroidVideoDecoder", "Insufficient output buffer size: " + bufferInfo.size);
            return;
        }
        if (i15 < ((i13 * i12) * 3) / 2 && i14 == i12 && i13 > i11) {
            i13 = (i15 * 2) / (i12 * 3);
        }
        int i16 = i13;
        ByteBuffer outputBuffer = this.codec.getOutputBuffer(i9);
        outputBuffer.position(bufferInfo.offset);
        outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
        ByteBuffer slice = outputBuffer.slice();
        if (this.colorFormat == 19) {
            androidVideoDecoder = this;
            copyNV12ToI420Buffer = androidVideoDecoder.copyI420Buffer(slice, i16, i14, i11, i12);
        } else {
            androidVideoDecoder = this;
            copyNV12ToI420Buffer = androidVideoDecoder.copyNV12ToI420Buffer(slice, i16, i14, i11, i12);
        }
        androidVideoDecoder.codec.releaseOutputBuffer(i9, false);
        VideoFrame videoFrame = new VideoFrame(copyNV12ToI420Buffer, i10, bufferInfo.presentationTimeUs * 1000);
        androidVideoDecoder.callback.onDecodedFrame(videoFrame, num, null);
        videoFrame.release();
    }

    private void deliverTextureFrame(int i9, MediaCodec.BufferInfo bufferInfo, int i10, Integer num) {
        int i11;
        int i12;
        synchronized (this.dimensionLock) {
            i11 = this.width;
            i12 = this.height;
        }
        synchronized (this.renderedTextureMetadataLock) {
            try {
                if (this.renderedTextureMetadata != null) {
                    this.codec.releaseOutputBuffer(i9, false);
                    return;
                }
                this.surfaceTextureHelper.setTextureSize(i11, i12);
                this.surfaceTextureHelper.setFrameRotation(i10);
                this.renderedTextureMetadata = new DecodedTextureMetadata(bufferInfo.presentationTimeUs, num);
                this.codec.releaseOutputBuffer(i9, true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private VideoCodecStatus initDecodeInternal(int i9, int i10) {
        this.decoderThreadChecker.checkIsOnValidThread();
        Logging.d("AndroidVideoDecoder", "initDecodeInternal name: " + this.codecName + " type: " + this.codecType + " width: " + i9 + " height: " + i10 + " color format: " + this.colorFormat);
        if (this.outputThread != null) {
            Logging.e("AndroidVideoDecoder", "initDecodeInternal called while the codec is already running");
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
        this.width = i9;
        this.height = i10;
        this.stride = i9;
        this.sliceHeight = i10;
        this.hasDecodedFirstFrame = false;
        this.keyFrameRequired = true;
        try {
            this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
            try {
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.codecType.mimeType(), i9, i10);
                if (this.sharedContext == null) {
                    createVideoFormat.setInteger("color-format", this.colorFormat);
                }
                this.codec.configure(createVideoFormat, this.surface, null, 0);
                this.codec.start();
                this.running = true;
                Thread createOutputThread = createOutputThread();
                this.outputThread = createOutputThread;
                createOutputThread.start();
                Logging.d("AndroidVideoDecoder", "initDecodeInternal done");
                return VideoCodecStatus.OK;
            } catch (IllegalArgumentException e10) {
                e = e10;
                Logging.e("AndroidVideoDecoder", "initDecode failed", e);
                release();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            } catch (IllegalStateException e11) {
                e = e11;
                Logging.e("AndroidVideoDecoder", "initDecode failed", e);
                release();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (IOException | IllegalArgumentException | IllegalStateException unused) {
            Logging.e("AndroidVideoDecoder", "Cannot create media decoder " + this.codecName);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private boolean isSupportedColorFormat(int i9) {
        for (int i10 : MediaCodecUtils.DECODER_COLOR_FORMATS) {
            if (i10 == i9) {
                return true;
            }
        }
        return false;
    }

    private void reformat(android.media.MediaFormat r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.AndroidVideoDecoder.reformat(android.media.MediaFormat):void");
    }

    private VideoCodecStatus reinitDecode(int i9, int i10) {
        this.decoderThreadChecker.checkIsOnValidThread();
        VideoCodecStatus releaseInternal = releaseInternal();
        if (releaseInternal != VideoCodecStatus.OK) {
            return releaseInternal;
        }
        return initDecodeInternal(i9, i10);
    }

    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.d("AndroidVideoDecoder", "Releasing MediaCodec on output thread");
        try {
            this.codec.stop();
        } catch (Exception e10) {
            Logging.e("AndroidVideoDecoder", "Media decoder stop failed", e10);
        }
        try {
            this.codec.release();
        } catch (Exception e11) {
            Logging.e("AndroidVideoDecoder", "Media decoder release failed", e11);
            this.shutdownException = e11;
        }
        Logging.d("AndroidVideoDecoder", "Release on output thread done");
    }

    private VideoCodecStatus releaseInternal() {
        if (!this.running) {
            Logging.d("AndroidVideoDecoder", "release: Decoder is not running.");
            return VideoCodecStatus.OK;
        }
        try {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, 5000L)) {
                Logging.e("AndroidVideoDecoder", "Media decoder release timeout", new RuntimeException());
                return VideoCodecStatus.TIMEOUT;
            } else if (this.shutdownException != null) {
                Logging.e("AndroidVideoDecoder", "Media decoder release error", new RuntimeException(this.shutdownException));
                this.shutdownException = null;
                return VideoCodecStatus.ERROR;
            } else {
                this.codec = null;
                this.outputThread = null;
                return VideoCodecStatus.OK;
            }
        } finally {
            this.codec = null;
            this.outputThread = null;
        }
    }

    private void stopOnOutputThread(Exception exc) {
        this.outputThreadChecker.checkIsOnValidThread();
        this.running = false;
        this.shutdownException = exc;
    }

    public VideoFrame.I420Buffer allocateI420Buffer(int i9, int i10) {
        return JavaI420Buffer.allocate(i9, i10);
    }

    public void copyPlane(ByteBuffer byteBuffer, int i9, ByteBuffer byteBuffer2, int i10, int i11, int i12) {
        YuvHelper.copyPlane(byteBuffer, i9, byteBuffer2, i10, i11, i12);
    }

    @Override
    public final long createNative(long j10) {
        return u.a(this, j10);
    }

    public SurfaceTextureHelper createSurfaceTextureHelper() {
        return SurfaceTextureHelper.create("decoder-texture-thread", this.sharedContext);
    }

    @Override
    public VideoCodecStatus decode(EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo) {
        int i9;
        int i10;
        VideoCodecStatus reinitDecode;
        this.decoderThreadChecker.checkIsOnValidThread();
        boolean z10 = false;
        if (this.codec != null && this.callback != null) {
            ByteBuffer byteBuffer = encodedImage.buffer;
            if (byteBuffer == null) {
                Logging.e("AndroidVideoDecoder", "decode() - no input data");
                return VideoCodecStatus.ERR_PARAMETER;
            }
            int remaining = byteBuffer.remaining();
            if (remaining == 0) {
                Logging.e("AndroidVideoDecoder", "decode() - input buffer empty");
                return VideoCodecStatus.ERR_PARAMETER;
            }
            synchronized (this.dimensionLock) {
                i9 = this.width;
                i10 = this.height;
            }
            int i11 = encodedImage.encodedWidth;
            int i12 = encodedImage.encodedHeight;
            if (i11 * i12 > 0 && ((i11 != i9 || i12 != i10) && (reinitDecode = reinitDecode(i11, i12)) != VideoCodecStatus.OK)) {
                return reinitDecode;
            }
            if (this.keyFrameRequired && encodedImage.frameType != EncodedImage.FrameType.VideoFrameKey) {
                Logging.e("AndroidVideoDecoder", "decode() - key frame required first");
                return VideoCodecStatus.NO_OUTPUT;
            }
            try {
                int dequeueInputBuffer = this.codec.dequeueInputBuffer(500000L);
                if (dequeueInputBuffer < 0) {
                    Logging.e("AndroidVideoDecoder", "decode() - no HW buffers available; decoder falling behind");
                    return VideoCodecStatus.ERROR;
                }
                try {
                    ByteBuffer inputBuffer = this.codec.getInputBuffer(dequeueInputBuffer);
                    if (inputBuffer.capacity() < remaining) {
                        Logging.e("AndroidVideoDecoder", "decode() - HW buffer too small");
                        return VideoCodecStatus.ERROR;
                    }
                    inputBuffer.put(encodedImage.buffer);
                    this.frameInfos.offer(new FrameInfo(SystemClock.elapsedRealtime(), encodedImage.rotation));
                    try {
                        this.codec.queueInputBuffer(dequeueInputBuffer, 0, remaining, TimeUnit.NANOSECONDS.toMicros(encodedImage.captureTimeNs), 0);
                        if (this.keyFrameRequired) {
                            this.keyFrameRequired = false;
                        }
                        return VideoCodecStatus.OK;
                    } catch (IllegalStateException e10) {
                        Logging.e("AndroidVideoDecoder", "queueInputBuffer failed", e10);
                        this.frameInfos.pollLast();
                        return VideoCodecStatus.ERROR;
                    }
                } catch (IllegalStateException e11) {
                    Logging.e("AndroidVideoDecoder", "getInputBuffer with index=" + dequeueInputBuffer + " failed", e11);
                    return VideoCodecStatus.ERROR;
                }
            } catch (IllegalStateException e12) {
                Logging.e("AndroidVideoDecoder", "dequeueInputBuffer failed", e12);
                return VideoCodecStatus.ERROR;
            }
        }
        StringBuilder sb2 = new StringBuilder("decode uninitalized, codec: ");
        if (this.codec != null) {
            z10 = true;
        }
        sb2.append(z10);
        sb2.append(", callback: ");
        sb2.append(this.callback);
        Logging.d("AndroidVideoDecoder", sb2.toString());
        return VideoCodecStatus.UNINITIALIZED;
    }

    public void deliverDecodedFrame() {
        Integer num;
        int i9;
        this.outputThreadChecker.checkIsOnValidThread();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 100000L);
            if (dequeueOutputBuffer == -2) {
                reformat(this.codec.getOutputFormat());
            } else if (dequeueOutputBuffer < 0) {
                Logging.v("AndroidVideoDecoder", "dequeueOutputBuffer returned " + dequeueOutputBuffer);
            } else {
                FrameInfo poll = this.frameInfos.poll();
                if (poll != null) {
                    num = Integer.valueOf((int) (SystemClock.elapsedRealtime() - poll.decodeStartTimeMs));
                    i9 = poll.rotation;
                } else {
                    num = null;
                    i9 = 0;
                }
                this.hasDecodedFirstFrame = true;
                if (this.surfaceTextureHelper != null) {
                    deliverTextureFrame(dequeueOutputBuffer, bufferInfo, i9, num);
                } else {
                    deliverByteFrame(dequeueOutputBuffer, bufferInfo, i9, num);
                }
            }
        } catch (IllegalStateException e10) {
            Logging.e("AndroidVideoDecoder", "deliverDecodedFrame failed", e10);
        }
    }

    @Override
    public String getImplementationName() {
        return this.codecName;
    }

    @Override
    public VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback) {
        this.decoderThreadChecker = new ThreadUtils.ThreadChecker();
        this.callback = callback;
        if (this.sharedContext != null) {
            this.surfaceTextureHelper = createSurfaceTextureHelper();
            this.surface = new Surface(this.surfaceTextureHelper.getSurfaceTexture());
            this.surfaceTextureHelper.startListening(this);
        }
        return initDecodeInternal(settings.width, settings.height);
    }

    @Override
    public void onFrame(VideoFrame videoFrame) {
        long j10;
        Integer num;
        synchronized (this.renderedTextureMetadataLock) {
            DecodedTextureMetadata decodedTextureMetadata = this.renderedTextureMetadata;
            if (decodedTextureMetadata != null) {
                j10 = decodedTextureMetadata.presentationTimestampUs * 1000;
                num = decodedTextureMetadata.decodeTimeMs;
                this.renderedTextureMetadata = null;
            } else {
                throw new IllegalStateException("Rendered texture metadata was null in onTextureFrameAvailable.");
            }
        }
        this.callback.onDecodedFrame(new VideoFrame(videoFrame.getBuffer(), videoFrame.getRotation(), j10), num, null);
    }

    @Override
    public VideoCodecStatus release() {
        Logging.d("AndroidVideoDecoder", "release");
        VideoCodecStatus releaseInternal = releaseInternal();
        if (this.surface != null) {
            releaseSurface();
            this.surface = null;
            this.surfaceTextureHelper.stopListening();
            this.surfaceTextureHelper.dispose();
            this.surfaceTextureHelper = null;
        }
        synchronized (this.renderedTextureMetadataLock) {
            this.renderedTextureMetadata = null;
        }
        this.callback = null;
        this.frameInfos.clear();
        return releaseInternal;
    }

    public void releaseSurface() {
        this.surface.release();
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        e0.a(this, videoSink);
    }
}
