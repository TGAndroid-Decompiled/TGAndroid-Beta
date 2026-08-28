package org.webrtc;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import j3.r0;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.voip.VoIPService;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.GlGenericDrawer;
import org.webrtc.RendererCommon;
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

    public void lambda$onFrameResolutionChanged$0(int i9, int i10, int i11, int i12) {
        this.updateScreenRunnable = null;
        this.videoWidth = i9;
        this.videoHeight = i10;
        this.rotatedFrameWidth = i11;
        this.rotatedFrameHeight = i12;
        updateSurfaceSize();
        requestLayout();
    }

    public void lambda$updateVideoSizes$1(int i9, int i10) {
        this.updateScreenRunnable = null;
        this.rotatedFrameWidth = i9;
        this.rotatedFrameHeight = i10;
        updateSurfaceSize();
        requestLayout();
    }

    private void logD(String str) {
        Logging.d("TextureViewRenderer", this.resourceName + ": " + str);
    }

    private void onRotationChanged() {
        int i9;
        int i10;
        if (this.useCameraRotation) {
            i9 = OrientationHelper.cameraOrientation;
        } else {
            i9 = 0;
        }
        boolean z10 = this.mirror;
        if (z10) {
            i9 = 360 - i9;
        }
        int i11 = -i9;
        if (this.useCameraRotation) {
            int i12 = this.screenRotation;
            if (i12 == 1) {
                if (z10) {
                    i10 = 90;
                } else {
                    i10 = -90;
                }
            } else if (i12 == 3) {
                if (z10) {
                    i10 = 270;
                } else {
                    i10 = -270;
                }
            }
            i11 += i10;
        }
        this.eglRenderer.setRotation(i11);
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
        if (this.enableFixedSize && this.rotatedFrameWidth != 0 && this.rotatedFrameHeight != 0 && getWidth() != 0 && getHeight() != 0) {
            float width = getWidth() / getHeight();
            int i9 = this.rotatedFrameWidth;
            int i10 = this.rotatedFrameHeight;
            if (i9 / i10 > width) {
                i9 = (int) (i10 * width);
            } else {
                i10 = (int) (i10 / width);
            }
            int min = Math.min(getWidth(), i9);
            int min2 = Math.min(getHeight(), i10);
            StringBuilder sb2 = new StringBuilder("updateSurfaceSize. Layout size: ");
            sb2.append(getWidth());
            sb2.append("x");
            sb2.append(getHeight());
            sb2.append(", frame size: ");
            sb2.append(this.rotatedFrameWidth);
            sb2.append("x");
            r0.y(sb2, this.rotatedFrameHeight, ", requested surface size: ", min, "x");
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
            return;
        }
        this.surfaceHeight = 0;
        this.surfaceWidth = 0;
    }

    private void updateVideoSizes() {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = this.videoHeight;
        if (i13 != 0 && (i9 = this.videoWidth) != 0) {
            if (this.rotateTextureWithScreen) {
                if (this.useCameraRotation) {
                    int i14 = this.screenRotation;
                    if (i14 == 0) {
                        i11 = i13;
                    } else {
                        i11 = i9;
                    }
                    if (i14 == 0) {
                        i13 = i9;
                    }
                } else {
                    int i15 = this.textureRotation;
                    if (i15 != 0 && i15 != 180 && i15 != -180) {
                        i12 = i13;
                    } else {
                        i12 = i9;
                    }
                    if (i15 != 0 && i15 != 180 && i15 != -180) {
                        i13 = i9;
                    }
                    i11 = i12;
                }
            } else {
                int i16 = this.textureRotation - OrientationHelper.cameraOrientation;
                if (i16 != 0 && i16 != 180 && i16 != -180) {
                    i10 = this.videoHeight;
                } else {
                    i10 = this.videoWidth;
                }
                if (i16 != 0 && i16 != 180 && i16 != -180) {
                    i13 = this.videoWidth;
                } else {
                    i13 = this.videoHeight;
                }
                i11 = i10;
            }
            if (this.rotatedFrameWidth != i11 || this.rotatedFrameHeight != i13) {
                synchronized (this.eglRenderer.layoutLock) {
                    try {
                        Runnable runnable = this.updateScreenRunnable;
                        if (runnable != null) {
                            AndroidUtilities.cancelRunOnUIThread(runnable);
                        }
                        h3.y yVar = new h3.y(this, i11, i13, 14);
                        this.updateScreenRunnable = yVar;
                        postOrRun(yVar);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public void addFrameListener(EglRenderer.FrameListener frameListener, float f10, RendererCommon.GlDrawer glDrawer) {
        this.eglRenderer.addFrameListener(frameListener, f10, glDrawer);
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
    public void onFrameResolutionChanged(int r9, int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.TextureViewRenderer.onFrameResolutionChanged(int, int, int):void");
    }

    @Override
    public void onMeasure(int i9, int i10) {
        Point measure;
        ThreadUtils.checkIsOnMainThread();
        if (!this.isCamera && this.rotateTextureWithScreen) {
            updateVideoSizes();
        }
        int i11 = this.maxTextureSize;
        if (i11 > 0) {
            measure = this.videoLayoutMeasure.measure(this.isCamera, View.MeasureSpec.makeMeasureSpec(Math.min(i11, View.MeasureSpec.getSize(i9)), View.MeasureSpec.getMode(i9)), View.MeasureSpec.makeMeasureSpec(Math.min(this.maxTextureSize, View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)), this.rotatedFrameWidth, this.rotatedFrameHeight);
        } else {
            measure = this.videoLayoutMeasure.measure(this.isCamera, i9, i10, this.rotatedFrameWidth, this.rotatedFrameHeight);
        }
        setMeasuredDimension(measure.x, measure.y);
        if (this.rotatedFrameWidth != 0 && this.rotatedFrameHeight != 0) {
            this.eglRenderer.setLayoutAspectRatio(getMeasuredWidth() / getMeasuredHeight());
        }
        updateSurfaceSize();
    }

    @Override
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i9, int i10) {
        ThreadUtils.checkIsOnMainThread();
        this.surfaceHeight = 0;
        this.surfaceWidth = 0;
        updateSurfaceSize();
        this.eglRenderer.onSurfaceTextureAvailable(surfaceTexture, i9, i10);
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
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i9, int i10) {
        this.surfaceWidth = i9;
        this.surfaceHeight = i10;
        this.eglRenderer.onSurfaceTextureSizeChanged(surfaceTexture, i9, i10);
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
        if (!LiteMode.isEnabled(512)) {
            return;
        }
        this.backgroundRenderer = textureView;
        if (textureView == null) {
            ThreadUtils.checkIsOnMainThread();
            this.eglRenderer.releaseEglSurface(null, true);
            return;
        }
        textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            {
                TextureViewRenderer.this = this;
            }

            @Override
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i9, int i10) {
                TextureViewRenderer.this.createBackgroundSurface(surfaceTexture);
            }

            @Override
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                ThreadUtils.checkIsOnMainThread();
                TextureViewRenderer.this.eglRenderer.releaseEglSurface(null, true);
                return false;
            }

            @Override
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i9, int i10) {
            }
        });
    }

    public void setEnableHardwareScaler(boolean z10) {
        ThreadUtils.checkIsOnMainThread();
        this.enableFixedSize = z10;
        updateSurfaceSize();
    }

    public void setFpsReduction(float f10) {
        this.eglRenderer.setFpsReduction(f10);
    }

    public void setIsCamera(boolean z10) {
        this.isCamera = z10;
        if (!z10) {
            OrientationHelper orientationHelper = new OrientationHelper() {
                {
                    TextureViewRenderer.this = this;
                }

                @Override
                public void onOrientationUpdate(int i9) {
                    if (!TextureViewRenderer.this.isCamera) {
                        TextureViewRenderer.this.updateRotation();
                    }
                }
            };
            this.orientationHelper = orientationHelper;
            orientationHelper.start();
        }
    }

    public void setMaxTextureSize(int i9) {
        this.maxTextureSize = i9;
    }

    public void setMirror(boolean z10) {
        if (this.mirror != z10) {
            this.mirror = z10;
            if (this.rotateTextureWithScreen) {
                onRotationChanged();
            } else {
                this.eglRenderer.setMirror(z10);
            }
            updateSurfaceSize();
            requestLayout();
        }
    }

    @Override
    public void setParentSink(VideoSink videoSink) {
        this.parentSink = videoSink;
    }

    public void setRotateTextureWithScreen(boolean z10) {
        if (this.rotateTextureWithScreen != z10) {
            this.rotateTextureWithScreen = z10;
            requestLayout();
        }
    }

    @Override
    public void setRotation(float f10) {
        super.setRotation(f10);
    }

    @Override
    public void setRotationX(float f10) {
        super.setRotationX(f10);
    }

    @Override
    public void setRotationY(float f10) {
        super.setRotationY(f10);
    }

    public void setScalingType(RendererCommon.ScalingType scalingType) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType);
        requestLayout();
    }

    public void setScreenRotation(int i9) {
        this.screenRotation = i9;
        onRotationChanged();
        updateVideoSizes();
    }

    public void setUseCameraRotation(boolean z10) {
        if (this.useCameraRotation != z10) {
            this.useCameraRotation = z10;
            onRotationChanged();
            updateVideoSizes();
        }
    }

    public void updateRotation() {
        View view;
        float f10;
        float f11;
        float min;
        if (this.orientationHelper != null && this.rotatedFrameWidth != 0 && this.rotatedFrameHeight != 0 && (view = (View) getParent()) != null) {
            int orientation = this.orientationHelper.getOrientation();
            float measuredWidth = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            float measuredWidth2 = view.getMeasuredWidth();
            float measuredHeight2 = view.getMeasuredHeight();
            if (orientation != 90 && orientation != 270) {
                f11 = measuredWidth;
                f10 = measuredHeight;
            } else {
                f10 = measuredWidth;
                f11 = measuredHeight;
            }
            if (f11 < f10) {
                min = Math.max(f11 / measuredWidth, f10 / measuredHeight);
            } else {
                min = Math.min(f11 / measuredWidth, f10 / measuredHeight);
            }
            float f12 = f11 * min;
            float f13 = f10 * min;
            if (Math.abs((f12 / f13) - (measuredWidth2 / measuredHeight2)) < 0.1f) {
                min *= Math.max(measuredWidth2 / f12, measuredHeight2 / f13);
            }
            if (orientation == 270) {
                orientation = -90;
            }
            animate().scaleX(min).scaleY(min).rotation(-orientation).setDuration(180L).start();
        }
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
            AndroidUtilities.runOnUIThread(new h(this, 2));
        }

        @Override
        public void onFrame(VideoFrame videoFrame) {
            updateFrameDimensionsAndReportEvents(videoFrame);
            super.onFrame(videoFrame);
        }

        @Override
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i9, int i10) {
            ThreadUtils.checkIsOnMainThread();
            createEglSurface(surfaceTexture);
        }

        @Override
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            ThreadUtils.checkIsOnMainThread();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            releaseEglSurface(new org.telegram.ui.ActionBar.p(countDownLatch, 16), false);
            ThreadUtils.awaitUninterruptibly(countDownLatch);
            return true;
        }

        @Override
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i9, int i10) {
            ThreadUtils.checkIsOnMainThread();
            logD("surfaceChanged: size: " + i9 + "x" + i10);
        }

        @Override
        public void pauseVideo() {
            synchronized (this.layoutLock) {
                this.isRenderingPaused = true;
            }
            super.pauseVideo();
        }

        @Override
        public void setFpsReduction(float f10) {
            boolean z10;
            synchronized (this.layoutLock) {
                if (f10 == 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.isRenderingPaused = z10;
            }
            super.setFpsReduction(f10);
        }

        @Override
        public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
            init(context, (RendererCommon.RendererEvents) null, iArr, glDrawer);
        }

        @Override
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }
}
