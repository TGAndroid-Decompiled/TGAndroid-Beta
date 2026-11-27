package org.webrtc;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLException;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.EglThread;
import org.webrtc.GlUtil;
import org.webrtc.RendererCommon;
public class EglRenderer implements VideoSink {
    private static final UUID EMPTY_UUID = new UUID(0, 0);
    private static final long LOG_INTERVAL_SEC = 4;
    private static final String TAG = "EglRenderer";
    private final GlTextureFrameBuffer bitmapTextureFramebuffer;
    private final Matrix drawMatrix;
    private RendererCommon.GlDrawer drawer;
    private EglBase eglBase;
    private final Runnable eglExceptionCallback;
    private final EglSurfaceCreation eglSurfaceCreationRunnable;
    private EglThread eglThread;
    private volatile ErrorCallback errorCallback;
    private final Object fpsReductionLock;
    private final VideoFrameDrawer frameDrawer;
    private final ArrayList<FrameListenerAndParams> frameListeners;
    private final Object frameLock;
    private int framesDropped;
    private int framesReceived;
    private int framesRendered;
    private UUID id;
    private float layoutAspectRatio;
    private final Object layoutLock;
    private final Runnable logStatisticsRunnable;
    private long minRenderPeriodNs;
    private boolean mirrorHorizontally;
    private boolean mirrorVertically;
    protected final String name;
    private long nextFrameTimeNs;
    private VideoFrame pendingFrame;
    private final ArrayList<RenderListener> renderListeners;
    private long renderSwapBufferTimeNs;
    private long renderTimeNs;
    private final Object statisticsLock;
    private long statisticsStartTimeNs;
    private final Object threadLock;
    private boolean usePresentationTimeStamp;

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

    public interface RenderListener {
        void onRender(long j);
    }

    public EglRenderer(String str, VideoFrameDrawer videoFrameDrawer) {
        this.id = EMPTY_UUID;
        this.threadLock = new Object();
        this.eglExceptionCallback = new Runnable() {
            {
                EglRenderer.this = this;
            }

            @Override
            public void run() {
                synchronized (EglRenderer.this.threadLock) {
                    EglRenderer.this.eglThread = null;
                }
            }
        };
        this.frameListeners = new ArrayList<>();
        this.renderListeners = new ArrayList<>();
        this.fpsReductionLock = new Object();
        this.drawMatrix = new Matrix();
        this.frameLock = new Object();
        this.layoutLock = new Object();
        this.statisticsLock = new Object();
        this.bitmapTextureFramebuffer = new GlTextureFrameBuffer(6408);
        this.logStatisticsRunnable = new Runnable() {
            {
                EglRenderer.this = this;
            }

            @Override
            public void run() {
                EglRenderer.this.logStatistics();
                synchronized (EglRenderer.this.threadLock) {
                    if (EglRenderer.this.eglThread != null) {
                        EglRenderer.this.eglThread.getHandler().removeCallbacks(EglRenderer.this.logStatisticsRunnable);
                        EglRenderer.this.eglThread.getHandler().postDelayed(EglRenderer.this.logStatisticsRunnable, 4000L);
                    }
                }
            }
        };
        this.eglSurfaceCreationRunnable = new EglSurfaceCreation(this, 0);
        this.name = str;
        this.frameDrawer = videoFrameDrawer;
    }

    public static void a(EglRenderer eglRenderer, Runnable runnable) {
        eglRenderer.lambda$releaseEglSurface$4(runnable);
    }

    private String averageTimeAsString(long j, int i) {
        if (i <= 0) {
            return "NA";
        }
        return qu6.p(new StringBuilder(), (j / i) / 1000, " us");
    }

    public static void b(EglRenderer eglRenderer, CountDownLatch countDownLatch, RenderListener renderListener) {
        eglRenderer.lambda$removeRenderListener$3(countDownLatch, renderListener);
    }

