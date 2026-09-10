package org.webrtc;

import android.os.Handler;
import android.os.HandlerThread;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Components.sx0;
import org.webrtc.EglBase;
import org.webrtc.VideoFrame;
public class VideoFileRenderer implements VideoSink {
    private static final String TAG = "VideoFileRenderer";
    private EglBase eglBase;
    private final HandlerThread fileThread;
    private final Handler fileThreadHandler;
    private int frameCount;
    private final int outputFileHeight;
    private final String outputFileName;
    private final int outputFileWidth;
    private final ByteBuffer outputFrameBuffer;
    private final int outputFrameSize;
    private final HandlerThread renderThread;
    private final Handler renderThreadHandler;
    private final FileOutputStream videoOutFile;
    private YuvConverter yuvConverter;

    public VideoFileRenderer(String str, int i10, int i11, final EglBase.Context context) {
        if (i10 % 2 != 1 && i11 % 2 != 1) {
            this.outputFileName = str;
            this.outputFileWidth = i10;
            this.outputFileHeight = i11;
            int i12 = ((i10 * i11) * 3) / 2;
            this.outputFrameSize = i12;
            this.outputFrameBuffer = ByteBuffer.allocateDirect(i12);
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            this.videoOutFile = fileOutputStream;
            fileOutputStream.write(("YUV4MPEG2 C420 W" + i10 + " H" + i11 + " Ip F30:1 A1:1\n").getBytes(Charset.forName("US-ASCII")));
            HandlerThread handlerThread = new HandlerThread("VideoFileRendererRenderThread");
            this.renderThread = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            this.renderThreadHandler = handler;
            HandlerThread handlerThread2 = new HandlerThread("VideoFileRendererFileThread");
            this.fileThread = handlerThread2;
            handlerThread2.start();
            this.fileThreadHandler = new Handler(handlerThread2.getLooper());
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() {
                {
                    VideoFileRenderer.this = this;
                }

                @Override
                public void run() {
                    VideoFileRenderer.this.eglBase = e.d(context, EglBase.CONFIG_PIXEL_BUFFER);
                    VideoFileRenderer.this.eglBase.createDummyPbufferSurface();
                    VideoFileRenderer.this.eglBase.makeCurrent();
                    VideoFileRenderer.this.yuvConverter = new YuvConverter();
                }
            });
            return;
        }
        throw new IllegalArgumentException("Does not support uneven width or height");
    }

    public void lambda$release$2(CountDownLatch countDownLatch) {
        this.yuvConverter.release();
        this.eglBase.release();
        this.renderThread.quit();
        countDownLatch.countDown();
    }

    public void lambda$release$3() {
        try {
            this.videoOutFile.close();
            Logging.d("VideoFileRenderer", "Video written to disk as " + this.outputFileName + ". The number of frames is " + this.frameCount + " and the dimensions of the frames are " + this.outputFileWidth + "x" + this.outputFileHeight + ".");
            this.fileThread.quit();
        } catch (IOException e) {
            throw new RuntimeException("Error closing output file", e);
        }
    }

    public void lambda$renderFrameOnRenderThread$1(VideoFrame.I420Buffer i420Buffer, VideoFrame videoFrame) {
        YuvHelper.I420Rotate(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), this.outputFrameBuffer, i420Buffer.getWidth(), i420Buffer.getHeight(), videoFrame.getRotation());
        i420Buffer.release();
        try {
            this.videoOutFile.write("FRAME\n".getBytes(Charset.forName("US-ASCII")));
            this.videoOutFile.write(this.outputFrameBuffer.array(), this.outputFrameBuffer.arrayOffset(), this.outputFrameSize);
            this.frameCount++;
        } catch (IOException e) {
            throw new RuntimeException("Error writing video to disk", e);
        }
    }

    public void lambda$onFrame$0(VideoFrame videoFrame) {
        int i10;
        int i11;
        VideoFrame.Buffer buffer = videoFrame.getBuffer();
        if (videoFrame.getRotation() % 180 == 0) {
            i10 = this.outputFileWidth;
        } else {
            i10 = this.outputFileHeight;
        }
        int i12 = i10;
        if (videoFrame.getRotation() % 180 == 0) {
            i11 = this.outputFileHeight;
        } else {
            i11 = this.outputFileWidth;
        }
        int i13 = i11;
        float width = buffer.getWidth() / buffer.getHeight();
        float f7 = i12 / i13;
        int width2 = buffer.getWidth();
        int height = buffer.getHeight();
        if (f7 > width) {
            height = (int) ((width / f7) * height);
        } else {
            width2 = (int) ((f7 / width) * width2);
        }
        VideoFrame.Buffer cropAndScale = buffer.cropAndScale((buffer.getWidth() - width2) / 2, (buffer.getHeight() - height) / 2, width2, height, i12, i13);
        videoFrame.release();
        VideoFrame.I420Buffer i420 = cropAndScale.toI420();
        cropAndScale.release();
        this.fileThreadHandler.post(new sx0(this, i420, videoFrame, 15));
    }

    @Override
    public void onFrame(VideoFrame videoFrame) {
        videoFrame.retain();
        this.renderThreadHandler.post(new s(4, this, videoFrame));
    }

    public void release() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.renderThreadHandler.post(new s(5, this, countDownLatch));
        ThreadUtils.awaitUninterruptibly(countDownLatch);
        this.fileThreadHandler.post(new h(this, 3));
        try {
            this.fileThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            Logging.e("VideoFileRenderer", "Interrupted while waiting for the write to disk to complete.", e);
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        e0.a(this, videoSink);
    }
}
