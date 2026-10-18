package s9;

import ai.u3;
import com.google.android.gms.internal.cast.i4;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class f implements ScheduledExecutorService, AutoCloseable {
    public final ExecutorService f46181a;
    public final ScheduledExecutorService f46182b;

    public f(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f46181a = executorService;
        this.f46182b = scheduledExecutorService;
    }

    @Override
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f46181a.awaitTermination(j10, timeUnit);
    }

    @Override
    public final void close() {
        i4.i(this);
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f46181a.execute(runnable);
    }

    @Override
    public final List invokeAll(Collection collection) {
        return this.f46181a.invokeAll(collection);
    }

    @Override
    public final Object invokeAny(Collection collection) {
        return this.f46181a.invokeAny(collection);
    }

    @Override
    public final boolean isShutdown() {
        return this.f46181a.isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return this.f46181a.isTerminated();
    }

    @Override
    public final ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        return new h(new u3(this, runnable, j10, timeUnit, 6));
    }

    @Override
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return new h(new c(this, runnable, j10, j11, timeUnit, 0));
    }

    @Override
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return new h(new c(this, runnable, j10, j11, timeUnit, 1));
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
        return this.f46181a.submit(callable);
    }

    @Override
    public final List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f46181a.invokeAll(collection, j10, timeUnit);
    }

    @Override
    public final Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f46181a.invokeAny(collection, j10, timeUnit);
    }

    @Override
    public final ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        return new h(new u3(this, callable, j10, timeUnit, 7));
    }

    @Override
    public final Future submit(Runnable runnable, Object obj) {
        return this.f46181a.submit(runnable, obj);
    }

    @Override
    public final Future submit(Runnable runnable) {
        return this.f46181a.submit(runnable);
    }
}
