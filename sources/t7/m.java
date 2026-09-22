package t7;

import com.google.android.gms.internal.cast.k4;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
public abstract class m implements ExecutorService, AutoCloseable {
    @Override
    public final boolean awaitTermination(long j3, TimeUnit timeUnit) {
        return ((qb.h) this).f41567a.awaitTermination(j3, timeUnit);
    }

    @Override
    public final void close() {
        k4.j(this);
    }

    @Override
    public final List invokeAll(Collection collection) {
        return ((qb.h) this).f41567a.invokeAll(collection);
    }

    @Override
    public final Object invokeAny(Collection collection) {
        return ((qb.h) this).f41567a.invokeAny(collection);
    }

    @Override
    public final boolean isShutdown() {
        return ((qb.h) this).f41567a.isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return ((qb.h) this).f41567a.isTerminated();
    }

    @Override
    public final void shutdown() {
        ((qb.h) this).f41567a.shutdown();
    }

    @Override
    public final List shutdownNow() {
        return ((qb.h) this).f41567a.shutdownNow();
    }

    @Override
    public final Future submit(Runnable runnable) {
        return ((qb.h) this).f41567a.submit(runnable);
    }

    public final String toString() {
        return ((qb.h) this).f41567a.toString();
    }

    @Override
    public final List invokeAll(Collection collection, long j3, TimeUnit timeUnit) {
        return ((qb.h) this).f41567a.invokeAll(collection, j3, timeUnit);
    }

    @Override
    public final Object invokeAny(Collection collection, long j3, TimeUnit timeUnit) {
        return ((qb.h) this).f41567a.invokeAny(collection, j3, timeUnit);
    }

    @Override
    public final Future submit(Runnable runnable, Object obj) {
        return ((qb.h) this).f41567a.submit(runnable, obj);
    }

    @Override
    public final Future submit(Callable callable) {
        return ((qb.h) this).f41567a.submit(callable);
    }
}
