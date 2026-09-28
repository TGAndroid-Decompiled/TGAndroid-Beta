package r9;

import ci.y6;
import com.google.android.gms.internal.cast.k4;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class f implements ScheduledExecutorService, AutoCloseable {
    public final ExecutorService f42451a;
    public final ScheduledExecutorService f42452b;

    public f(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f42451a = executorService;
        this.f42452b = scheduledExecutorService;
    }

    @Override
    public final boolean awaitTermination(long j3, TimeUnit timeUnit) {
        return this.f42451a.awaitTermination(j3, timeUnit);
    }

    @Override
    public final void close() {
        k4.i(this);
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f42451a.execute(runnable);
    }

    @Override
    public final List invokeAll(Collection collection) {
        return this.f42451a.invokeAll(collection);
    }

    @Override
    public final Object invokeAny(Collection collection) {
        return this.f42451a.invokeAny(collection);
    }

    @Override
    public final boolean isShutdown() {
        return this.f42451a.isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return this.f42451a.isTerminated();
    }

    @Override
    public final ScheduledFuture schedule(Runnable runnable, long j3, TimeUnit timeUnit) {
        return new h(new y6(this, runnable, j3, timeUnit, 5));
    }

    @Override
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j3, long j10, TimeUnit timeUnit) {
        return new h(new c(this, runnable, j3, j10, timeUnit, 0));
    }

    @Override
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j3, long j10, TimeUnit timeUnit) {
        return new h(new c(this, runnable, j3, j10, timeUnit, 1));
    }

    @Override
    public final void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override
    public final List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override
    public final Future submit(Callable callable) {
        return this.f42451a.submit(callable);
    }

    @Override
    public final List invokeAll(Collection collection, long j3, TimeUnit timeUnit) {
        return this.f42451a.invokeAll(collection, j3, timeUnit);
    }

    @Override
    public final Object invokeAny(Collection collection, long j3, TimeUnit timeUnit) {
        return this.f42451a.invokeAny(collection, j3, timeUnit);
    }

    @Override
    public final ScheduledFuture schedule(Callable callable, long j3, TimeUnit timeUnit) {
        return new h(new y6(this, callable, j3, timeUnit, 6));
    }

    @Override
    public final Future submit(Runnable runnable, Object obj) {
        return this.f42451a.submit(runnable, obj);
    }

    @Override
    public final Future submit(Runnable runnable) {
        return this.f42451a.submit(runnable);
    }
}
