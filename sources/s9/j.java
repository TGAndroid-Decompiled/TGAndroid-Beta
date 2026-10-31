package s9;

import j9.u;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import l5.o;
import n6.l;
public final class j implements Executor {
    public static final Logger f48115f = Logger.getLogger(j.class.getName());
    public final Executor f48116a;
    public final ArrayDeque f48117b = new ArrayDeque();
    public int f48118c = 1;
    public long d = 0;
    public final u e = new u(this);

    public j(Executor executor) {
        l.g(executor);
        this.f48116a = executor;
    }

    @Override
    public final void execute(Runnable runnable) {
        l.g(runnable);
        synchronized (this.f48117b) {
            int i10 = this.f48118c;
            if (i10 != 4 && i10 != 3) {
                long j10 = this.d;
                o oVar = new o(1, runnable);
                this.f48117b.add(oVar);
                this.f48118c = 2;
                try {
                    this.f48116a.execute(this.e);
                    if (this.f48118c == 2) {
                        synchronized (this.f48117b) {
                            try {
                                if (this.d == j10 && this.f48118c == 2) {
                                    this.f48118c = 3;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f48117b) {
                        try {
                            int i11 = this.f48118c;
                            boolean z10 = true;
                            if ((i11 != 1 && i11 != 2) || !this.f48117b.removeLastOccurrence(oVar)) {
                                z10 = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z10) {
                                throw e;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f48117b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f48116a + "}";
    }
}
