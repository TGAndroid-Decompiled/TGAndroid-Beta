package s9;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.dg;
public final class f implements ScheduledExecutorService, AutoCloseable {
    public final ExecutorService f48122a;
    public final ScheduledExecutorService f48123b;

    public f(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f48122a = executorService;
        this.f48123b = scheduledExecutorService;
    }

    @Override
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f48122a.awaitTermination(j10, timeUnit);
    }

    @Override
    public final void close() {
        cf.b.h(this);
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f48122a.execute(runnable);
    }

    @Override
    public final List invokeAll(Collection collection) {
        return this.f48122a.invokeAll(collection);
    }

    @Override
    public final Object invokeAny(Collection collection) {
        return this.f48122a.invokeAny(collection);
    }

    @Override
    public final boolean isShutdown() {
        return this.f48122a.isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return this.f48122a.isTerminated();
    }

    @Override
    public final ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        return new i(new dg(this, runnable, j10, timeUnit, 6));
    }

    @Override
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return new i(new c(this, runnable, j10, j11, timeUnit, 0));
    }

    @Override
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return new i(new c(this, runnable, j10, j11, timeUnit, 1));
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
        return this.f48122a.submit(callable);
    }

    @Override
    public final List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f48122a.invokeAll(collection, j10, timeUnit);
    }

    @Override
    public final Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f48122a.invokeAny(collection, j10, timeUnit);
    }

    @Override
    public final ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        return new i(new dg(this, callable, j10, timeUnit, 7));
    }

    @Override
    public final Future submit(Runnable runnable, Object obj) {
        return this.f48122a.submit(runnable, obj);
    }

    @Override
    public final Future submit(Runnable runnable) {
        return this.f48122a.submit(runnable);
    }
}
