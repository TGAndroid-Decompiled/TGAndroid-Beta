package s9;

import j9.u;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import l5.o;
import n6.l;
public final class j implements Executor {
    public static final Logger f48126f = Logger.getLogger(j.class.getName());
    public final Executor f48127a;
    public final ArrayDeque f48128b = new ArrayDeque();
    public int f48129c = 1;
    public long d = 0;
    public final u e = new u(this);

    public j(Executor executor) {
        l.g(executor);
        this.f48127a = executor;
    }

    @Override
    public final void execute(Runnable runnable) {
        l.g(runnable);
        synchronized (this.f48128b) {
            int i10 = this.f48129c;
            if (i10 != 4 && i10 != 3) {
                long j10 = this.d;
                o oVar = new o(1, runnable);
                this.f48128b.add(oVar);
                this.f48129c = 2;
                try {
                    this.f48127a.execute(this.e);
                    if (this.f48129c == 2) {
                        synchronized (this.f48128b) {
                            try {
                                if (this.d == j10 && this.f48129c == 2) {
                                    this.f48129c = 3;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f48128b) {
                        try {
                            int i11 = this.f48129c;
                            boolean z10 = true;
                            if ((i11 != 1 && i11 != 2) || !this.f48128b.removeLastOccurrence(oVar)) {
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
            this.f48128b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f48127a + "}";
    }
}
