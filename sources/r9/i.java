package r9;

import i9.s;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import l5.o;
import n6.l;
public final class i implements Executor {
    public static final Logger f42453f = Logger.getLogger(i.class.getName());
    public final Executor f42454a;
    public final ArrayDeque f42455b = new ArrayDeque();
    public int f42456c = 1;
    public long d = 0;
    public final s e = new s(this);

    public i(Executor executor) {
        l.h(executor);
        this.f42454a = executor;
    }

    @Override
    public final void execute(Runnable runnable) {
        l.h(runnable);
        synchronized (this.f42455b) {
            int i10 = this.f42456c;
            if (i10 != 4 && i10 != 3) {
                long j3 = this.d;
                o oVar = new o(1, runnable);
                this.f42455b.add(oVar);
                this.f42456c = 2;
                try {
                    this.f42454a.execute(this.e);
                    if (this.f42456c == 2) {
                        synchronized (this.f42455b) {
                            try {
                                if (this.d == j3 && this.f42456c == 2) {
                                    this.f42456c = 3;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f42455b) {
                        try {
                            int i11 = this.f42456c;
                            boolean z10 = true;
                            if ((i11 != 1 && i11 != 2) || !this.f42455b.removeLastOccurrence(oVar)) {
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
            this.f42455b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f42454a + "}";
    }
}
