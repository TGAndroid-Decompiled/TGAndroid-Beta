package org.webrtc;

import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.view.Surface;
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

    public ScreenCapturerAndroid(Intent intent, MediaProjection.Callback callback) {
        this.mediaProjectionPermissionResultData = intent;
        this.mediaProjectionCallback = callback;
    }

    public static void a(ScreenCapturerAndroid screenCapturerAndroid, int i, int i2) {
        screenCapturerAndroid.lambda$changeCaptureFormat$1(i, i2);
    }

    public static void b(ScreenCapturerAndroid screenCapturerAndroid) {
        screenCapturerAndroid.lambda$stopCapture$0();
    }

    private void checkNotDisposed() {
        if (!this.isDisposed) {
            return;
        }
        wn4.j("capturer is disposed.");
    }

    private void createVirtualDisplay() {
        this.surfaceTextureHelper.setTextureSize(this.width, this.height);
        try {
            this.virtualDisplay = this.mediaProjection.createVirtualDisplay("WebRTC_ScreenCapture", this.width, this.height, 400, 3, new Surface(this.surfaceTextureHelper.getSurfaceTexture()), null, null);
        } catch (Throwable th) {
            fa4.g(th, true);
        }
    }

    public void lambda$changeCaptureFormat$1(int i, int i2) {
        VirtualDisplay virtualDisplay = this.virtualDisplay;
        if (virtualDisplay == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 31) {
            virtualDisplay.release();
            createVirtualDisplay();
            return;
        }
        this.surfaceTextureHelper.setTextureSize(i, i2);
        this.virtualDisplay.resize(i, i2, 400);
        this.virtualDisplay.setSurface(new Surface(this.surfaceTextureHelper.getSurfaceTexture()));
    }

    public void lambda$stopCapture$0() {
        this.surfaceTextureHelper.stopListening();
        this.capturerObserver.onCapturerStopped();
        VirtualDisplay virtualDisplay = this.virtualDisplay;
        if (virtualDisplay != null) {
            virtualDisplay.release();
            this.virtualDisplay = null;
        }
        MediaProjection mediaProjection = this.mediaProjection;
        if (mediaProjection != null) {
            mediaProjection.unregisterCallback(this.mediaProjectionCallback);
            this.mediaProjection.stop();
            this.mediaProjection = null;
        }
    }

    @Override
    public synchronized void changeCaptureFormat(int i, int i2, int i3) {
        checkNotDisposed();
        this.width = i;
        this.height = i2;
        if (this.virtualDisplay == null) {
            return;
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new bt(this, i, i2, (byte) 14));
    }

    @Override
    public synchronized void dispose() {
        this.isDisposed = true;
    }

    public MediaProjection getMediaProjection() {
        return this.mediaProjection;
    }

    public long getNumCapturedFrames() {
        return this.numCapturedFrames;
    }

    @Override
    public synchronized void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        checkNotDisposed();
        if (capturerObserver != null) {
            this.capturerObserver = capturerObserver;
            if (surfaceTextureHelper != null) {
                this.surfaceTextureHelper = surfaceTextureHelper;
                this.mediaProjectionManager = (MediaProjectionManager) context.getSystemService("media_projection");
            } else {
                throw new RuntimeException("surfaceTextureHelper not set.");
            }
        } else {
            throw new RuntimeException("capturerObserver not set.");
        }
    }

    @Override
    public boolean isScreencast() {
        return true;
    }

    @Override
    public void onFrame(VideoFrame videoFrame) {
        this.numCapturedFrames++;
        this.capturerObserver.onFrameCaptured(videoFrame);
    }

    @Override
    public synchronized void startCapture(int i, int i2, int i3) {
        if (this.mediaProjection == null && this.mediaProjectionManager != null) {
            checkNotDisposed();
            this.width = i;
            this.height = i2;
            MediaProjection mediaProjection = this.mediaProjectionManager.getMediaProjection(-1, this.mediaProjectionPermissionResultData);
            this.mediaProjection = mediaProjection;
            mediaProjection.registerCallback(this.mediaProjectionCallback, this.surfaceTextureHelper.getHandler());
            createVirtualDisplay();
            this.capturerObserver.onCapturerStarted(true);
            this.surfaceTextureHelper.startListening(this);
        }
    }

    @Override
    public synchronized void stopCapture() {
        checkNotDisposed();
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new zk9(this, (byte) 8));
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
    }
}
