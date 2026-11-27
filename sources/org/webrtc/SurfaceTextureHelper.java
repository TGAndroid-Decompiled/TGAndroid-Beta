package org.webrtc;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.Callable;
import org.webrtc.EglBase;
import org.webrtc.TextureBufferImpl;
import org.webrtc.VideoFrame;
public class SurfaceTextureHelper {
    private static final String TAG = "SurfaceTextureHelper";
    private final EglBase eglBase;
    private final FrameRefMonitor frameRefMonitor;
    private int frameRotation;
    private final Handler handler;
    private boolean hasPendingTexture;
    private boolean isQuitting;
    private volatile boolean isTextureInUse;
    private VideoSink listener;
    private final int oesTextureId;
    private VideoSink pendingListener;
    final Runnable setListenerRunnable;
    private final SurfaceTexture surfaceTexture;
    private int textureHeight;
    private final TextureBufferImpl.RefCountMonitor textureRefCountMonitor;
    private int textureWidth;
    private final TimestampAligner timestampAligner;
    private final YuvConverter yuvConverter;

    public interface FrameRefMonitor {
        void onDestroyBuffer(VideoFrame.TextureBuffer textureBuffer);

        void onNewBuffer(VideoFrame.TextureBuffer textureBuffer);

        void onReleaseBuffer(VideoFrame.TextureBuffer textureBuffer);

        void onRetainBuffer(VideoFrame.TextureBuffer textureBuffer);
    }

