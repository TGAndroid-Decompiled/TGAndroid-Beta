package org.webrtc;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import j7.l1;
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

    public void lambda$onFrameResolutionChanged$0(int i10, int i11, int i12, int i13) {
        this.updateScreenRunnable = null;
        this.videoWidth = i10;
        this.videoHeight = i11;
        this.rotatedFrameWidth = i12;
        this.rotatedFrameHeight = i13;
        updateSurfaceSize();
        requestLayout();
    }

    public void lambda$updateVideoSizes$1(int i10, int i11) {
        this.updateScreenRunnable = null;
        this.rotatedFrameWidth = i10;
        this.rotatedFrameHeight = i11;
        updateSurfaceSize();
        requestLayout();
    }

    private void logD(String str) {
        Logging.d("TextureViewRenderer", this.resourceName + ": " + str);
    }

    private void onRotationChanged() {
        int i10;
        int i11;
        if (this.useCameraRotation) {
            i10 = OrientationHelper.cameraOrientation;
        } else {
            i10 = 0;
        }
        boolean z10 = this.mirror;
        if (z10) {
            i10 = 360 - i10;
        }
        int i12 = -i10;
        if (this.useCameraRotation) {
            int i13 = this.screenRotation;
            if (i13 == 1) {
                if (z10) {
                    i11 = 90;
                } else {
                    i11 = -90;
                }
            } else if (i13 == 3) {
                if (z10) {
                    i11 = 270;
                } else {
                    i11 = -270;
                }
            }
            i12 += i11;
        }
        this.eglRenderer.setRotation(i12);
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
            int i10 = this.rotatedFrameWidth;
            int i11 = this.rotatedFrameHeight;
            if (i10 / i11 > width) {
                i10 = (int) (i11 * width);
            } else {
                i11 = (int) (i11 / width);
            }
            int min = Math.min(getWidth(), i10);
            int min2 = Math.min(getHeight(), i11);
            StringBuilder sb2 = new StringBuilder("updateSurfaceSize. Layout size: ");
            sb2.append(getWidth());
            sb2.append("x");
            sb2.append(getHeight());
            sb2.append(", frame size: ");
            sb2.append(this.rotatedFrameWidth);
            sb2.append("x");
            l1.w(sb2, this.rotatedFrameHeight, ", requested surface size: ", min, "x");
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
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.videoHeight;
        if (i14 != 0 && (i10 = this.videoWidth) != 0) {
            if (this.rotateTextureWithScreen) {
                if (this.useCameraRotation) {
                    int i15 = this.screenRotation;
                    if (i15 == 0) {
                        i12 = i14;
                    } else {
                        i12 = i10;
                    }
                    if (i15 == 0) {
                        i14 = i10;
                    }
                } else {
                    int i16 = this.textureRotation;
                    if (i16 != 0 && i16 != 180 && i16 != -180) {
                        i13 = i14;
                    } else {
                        i13 = i10;
                    }
                    if (i16 != 0 && i16 != 180 && i16 != -180) {
                        i14 = i10;
                    }
                    i12 = i13;
                }
            } else {
                int i17 = this.textureRotation - OrientationHelper.cameraOrientation;
                if (i17 != 0 && i17 != 180 && i17 != -180) {
                    i11 = this.videoHeight;
                } else {
                    i11 = this.videoWidth;
                }
                if (i17 != 0 && i17 != 180 && i17 != -180) {
                    i14 = this.videoWidth;
                } else {
                    i14 = this.videoHeight;
                }
                i12 = i11;
            }
            if (this.rotatedFrameWidth != i12 || this.rotatedFrameHeight != i14) {
                synchronized (this.eglRenderer.layoutLock) {
                    try {
                        Runnable runnable = this.updateScreenRunnable;
                        if (runnable != null) {
                            AndroidUtilities.cancelRunOnUIThread(runnable);
                        }
                        j3.y yVar = new j3.y(this, i12, i14, 13);
                        this.updateScreenRunnable = yVar;
                        postOrRun(yVar);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    public void addFrameListener(EglRenderer.FrameListener frameListener, float f9, RendererCommon.GlDrawer glDrawer) {
        this.eglRenderer.addFrameListener(frameListener, f9, glDrawer);
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
    public void onMeasure(int i10, int i11) {
        Point measure;
        ThreadUtils.checkIsOnMainThread();
        if (!this.isCamera && this.rotateTextureWithScreen) {
            updateVideoSizes();
        }
        int i12 = this.maxTextureSize;
        if (i12 > 0) {
            measure = this.videoLayoutMeasure.measure(this.isCamera, View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)), View.MeasureSpec.makeMeasureSpec(Math.min(this.maxTextureSize, View.MeasureSpec.getSize(i11)), View.MeasureSpec.getMode(i11)), this.rotatedFrameWidth, this.rotatedFrameHeight);
        } else {
            measure = this.videoLayoutMeasure.measure(this.isCamera, i10, i11, this.rotatedFrameWidth, this.rotatedFrameHeight);
        }
        setMeasuredDimension(measure.x, measure.y);
        if (this.rotatedFrameWidth != 0 && this.rotatedFrameHeight != 0) {
            this.eglRenderer.setLayoutAspectRatio(getMeasuredWidth() / getMeasuredHeight());
        }
        updateSurfaceSize();
    }

    @Override
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        ThreadUtils.checkIsOnMainThread();
        this.surfaceHeight = 0;
        this.surfaceWidth = 0;
        updateSurfaceSize();
        this.eglRenderer.onSurfaceTextureAvailable(surfaceTexture, i10, i11);
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
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.surfaceWidth = i10;
        this.surfaceHeight = i11;
        this.eglRenderer.onSurfaceTextureSizeChanged(surfaceTexture, i10, i11);
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
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
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
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            }
        });
    }

    public void setEnableHardwareScaler(boolean z10) {
        ThreadUtils.checkIsOnMainThread();
        this.enableFixedSize = z10;
        updateSurfaceSize();
    }

    public void setFpsReduction(float f9) {
        this.eglRenderer.setFpsReduction(f9);
    }

    public void setIsCamera(boolean z10) {
        this.isCamera = z10;
        if (!z10) {
            OrientationHelper orientationHelper = new OrientationHelper() {
                {
                    TextureViewRenderer.this = this;
                }

                @Override
                public void onOrientationUpdate(int i10) {
                    if (!TextureViewRenderer.this.isCamera) {
                        TextureViewRenderer.this.updateRotation();
                    }
                }
            };
            this.orientationHelper = orientationHelper;
            orientationHelper.start();
        }
    }

    public void setMaxTextureSize(int i10) {
        this.maxTextureSize = i10;
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
    public void setRotation(float f9) {
        super.setRotation(f9);
    }

    @Override
    public void setRotationX(float f9) {
        super.setRotationX(f9);
    }

    @Override
    public void setRotationY(float f9) {
        super.setRotationY(f9);
    }

    public void setScalingType(RendererCommon.ScalingType scalingType) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType);
        requestLayout();
    }

    public void setScreenRotation(int i10) {
        this.screenRotation = i10;
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
        float f9;
        float f10;
        float min;
        if (this.orientationHelper != null && this.rotatedFrameWidth != 0 && this.rotatedFrameHeight != 0 && (view = (View) getParent()) != null) {
            int orientation = this.orientationHelper.getOrientation();
            float measuredWidth = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            float measuredWidth2 = view.getMeasuredWidth();
            float measuredHeight2 = view.getMeasuredHeight();
            if (orientation != 90 && orientation != 270) {
                f10 = measuredWidth;
                f9 = measuredHeight;
            } else {
                f9 = measuredWidth;
                f10 = measuredHeight;
            }
            if (f10 < f9) {
                min = Math.max(f10 / measuredWidth, f9 / measuredHeight);
            } else {
                min = Math.min(f10 / measuredWidth, f9 / measuredHeight);
            }
            float f11 = f10 * min;
            float f12 = f9 * min;
            if (Math.abs((f11 / f12) - (measuredWidth2 / measuredHeight2)) < 0.1f) {
                min *= Math.max(measuredWidth2 / f11, measuredHeight2 / f12);
            }
            if (orientation == 270) {
                orientation = -90;
            }
            animate().scaleX(min).scaleY(min).rotation(-orientation).setDuration(180L).start();
        }
    }

    public void addFrameListener(EglRenderer.FrameListener frameListener, float f9) {
        this.eglRenderer.addFrameListener(frameListener, f9);
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
                } catch (Throwable th2) {
                    throw th2;
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
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            ThreadUtils.checkIsOnMainThread();
            createEglSurface(surfaceTexture);
        }

        @Override
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            ThreadUtils.checkIsOnMainThread();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            releaseEglSurface(new org.telegram.ui.ActionBar.q(countDownLatch, 16), false);
            ThreadUtils.awaitUninterruptibly(countDownLatch);
            return true;
        }

        @Override
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            ThreadUtils.checkIsOnMainThread();
            logD("surfaceChanged: size: " + i10 + "x" + i11);
        }

        @Override
        public void pauseVideo() {
            synchronized (this.layoutLock) {
                this.isRenderingPaused = true;
            }
            super.pauseVideo();
        }

        @Override
        public void setFpsReduction(float f9) {
            boolean z10;
            synchronized (this.layoutLock) {
                if (f9 == 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.isRenderingPaused = z10;
            }
            super.setFpsReduction(f9);
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
