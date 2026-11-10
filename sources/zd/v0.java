package zd;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.ix;
public final class v0 extends u0 implements g0 {
    public final Executor f60129c;

    public v0(Executor executor) {
        this.f60129c = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override
    public final l0 a(long j3, y1 y1Var, id.h hVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f60129c;
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
                a1 a1Var = (a1) hVar.get(y.f60139b);
                if (a1Var != null) {
                    a1Var.cancel(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            return new k0(scheduledFuture);
        }
        return c0.f60064s.a(j3, y1Var, hVar);
    }

    @Override
    public final void b(long j3, m mVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f60129c;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            ix ixVar = new ix(this, mVar, false, 12);
            id.h hVar = mVar.f60101e;
            try {
                scheduledFuture = scheduledExecutorService.schedule(ixVar, j3, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                a1 a1Var = (a1) hVar.get(y.f60139b);
                if (a1Var != null) {
                    a1Var.cancel(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            mVar.v(new j(scheduledFuture, 0));
        } else {
            c0.f60064s.b(j3, mVar);
        }
    }

    @Override
    public final void c(id.h hVar, Runnable runnable) {
        try {
            this.f60129c.execute(runnable);
        } catch (RejectedExecutionException e10) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e10);
            a1 a1Var = (a1) hVar.get(y.f60139b);
            if (a1Var != null) {
                a1Var.cancel(cancellationException);
            }
            ge.e eVar = j0.f60091a;
            ge.d.f13853c.c(hVar, runnable);
        }
    }

    @Override
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.f60129c;
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
        if ((obj instanceof v0) && ((v0) obj).f60129c == this.f60129c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f60129c);
    }

    @Override
    public final String toString() {
        return this.f60129c.toString();
    }
}