    public void lambda$clearImage$5(float f, float f2, float f3, float f4) {
        EglBase eglBase = this.eglBase;
        if (eglBase != null && eglBase.hasSurface()) {
            logD("clearSurface");
            this.eglBase.makeCurrent();
            GLES20.glClearColor(f, f2, f3, f4);
            GLES20.glClear(16384);
            this.eglBase.swapBuffers();
        }
    }

    private void createEglSurfaceInternal(Object obj) {
        this.eglSurfaceCreationRunnable.setSurface(obj);
        postToRenderThread(this.eglSurfaceCreationRunnable);
    }

    public static void d(EglRenderer eglRenderer, CountDownLatch countDownLatch) {
        eglRenderer.lambda$release$0(countDownLatch);
    }

    public static void f(EglRenderer eglRenderer, CountDownLatch countDownLatch, FrameListener frameListener) {
        eglRenderer.lambda$removeFrameListener$2(countDownLatch, frameListener);
    }

    public static void h(EglRenderer eglRenderer) {
        eglRenderer.renderFrameOnRenderThread();
    }

    public void lambda$addFrameListener$1(RendererCommon.GlDrawer glDrawer, FrameListener frameListener, float f, boolean z) {
        if (glDrawer == null) {
            glDrawer = this.drawer;
        }
        this.frameListeners.add(new FrameListenerAndParams(frameListener, f, glDrawer, z));
    }

    public void lambda$release$0(CountDownLatch countDownLatch) {
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
        this.renderListeners.clear();
        this.frameListeners.clear();
        countDownLatch.countDown();
    }

    public void lambda$releaseEglSurface$4(Runnable runnable) {
        EglBase eglBase = this.eglBase;
        if (eglBase != null) {
            eglBase.detachCurrent();
            this.eglBase.releaseSurface();
        }
        runnable.run();
    }

    public void lambda$removeFrameListener$2(CountDownLatch countDownLatch, FrameListener frameListener) {
        countDownLatch.countDown();
        Iterator<FrameListenerAndParams> it = this.frameListeners.iterator();
        while (it.hasNext()) {
            if (it.next().listener == frameListener) {
                it.remove();
            }
        }
    }

    public void lambda$removeRenderListener$3(CountDownLatch countDownLatch, RenderListener renderListener) {
        countDownLatch.countDown();
        Iterator<RenderListener> it = this.renderListeners.iterator();
        while (it.hasNext()) {
            if (it.next() == renderListener) {
                it.remove();
            }
        }
    }

