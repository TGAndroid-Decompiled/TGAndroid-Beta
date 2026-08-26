package org.webrtc;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda8;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda26;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda194;

public class TextureViewRenderer extends TextureView implements TextureView.SurfaceTextureListener, VideoSink, RendererCommon.RendererEvents {
    private static final String TAG = "TextureViewRenderer";
    private TextureView backgroundRenderer;
    private int cameraRotation;
    private final TextureEglRenderer eglRenderer;
    private boolean enableFixedSize;
    private boolean isCamera;
    private int maxTextureSize;
    private boolean mirror;
    private OrientationHelper orientationHelper;
    private VideoSink parentSink;
    private RendererCommon.RendererEvents rendererEvents;
    private final String resourceName;
    private boolean rotateTextureWithScreen;
    public int rotatedFrameHeight;
    public int rotatedFrameWidth;
    private int screenRotation;
    private int surfaceHeight;
    private int surfaceWidth;
    int textureRotation;
    Runnable updateScreenRunnable;
    boolean useCameraRotation;
    private int videoHeight;
    private final RendererCommon.VideoLayoutMeasure videoLayoutMeasure;
    private int videoWidth;

    public TextureViewRenderer(Context context) {
        super(context);
        this.videoLayoutMeasure = new RendererCommon.VideoLayoutMeasure();
        String resourceName = getResourceName();
        this.resourceName = resourceName;
        this.eglRenderer = new TextureEglRenderer(resourceName);
        setSurfaceTextureListener(this);
    }

    private String getResourceName() {
        try {
            return getResources().getResourceEntryName(getId());
        } catch (Resources.NotFoundException unused) {
            return "";
        }
    }

    public void lambda$onFrameResolutionChanged$0(int i, int i2, int i3, int i4) {
        this.updateScreenRunnable = null;
        this.videoWidth = i;
        this.videoHeight = i2;
        this.rotatedFrameWidth = i3;
        this.rotatedFrameHeight = i4;
        updateSurfaceSize();
        requestLayout();
    }

    public void lambda$updateVideoSizes$1(int i, int i2) {
        this.updateScreenRunnable = null;
        this.rotatedFrameWidth = i;
        this.rotatedFrameHeight = i2;
        updateSurfaceSize();
        requestLayout();
    }

    private void logD(String str) {
        Logging.d("TextureViewRenderer", this.resourceName + ": " + str);
    }

    private void onRotationChanged() {
        int i;
        int i2 = this.useCameraRotation ? OrientationHelper.cameraOrientation : 0;
        boolean z = this.mirror;
        if (z) {
            i2 = 360 - i2;
        }
        int i3 = -i2;
        if (this.useCameraRotation) {
            int i4 = this.screenRotation;
            if (i4 == 1) {
                i = z ? 90 : -90;
            } else if (i4 == 3) {
                i = z ? 270 : -270;
            }
            i3 += i;
        }
        this.eglRenderer.setRotation(i3);
        this.eglRenderer.setMirror(this.mirror);
    }

    private void postOrRun(Runnable runnable) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    private void updateSurfaceSize() {
        ThreadUtils.checkIsOnMainThread();
        if (!this.enableFixedSize || this.rotatedFrameWidth == 0 || this.rotatedFrameHeight == 0 || getWidth() == 0 || getHeight() == 0) {
            this.surfaceHeight = 0;
            this.surfaceWidth = 0;
            return;
        }
        float width = getWidth() / getHeight();
        int i = this.rotatedFrameWidth;
        int i2 = this.rotatedFrameHeight;
        float f = i2;
        if (i / f > width) {
            i = (int) (f * width);
        } else {
            i2 = (int) (f / width);
        }
        int iMin = Math.min(getWidth(), i);
        int iMin2 = Math.min(getHeight(), i2);
        StringBuilder sb = new StringBuilder("updateSurfaceSize. Layout size: ");
        sb.append(getWidth());
        sb.append("x");
        sb.append(getHeight());
        sb.append(", frame size: ");
        sb.append(this.rotatedFrameWidth);
        sb.append("x");
        SurfaceContainer$$ExternalSyntheticOutline0.m(sb, this.rotatedFrameHeight, ", requested surface size: ", iMin, "x");
        sb.append(iMin2);
        sb.append(", old surface size: ");
        sb.append(this.surfaceWidth);
        sb.append("x");
        sb.append(this.surfaceHeight);
        logD(sb.toString());
        if (iMin == this.surfaceWidth && iMin2 == this.surfaceHeight) {
            return;
        }
        this.surfaceWidth = iMin;
        this.surfaceHeight = iMin2;
    }

