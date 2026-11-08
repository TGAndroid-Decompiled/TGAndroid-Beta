package zd;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.fx;
public final class v0 extends u0 implements g0 {
    public final Executor f60121c;

    public v0(Executor executor) {
        this.f60121c = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override
    public final l0 a(long j3, y1 y1Var, id.h hVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f60121c;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(y1Var, j3, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                a1 a1Var = (a1) hVar.get(y.f60131b);
                if (a1Var != null) {
                    a1Var.cancel(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            return new k0(scheduledFuture);
        }
        return c0.f60056s.a(j3, y1Var, hVar);
    }

    @Override
    public final void b(long j3, m mVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f60121c;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            fx fxVar = new fx(this, mVar, false, 12);
            id.h hVar = mVar.f60093e;
            try {
                scheduledFuture = scheduledExecutorService.schedule(fxVar, j3, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                a1 a1Var = (a1) hVar.get(y.f60131b);
                if (a1Var != null) {
                    a1Var.cancel(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            mVar.v(new j(scheduledFuture, 0));
        } else {
            c0.f60056s.b(j3, mVar);
        }
    }

    @Override
    public final void c(id.h hVar, Runnable runnable) {
        try {
            this.f60121c.execute(runnable);
        } catch (RejectedExecutionException e10) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e10);
            a1 a1Var = (a1) hVar.get(y.f60131b);
            if (a1Var != null) {
                a1Var.cancel(cancellationException);
            }
            ge.e eVar = j0.f60083a;
            ge.d.f13851c.c(hVar, runnable);
        }
    }

    @Override
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.f60121c;
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
        if ((obj instanceof v0) && ((v0) obj).f60121c == this.f60121c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f60121c);
    }

    @Override
    public final String toString() {
        return this.f60121c.toString();
    }
}
