package t7;

import com.google.android.gms.internal.cast.i4;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
public abstract class m implements ExecutorService, AutoCloseable {
    @Override
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return ((rb.h) this).f45188a.awaitTermination(j10, timeUnit);
    }

    @Override
    public final void close() {
        i4.j(this);
    }

    @Override
    public final List invokeAll(Collection collection) {
        return ((rb.h) this).f45188a.invokeAll(collection);
    }

    @Override
    public final Object invokeAny(Collection collection) {
        return ((rb.h) this).f45188a.invokeAny(collection);
    }

    @Override
    public final boolean isShutdown() {
        return ((rb.h) this).f45188a.isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return ((rb.h) this).f45188a.isTerminated();
    }

    @Override
    public final void shutdown() {
        ((rb.h) this).f45188a.shutdown();
    }

    @Override
    public final List shutdownNow() {
        return ((rb.h) this).f45188a.shutdownNow();
    }

    @Override
    public final Future submit(Runnable runnable) {
        return ((rb.h) this).f45188a.submit(runnable);
    }

    public final String toString() {
        return ((rb.h) this).f45188a.toString();
    }

    @Override
    public final List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
        return ((rb.h) this).f45188a.invokeAll(collection, j10, timeUnit);
    }

    @Override
    public final Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
        return ((rb.h) this).f45188a.invokeAny(collection, j10, timeUnit);
    }

    @Override
    public final Future submit(Runnable runnable, Object obj) {
        return ((rb.h) this).f45188a.submit(runnable, obj);
    }

    @Override
    public final Future submit(Callable callable) {
        return ((rb.h) this).f45188a.submit(callable);
    }
}