    public void lambda$swapBuffersOnRenderThread$6(VideoFrame videoFrame, long j, boolean z) {
        if (!z) {
            EglBase eglBase = this.eglBase;
            if (eglBase != null && eglBase.hasSurface()) {
                this.eglBase.makeCurrent();
            } else {
                return;
            }
        }
        boolean z2 = this.usePresentationTimeStamp;
        EglBase eglBase2 = this.eglBase;
        if (z2) {
            eglBase2.swapBuffers(videoFrame.getTimestampNs());
        } else {
            eglBase2.swapBuffers();
        }
        ArrayList<RenderListener> arrayList = this.renderListeners;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            RenderListener renderListener = arrayList.get(i);
            i++;
            renderListener.onRender(System.nanoTime());
        }
        synchronized (this.statisticsLock) {
            this.renderSwapBufferTimeNs = (System.nanoTime() - j) + this.renderSwapBufferTimeNs;
        }
    }

    private void logD(String str) {
        Logging.d("EglRenderer", this.name + str);
    }

    private void logE(String str, Throwable th) {
        Logging.e("EglRenderer", this.name + str, th);
    }

    public void logStatistics() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        long nanoTime = System.nanoTime();
        synchronized (this.statisticsLock) {
            long j = nanoTime - this.statisticsStartTimeNs;
            if (j > 0 && (this.minRenderPeriodNs != Long.MAX_VALUE || this.framesReceived != 0)) {
                float f = ((float) (this.framesRendered * 1000000000)) / ((float) j);
                logD("Duration: " + (j / 1000000) + " ms. Frames received: " + this.framesReceived + ". Dropped: " + this.framesDropped + ". Rendered: " + this.framesRendered + ". Render fps: " + decimalFormat.format(f) + ". Average render time: " + averageTimeAsString(this.renderTimeNs, this.framesRendered) + ". Average swapBuffer time: " + averageTimeAsString(this.renderSwapBufferTimeNs, this.framesRendered) + ".");
                resetStatistics(nanoTime);
            }
        }
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
                        this.frameDrawer.drawFrame(videoFrame, next.drawer, this.drawMatrix, 0, 0, rotatedWidth, rotatedHeight);
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
        synchronized (this.threadLock) {
            EglThread eglThread = this.eglThread;
            if (eglThread != null) {
                eglThread.getHandler().post(runnable);
            }
        }
    }

    public void renderFrameOnRenderThread() {
        boolean z;
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
                try {
                    this.eglBase.makeCurrent();
                    synchronized (this.fpsReductionLock) {
                        long j = this.minRenderPeriodNs;
                        if (j != Long.MAX_VALUE) {
                            if (j > 0) {
                                long nanoTime = System.nanoTime();
                                long j2 = this.nextFrameTimeNs;
                                if (nanoTime < j2) {
                                    logD("Skipping frame rendering - fps reduction is active.");
                                } else {
                                    long j3 = j2 + this.minRenderPeriodNs;
                                    this.nextFrameTimeNs = j3;
                                    this.nextFrameTimeNs = Math.max(j3, nanoTime);
                                }
                            }
                            z = true;
                        }
                        z = false;
                    }
                    long nanoTime2 = System.nanoTime();
                    float rotatedWidth = videoFrame.getRotatedWidth() / videoFrame.getRotatedHeight();
                    synchronized (this.layoutLock) {
                        f = this.layoutAspectRatio;
                        if (f == 0.0f) {
                            f = rotatedWidth;
                        }
                    }
                    float f5 = 1.0f;
                    if (rotatedWidth > f) {
                        f3 = f / rotatedWidth;
                        f2 = 1.0f;
                    } else {
                        f2 = rotatedWidth / f;
                        f3 = 1.0f;
                    }
                    this.drawMatrix.reset();
                    this.drawMatrix.preTranslate(0.5f, 0.5f);
                    Matrix matrix = this.drawMatrix;
                    if (this.mirrorHorizontally) {
                        f4 = -1.0f;
                    } else {
                        f4 = 1.0f;
                    }
                    if (this.mirrorVertically) {
                        f5 = -1.0f;
                    }
                    matrix.preScale(f4, f5);
                    this.drawMatrix.preScale(f3, f2);
                    this.drawMatrix.preTranslate(-0.5f, -0.5f);
                    try {
                        if (z) {
                            try {
                                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                                GLES20.glClear(16384);
                                this.frameDrawer.drawFrame(videoFrame, this.drawer, this.drawMatrix, 0, 0, this.eglBase.surfaceWidth(), this.eglBase.surfaceHeight());
                                long nanoTime3 = System.nanoTime();
                                swapBuffersOnRenderThread(videoFrame, nanoTime3);
                                synchronized (this.statisticsLock) {
                                    try {
                                        this.framesRendered++;
                                        this.renderTimeNs = (nanoTime3 - nanoTime2) + this.renderTimeNs;
                                    } finally {
                                    }
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
                } catch (GLException e2) {
                    logE("Error while eglMakeCurrent", e2);
                    return;
                }
            }
            logD("Dropping frame - No surface");
        }
    }

    private void resetStatistics(long j) {
        synchronized (this.statisticsLock) {
            this.statisticsStartTimeNs = j;
            this.framesReceived = 0;
            this.framesDropped = 0;
            this.framesRendered = 0;
            this.renderTimeNs = 0L;
            this.renderSwapBufferTimeNs = 0L;
        }
    }

    private void swapBuffersOnRenderThread(final VideoFrame videoFrame, final long j) {
        synchronized (this.threadLock) {
            if (this.eglThread == null) {
                return;
            }
            EglThread.RenderUpdate renderUpdate = new EglThread.RenderUpdate() {
                @Override
                public final void update(boolean z) {
                    EglRenderer.this.lambda$swapBuffersOnRenderThread$6(videoFrame, j, z);
                }
            };
            boolean equals = this.id.equals(EMPTY_UUID);
            EglThread eglThread = this.eglThread;
            if (equals) {
                eglThread.scheduleRenderUpdate(renderUpdate);
            } else {
                eglThread.scheduleRenderUpdate(this.id, renderUpdate);
            }
        }
    }

    public void addFrameListener(final FrameListener frameListener, final float f, final RendererCommon.GlDrawer glDrawer, final boolean z) {
        postToRenderThread(new Runnable() {
            @Override
            public final void run() {
                EglRenderer.this.lambda$addFrameListener$1(glDrawer, frameListener, f, z);
            }
        });
    }

    public void addRenderListener(RenderListener renderListener) {
        this.renderListeners.add(renderListener);
    }

    public void clearImage(final float f, final float f2, final float f3, final float f4) {
        synchronized (this.threadLock) {
            EglThread eglThread = this.eglThread;
            if (eglThread == null) {
                return;
            }
            eglThread.getHandler().postAtFrontOfQueue(new Runnable() {
                @Override
                public final void run() {
                    EglRenderer.this.lambda$clearImage$5(f, f2, f3, f4);
                }
            });
        }
    }

    public void createEglSurface(Surface surface) {
        createEglSurfaceInternal(surface);
    }

    public void disableFpsReduction() {
        setFpsReduction(Float.POSITIVE_INFINITY);
    }

    public void init(EglThread eglThread, RendererCommon.GlDrawer glDrawer, boolean z) {
        synchronized (this.threadLock) {
            if (this.eglThread == null) {
                logD("Initializing EglRenderer");
                this.eglThread = eglThread;
                this.drawer = glDrawer;
                this.usePresentationTimeStamp = z;
                eglThread.addExceptionCallback(this.eglExceptionCallback);
                this.eglBase = eglThread.createEglBaseWithSharedConnection();
                eglThread.getHandler().post(this.eglSurfaceCreationRunnable);
                resetStatistics(System.nanoTime());
                eglThread.getHandler().postDelayed(this.logStatisticsRunnable, 4000L);
            } else {
                throw new IllegalStateException(this.name + "Already initialized");
            }
        }
    }

    @Override
    public void onFrame(VideoFrame videoFrame) {
        boolean z;
        synchronized (this.statisticsLock) {
            this.framesReceived++;
        }
        synchronized (this.threadLock) {
            if (this.eglThread == null) {
                logD("Dropping frame - Not initialized or already released.");
                return;
            }
            synchronized (this.frameLock) {
                VideoFrame videoFrame2 = this.pendingFrame;
                if (videoFrame2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    videoFrame2.release();
                }
                this.pendingFrame = videoFrame;
                videoFrame.retain();
                this.eglThread.getHandler().post(new zg3(this, (byte) 23));
            }
            if (z) {
                synchronized (this.statisticsLock) {
                    this.framesDropped++;
                }
            }
        }
    }

    public void pauseVideo() {
        setFpsReduction(0.0f);
    }

    public void printStackTrace() {
        Thread thread;
        synchronized (this.threadLock) {
            EglThread eglThread = this.eglThread;
            if (eglThread == null) {
                thread = null;
            } else {
                thread = eglThread.getHandler().getLooper().getThread();
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
        synchronized (this.threadLock) {
            EglThread eglThread = this.eglThread;
            if (eglThread == null) {
                logD("Already released");
                return;
            }
            eglThread.getHandler().removeCallbacks(this.logStatisticsRunnable);
            this.eglThread.removeExceptionCallback(this.eglExceptionCallback);
            this.eglThread.getHandler().postAtFrontOfQueue(new wd3(this, countDownLatch, (byte) 27));
            this.eglThread.release();
            this.eglThread = null;
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

    public void releaseEglSurface(Runnable runnable) {
        this.eglSurfaceCreationRunnable.setSurface(null);
        synchronized (this.threadLock) {
            EglThread eglThread = this.eglThread;
            if (eglThread != null) {
                eglThread.getHandler().removeCallbacks(this.eglSurfaceCreationRunnable);
                this.eglThread.getHandler().postAtFrontOfQueue(new wd3(this, runnable, (byte) 26));
                return;
            }
            runnable.run();
        }
    }

    public void removeFrameListener(FrameListener frameListener) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.threadLock) {
            if (this.eglThread == null) {
                return;
            }
            if (Thread.currentThread() != this.eglThread.getHandler().getLooper().getThread()) {
                postToRenderThread(new cv2(this, countDownLatch, frameListener, (byte) 17));
                ThreadUtils.awaitUninterruptibly(countDownLatch);
                return;
            }
            throw new RuntimeException("removeFrameListener must not be called on the render thread.");
        }
    }

    public void removeRenderListener(RenderListener renderListener) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.threadLock) {
            if (this.eglThread == null) {
                return;
            }
            if (Thread.currentThread() != this.eglThread.getHandler().getLooper().getThread()) {
                postToRenderThread(new cv2(this, countDownLatch, renderListener, (byte) 18));
                ThreadUtils.awaitUninterruptibly(countDownLatch);
                return;
            }
            throw new RuntimeException("removeRenderListener must not be called on the render thread.");
        }
    }

    public void setErrorCallback(ErrorCallback errorCallback) {
        this.errorCallback = errorCallback;
    }

    public void setFpsReduction(float f) {
        long j;
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
        synchronized (this.layoutLock) {
            this.layoutAspectRatio = f;
        }
    }

    public void setMirror(boolean z) {
        synchronized (this.layoutLock) {
            this.mirrorHorizontally = z;
        }
    }

    public void setMirrorVertically(boolean z) {
        synchronized (this.layoutLock) {
            this.mirrorVertically = z;
        }
    }

    public void createEglSurface(SurfaceTexture surfaceTexture) {
        createEglSurfaceInternal(surfaceTexture);
    }

    public class EglSurfaceCreation implements Runnable {
        private Object surface;

        private EglSurfaceCreation() {
            EglRenderer.this = r1;
        }

        @Override
        public synchronized void run() {
            if (this.surface != null && EglRenderer.this.eglBase != null && !EglRenderer.this.eglBase.hasSurface()) {
                Object obj = this.surface;
                if (obj instanceof Surface) {
                    EglRenderer.this.eglBase.createSurface((Surface) this.surface);
                } else if (obj instanceof SurfaceTexture) {
                    EglRenderer.this.eglBase.createSurface((SurfaceTexture) this.surface);
                } else {
                    throw new IllegalStateException("Invalid surface: " + this.surface);
                }
                EglRenderer.this.eglBase.makeCurrent();
                GLES20.glPixelStorei(3317, 1);
            }
        }

        public synchronized void setSurface(Object obj) {
            this.surface = obj;
        }

        public EglSurfaceCreation(EglRenderer eglRenderer, int i) {
            this();
        }
    }

    public void addFrameListener(FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer) {
        addFrameListener(frameListener, f, glDrawer, false);
    }

    public void addFrameListener(FrameListener frameListener, float f) {
        addFrameListener(frameListener, f, null, false);
    }

    public void clearImage() {
        clearImage(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void init(EglThread eglThread, RendererCommon.GlDrawer glDrawer, boolean z, boolean z2) {
        if (z2) {
            this.id = UUID.randomUUID();
        }
        init(eglThread, glDrawer, z);
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer, boolean z) {
        init(EglThread.create(null, context, iArr), glDrawer, z);
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        init(context, iArr, glDrawer, false);
    }

    public EglRenderer(String str) {
        this(str, new VideoFrameDrawer());
    }
}
