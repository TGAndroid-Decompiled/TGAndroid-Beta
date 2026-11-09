package org.webrtc;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.RendererCommon;
public class SurfaceViewRenderer extends SurfaceView implements SurfaceHolder.Callback, VideoSink, RendererCommon.RendererEvents {
    private static final String TAG = "SurfaceViewRenderer";
    private final SurfaceEglRenderer eglRenderer;
    private boolean enableFixedSize;
    private RendererCommon.RendererEvents rendererEvents;
    private final String resourceName;
    private int rotatedFrameHeight;
    private int rotatedFrameWidth;
    private int surfaceHeight;
    private int surfaceWidth;
    private final RendererCommon.VideoLayoutMeasure videoLayoutMeasure;

    public SurfaceViewRenderer(Context context) {
        super(context);
        this.videoLayoutMeasure = new RendererCommon.VideoLayoutMeasure();
        String resourceName = getResourceName();
        this.resourceName = resourceName;
        SurfaceEglRenderer surfaceEglRenderer = new SurfaceEglRenderer(resourceName);
        this.eglRenderer = surfaceEglRenderer;
        getHolder().addCallback(this);
        getHolder().addCallback(surfaceEglRenderer);
    }

    public static void a(SurfaceViewRenderer surfaceViewRenderer, int i7, int i10) {
        surfaceViewRenderer.lambda$onFrameResolutionChanged$0(i7, i10);
    }

    private String getResourceName() {
        try {
            return getResources().getResourceEntryName(getId());
        } catch (Resources.NotFoundException unused) {
            return "";
        }
    }

    public void lambda$onFrameResolutionChanged$0(int i7, int i10) {
        this.rotatedFrameWidth = i7;
        this.rotatedFrameHeight = i10;
        updateSurfaceSize();
        requestLayout();
    }

    private void logD(String str) {
        Logging.d("SurfaceViewRenderer", this.resourceName + ": " + str);
    }

    private void postOrRun(Runnable runnable) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    private void updateSurfaceSize() {
        ThreadUtils.checkIsOnMainThread();
        if (this.enableFixedSize && this.rotatedFrameWidth != 0 && this.rotatedFrameHeight != 0 && getWidth() != 0 && getHeight() != 0) {
            float width = getWidth() / getHeight();
            int i7 = this.rotatedFrameWidth;
            int i10 = this.rotatedFrameHeight;
            if (i7 / i10 > width) {
                i7 = (int) (i10 * width);
            } else {
                i10 = (int) (i7 / width);
            }
            int min = Math.min(getWidth(), i7);
            int min2 = Math.min(getHeight(), i10);
            StringBuilder sb2 = new StringBuilder("updateSurfaceSize. Layout size: ");
            sb2.append(getWidth());
            sb2.append("x");
            sb2.append(getHeight());
            sb2.append(", frame size: ");
            sb2.append(this.rotatedFrameWidth);
            sb2.append("x");
            jg.g.x(sb2, this.rotatedFrameHeight, ", requested surface size: ", min, "x");
            sb2.append(min2);
            sb2.append(", old surface size: ");
            sb2.append(this.surfaceWidth);
            sb2.append("x");
            sb2.append(this.surfaceHeight);
            logD(sb2.toString());
            if (min == this.surfaceWidth && min2 == this.surfaceHeight) {
                return;
            }
            this.surfaceWidth = min;
            this.surfaceHeight = min2;
            getHolder().setFixedSize(min, min2);
            return;
        }
        this.surfaceHeight = 0;
        this.surfaceWidth = 0;
        getHolder().setSizeFromLayout();
    }

    public void addFrameListener(EglRenderer.FrameListener frameListener, float f10, RendererCommon.GlDrawer glDrawer) {
        this.eglRenderer.addFrameListener(frameListener, f10, glDrawer);
    }

    public void clearImage() {
        this.eglRenderer.clearImage();
    }

    public void disableFpsReduction() {
        this.eglRenderer.disableFpsReduction();
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents) {
        init(context, rendererEvents, EglBase.CONFIG_PLAIN, new GlRectDrawer());
    }

    @Override
    public void onFirstFrameRendered() {
        RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
        if (rendererEvents != null) {
            rendererEvents.onFirstFrameRendered();
        }
    }

    @Override
    public void onFrame(VideoFrame videoFrame) {
        this.eglRenderer.onFrame(videoFrame);
    }

    @Override
    public void onFrameResolutionChanged(int i7, int i10, int i11) {
        int i12;
        RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
        if (rendererEvents != null) {
            rendererEvents.onFrameResolutionChanged(i7, i10, i11);
        }
        if (i11 != 0 && i11 != 180) {
            i12 = i10;
        } else {
            i12 = i7;
        }
        if (i11 == 0 || i11 == 180) {
            i7 = i10;
        }
        postOrRun(new jg.r(this, i12, i7, 16));
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        ThreadUtils.checkIsOnMainThread();
        this.eglRenderer.setLayoutAspectRatio((i11 - i7) / (i12 - i10));
        updateSurfaceSize();
    }

    @Override
    public void onMeasure(int i7, int i10) {
        ThreadUtils.checkIsOnMainThread();
        Point measure = this.videoLayoutMeasure.measure(true, i7, i10, this.rotatedFrameWidth, this.rotatedFrameHeight);
        setMeasuredDimension(measure.x, measure.y);
        logD("onMeasure(). New size: " + measure.x + "x" + measure.y);
    }

    public void pauseVideo() {
        this.eglRenderer.pauseVideo();
    }

    public void release() {
        this.eglRenderer.release();
    }

    public void removeFrameListener(EglRenderer.FrameListener frameListener) {
        this.eglRenderer.removeFrameListener(frameListener);
    }

    public void setEnableHardwareScaler(boolean z9) {
        ThreadUtils.checkIsOnMainThread();
        this.enableFixedSize = z9;
        updateSurfaceSize();
    }

    public void setFpsReduction(float f10) {
        this.eglRenderer.setFpsReduction(f10);
    }

    public void setMirror(boolean z9) {
        this.eglRenderer.setMirror(z9);
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        d0.a(this, videoSink);
    }

    public void setScalingType(RendererCommon.ScalingType scalingType) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType);
        requestLayout();
    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        this.surfaceHeight = 0;
        this.surfaceWidth = 0;
        updateSurfaceSize();
    }

    public void addFrameListener(EglRenderer.FrameListener frameListener, float f10) {
        this.eglRenderer.addFrameListener(frameListener, f10);
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        ThreadUtils.checkIsOnMainThread();
        this.rendererEvents = rendererEvents;
        this.rotatedFrameWidth = 0;
        this.rotatedFrameHeight = 0;
        this.eglRenderer.init(context, this, iArr, glDrawer);
    }

    public void setScalingType(RendererCommon.ScalingType scalingType, RendererCommon.ScalingType scalingType2) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType, scalingType2);
        requestLayout();
    }

    public SurfaceViewRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.videoLayoutMeasure = new RendererCommon.VideoLayoutMeasure();
        String resourceName = getResourceName();
        this.resourceName = resourceName;
        SurfaceEglRenderer surfaceEglRenderer = new SurfaceEglRenderer(resourceName);
        this.eglRenderer = surfaceEglRenderer;
        getHolder().addCallback(this);
        getHolder().addCallback(surfaceEglRenderer);
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i10, int i11) {
    }
}
