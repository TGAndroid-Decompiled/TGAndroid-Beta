package v9;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import o5.p;
import pb.l;
import q6.m;
public final class j implements Executor {
    public static final Logger f59453f = Logger.getLogger(j.class.getName());
    public final Executor f59454a;
    public final ArrayDeque f59455b = new ArrayDeque();
    public int f59456c = 1;
    public long d = 0;
    public final l f59457e = new l(this);

    public j(Executor executor) {
        m.h(executor);
        this.f59454a = executor;
    }

    @Override
    public final void execute(Runnable runnable) {
        m.h(runnable);
        synchronized (this.f59455b) {
            int i7 = this.f59456c;
            if (i7 != 4 && i7 != 3) {
                long j3 = this.d;
                p pVar = new p(1, runnable);
                this.f59455b.add(pVar);
                this.f59456c = 2;
                try {
                    this.f59454a.execute(this.f59457e);
                    if (this.f59456c == 2) {
                        synchronized (this.f59455b) {
                            try {
                                if (this.d == j3 && this.f59456c == 2) {
                                    this.f59456c = 3;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f59455b) {
                        try {
                            int i10 = this.f59456c;
                            boolean z10 = true;
                            if ((i10 != 1 && i10 != 2) || !this.f59455b.removeLastOccurrence(pVar)) {
                                z10 = false;
                            }
                            if (!(e10 instanceof RejectedExecutionException) || z10) {
                                throw e10;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f59455b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f59454a + "}";
    }
}
