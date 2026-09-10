package zd;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public final class y0 extends x0 implements j0 {
    public final Executor f48066c;

    public y0(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.f48066c = executor;
        Method method2 = ee.c.f7476a;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor != null && (method = ee.c.f7476a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override
    public final o0 a(long j3, e2 e2Var, id.h hVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f48066c;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(e2Var, j3, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                e0.e(hVar, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            return new n0(scheduledFuture);
        }
        return f0.f48011s.a(j3, e2Var, hVar);
    }

    @Override
    public final void b(long j3, m mVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f48066c;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            u4.e eVar = new u4.e(this, mVar, false, 14);
            id.h hVar = mVar.e;
            try {
                scheduledFuture = scheduledExecutorService.schedule(eVar, j3, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                e0.e(hVar, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            mVar.v(new j(scheduledFuture, 0));
        } else {
            f0.f48011s.b(j3, mVar);
        }
    }

    @Override
    public final void c(id.h hVar, Runnable runnable) {
        try {
            this.f48066c.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            e0.e(hVar, cancellationException);
            m0.f48028b.c(hVar, runnable);
        }
    }

    @Override
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.f48066c;
        if (executor instanceof ExecutorService) {
            executorService = (ExecutorService) executor;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof y0) && ((y0) obj).f48066c == this.f48066c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f48066c);
    }

    @Override
    public final String toString() {
        return this.f48066c.toString();
    }
}
