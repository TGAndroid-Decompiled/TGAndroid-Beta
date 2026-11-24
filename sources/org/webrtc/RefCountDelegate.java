package org.webrtc;

import java.util.concurrent.atomic.AtomicInteger;
public class RefCountDelegate implements RefCounted {
    private final AtomicInteger refCount = new AtomicInteger(1);
    private final Runnable releaseCallback;

    public RefCountDelegate(Runnable runnable) {
        this.releaseCallback = runnable;
    }

    @Override
    public void release() {
        Runnable runnable;
        int decrementAndGet = this.refCount.decrementAndGet();
        if (decrementAndGet >= 0) {
            if (decrementAndGet == 0 && (runnable = this.releaseCallback) != null) {
                runnable.run();
                return;
            }
            return;
        }
        dq9.m("release() called on an object with refcount < 1");
    }

    @Override
    public void retain() {
        if (this.refCount.incrementAndGet() >= 2) {
            return;
        }
        dq9.m("retain() called on an object with refcount < 1");
    }

    public boolean safeRetain() {
        int i = this.refCount.get();
        while (i != 0) {
            if (this.refCount.weakCompareAndSet(i, i + 1)) {
                return true;
            }
            i = this.refCount.get();
        }
        return false;
    }
}
