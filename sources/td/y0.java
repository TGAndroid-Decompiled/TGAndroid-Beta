package td;

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
    public final Executor f48691c;

    public y0(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.f48691c = executor;
        Method method2 = yd.c.f54417a;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor != null && (method = yd.c.f54417a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override
    public final void a(long j10, m mVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f48691c;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            z1 z1Var = new z1(0, this, mVar);
            cd.h hVar = mVar.e;
            try {
                scheduledFuture = scheduledExecutorService.schedule(z1Var, j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                e0.e(hVar, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            mVar.v(new j(scheduledFuture, 0));
        } else {
            f0.f48635s.a(j10, mVar);
        }
    }

    @Override
    public final o0 b(long j10, f2 f2Var, cd.h hVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f48691c;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(f2Var, j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                e0.e(hVar, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            return new n0(scheduledFuture);
        }
        return f0.f48635s.b(j10, f2Var, hVar);
    }

    @Override
    public final void c(cd.h hVar, Runnable runnable) {
        try {
            this.f48691c.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            e0.e(hVar, cancellationException);
            m0.f48653b.c(hVar, runnable);
        }
    }

    @Override
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.f48691c;
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
        if ((obj instanceof y0) && ((y0) obj).f48691c == this.f48691c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f48691c);
    }

    @Override
    public final String toString() {
        return this.f48691c.toString();
    }
}
