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
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
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

        public EglSurfaceCreation(boolean z) {
            EglRenderer.this = r1;
            this.background = z;
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

        public FrameListenerAndParams(FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer, boolean z) {
            this.listener = frameListener;
            this.scale = f;
            this.drawer = glDrawer;
            this.applyFpsReduction = z;
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

    public static void a(EglRenderer eglRenderer, EglBase.Context context, int[] iArr) {
        eglRenderer.lambda$init$0(context, iArr);
    }

    public static void b(EglRenderer eglRenderer, CountDownLatch countDownLatch, FrameListener frameListener) {
        eglRenderer.lambda$removeFrameListener$4(countDownLatch, frameListener);
    }

    public static void c(EglRenderer eglRenderer, CountDownLatch countDownLatch) {
        eglRenderer.lambda$release$1(countDownLatch);
    }

    public void lambda$clearImage$6(float f, float f2, float f3, float f4) {
        EglBase eglBase = this.eglBase;
        if (eglBase != null && eglBase.hasSurface()) {
            logD("clearSurface");
            GLES20.glClearColor(f, f2, f3, f4);
            GLES20.glClear(16384);
            this.eglBase.swapBuffers(false);
        }
        EglBase eglBase2 = this.eglBase;
        if (eglBase2 != null && eglBase2.hasBackgroundSurface()) {
            this.eglBase.makeBackgroundCurrent();
            logD("clearSurface in background");
            GLES20.glClearColor(f, f2, f3, f4);
            GLES20.glClear(16384);
            this.eglBase.swapBuffers(true);
            this.eglBase.makeCurrent();
        }
    }

    private void createEglSurfaceInternal(Object obj, boolean z) {
        if (z) {
            this.eglSurfaceBackgroundCreationRunnable.setSurface(obj);
            synchronized (this.handlerLock) {
                Handler handler = this.renderThreadHandler;
                if (handler != null) {
                    handler.post(this.eglSurfaceBackgroundCreationRunnable);
                } else {
                    fc4.b("can't create background surface. render thread is null");
                }
            }
            return;
        }
        this.eglSurfaceCreationRunnable.setSurface(obj);
        postToRenderThread(this.eglSurfaceCreationRunnable);
    }

    public static void e(EglRenderer eglRenderer, boolean z, Runnable runnable) {
        eglRenderer.lambda$releaseEglSurface$5(z, runnable);
    }

    public static void f(EglRenderer eglRenderer) {
        eglRenderer.renderFrameOnRenderThread();
    }

    public static void h(EglRenderer eglRenderer, GlGenericDrawer.TextureCallback textureCallback) {
        eglRenderer.lambda$getTexture$7(textureCallback);
    }

    public static void i(EglRenderer eglRenderer, Looper looper) {
        eglRenderer.lambda$release$2(looper);
    }

    public void lambda$addFrameListener$3(RendererCommon.GlDrawer glDrawer, FrameListener frameListener, float f, boolean z) {
        if (glDrawer == null) {
            glDrawer = this.drawer;
        }
        this.frameListeners.add(new FrameListenerAndParams(frameListener, f, glDrawer, z));
    }

    public void lambda$getTexture$7(GlGenericDrawer.TextureCallback textureCallback) {
        this.frameDrawer.getRenderBufferBitmap(this.drawer, this.rotation, textureCallback);
    }

    public void lambda$init$0(EglBase.Context context, int[] iArr) {
        if (context == null) {
            logD("EglBase10.create context");
            int i = c.a;
            this.eglBase = new EglBase10Impl(null, iArr);
            return;
        }
        logD("EglBase.create shared context");
        this.eglBase = c.a(context, iArr);
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

    public void lambda$releaseEglSurface$5(boolean z, Runnable runnable) {
        EglBase eglBase = this.eglBase;
        if (eglBase != null) {
            eglBase.detachCurrent();
            this.eglBase.releaseSurface(z);
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

    private void logE(String str, Throwable th) {
        Logging.e("EglRenderer", this.name + str, th);
    }

    private void logW(String str) {
        Logging.w("EglRenderer", this.name + str);
    }

    private void notifyCallbacks(VideoFrame videoFrame, boolean z) {
        float f;
        float f2;
        if (!this.frameListeners.isEmpty()) {
            this.drawMatrix.reset();
            this.drawMatrix.preTranslate(0.5f, 0.5f);
            this.drawMatrix.preRotate(this.rotation);
            Matrix matrix = this.drawMatrix;
            if (this.mirrorHorizontally) {
                f = -1.0f;
            } else {
                f = 1.0f;
            }
            if (this.mirrorVertically) {
                f2 = -1.0f;
            } else {
                f2 = 1.0f;
            }
            matrix.preScale(f, f2);
            this.drawMatrix.preScale(1.0f, -1.0f);
            this.drawMatrix.preTranslate(-0.5f, -0.5f);
            Iterator<FrameListenerAndParams> it = this.frameListeners.iterator();
            while (it.hasNext()) {
                FrameListenerAndParams next = it.next();
                if (z || !next.applyFpsReduction) {
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
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((rotatedWidth * rotatedHeight) << 2);
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
            Handler handler = this.renderThreadHandler;
            if (handler != null) {
                handler.post(runnable);
            }
        }
    }

    public void renderFrameOnRenderThread() {
        boolean z;
        boolean z2;
        int rotatedWidth;
        int rotatedHeight;
        float f;
        float f2;
        float f3;
        float f4;
        synchronized (this.frameLock) {
            VideoFrame videoFrame = this.pendingFrame;
            if (videoFrame == null) {
                return;
            }
            this.pendingFrame = null;
            EglBase eglBase = this.eglBase;
            if (eglBase != null && eglBase.hasSurface()) {
                synchronized (this.fpsReductionLock) {
                    long j = this.minRenderPeriodNs;
                    if (j != Long.MAX_VALUE) {
                        if (j > 0) {
                            long nanoTime = System.nanoTime();
                            long j2 = this.nextFrameTimeNs;
                            if (nanoTime >= j2) {
                                long j3 = j2 + this.minRenderPeriodNs;
                                this.nextFrameTimeNs = j3;
                                this.nextFrameTimeNs = Math.max(j3, nanoTime);
                            }
                        }
                        z = true;
                    }
                    z = false;
                }
                System.nanoTime();
                if (Math.abs(this.rotation) != 90 && Math.abs(this.rotation) != 270) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    rotatedWidth = videoFrame.getRotatedHeight();
                } else {
                    rotatedWidth = videoFrame.getRotatedWidth();
                }
                float f5 = rotatedWidth;
                if (z2) {
                    rotatedHeight = videoFrame.getRotatedWidth();
                } else {
                    rotatedHeight = videoFrame.getRotatedHeight();
                }
                float f6 = f5 / rotatedHeight;
                synchronized (this.layoutLock) {
                    f = this.layoutAspectRatio;
                    if (f == 0.0f) {
                        f = f6;
                    }
                }
                float f7 = 1.0f;
                if (f6 > f) {
                    f3 = f / f6;
                    f2 = 1.0f;
                } else {
                    f2 = f6 / f;
                    f3 = 1.0f;
                }
                this.drawMatrix.reset();
                this.drawMatrix.preTranslate(0.5f, 0.5f);
                this.drawMatrix.preRotate(this.rotation);
                Matrix matrix = this.drawMatrix;
                if (this.mirrorHorizontally) {
                    f4 = -1.0f;
                } else {
                    f4 = 1.0f;
                }
                if (this.mirrorVertically) {
                    f7 = -1.0f;
                }
                matrix.preScale(f4, f7);
                this.drawMatrix.preScale(f3, f2);
                this.drawMatrix.preTranslate(-0.5f, -0.5f);
                try {
                    if (z) {
                        try {
                            this.frameDrawer.drawFrame(videoFrame, this.drawer, this.drawMatrix, 0, 0, this.eglBase.surfaceWidth(), this.eglBase.surfaceHeight(), z2, false);
                            if (this.eglBase.hasBackgroundSurface()) {
                                this.eglBase.makeBackgroundCurrent();
                                this.frameDrawer.drawFrame(videoFrame, this.drawer, this.drawMatrix, 0, 0, this.eglBase.surfaceWidth(), this.eglBase.surfaceHeight(), z2, true);
                                boolean z3 = this.usePresentationTimeStamp;
                                EglBase eglBase2 = this.eglBase;
                                if (z3) {
                                    eglBase2.swapBuffers(videoFrame.getTimestampNs(), true);
                                } else {
                                    eglBase2.swapBuffers(true);
                                }
                                this.eglBase.makeCurrent();
                            }
                            System.nanoTime();
                            boolean z4 = this.usePresentationTimeStamp;
                            EglBase eglBase3 = this.eglBase;
                            if (z4) {
                                eglBase3.swapBuffers(videoFrame.getTimestampNs(), false);
                            } else {
                                eglBase3.swapBuffers(false);
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
                        }
                    }
                    notifyCallbacks(videoFrame, z);
                    return;
                } finally {
                    videoFrame.release();
                }
            }
            logD("Dropping frame - No surface");
        }
    }

    public void addFrameListener(final FrameListener frameListener, final float f, final RendererCommon.GlDrawer glDrawer, final boolean z) {
        postToRenderThread(new Runnable() {
            @Override
            public final void run() {
                EglRenderer.this.lambda$addFrameListener$3(glDrawer, frameListener, f, z);
            }
        });
    }

    public void clearImage(final float f, final float f2, final float f3, final float f4) {
        synchronized (this.handlerLock) {
            Handler handler = this.renderThreadHandler;
            if (handler == null) {
                return;
            }
            handler.postAtFrontOfQueue(new Runnable() {
                @Override
                public final void run() {
                    EglRenderer.this.lambda$clearImage$6(f, f2, f3, f4);
                }
            });
        }
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
                    handler.post(new rd3(this, textureCallback, (byte) 29));
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer, boolean z) {
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler == null) {
                logD("Initializing EglRenderer");
                this.drawer = glDrawer;
                this.usePresentationTimeStamp = z;
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
                handlerWithExceptionCallback.post(new pz2(this, context, iArr, (byte) 15));
                this.renderThreadHandler.post(this.eglSurfaceCreationRunnable);
            } else {
                throw new IllegalStateException(this.name + "Already initialized");
            }
        }
    }

    @Override
    public void onFrame(VideoFrame videoFrame) {
        synchronized (this.handlerLock) {
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
                this.renderThreadHandler.post(new bi3(this, (byte) 20));
            }
        }
    }

    public void pauseVideo() {
        setFpsReduction(0.0f);
    }

    public void printStackTrace() {
        Thread thread;
        synchronized (this.handlerLock) {
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
        }
    }

    public void release() {
        logD("Releasing.");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.handlerLock) {
            Handler handler = this.renderThreadHandler;
            if (handler == null) {
                logD("Already released");
                return;
            }
            handler.postAtFrontOfQueue(new pv3(this, countDownLatch, (byte) 0));
            this.renderThreadHandler.post(new pv3(this, this.renderThreadHandler.getLooper(), (byte) 1));
            this.renderThreadHandler = null;
            ThreadUtils.awaitUninterruptibly(countDownLatch);
            synchronized (this.frameLock) {
                VideoFrame videoFrame = this.pendingFrame;
                if (videoFrame != null) {
                    videoFrame.release();
                    this.pendingFrame = null;
                }
            }
            logD("Releasing done.");
        }
    }

    public void releaseEglSurface(Runnable runnable, boolean z) {
        this.eglSurfaceCreationRunnable.setSurface(null);
        synchronized (this.handlerLock) {
            Handler handler = this.renderThreadHandler;
            if (handler != null) {
                handler.removeCallbacks(this.eglSurfaceCreationRunnable);
                this.renderThreadHandler.postAtFrontOfQueue(new np6(this, z, runnable, (byte) 19));
            } else if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void removeFrameListener(FrameListener frameListener) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler == null) {
                return;
            }
            if (Thread.currentThread() != this.renderThreadHandler.getLooper().getThread()) {
                postToRenderThread(new pz2(this, countDownLatch, frameListener, (byte) 16));
                ThreadUtils.awaitUninterruptibly(countDownLatch);
                return;
            }
            throw new RuntimeException("removeFrameListener must not be called on the render thread.");
        }
    }

    public void setErrorCallback(ErrorCallback errorCallback) {
        this.errorCallback = errorCallback;
    }

    public void setFpsReduction(float f) {
        long j;
        logD("setFpsReduction: " + f);
        synchronized (this.fpsReductionLock) {
            long j2 = this.minRenderPeriodNs;
            if (f <= 0.0f) {
                j = Long.MAX_VALUE;
                this.minRenderPeriodNs = Long.MAX_VALUE;
            } else {
                j = 1.0E9f / f;
                this.minRenderPeriodNs = j;
            }
            if (j != j2) {
                this.nextFrameTimeNs = System.nanoTime();
            }
        }
    }

    public void setLayoutAspectRatio(float f) {
        if (this.layoutAspectRatio != f) {
            synchronized (this.layoutLock) {
                this.layoutAspectRatio = f;
            }
        }
    }

    public void setMirror(boolean z) {
        logD("setMirrorHorizontally: " + z);
        synchronized (this.layoutLock) {
            this.mirrorHorizontally = z;
        }
    }

    public void setMirrorVertically(boolean z) {
        logD("setMirrorVertically: " + z);
        synchronized (this.layoutLock) {
            this.mirrorVertically = z;
        }
    }

    public void setRotation(int i) {
        synchronized (this.layoutLock) {
            this.rotation = i;
        }
    }

    public void createEglSurface(SurfaceTexture surfaceTexture) {
        createEglSurfaceInternal(surfaceTexture, false);
    }

    public void addFrameListener(FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer) {
        addFrameListener(frameListener, f, glDrawer, false);
    }

    public void addFrameListener(FrameListener frameListener, float f) {
        addFrameListener(frameListener, f, null, false);
    }

    public void clearImage() {
        clearImage(0.0f, 0.0f, 0.0f, 0.0f);
        this.firstFrameRendered = false;
    }

    public EglRenderer(String str) {
        this(str, new VideoFrameDrawer());
    }

    public void onFirstFrameRendered() {
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        init(context, iArr, glDrawer, false);
    }
}
