package t7;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
public abstract class m implements ExecutorService, AutoCloseable {
    @Override
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return ((jb.h) this).f9786a.awaitTermination(j10, timeUnit);
    }

    @Override
    public final void close() {
        cf.b.i(this);
    }

    @Override
    public final List invokeAll(Collection collection) {
        return ((jb.h) this).f9786a.invokeAll(collection);
    }

    @Override
    public final Object invokeAny(Collection collection) {
        return ((jb.h) this).f9786a.invokeAny(collection);
    }

    @Override
    public final boolean isShutdown() {
        return ((jb.h) this).f9786a.isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return ((jb.h) this).f9786a.isTerminated();
    }

    @Override
    public final void shutdown() {
        ((jb.h) this).f9786a.shutdown();
    }

    @Override
    public final List shutdownNow() {
        return ((jb.h) this).f9786a.shutdownNow();
    }

    @Override
    public final Future submit(Runnable runnable) {
        return ((jb.h) this).f9786a.submit(runnable);
    }

    public final String toString() {
        return ((jb.h) this).f9786a.toString();
    }

    @Override
    public final List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
        return ((jb.h) this).f9786a.invokeAll(collection, j10, timeUnit);
    }

    @Override
    public final Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
        return ((jb.h) this).f9786a.invokeAny(collection, j10, timeUnit);
    }

    @Override
    public final Future submit(Runnable runnable, Object obj) {
        return ((jb.h) this).f9786a.submit(runnable, obj);
    }

    @Override
    public final Future submit(Callable callable) {
        return ((jb.h) this).f9786a.submit(callable);
    }
}
