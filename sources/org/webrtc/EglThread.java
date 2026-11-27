package org.webrtc;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.webrtc.EglBase;
import org.webrtc.EglBase10;
import org.webrtc.EglBase10Impl;
import org.webrtc.EglBase14;
import org.webrtc.EglBase14Impl;
import org.webrtc.RenderSynchronizer;
public class EglThread implements RenderSynchronizer.Listener {
    private final EglBase.EglConnection eglConnection;
    private final HandlerWithExceptionCallbacks handler;
    private final ReleaseMonitor releaseMonitor;
    private final RenderSynchronizer renderSynchronizer;
    private final Map<UUID, RenderUpdate> pendingRenderUpdates = new HashMap();
    private final List<RenderUpdate> pendingRenderUpdatesQueued = new ArrayList();
    private boolean renderWindowOpen = true;

    public static class HandlerWithExceptionCallbacks extends Handler {
        private final Object callbackLock;
        private final List<Runnable> exceptionCallbacks;

        public HandlerWithExceptionCallbacks(Looper looper) {
            super(looper);
            this.callbackLock = new Object();
            this.exceptionCallbacks = new ArrayList();
        }

        public void addExceptionCallback(Runnable runnable) {
            synchronized (this.callbackLock) {
                this.exceptionCallbacks.add(runnable);
            }
        }

        @Override
        public void dispatchMessage(Message message) {
            try {
                super.dispatchMessage(message);
            } catch (Exception e) {
                Logging.e("EglThread", "Exception on EglThread", e);
                synchronized (this.callbackLock) {
                    for (Runnable runnable : this.exceptionCallbacks) {
                        runnable.run();
                    }
                    throw e;
                }
            }
        }

        public void removeExceptionCallback(Runnable runnable) {
            synchronized (this.callbackLock) {
                this.exceptionCallbacks.remove(runnable);
            }
        }
    }

    public interface ReleaseMonitor {
        boolean onRelease(EglThread eglThread);
    }

    public interface RenderUpdate {
        void update(boolean z);
    }

    private EglThread(ReleaseMonitor releaseMonitor, HandlerWithExceptionCallbacks handlerWithExceptionCallbacks, EglBase.EglConnection eglConnection, RenderSynchronizer renderSynchronizer) {
        this.releaseMonitor = releaseMonitor;
        this.handler = handlerWithExceptionCallbacks;
        this.eglConnection = eglConnection;
        this.renderSynchronizer = renderSynchronizer;
        if (renderSynchronizer != null) {
            renderSynchronizer.registerListener(this);
        }
    }

    public static EglThread create(ReleaseMonitor releaseMonitor, EglBase.Context context, int[] iArr, RenderSynchronizer renderSynchronizer) {
        HandlerThread handlerThread = new HandlerThread("EglThread");
        handlerThread.start();
        HandlerWithExceptionCallbacks handlerWithExceptionCallbacks = new HandlerWithExceptionCallbacks(handlerThread.getLooper());
        EglBase.EglConnection eglConnection = (EglBase.EglConnection) ThreadUtils.invokeAtFrontUninterruptibly(handlerWithExceptionCallbacks, new i73(context, iArr, (byte) 3));
        if (releaseMonitor == null) {
            releaseMonitor = new su3((byte) 2);
        }
        return new EglThread(releaseMonitor, handlerWithExceptionCallbacks, eglConnection, renderSynchronizer);
    }

    public static EglBase.EglConnection lambda$create$0(EglBase.Context context, int[] iArr) {
        if (context == null) {
            return new EglBase10Impl.EglConnection(null, iArr);
        }
        if (context instanceof EglBase14.Context) {
            return new EglBase14Impl.EglConnection(((EglBase14.Context) context).getRawContext(), iArr);
        }
        if (context instanceof EglBase10.Context) {
            return new EglBase10Impl.EglConnection(((EglBase10.Context) context).getRawContext(), iArr);
        }
        lq5.j("Unrecognized Context");
        return null;
    }

    public static boolean lambda$create$1(EglThread eglThread) {
        return true;
    }

    public void lambda$onRenderWindowClose$3() {
        this.renderWindowOpen = false;
    }

    public void lambda$onRenderWindowOpen$2() {
        this.renderWindowOpen = true;
        for (RenderUpdate renderUpdate : this.pendingRenderUpdates.values()) {
            renderUpdate.update(false);
        }
        this.pendingRenderUpdates.clear();
        for (RenderUpdate renderUpdate2 : this.pendingRenderUpdatesQueued) {
            renderUpdate2.update(false);
        }
        this.pendingRenderUpdatesQueued.clear();
    }

    public void addExceptionCallback(Runnable runnable) {
        this.handler.addExceptionCallback(runnable);
    }

    public EglBase createEglBaseWithSharedConnection() {
        EglBase.EglConnection eglConnection = this.eglConnection;
        int i = c.a;
        if (eglConnection == null) {
            return c.a(null, EglBase.CONFIG_PLAIN);
        }
        if (eglConnection instanceof EglBase14Impl.EglConnection) {
            return new EglBase14Impl((EglBase14Impl.EglConnection) eglConnection);
        }
        if (eglConnection instanceof EglBase10Impl.EglConnection) {
            return new EglBase10Impl((EglBase10Impl.EglConnection) eglConnection);
        }
        lq5.j("Unrecognized EglConnection");
        return null;
    }

    public Handler getHandler() {
        return this.handler;
    }

    @Override
    public void onRenderWindowClose() {
        this.handler.post(new yu3(this, (byte) 1));
    }

    @Override
    public void onRenderWindowOpen() {
        this.handler.post(new yu3(this, (byte) 0));
    }

    public void release() {
        if (!this.releaseMonitor.onRelease(this)) {
            return;
        }
        RenderSynchronizer renderSynchronizer = this.renderSynchronizer;
        if (renderSynchronizer != null) {
            renderSynchronizer.removeListener(this);
        }
        HandlerWithExceptionCallbacks handlerWithExceptionCallbacks = this.handler;
        EglBase.EglConnection eglConnection = this.eglConnection;
        Objects.requireNonNull(eglConnection);
        handlerWithExceptionCallbacks.post(new zg3(eglConnection, (byte) 24));
        this.handler.getLooper().quitSafely();
    }

    public void removeExceptionCallback(Runnable runnable) {
        this.handler.removeExceptionCallback(runnable);
    }

    public void scheduleRenderUpdate(UUID uuid, RenderUpdate renderUpdate) {
        if (this.renderWindowOpen) {
            renderUpdate.update(true);
        } else {
            this.pendingRenderUpdates.put(uuid, renderUpdate);
        }
    }

    @Deprecated
    public void scheduleRenderUpdate(RenderUpdate renderUpdate) {
        if (this.renderWindowOpen) {
            renderUpdate.update(true);
        } else {
            this.pendingRenderUpdatesQueued.add(renderUpdate);
        }
    }

    public static EglThread create(ReleaseMonitor releaseMonitor, EglBase.Context context, int[] iArr) {
        return create(releaseMonitor, context, iArr, null);
    }
}
