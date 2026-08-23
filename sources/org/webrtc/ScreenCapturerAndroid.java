package org.webrtc;

import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.view.Surface;
import org.telegram.messenger.FileLog;

public class ScreenCapturerAndroid implements VideoCapturer, VideoSink {
    private static final int DISPLAY_FLAGS = 3;
    private static final int VIRTUAL_DISPLAY_DPI = 400;
    private CapturerObserver capturerObserver;
    private int height;
    private boolean isDisposed;
    private MediaProjection mediaProjection;
    private final MediaProjection.Callback mediaProjectionCallback;
    private MediaProjectionManager mediaProjectionManager;
    private final Intent mediaProjectionPermissionResultData;
    private long numCapturedFrames;
    private SurfaceTextureHelper surfaceTextureHelper;
    private VirtualDisplay virtualDisplay;
    private int width;

    @Override
    public boolean isScreencast() {
        return true;
    }

    @Override
    public void setParentSink(VideoSink videoSink) {
        VideoSink.CC.$default$setParentSink(this, videoSink);
    }

    public ScreenCapturerAndroid(Intent intent, MediaProjection.Callback callback) {
        this.mediaProjectionPermissionResultData = intent;
        this.mediaProjectionCallback = callback;
    }

    private void checkNotDisposed() {
        if (this.isDisposed) {
            throw new RuntimeException("capturer is disposed.");
        }
    }

    public MediaProjection getMediaProjection() {
        return this.mediaProjection;
    }

    @Override
    public synchronized void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        checkNotDisposed();
        if (capturerObserver == null) {
            throw new RuntimeException("capturerObserver not set.");
        }
        this.capturerObserver = capturerObserver;
        if (surfaceTextureHelper == null) {
            throw new RuntimeException("surfaceTextureHelper not set.");
        }
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.mediaProjectionManager = (MediaProjectionManager) context.getSystemService("media_projection");
    }

    @Override
    public synchronized void startCapture(int i, int i2, int i3) {
        try {
            if (this.mediaProjection == null && this.mediaProjectionManager != null) {
                try {
                    checkNotDisposed();
                    this.width = i;
                    this.height = i2;
                    MediaProjection mediaProjection = this.mediaProjectionManager.getMediaProjection(-1, this.mediaProjectionPermissionResultData);
                    this.mediaProjection = mediaProjection;
                    mediaProjection.registerCallback(this.mediaProjectionCallback, this.surfaceTextureHelper.getHandler());
                    createVirtualDisplay();
                    this.capturerObserver.onCapturerStarted(true);
                    this.surfaceTextureHelper.startListening(this);
                } catch (Throwable th) {
                    this.mediaProjectionCallback.onStop();
                    FileLog.e(th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public synchronized void stopCapture() {
        checkNotDisposed();
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new Runnable() {
            @Override
            public final void run() {
                ScreenCapturerAndroid.$r8$lambda$sVxaGU9KxEY26pvFhYDK1kR0KDo(this.f$0);
            }
        });
    }

    public static void $r8$lambda$sVxaGU9KxEY26pvFhYDK1kR0KDo(ScreenCapturerAndroid screenCapturerAndroid) {
        screenCapturerAndroid.surfaceTextureHelper.stopListening();
        screenCapturerAndroid.capturerObserver.onCapturerStopped();
        VirtualDisplay virtualDisplay = screenCapturerAndroid.virtualDisplay;
        if (virtualDisplay != null) {
            virtualDisplay.release();
            screenCapturerAndroid.virtualDisplay = null;
        }
        MediaProjection mediaProjection = screenCapturerAndroid.mediaProjection;
        if (mediaProjection != null) {
            mediaProjection.unregisterCallback(screenCapturerAndroid.mediaProjectionCallback);
            screenCapturerAndroid.mediaProjection.stop();
            screenCapturerAndroid.mediaProjection = null;
        }
    }

    @Override
    public synchronized void dispose() {
        this.isDisposed = true;
    }

    @Override
    public synchronized void changeCaptureFormat(int i, int i2, int i3) {
        checkNotDisposed();
        this.width = i;
        this.height = i2;
        if (this.virtualDisplay == null) {
            return;
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new Runnable() {
            @Override
            public final void run() {
                ScreenCapturerAndroid.$r8$lambda$sTXrEvwQux_7ZpaLZY0BN21JDZ0(this.f$0);
            }
        });
    }

    public static void $r8$lambda$sTXrEvwQux_7ZpaLZY0BN21JDZ0(ScreenCapturerAndroid screenCapturerAndroid) {
        screenCapturerAndroid.virtualDisplay.release();
        screenCapturerAndroid.createVirtualDisplay();
    }

    private void createVirtualDisplay() {
        this.surfaceTextureHelper.setTextureSize(this.width, this.height);
        try {
            this.virtualDisplay = this.mediaProjection.createVirtualDisplay("WebRTC_ScreenCapture", this.width, this.height, 400, 3, new Surface(this.surfaceTextureHelper.getSurfaceTexture()), null, null);
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    @Override
    public void onFrame(VideoFrame videoFrame) {
        this.numCapturedFrames++;
        this.capturerObserver.onFrameCaptured(videoFrame);
    }

    public long getNumCapturedFrames() {
        return this.numCapturedFrames;
    }
}
