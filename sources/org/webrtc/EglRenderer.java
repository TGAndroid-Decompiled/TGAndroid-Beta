package org.webrtc;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.cm0;
import org.webrtc.EglBase;
import org.webrtc.GlGenericDrawer;
import org.webrtc.GlUtil;
import org.webrtc.RendererCommon;
public class EglRenderer implements VideoSink {
    private static final long LOG_INTERVAL_SEC = 4;
    private static final String TAG = "EglRenderer";
    private final GlTextureFrameBuffer bitmapTextureFramebuffer;
    private final Matrix drawMatrix;
    private RendererCommon.GlDrawer drawer;
    private EglBase eglBase;
    private final EglSurfaceCreation eglSurfaceBackgroundCreationRunnable;
    private final EglSurfaceCreation eglSurfaceCreationRunnable;
    private volatile ErrorCallback errorCallback;
    public boolean firstFrameRendered;
    private final Object fpsReductionLock;
    private final VideoFrameDrawer frameDrawer;
    private final ArrayList<FrameListenerAndParams> frameListeners;
    private final Object frameLock;
    private int framesDropped;
    private int framesReceived;
    private int framesRendered;
    private final Object handlerLock;
    private float layoutAspectRatio;
    private final Object layoutLock;
    private long minRenderPeriodNs;
    private boolean mirrorHorizontally;
    private boolean mirrorVertically;
    protected final String name;
    private long nextFrameTimeNs;
    private VideoFrame pendingFrame;
    private long renderSwapBufferTimeNs;
    private Handler renderThreadHandler;
    private long renderTimeNs;
    private int rotation;
    private boolean usePresentationTimeStamp;

    public class EglSurfaceCreation implements Runnable {
        private final boolean background;
        private Object surface;

        public EglSurfaceCreation(boolean z10) {
            EglRenderer.this = r1;
            this.background = z10;
        }

        @Override
        public synchronized void run() {
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.EglRenderer.EglSurfaceCreation.run():void");
        }

        public synchronized void setSurface(Object obj) {
            this.surface = obj;
        }
    }

    public interface ErrorCallback {
        void onGlOutOfMemory();
    }

    public interface FrameListener {
        void onFrame(Bitmap bitmap);
    }

    public static class FrameListenerAndParams {
        public final boolean applyFpsReduction;
        public final RendererCommon.GlDrawer drawer;
        public final FrameListener listener;
        public final float scale;

        public FrameListenerAndParams(FrameListener frameListener, float f7, RendererCommon.GlDrawer glDrawer, boolean z10) {
            this.listener = frameListener;
            this.scale = f7;
            this.drawer = glDrawer;
            this.applyFpsReduction = z10;
        }
    }

    public static class HandlerWithExceptionCallback extends Handler {
        private final Runnable exceptionCallback;

        public HandlerWithExceptionCallback(Looper looper, Runnable runnable) {
            super(looper);
            this.exceptionCallback = runnable;
        }

        @Override
        public void dispatchMessage(Message message) {
            try {
                super.dispatchMessage(message);
            } catch (Exception e) {
                Logging.e("EglRenderer", "Exception on EglRenderer thread", e);
                this.exceptionCallback.run();
                throw e;
            }
        }
    }

    public EglRenderer(String str) {
        this(str, new VideoFrameDrawer());
    }

    public void lambda$clearImage$6(float f7, float f10, float f11, float f12) {
        EglBase eglBase = this.eglBase;
        if (eglBase != null && eglBase.hasSurface()) {
            logD("clearSurface");
            GLES20.glClearColor(f7, f10, f11, f12);
            GLES20.glClear(16384);
            this.eglBase.swapBuffers(false);
        }
        EglBase eglBase2 = this.eglBase;
        if (eglBase2 != null && eglBase2.hasBackgroundSurface()) {
            this.eglBase.makeBackgroundCurrent();
            logD("clearSurface in background");
            GLES20.glClearColor(f7, f10, f11, f12);
            GLES20.glClear(16384);
            this.eglBase.swapBuffers(true);
            this.eglBase.makeCurrent();
        }
    }

