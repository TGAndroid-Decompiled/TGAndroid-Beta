package w7;

import com.google.android.gms.internal.cast.f4;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
public abstract class m implements ExecutorService, AutoCloseable {
    @Override
    public final boolean awaitTermination(long j3, TimeUnit timeUnit) {
        return ((pb.h) this).f53534a.awaitTermination(j3, timeUnit);
    }

    @Override
    public final void close() {
        f4.j(this);
    }

    @Override
    public final List invokeAll(Collection collection) {
        return ((pb.h) this).f53534a.invokeAll(collection);
    }

    @Override
    public final Object invokeAny(Collection collection) {
        return ((pb.h) this).f53534a.invokeAny(collection);
    }

    @Override
    public final boolean isShutdown() {
        return ((pb.h) this).f53534a.isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return ((pb.h) this).f53534a.isTerminated();
    }

    @Override
    public final void shutdown() {
        ((pb.h) this).f53534a.shutdown();
    }

    @Override
    public final List shutdownNow() {
        return ((pb.h) this).f53534a.shutdownNow();
    }

    @Override
    public final Future submit(Runnable runnable) {
        return ((pb.h) this).f53534a.submit(runnable);
    }

    public final String toString() {
        return ((pb.h) this).f53534a.toString();
    }

    @Override
    public final List invokeAll(Collection collection, long j3, TimeUnit timeUnit) {
        return ((pb.h) this).f53534a.invokeAll(collection, j3, timeUnit);
    }

    @Override
    public final Object invokeAny(Collection collection, long j3, TimeUnit timeUnit) {
        return ((pb.h) this).f53534a.invokeAny(collection, j3, timeUnit);
    }

    @Override
    public final Future submit(Runnable runnable, Object obj) {
        return ((pb.h) this).f53534a.submit(runnable, obj);
    }

    @Override
    public final Future submit(Callable callable) {
        return ((pb.h) this).f53534a.submit(callable);
    }
}
