package org.webrtc;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.view.Choreographer;
import java.util.Iterator;
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

    public RenderSynchronizer() {
        this(30.0f);
    }

    public RenderSynchronizer(float f) {
        this.lock = new Object();
        this.listeners = new CopyOnWriteArrayList();
        this.targetFrameIntervalNanos = Math.round(((float) TimeUnit.SECONDS.toNanos(1L)) / f);
        Handler handler = new Handler(Looper.getMainLooper());
        this.mainThreadHandler = handler;
        handler.post(new Runnable() {
            @Override
            public final void run() {
                RenderSynchronizer.this.lambda$new$0();
            }
        });
        Logging.d("RenderSynchronizer", "Created");
    }

    private void closeRenderWindow() {
        this.renderWindowOpen = false;
        traceRenderWindowChange();
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRenderWindowClose();
        }
    }

    public void lambda$new$0() {
        this.choreographer = Choreographer.getInstance();
    }

    public void lambda$registerListener$1() {
        this.choreographer.postFrameCallback(new RenderSynchronizer$$ExternalSyntheticLambda2(this));
    }

    public void onDisplayRefreshCycleBegin(long j) {
        synchronized (this.lock) {
            try {
                if (this.listeners.isEmpty()) {
                    Logging.d("RenderSynchronizer", "No listeners, unsubscribing to frame callbacks");
                    this.isListening = false;
                    return;
                }
                this.choreographer.postFrameCallback(new RenderSynchronizer$$ExternalSyntheticLambda2(this));
                long j2 = j - this.lastOpenedTimeNanos;
                long j3 = j - this.lastRefreshTimeNanos;
                this.lastRefreshTimeNanos = j;
                if (Math.abs(j2 - this.targetFrameIntervalNanos) < Math.abs((j2 - this.targetFrameIntervalNanos) + j3)) {
                    this.lastOpenedTimeNanos = j;
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
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRenderWindowOpen();
        }
    }

    private void traceRenderWindowChange() {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter("RenderWindow", this.renderWindowOpen ? 1L : 0L);
        }
    }

    public void registerListener(Listener listener) {
        this.listeners.add(listener);
        synchronized (this.lock) {
            try {
                if (!this.isListening) {
                    Logging.d("RenderSynchronizer", "First listener, subscribing to frame callbacks");
                    this.isListening = true;
                    this.mainThreadHandler.post(new Runnable() {
                        @Override
                        public final void run() {
                            RenderSynchronizer.this.lambda$registerListener$1();
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }
}