    private void createEglSurfaceInternal(Object obj, boolean z10) {
        if (z10) {
            this.eglSurfaceBackgroundCreationRunnable.setSurface(obj);
            synchronized (this.handlerLock) {
                try {
                    Handler handler = this.renderThreadHandler;
                    if (handler != null) {
                        handler.post(this.eglSurfaceBackgroundCreationRunnable);
                    } else {
                        FileLog.d("can't create background surface. render thread is null");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        this.eglSurfaceCreationRunnable.setSurface(obj);
        postToRenderThread(this.eglSurfaceCreationRunnable);
    }

    public void lambda$addFrameListener$3(RendererCommon.GlDrawer glDrawer, FrameListener frameListener, float f7, boolean z10) {
        if (glDrawer == null) {
            glDrawer = this.drawer;
        }
        this.frameListeners.add(new FrameListenerAndParams(frameListener, f7, glDrawer, z10));
    }

    public void lambda$getTexture$7(GlGenericDrawer.TextureCallback textureCallback) {
        this.frameDrawer.getRenderBufferBitmap(this.drawer, this.rotation, textureCallback);
    }

    public void lambda$init$0(EglBase.Context context, int[] iArr) {
        if (context == null) {
            logD("EglBase10.create context");
            this.eglBase = e.g(iArr);
            return;
        }
        logD("EglBase.create shared context");
        this.eglBase = e.d(context, iArr);
    }

    public void lambda$release$1(CountDownLatch countDownLatch) {
        synchronized (EglBase.lock) {
            GLES20.glUseProgram(0);
        }
        RendererCommon.GlDrawer glDrawer = this.drawer;
        if (glDrawer != null) {
            glDrawer.release();
            this.drawer = null;
        }
        this.frameDrawer.release();
        this.bitmapTextureFramebuffer.release();
        if (this.eglBase != null) {
            logD("eglBase detach and release.");
            this.eglBase.detachCurrent();
            this.eglBase.release();
            this.eglBase = null;
        }
        this.frameListeners.clear();
        countDownLatch.countDown();
    }

    public void lambda$release$2(Looper looper) {
        logD("Quitting render thread.");
        looper.quit();
    }

    public void lambda$releaseEglSurface$5(boolean z10, Runnable runnable) {
        EglBase eglBase = this.eglBase;
        if (eglBase != null) {
            eglBase.detachCurrent();
            this.eglBase.releaseSurface(z10);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$removeFrameListener$4(CountDownLatch countDownLatch, FrameListener frameListener) {
        countDownLatch.countDown();
        Iterator<FrameListenerAndParams> it = this.frameListeners.iterator();
        while (it.hasNext()) {
            if (it.next().listener == frameListener) {
                it.remove();
            }
        }
    }

    private void logD(String str) {
        Logging.d("EglRenderer", this.name + str);
    }

    private void logE(String str, Throwable th2) {
        Logging.e("EglRenderer", this.name + str, th2);
    }

    private void logW(String str) {
        Logging.w("EglRenderer", this.name + str);
    }

    private void notifyCallbacks(VideoFrame videoFrame, boolean z10) {
        float f7;
        float f10;
        if (!this.frameListeners.isEmpty()) {
            this.drawMatrix.reset();
            this.drawMatrix.preTranslate(0.5f, 0.5f);
            this.drawMatrix.preRotate(this.rotation);
            Matrix matrix = this.drawMatrix;
            if (this.mirrorHorizontally) {
                f7 = -1.0f;
            } else {
                f7 = 1.0f;
            }
            if (this.mirrorVertically) {
                f10 = -1.0f;
            } else {
                f10 = 1.0f;
            }
            matrix.preScale(f7, f10);
            this.drawMatrix.preScale(1.0f, -1.0f);
            this.drawMatrix.preTranslate(-0.5f, -0.5f);
            Iterator<FrameListenerAndParams> it = this.frameListeners.iterator();
            while (it.hasNext()) {
                FrameListenerAndParams next = it.next();
                if (z10 || !next.applyFpsReduction) {
                    it.remove();
                    int rotatedWidth = (int) (next.scale * videoFrame.getRotatedWidth());
                    int rotatedHeight = (int) (next.scale * videoFrame.getRotatedHeight());
                    if (rotatedWidth != 0 && rotatedHeight != 0) {
                        this.bitmapTextureFramebuffer.setSize(rotatedWidth, rotatedHeight);
                        GLES20.glBindFramebuffer(36160, this.bitmapTextureFramebuffer.getFrameBufferId());
                        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.bitmapTextureFramebuffer.getTextureId(), 0);
                        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                        GLES20.glClear(16384);
                        this.frameDrawer.drawFrame(videoFrame, next.drawer, this.drawMatrix, 0, 0, rotatedWidth, rotatedHeight, false, false);
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(rotatedWidth * rotatedHeight * 4);
                        GLES20.glViewport(0, 0, rotatedWidth, rotatedHeight);
                        GLES20.glReadPixels(0, 0, rotatedWidth, rotatedHeight, 6408, 5121, allocateDirect);
                        GLES20.glBindFramebuffer(36160, 0);
                        GlUtil.checkNoGLES2Error("EglRenderer.notifyCallbacks");
                        Bitmap createBitmap = Bitmap.createBitmap(rotatedWidth, rotatedHeight, Bitmap.Config.ARGB_8888);
                        createBitmap.copyPixelsFromBuffer(allocateDirect);
                        next.listener.onFrame(createBitmap);
                    } else {
                        next.listener.onFrame(null);
                    }
                }
            }
        }
    }

    private void postToRenderThread(Runnable runnable) {
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler != null) {
                    handler.post(runnable);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void renderFrameOnRenderThread() {
        boolean z10;
        boolean z11;
        int rotatedWidth;
        int rotatedHeight;
        float f7;
        float f10;
        float f11;
        float f12;
        synchronized (this.frameLock) {
            try {
                VideoFrame videoFrame = this.pendingFrame;
                if (videoFrame == null) {
                    return;
                }
                this.pendingFrame = null;
                EglBase eglBase = this.eglBase;
                if (eglBase != null && eglBase.hasSurface()) {
                    synchronized (this.fpsReductionLock) {
                        long j3 = this.minRenderPeriodNs;
                        if (j3 != Long.MAX_VALUE) {
                            if (j3 > 0) {
                                long nanoTime = System.nanoTime();
                                long j10 = this.nextFrameTimeNs;
                                if (nanoTime >= j10) {
                                    long j11 = j10 + this.minRenderPeriodNs;
                                    this.nextFrameTimeNs = j11;
                                    this.nextFrameTimeNs = Math.max(j11, nanoTime);
                                }
                            }
                            z10 = true;
                        }
                        z10 = false;
                    }
                    System.nanoTime();
                    if (Math.abs(this.rotation) != 90 && Math.abs(this.rotation) != 270) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        rotatedWidth = videoFrame.getRotatedHeight();
                    } else {
                        rotatedWidth = videoFrame.getRotatedWidth();
                    }
                    float f13 = rotatedWidth;
                    if (z11) {
                        rotatedHeight = videoFrame.getRotatedWidth();
                    } else {
                        rotatedHeight = videoFrame.getRotatedHeight();
                    }
                    float f14 = f13 / rotatedHeight;
                    synchronized (this.layoutLock) {
                        f7 = this.layoutAspectRatio;
                        if (f7 == 0.0f) {
                            f7 = f14;
                        }
                    }
                    float f15 = 1.0f;
                    if (f14 > f7) {
                        f11 = f7 / f14;
                        f10 = 1.0f;
                    } else {
                        f10 = f14 / f7;
                        f11 = 1.0f;
                    }
                    this.drawMatrix.reset();
                    this.drawMatrix.preTranslate(0.5f, 0.5f);
                    this.drawMatrix.preRotate(this.rotation);
                    Matrix matrix = this.drawMatrix;
                    if (this.mirrorHorizontally) {
                        f12 = -1.0f;
                    } else {
                        f12 = 1.0f;
                    }
                    if (this.mirrorVertically) {
                        f15 = -1.0f;
                    }
                    matrix.preScale(f12, f15);
                    this.drawMatrix.preScale(f11, f10);
                    this.drawMatrix.preTranslate(-0.5f, -0.5f);
                    if (z10) {
                        try {
                            try {
                                this.frameDrawer.drawFrame(videoFrame, this.drawer, this.drawMatrix, 0, 0, this.eglBase.surfaceWidth(), this.eglBase.surfaceHeight(), z11, false);
                                if (this.eglBase.hasBackgroundSurface()) {
                                    this.eglBase.makeBackgroundCurrent();
                                    this.frameDrawer.drawFrame(videoFrame, this.drawer, this.drawMatrix, 0, 0, this.eglBase.surfaceWidth(), this.eglBase.surfaceHeight(), z11, true);
                                    if (this.usePresentationTimeStamp) {
                                        this.eglBase.swapBuffers(videoFrame.getTimestampNs(), true);
                                    } else {
                                        this.eglBase.swapBuffers(true);
                                    }
                                    this.eglBase.makeCurrent();
                                }
                                System.nanoTime();
                                if (this.usePresentationTimeStamp) {
                                    this.eglBase.swapBuffers(videoFrame.getTimestampNs(), false);
                                } else {
                                    this.eglBase.swapBuffers(false);
                                }
                                if (!this.firstFrameRendered) {
                                    this.firstFrameRendered = true;
                                    onFirstFrameRendered();
                                }
                            } catch (GlUtil.GlOutOfMemoryException e) {
                                logE("Error while drawing frame", e);
                                ErrorCallback errorCallback = this.errorCallback;
                                if (errorCallback != null) {
                                    errorCallback.onGlOutOfMemory();
                                }
                                this.drawer.release();
                                this.frameDrawer.release();
                                this.bitmapTextureFramebuffer.release();
                                videoFrame.release();
                                return;
                            }
                        } catch (Throwable th2) {
                            videoFrame.release();
                            throw th2;
                        }
                    }
                    notifyCallbacks(videoFrame, z10);
                    videoFrame.release();
                    return;
                }
                logD("Dropping frame - No surface");
                videoFrame.release();
            } finally {
            }
        }
    }

    public void addFrameListener(FrameListener frameListener, float f7) {
        addFrameListener(frameListener, f7, null, false);
    }

    public void clearImage() {
        clearImage(0.0f, 0.0f, 0.0f, 0.0f);
        this.firstFrameRendered = false;
    }

    public void createBackgroundSurface(SurfaceTexture surfaceTexture) {
        createEglSurfaceInternal(surfaceTexture, true);
    }

    public void createEglSurface(Surface surface) {
        createEglSurfaceInternal(surface, false);
    }

    public void disableFpsReduction() {
        setFpsReduction(Float.POSITIVE_INFINITY);
    }

    public void getTexture(GlGenericDrawer.TextureCallback textureCallback) {
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler != null) {
                    handler.post(new s(1, this, textureCallback));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer, boolean z10) {
        synchronized (this.handlerLock) {
            try {
                if (this.renderThreadHandler == null) {
                    logD("Initializing EglRenderer");
                    this.drawer = glDrawer;
                    this.usePresentationTimeStamp = z10;
                    this.firstFrameRendered = false;
                    HandlerThread handlerThread = new HandlerThread(this.name + "EglRenderer");
                    handlerThread.start();
                    HandlerWithExceptionCallback handlerWithExceptionCallback = new HandlerWithExceptionCallback(handlerThread.getLooper(), new Runnable() {
                        {
                            EglRenderer.this = this;
                        }

                        @Override
                        public void run() {
                            synchronized (EglRenderer.this.handlerLock) {
                                EglRenderer.this.renderThreadHandler = null;
                            }
                        }
                    });
                    this.renderThreadHandler = handlerWithExceptionCallback;
                    handlerWithExceptionCallback.post(new sx0(this, context, iArr, 13));
                    this.renderThreadHandler.post(this.eglSurfaceCreationRunnable);
                } else {
                    throw new IllegalStateException(this.name + "Already initialized");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void onFrame(VideoFrame videoFrame) {
        synchronized (this.handlerLock) {
            try {
                if (this.renderThreadHandler == null) {
                    logD("Dropping frame - Not initialized or already released.");
                    return;
                }
                synchronized (this.frameLock) {
                    VideoFrame videoFrame2 = this.pendingFrame;
                    if (videoFrame2 != null) {
                        videoFrame2.release();
                    }
                    this.pendingFrame = videoFrame;
                    videoFrame.retain();
                    this.renderThreadHandler.post(new h(this, 0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void pauseVideo() {
        setFpsReduction(0.0f);
    }

    public void printStackTrace() {
        Thread thread;
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler == null) {
                    thread = null;
                } else {
                    thread = handler.getLooper().getThread();
                }
                if (thread != null) {
                    StackTraceElement[] stackTrace = thread.getStackTrace();
                    if (stackTrace.length > 0) {
                        logW("EglRenderer stack trace:");
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            logW(stackTraceElement.toString());
                        }
                    }
                }
            } finally {
            }
        }
    }

    public void release() {
        logD("Releasing.");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler == null) {
                    logD("Already released");
                    return;
                }
                handler.postAtFrontOfQueue(new s(2, this, countDownLatch));
                this.renderThreadHandler.post(new s(3, this, this.renderThreadHandler.getLooper()));
                this.renderThreadHandler = null;
                ThreadUtils.awaitUninterruptibly(countDownLatch);
                synchronized (this.frameLock) {
                    try {
                        VideoFrame videoFrame = this.pendingFrame;
                        if (videoFrame != null) {
                            videoFrame.release();
                            this.pendingFrame = null;
                        }
                    } finally {
                    }
                }
                logD("Releasing done.");
            } finally {
            }
        }
    }

    public void releaseEglSurface(Runnable runnable, boolean z10) {
        this.eglSurfaceCreationRunnable.setSurface(null);
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler != null) {
                    handler.removeCallbacks(this.eglSurfaceCreationRunnable);
                    this.renderThreadHandler.postAtFrontOfQueue(new cm0(this, z10, runnable, 11));
                } else if (runnable != null) {
                    runnable.run();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void removeFrameListener(FrameListener frameListener) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.handlerLock) {
            try {
                if (this.renderThreadHandler == null) {
                    return;
                }
                if (Thread.currentThread() != this.renderThreadHandler.getLooper().getThread()) {
                    postToRenderThread(new sx0(this, countDownLatch, frameListener, 14));
                    ThreadUtils.awaitUninterruptibly(countDownLatch);
                    return;
                }
                throw new RuntimeException("removeFrameListener must not be called on the render thread.");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setErrorCallback(ErrorCallback errorCallback) {
        this.errorCallback = errorCallback;
    }

    public void setFpsReduction(float f7) {
        logD("setFpsReduction: " + f7);
        synchronized (this.fpsReductionLock) {
            try {
                long j3 = this.minRenderPeriodNs;
                if (f7 <= 0.0f) {
                    this.minRenderPeriodNs = Long.MAX_VALUE;
                } else {
                    this.minRenderPeriodNs = ((float) TimeUnit.SECONDS.toNanos(1L)) / f7;
                }
                if (this.minRenderPeriodNs != j3) {
                    this.nextFrameTimeNs = System.nanoTime();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setLayoutAspectRatio(float f7) {
        if (this.layoutAspectRatio != f7) {
            synchronized (this.layoutLock) {
                this.layoutAspectRatio = f7;
            }
        }
    }

    public void setMirror(boolean z10) {
        logD("setMirrorHorizontally: " + z10);
        synchronized (this.layoutLock) {
            this.mirrorHorizontally = z10;
        }
    }

    public void setMirrorVertically(boolean z10) {
        logD("setMirrorVertically: " + z10);
        synchronized (this.layoutLock) {
            this.mirrorVertically = z10;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        e0.a(this, videoSink);
    }

    public void setRotation(int i10) {
        synchronized (this.layoutLock) {
            this.rotation = i10;
        }
    }

    public EglRenderer(String str, VideoFrameDrawer videoFrameDrawer) {
        this.handlerLock = new Object();
        this.frameListeners = new ArrayList<>();
        this.fpsReductionLock = new Object();
        this.drawMatrix = new Matrix();
        this.frameLock = new Object();
        this.layoutLock = new Object();
        this.bitmapTextureFramebuffer = new GlTextureFrameBuffer(6408);
        this.eglSurfaceCreationRunnable = new EglSurfaceCreation(false);
        this.eglSurfaceBackgroundCreationRunnable = new EglSurfaceCreation(true);
        this.name = str;
        this.frameDrawer = videoFrameDrawer;
    }

    public void addFrameListener(FrameListener frameListener, float f7, RendererCommon.GlDrawer glDrawer) {
        addFrameListener(frameListener, f7, glDrawer, false);
    }

    public void createEglSurface(SurfaceTexture surfaceTexture) {
        createEglSurfaceInternal(surfaceTexture, false);
    }

    public void addFrameListener(final FrameListener frameListener, final float f7, final RendererCommon.GlDrawer glDrawer, final boolean z10) {
        postToRenderThread(new Runnable() {
            @Override
            public final void run() {
                EglRenderer.this.lambda$addFrameListener$3(glDrawer, frameListener, f7, z10);
            }
        });
    }

    public void clearImage(final float f7, final float f10, final float f11, final float f12) {
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler == null) {
                    return;
                }
                handler.postAtFrontOfQueue(new Runnable() {
                    @Override
                    public final void run() {
                        EglRenderer.this.lambda$clearImage$6(f7, f10, f11, f12);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        init(context, iArr, glDrawer, false);
    }

    public void onFirstFrameRendered() {
    }
}