    private void updateVideoSizes() {
        int i;
        int i2;
        int i3 = this.videoHeight;
        if (i3 == 0 || (i = this.videoWidth) == 0) {
            return;
        }
        if (!this.rotateTextureWithScreen) {
            int i4 = this.textureRotation - OrientationHelper.cameraOrientation;
            int i5 = (i4 == 0 || i4 == 180 || i4 == -180) ? this.videoWidth : this.videoHeight;
            i3 = (i4 == 0 || i4 == 180 || i4 == -180) ? this.videoHeight : this.videoWidth;
            i2 = i5;
        } else if (this.useCameraRotation) {
            int i6 = this.screenRotation;
            i2 = i6 == 0 ? i3 : i;
            if (i6 == 0) {
                i3 = i;
            }
        } else {
            int i7 = this.textureRotation;
            int i8 = (i7 == 0 || i7 == 180 || i7 == -180) ? i : i3;
            if (i7 == 0 || i7 == 180 || i7 == -180) {
                i2 = i8;
            } else {
                i2 = i8;
                i3 = i;
            }
        }
        if (this.rotatedFrameWidth == i2 && this.rotatedFrameHeight == i3) {
            return;
        }
        synchronized (this.eglRenderer.layoutLock) {
            try {
                Runnable runnable = this.updateScreenRunnable;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                ArticleViewer$$ExternalSyntheticLambda26 articleViewer$$ExternalSyntheticLambda26 = new ArticleViewer$$ExternalSyntheticLambda26(this, i2, i3, 14);
                this.updateScreenRunnable = articleViewer$$ExternalSyntheticLambda26;
                postOrRun(articleViewer$$ExternalSyntheticLambda26);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addFrameListener(EglRenderer.FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer) {
        this.eglRenderer.addFrameListener(frameListener, f, glDrawer);
    }

    public void clearFirstFrame() {
        TextureEglRenderer textureEglRenderer = this.eglRenderer;
        textureEglRenderer.firstFrameRendered = false;
        textureEglRenderer.isFirstFrameRendered = false;
    }

    public void clearImage() {
        this.eglRenderer.clearImage();
        this.eglRenderer.isFirstFrameRendered = false;
    }

    public void createBackgroundSurface(SurfaceTexture surfaceTexture) {
        this.eglRenderer.createBackgroundSurface(surfaceTexture);
    }

    public void disableFpsReduction() {
        this.eglRenderer.disableFpsReduction();
    }

    public void getRenderBufferBitmap(GlGenericDrawer.TextureCallback textureCallback) {
        this.eglRenderer.getTexture(textureCallback);
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents) {
        init(context, rendererEvents, EglBase.CONFIG_PLAIN, new GlRectDrawer());
    }

    public boolean isFirstFrameRendered() {
        return this.eglRenderer.isFirstFrameRendered;
    }

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
    public void onFrameResolutionChanged(int i, int i2, int i3) throws Throwable {
        int i4;
        int i5;
        Throwable th;
        RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
        if (rendererEvents != null) {
            rendererEvents.onFrameResolutionChanged(i, i2, i3);
        }
        this.textureRotation = i3;
        if (this.rotateTextureWithScreen) {
            if (this.isCamera) {
                onRotationChanged();
            }
            if (this.useCameraRotation) {
                int i6 = this.screenRotation;
                i4 = i6 == 0 ? i2 : i;
                if (i6 == 0) {
                    i5 = i;
                } else {
                    i5 = i2;
                }
            } else {
                int i7 = this.textureRotation;
                i4 = (i7 == 0 || i7 == 180 || i7 == -180) ? i : i2;
                if (i7 == 0 || i7 == 180 || i7 == -180) {
                    i5 = i2;
                } else {
                    i5 = i;
                }
            }
        } else {
            if (this.isCamera) {
                this.eglRenderer.setRotation(-OrientationHelper.cameraRotation);
            }
            int i8 = i3 - OrientationHelper.cameraOrientation;
            i4 = (i8 == 0 || i8 == 180 || i8 == -180) ? i : i2;
            if (i8 == 0 || i8 == 180 || i8 == -180) {
                i5 = i2;
            } else {
                i5 = i;
            }
        }
        int i9 = i4;
        synchronized (this.eglRenderer.layoutLock) {
            try {
                try {
                    Runnable runnable = this.updateScreenRunnable;
                    if (runnable != null) {
                        try {
                            AndroidUtilities.cancelRunOnUIThread(runnable);
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    ChatActivity$$ExternalSyntheticLambda194 chatActivity$$ExternalSyntheticLambda194 = new ChatActivity$$ExternalSyntheticLambda194(this, i, i2, i9, i5, 2);
                    this.updateScreenRunnable = chatActivity$$ExternalSyntheticLambda194;
                    postOrRun(chatActivity$$ExternalSyntheticLambda194);
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        ThreadUtils.checkIsOnMainThread();
        if (!this.isCamera && this.rotateTextureWithScreen) {
            updateVideoSizes();
        }
        int i3 = this.maxTextureSize;
        Point pointMeasure = i3 > 0 ? this.videoLayoutMeasure.measure(this.isCamera, View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i)), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.min(this.maxTextureSize, View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)), this.rotatedFrameWidth, this.rotatedFrameHeight) : this.videoLayoutMeasure.measure(this.isCamera, i, i2, this.rotatedFrameWidth, this.rotatedFrameHeight);
        setMeasuredDimension(pointMeasure.x, pointMeasure.y);
        if (this.rotatedFrameWidth != 0 && this.rotatedFrameHeight != 0) {
            this.eglRenderer.setLayoutAspectRatio(getMeasuredWidth() / getMeasuredHeight());
        }
        updateSurfaceSize();
    }

    @Override
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        ThreadUtils.checkIsOnMainThread();
        this.surfaceHeight = 0;
        this.surfaceWidth = 0;
        updateSurfaceSize();
        this.eglRenderer.onSurfaceTextureAvailable(surfaceTexture, i, i2);
    }

    @Override
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        VideoSink videoSink = this.parentSink;
        if (videoSink instanceof VoIPService.ProxyVideoSink) {
            VoIPService.ProxyVideoSink proxyVideoSink = (VoIPService.ProxyVideoSink) videoSink;
            proxyVideoSink.removeTarget(this);
            proxyVideoSink.removeBackground(this);
        }
        this.eglRenderer.onSurfaceTextureDestroyed(surfaceTexture);
        return true;
    }

    @Override
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.surfaceWidth = i;
        this.surfaceHeight = i2;
        this.eglRenderer.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.eglRenderer.onSurfaceTextureUpdated(surfaceTexture);
    }

    public void pauseVideo() {
        this.eglRenderer.pauseVideo();
    }

    public void release() {
        this.eglRenderer.release();
        OrientationHelper orientationHelper = this.orientationHelper;
        if (orientationHelper != null) {
            orientationHelper.stop();
        }
    }

    public void removeFrameListener(EglRenderer.FrameListener frameListener) {
        this.eglRenderer.removeFrameListener(frameListener);
    }

    public void setBackgroundRenderer(TextureView textureView) {
        if (LiteMode.isEnabled(512)) {
            this.backgroundRenderer = textureView;
            if (textureView != null) {
                textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
                    @Override
                    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                        TextureViewRenderer.this.createBackgroundSurface(surfaceTexture);
                    }

                    @Override
                    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                        ThreadUtils.checkIsOnMainThread();
                        TextureViewRenderer.this.eglRenderer.releaseEglSurface(null, true);
                        return false;
                    }

                    @Override
                    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                    }

                    @Override
                    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                    }
                });
            } else {
                ThreadUtils.checkIsOnMainThread();
                this.eglRenderer.releaseEglSurface(null, true);
            }
        }
    }

    public void setEnableHardwareScaler(boolean z) {
        ThreadUtils.checkIsOnMainThread();
        this.enableFixedSize = z;
        updateSurfaceSize();
    }

    public void setFpsReduction(float f) {
        this.eglRenderer.setFpsReduction(f);
    }

    public void setIsCamera(boolean z) {
        this.isCamera = z;
        if (z) {
            return;
        }
        OrientationHelper orientationHelper = new OrientationHelper() {
            @Override
            public void onOrientationUpdate(int i) {
                if (TextureViewRenderer.this.isCamera) {
                    return;
                }
                TextureViewRenderer.this.updateRotation();
            }
        };
        this.orientationHelper = orientationHelper;
        orientationHelper.start();
    }

    public void setMaxTextureSize(int i) {
        this.maxTextureSize = i;
    }

    public void setMirror(boolean z) {
        if (this.mirror != z) {
            this.mirror = z;
            if (this.rotateTextureWithScreen) {
                onRotationChanged();
            } else {
                this.eglRenderer.setMirror(z);
            }
            updateSurfaceSize();
            requestLayout();
        }
    }

    @Override
    public void setParentSink(VideoSink videoSink) {
        this.parentSink = videoSink;
    }

    public void setRotateTextureWithScreen(boolean z) {
        if (this.rotateTextureWithScreen != z) {
            this.rotateTextureWithScreen = z;
            requestLayout();
        }
    }

    @Override
    public void setRotation(float f) {
        super.setRotation(f);
    }

    @Override
    public void setRotationX(float f) {
        super.setRotationX(f);
    }

    @Override
    public void setRotationY(float f) {
        super.setRotationY(f);
    }

    public void setScalingType(RendererCommon.ScalingType scalingType) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType);
        requestLayout();
    }

    public void setScreenRotation(int i) {
        this.screenRotation = i;
        onRotationChanged();
        updateVideoSizes();
    }

    public void setUseCameraRotation(boolean z) {
        if (this.useCameraRotation != z) {
            this.useCameraRotation = z;
            onRotationChanged();
            updateVideoSizes();
        }
    }

    public void updateRotation() {
        View view;
        float f;
        float f2;
        if (this.orientationHelper == null || this.rotatedFrameWidth == 0 || this.rotatedFrameHeight == 0 || (view = (View) getParent()) == null) {
            return;
        }
        int orientation = this.orientationHelper.getOrientation();
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float measuredWidth2 = view.getMeasuredWidth();
        float measuredHeight2 = view.getMeasuredHeight();
        if (orientation == 90 || orientation == 270) {
            f = measuredWidth;
            f2 = measuredHeight;
        } else {
            f2 = measuredWidth;
            f = measuredHeight;
        }
        float fMax = f2 < f ? Math.max(f2 / measuredWidth, f / measuredHeight) : Math.min(f2 / measuredWidth, f / measuredHeight);
        float f3 = f2 * fMax;
        float f4 = f * fMax;
        if (Math.abs((f3 / f4) - (measuredWidth2 / measuredHeight2)) < 0.1f) {
            fMax *= Math.max(measuredWidth2 / f3, measuredHeight2 / f4);
        }
        if (orientation == 270) {
            orientation = -90;
        }
        animate().scaleX(fMax).scaleY(fMax).rotation(-orientation).setDuration(180L).start();
    }

    public void addFrameListener(EglRenderer.FrameListener frameListener, float f) {
        this.eglRenderer.addFrameListener(frameListener, f);
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

    public static class TextureEglRenderer extends EglRenderer implements TextureView.SurfaceTextureListener {
        private static final String TAG = "TextureEglRenderer";
        private int frameRotation;
        private boolean isFirstFrameRendered;
        private boolean isRenderingPaused;
        private final Object layoutLock;
        private RendererCommon.RendererEvents rendererEvents;
        private int rotatedFrameHeight;
        private int rotatedFrameWidth;

        public TextureEglRenderer(String str) {
            super(str);
            this.layoutLock = new Object();
        }

        public void lambda$onFirstFrameRendered$0() {
            this.isFirstFrameRendered = true;
            this.rendererEvents.onFirstFrameRendered();
        }

        private void logD(String str) {
            Logging.d("TextureEglRenderer", this.name + ": " + str);
        }

        private void updateFrameDimensionsAndReportEvents(VideoFrame videoFrame) {
            synchronized (this.layoutLock) {
                try {
                    if (this.isRenderingPaused) {
                        return;
                    }
                    if (this.rotatedFrameWidth != videoFrame.getRotatedWidth() || this.rotatedFrameHeight != videoFrame.getRotatedHeight() || this.frameRotation != videoFrame.getRotation()) {
                        logD("Reporting frame resolution changed to " + videoFrame.getBuffer().getWidth() + "x" + videoFrame.getBuffer().getHeight() + " with rotation " + videoFrame.getRotation());
                        RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
                        if (rendererEvents != null) {
                            rendererEvents.onFrameResolutionChanged(videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation());
                        }
                        this.rotatedFrameWidth = videoFrame.getRotatedWidth();
                        this.rotatedFrameHeight = videoFrame.getRotatedHeight();
                        this.frameRotation = videoFrame.getRotation();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override
        public void disableFpsReduction() {
            synchronized (this.layoutLock) {
                this.isRenderingPaused = false;
            }
            super.disableFpsReduction();
        }

        public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents, int[] iArr, RendererCommon.GlDrawer glDrawer) {
            ThreadUtils.checkIsOnMainThread();
            this.rendererEvents = rendererEvents;
            synchronized (this.layoutLock) {
                this.isFirstFrameRendered = false;
                this.rotatedFrameWidth = 0;
                this.rotatedFrameHeight = 0;
                this.frameRotation = 0;
            }
            super.init(context, iArr, glDrawer);
        }

        @Override
        public void onFirstFrameRendered() {
            AndroidUtilities.runOnUIThread(new EglRenderer$$ExternalSyntheticLambda5(this, 2));
        }

        @Override
        public void onFrame(VideoFrame videoFrame) {
            updateFrameDimensionsAndReportEvents(videoFrame);
            super.onFrame(videoFrame);
        }

        @Override
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            ThreadUtils.checkIsOnMainThread();
            createEglSurface(surfaceTexture);
        }

        @Override
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            ThreadUtils.checkIsOnMainThread();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            releaseEglSurface(new Theme$$ExternalSyntheticLambda8(countDownLatch, 17), false);
            ThreadUtils.awaitUninterruptibly(countDownLatch);
            return true;
        }

        @Override
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            ThreadUtils.checkIsOnMainThread();
            logD("surfaceChanged: size: " + i + "x" + i2);
        }

        @Override
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override
        public void pauseVideo() {
            synchronized (this.layoutLock) {
                this.isRenderingPaused = true;
            }
            super.pauseVideo();
        }

        @Override
        public void setFpsReduction(float f) {
            synchronized (this.layoutLock) {
                this.isRenderingPaused = f == 0.0f;
            }
            super.setFpsReduction(f);
        }

        @Override
        public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
            init(context, (RendererCommon.RendererEvents) null, iArr, glDrawer);
        }
    }
}
