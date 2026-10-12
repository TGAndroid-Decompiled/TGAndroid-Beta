package s9;

import com.google.android.gms.internal.cast.i4;
import di.w6;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class g implements ScheduledExecutorService, AutoCloseable {
    public final ExecutorService f45064a;
    public final ScheduledExecutorService f45065b;

    public g(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f45064a = executorService;
        this.f45065b = scheduledExecutorService;
    }

    @Override
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f45064a.awaitTermination(j10, timeUnit);
    }

    @Override
    public final void close() {
        i4.i(this);
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f45064a.execute(runnable);
    }

    @Override
    public final List invokeAll(Collection collection) {
        return this.f45064a.invokeAll(collection);
    }

    @Override
    public final Object invokeAny(Collection collection) {
        return this.f45064a.invokeAny(collection);
    }

    @Override
    public final boolean isShutdown() {
        return this.f45064a.isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return this.f45064a.isTerminated();
    }

    @Override
    public final ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        return new i(new w6(this, runnable, j10, timeUnit, 5));
    }

    @Override
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return new i(new d(this, runnable, j10, j11, timeUnit, 0));
    }

    @Override
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return new i(new d(this, runnable, j10, j11, timeUnit, 1));
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
        return this.f45064a.submit(callable);
    }

    @Override
    public final List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f45064a.invokeAll(collection, j10, timeUnit);
    }

    @Override
    public final Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f45064a.invokeAny(collection, j10, timeUnit);
    }

    @Override
    public final ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        return new i(new w6(this, callable, j10, timeUnit, 6));
    }

    @Override
    public final Future submit(Runnable runnable, Object obj) {
        return this.f45064a.submit(runnable, obj);
    }

    @Override
    public final Future submit(Runnable runnable) {
        return this.f45064a.submit(runnable);
    }
}
