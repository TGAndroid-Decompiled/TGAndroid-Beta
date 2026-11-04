package v7;

import com.google.android.gms.internal.cast.g4;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
public abstract class m implements ExecutorService, AutoCloseable {
    @Override
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return ((mb.h) this).f19234a.awaitTermination(j10, timeUnit);
    }

    @Override
    public final void close() {
        g4.j(this);
    }

    @Override
    public final List invokeAll(Collection collection) {
        return ((mb.h) this).f19234a.invokeAll(collection);
    }

    @Override
    public final Object invokeAny(Collection collection) {
        return ((mb.h) this).f19234a.invokeAny(collection);
    }

    @Override
    public final boolean isShutdown() {
        return ((mb.h) this).f19234a.isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return ((mb.h) this).f19234a.isTerminated();
    }

    @Override
    public final void shutdown() {
        ((mb.h) this).f19234a.shutdown();
    }

    @Override
    public final List shutdownNow() {
        return ((mb.h) this).f19234a.shutdownNow();
    }

    @Override
    public final Future submit(Runnable runnable) {
        return ((mb.h) this).f19234a.submit(runnable);
    }

    public final String toString() {
        return ((mb.h) this).f19234a.toString();
    }

    @Override
    public final List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
        return ((mb.h) this).f19234a.invokeAll(collection, j10, timeUnit);
    }

    @Override
    public final Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
        return ((mb.h) this).f19234a.invokeAny(collection, j10, timeUnit);
    }

    @Override
    public final Future submit(Runnable runnable, Object obj) {
        return ((mb.h) this).f19234a.submit(runnable, obj);
    }

    @Override
    public final Future submit(Callable callable) {
        return ((mb.h) this).f19234a.submit(callable);
    }
}
