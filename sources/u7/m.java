package u7;

import com.google.android.gms.internal.cast.f4;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
public abstract class m implements ExecutorService, AutoCloseable {
    @Override
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return ((sb.h) this).f48091a.awaitTermination(j10, timeUnit);
    }

    @Override
    public final void close() {
        f4.j(this);
    }

    @Override
    public final List invokeAll(Collection collection) {
        return ((sb.h) this).f48091a.invokeAll(collection);
    }

    @Override
    public final Object invokeAny(Collection collection) {
        return ((sb.h) this).f48091a.invokeAny(collection);
    }

    @Override
    public final boolean isShutdown() {
        return ((sb.h) this).f48091a.isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return ((sb.h) this).f48091a.isTerminated();
    }

    @Override
    public final void shutdown() {
        ((sb.h) this).f48091a.shutdown();
    }

    @Override
    public final List shutdownNow() {
        return ((sb.h) this).f48091a.shutdownNow();
    }

    @Override
    public final Future submit(Runnable runnable) {
        return ((sb.h) this).f48091a.submit(runnable);
    }

    public final String toString() {
        return ((sb.h) this).f48091a.toString();
    }

    @Override
    public final List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
        return ((sb.h) this).f48091a.invokeAll(collection, j10, timeUnit);
    }

    @Override
    public final Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
        return ((sb.h) this).f48091a.invokeAny(collection, j10, timeUnit);
    }

    @Override
    public final Future submit(Runnable runnable, Object obj) {
        return ((sb.h) this).f48091a.submit(runnable, obj);
    }

    @Override
    public final Future submit(Callable callable) {
        return ((sb.h) this).f48091a.submit(callable);
    }
}
