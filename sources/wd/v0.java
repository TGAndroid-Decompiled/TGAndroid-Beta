package wd;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public final class v0 extends u0 implements g0 {
    public final Executor f57541c;

    public v0(Executor executor) {
        this.f57541c = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override
    public final void a(long j10, m mVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f57541c;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            u9.k kVar = new u9.k(this, mVar, false, 6);
            fd.h hVar = mVar.f57513e;
            try {
                scheduledFuture = scheduledExecutorService.schedule(kVar, j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                a1 a1Var = (a1) hVar.get(y.f57551b);
                if (a1Var != null) {
                    a1Var.cancel(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            mVar.v(new j(scheduledFuture, 0));
        } else {
            c0.f57476s.a(j10, mVar);
        }
    }

    @Override
    public final l0 b(long j10, y1 y1Var, fd.h hVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f57541c;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(y1Var, j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                a1 a1Var = (a1) hVar.get(y.f57551b);
                if (a1Var != null) {
                    a1Var.cancel(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            return new k0(scheduledFuture);
        }
        return c0.f57476s.b(j10, y1Var, hVar);
    }

    @Override
    public final void c(fd.h hVar, Runnable runnable) {
        try {
            this.f57541c.execute(runnable);
        } catch (RejectedExecutionException e10) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e10);
            a1 a1Var = (a1) hVar.get(y.f57551b);
            if (a1Var != null) {
                a1Var.cancel(cancellationException);
            }
            de.e eVar = j0.f57503a;
            de.d.f8823c.c(hVar, runnable);
        }
    }

    @Override
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.f57541c;
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
        if ((obj instanceof v0) && ((v0) obj).f57541c == this.f57541c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f57541c);
    }

    @Override
    public final String toString() {
        return this.f57541c.toString();
    }
}
