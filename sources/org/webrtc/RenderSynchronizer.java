package org.webrtc;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.view.Choreographer;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
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

    public RenderSynchronizer(float f10) {
        this.lock = new Object();
        this.listeners = new CopyOnWriteArrayList();
        this.targetFrameIntervalNanos = Math.round(((float) TimeUnit.SECONDS.toNanos(1L)) / f10);
        Handler handler = new Handler(Looper.getMainLooper());
        this.mainThreadHandler = handler;
        handler.post(new n(this, 1));
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
        this.choreographer.postFrameCallback(new o(this));
    }

    public void onDisplayRefreshCycleBegin(long j10) {
        synchronized (this.lock) {
            try {
                if (this.listeners.isEmpty()) {
                    Logging.d("RenderSynchronizer", "No listeners, unsubscribing to frame callbacks");
                    this.isListening = false;
                    return;
                }
                this.choreographer.postFrameCallback(new o(this));
                long j11 = j10 - this.lastOpenedTimeNanos;
                this.lastRefreshTimeNanos = j10;
                if (Math.abs(j11 - this.targetFrameIntervalNanos) < Math.abs((j11 - this.targetFrameIntervalNanos) + (j10 - this.lastRefreshTimeNanos))) {
                    this.lastOpenedTimeNanos = j10;
                    openRenderWindow();
                } else if (this.renderWindowOpen) {
                    closeRenderWindow();
                }
            } catch (Throwable th) {
                throw th;
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
        long j10;
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.renderWindowOpen) {
                j10 = 1;
            } else {
                j10 = 0;
            }
            Trace.setCounter("RenderWindow", j10);
        }
    }

    public void registerListener(Listener listener) {
        this.listeners.add(listener);
        synchronized (this.lock) {
            try {
                if (!this.isListening) {
                    Logging.d("RenderSynchronizer", "First listener, subscribing to frame callbacks");
                    this.isListening = true;
                    this.mainThreadHandler.post(new n(this, 0));
                }
            } catch (Throwable th) {
                throw th;
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