    private SurfaceTextureHelper(EglBase.Context context, Handler handler, boolean z, YuvConverter yuvConverter, FrameRefMonitor frameRefMonitor) {
        this.textureRefCountMonitor = new TextureBufferImpl.RefCountMonitor() {
            {
                SurfaceTextureHelper.this = this;
            }

            @Override
            public void onDestroy(TextureBufferImpl textureBufferImpl) {
                SurfaceTextureHelper.this.returnTextureFrame();
                if (SurfaceTextureHelper.this.frameRefMonitor != null) {
                    SurfaceTextureHelper.this.frameRefMonitor.onDestroyBuffer(textureBufferImpl);
                }
            }

            @Override
            public void onRelease(TextureBufferImpl textureBufferImpl) {
                if (SurfaceTextureHelper.this.frameRefMonitor != null) {
                    SurfaceTextureHelper.this.frameRefMonitor.onReleaseBuffer(textureBufferImpl);
                }
            }

            @Override
            public void onRetain(TextureBufferImpl textureBufferImpl) {
                if (SurfaceTextureHelper.this.frameRefMonitor != null) {
                    SurfaceTextureHelper.this.frameRefMonitor.onRetainBuffer(textureBufferImpl);
                }
            }
        };
        this.setListenerRunnable = new Runnable() {
            {
                SurfaceTextureHelper.this = this;
            }

            @Override
            public void run() {
                Logging.d("SurfaceTextureHelper", "Setting listener to " + SurfaceTextureHelper.this.pendingListener);
                SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                surfaceTextureHelper.listener = surfaceTextureHelper.pendingListener;
                SurfaceTextureHelper.this.pendingListener = null;
                if (SurfaceTextureHelper.this.hasPendingTexture) {
                    SurfaceTextureHelper.this.updateTexImage();
                    SurfaceTextureHelper.this.hasPendingTexture = false;
                }
            }
        };
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            this.handler = handler;
            this.timestampAligner = z ? new TimestampAligner() : null;
            this.yuvConverter = yuvConverter;
            this.frameRefMonitor = frameRefMonitor;
            EglBase a = c.a(context, EglBase.CONFIG_PIXEL_BUFFER);
            this.eglBase = a;
            try {
                a.createDummyPbufferSurface();
                a.makeCurrent();
                int generateTexture = GlUtil.generateTexture(36197);
                this.oesTextureId = generateTexture;
                SurfaceTexture surfaceTexture = new SurfaceTexture(generateTexture);
                this.surfaceTexture = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(new pa1(this, (byte) 3), handler);
                return;
            } catch (RuntimeException e) {
                this.eglBase.release();
                handler.getLooper().quit();
                throw e;
            }
        }
        grb.i("SurfaceTextureHelper must be created on the handler thread");
        throw null;
    }

    public static SurfaceTextureHelper create(final String str, final EglBase.Context context, final boolean z, final YuvConverter yuvConverter, final FrameRefMonitor frameRefMonitor) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final Handler handler = new Handler(handlerThread.getLooper());
        return (SurfaceTextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<SurfaceTextureHelper>() {
            @Override
            public SurfaceTextureHelper call() {
                try {
                    return new SurfaceTextureHelper(context, handler, z, yuvConverter, frameRefMonitor, 0);
                } catch (RuntimeException e) {
                    Logging.e("SurfaceTextureHelper", str + " create failure", e);
                    return null;
                }
            }
        });
    }

    public void lambda$dispose$6() {
        this.isQuitting = true;
        if (!this.isTextureInUse) {
            release();
        }
    }

    public void lambda$forceFrame$3() {
        this.hasPendingTexture = true;
        tryDeliverTextureFrame();
    }

    public void lambda$new$0(SurfaceTexture surfaceTexture) {
        if (this.hasPendingTexture) {
            Logging.d("SurfaceTextureHelper", "A frame is already pending, dropping frame.");
        }
        this.hasPendingTexture = true;
        tryDeliverTextureFrame();
    }

    public void lambda$returnTextureFrame$5() {
        this.isTextureInUse = false;
        if (this.isQuitting) {
            release();
        } else {
            tryDeliverTextureFrame();
        }
    }

    public void lambda$setFrameRotation$4(int i) {
        this.frameRotation = i;
    }

    public void lambda$setTextureSize$2(int i, int i2) {
        this.textureWidth = i;
        this.textureHeight = i2;
        tryDeliverTextureFrame();
    }

    public void lambda$stopListening$1() {
        this.listener = null;
        this.pendingListener = null;
    }

    private void release() {
        if (this.handler.getLooper().getThread() == Thread.currentThread()) {
            if (!this.isTextureInUse && this.isQuitting) {
                this.yuvConverter.release();
                GLES20.glDeleteTextures(1, new int[]{this.oesTextureId}, 0);
                this.surfaceTexture.release();
                this.eglBase.release();
                this.handler.getLooper().quit();
                TimestampAligner timestampAligner = this.timestampAligner;
                if (timestampAligner != null) {
                    timestampAligner.dispose();
                    return;
                }
                return;
            }
            grb.i("Unexpected release.");
            return;
        }
        grb.i("Wrong thread.");
    }

    public void returnTextureFrame() {
        this.handler.post(new xfb(this, (byte) 2));
    }

    private void tryDeliverTextureFrame() {
        if (this.handler.getLooper().getThread() == Thread.currentThread()) {
            if (!this.isQuitting && this.hasPendingTexture && !this.isTextureInUse && this.listener != null) {
                if (this.textureWidth != 0 && this.textureHeight != 0) {
                    this.isTextureInUse = true;
                    this.hasPendingTexture = false;
                    updateTexImage();
                    float[] fArr = new float[16];
                    this.surfaceTexture.getTransformMatrix(fArr);
                    long timestamp = this.surfaceTexture.getTimestamp();
                    TimestampAligner timestampAligner = this.timestampAligner;
                    if (timestampAligner != null) {
                        timestamp = timestampAligner.translateTimestamp(timestamp);
                    }
                    TextureBufferImpl textureBufferImpl = new TextureBufferImpl(this.textureWidth, this.textureHeight, VideoFrame.TextureBuffer.Type.OES, this.oesTextureId, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), this.handler, this.yuvConverter, this.textureRefCountMonitor);
                    FrameRefMonitor frameRefMonitor = this.frameRefMonitor;
                    if (frameRefMonitor != null) {
                        frameRefMonitor.onNewBuffer(textureBufferImpl);
                    }
                    VideoFrame videoFrame = new VideoFrame(textureBufferImpl, this.frameRotation, timestamp);
                    this.listener.onFrame(videoFrame);
                    videoFrame.release();
                    return;
                }
                Logging.w("SurfaceTextureHelper", "Texture size has not been set.");
                return;
            }
            return;
        }
        grb.i("Wrong thread.");
    }

    public void updateTexImage() {
        synchronized (EglBase.lock) {
            try {
                this.surfaceTexture.updateTexImage();
            } catch (RuntimeException e) {
                Logging.e("SurfaceTextureHelper", "updateTexImage failed", e);
            }
        }
    }

    public void dispose() {
        Logging.d("SurfaceTextureHelper", "dispose()");
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new xfb(this, (byte) 1));
    }

    public void forceFrame() {
        this.handler.post(new xfb(this, (byte) 3));
    }

    public Handler getHandler() {
        return this.handler;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.surfaceTexture;
    }

    public boolean isTextureInUse() {
        return this.isTextureInUse;
    }

    public void setFrameRotation(int i) {
        this.handler.post(new oe7(this, i, (byte) 22));
    }

    public void setTextureSize(int i, int i2) {
        if (i > 0) {
            if (i2 > 0) {
                this.surfaceTexture.setDefaultBufferSize(i, i2);
                this.handler.post(new bt(this, i, i2, (byte) 14));
                return;
            }
            lq5.j(uh9.k(i2, "Texture height must be positive, but was "));
            return;
        }
        lq5.j(uh9.k(i, "Texture width must be positive, but was "));
    }

    public void startListening(VideoSink videoSink) {
        if (this.listener == null && this.pendingListener == null) {
            this.pendingListener = videoSink;
            this.handler.post(this.setListenerRunnable);
            return;
        }
        grb.i("SurfaceTextureHelper listener has already been set.");
    }

    public void stopListening() {
        Logging.d("SurfaceTextureHelper", "stopListening()");
        this.handler.removeCallbacks(this.setListenerRunnable);
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new xfb(this, (byte) 0));
    }

    @Deprecated
    public VideoFrame.I420Buffer textureToYuv(VideoFrame.TextureBuffer textureBuffer) {
        return textureBuffer.toI420();
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context) {
        return create(str, context, false, new YuvConverter(), null);
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context, boolean z) {
        return create(str, context, z, new YuvConverter(), null);
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context, boolean z, YuvConverter yuvConverter) {
        return create(str, context, z, yuvConverter, null);
    }

    public SurfaceTextureHelper(EglBase.Context context, Handler handler, boolean z, YuvConverter yuvConverter, FrameRefMonitor frameRefMonitor, int i) {
        this(context, handler, z, yuvConverter, frameRefMonitor);
    }
}
