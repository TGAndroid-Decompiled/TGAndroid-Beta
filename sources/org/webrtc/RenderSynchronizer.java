package org.webrtc;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.view.Choreographer;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
public final class RenderSynchronizer {
    private static final float DEFAULT_TARGET_FPS = 30.0f;
    private static final String TAG = "RenderSynchronizer";
    private Choreographer choreographer;
    private boolean isListening;
    private long lastOpenedTimeNanos;
    private long lastRefreshTimeNanos;
    private final List<Listener> listeners;
    private final Object lock;
    private final Handler mainThreadHandler;
    private boolean renderWindowOpen;
    private final long targetFrameIntervalNanos;

    public interface Listener {
        void onRenderWindowClose();

        void onRenderWindowOpen();
    }

    public RenderSynchronizer(float f) {
        this.lock = new Object();
        this.listeners = new CopyOnWriteArrayList();
        this.targetFrameIntervalNanos = Math.round(1.0E9f / f);
        Handler handler = new Handler(Looper.getMainLooper());
        this.mainThreadHandler = handler;
        handler.post(new ia9(this, (byte) 1));
        Logging.d("RenderSynchronizer", "Created");
    }

    private void closeRenderWindow() {
        this.renderWindowOpen = false;
        traceRenderWindowChange();
        for (Listener listener : this.listeners) {
            listener.onRenderWindowClose();
        }
    }

    public void lambda$new$0() {
        this.choreographer = Choreographer.getInstance();
    }

    public void lambda$registerListener$1() {
        this.choreographer.postFrameCallback(new jr4(this, (byte) 3));
    }

    public void onDisplayRefreshCycleBegin(long j) {
        synchronized (this.lock) {
            if (this.listeners.isEmpty()) {
                Logging.d("RenderSynchronizer", "No listeners, unsubscribing to frame callbacks");
                this.isListening = false;
                return;
            }
            this.choreographer.postFrameCallback(new jr4(this, (byte) 3));
            long j2 = j - this.lastOpenedTimeNanos;
            this.lastRefreshTimeNanos = j;
            if (Math.abs(j2 - this.targetFrameIntervalNanos) < Math.abs((j2 - this.targetFrameIntervalNanos) + (j - this.lastRefreshTimeNanos))) {
                this.lastOpenedTimeNanos = j;
                openRenderWindow();
            } else if (this.renderWindowOpen) {
                closeRenderWindow();
            }
        }
    }

    private void openRenderWindow() {
        this.renderWindowOpen = true;
        traceRenderWindowChange();
        for (Listener listener : this.listeners) {
            listener.onRenderWindowOpen();
        }
    }

    private void traceRenderWindowChange() {
        long j;
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.renderWindowOpen) {
                j = 1;
            } else {
                j = 0;
            }
            Trace.setCounter("RenderWindow", j);
        }
    }

    public void registerListener(Listener listener) {
        this.listeners.add(listener);
        synchronized (this.lock) {
            if (!this.isListening) {
                Logging.d("RenderSynchronizer", "First listener, subscribing to frame callbacks");
                this.isListening = true;
                this.mainThreadHandler.post(new ia9(this, (byte) 0));
            }
        }
    }

    public void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    public RenderSynchronizer() {
        this(30.0f);
    }
}
