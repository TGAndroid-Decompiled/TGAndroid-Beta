package r9;

import i9.s;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import l5.o;
import n6.l;
public final class j implements Executor {
    public static final Logger f45081f = Logger.getLogger(j.class.getName());
    public final Executor f45082a;
    public final ArrayDeque f45083b = new ArrayDeque();
    public int f45084c = 1;
    public long d = 0;
    public final s f45085e = new s(this);

    public j(Executor executor) {
        l.h(executor);
        this.f45082a = executor;
    }

    @Override
    public final void execute(Runnable runnable) {
        l.h(runnable);
        synchronized (this.f45083b) {
            int i10 = this.f45084c;
            if (i10 != 4 && i10 != 3) {
                long j3 = this.d;
                o oVar = new o(1, runnable);
                this.f45083b.add(oVar);
                this.f45084c = 2;
                try {
                    this.f45082a.execute(this.f45085e);
                    if (this.f45084c == 2) {
                        synchronized (this.f45083b) {
                            try {
                                if (this.d == j3 && this.f45084c == 2) {
                                    this.f45084c = 3;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e7) {
                    synchronized (this.f45083b) {
                        try {
                            int i11 = this.f45084c;
                            boolean z10 = true;
                            if ((i11 != 1 && i11 != 2) || !this.f45083b.removeLastOccurrence(oVar)) {
                                z10 = false;
                            }
                            if (!(e7 instanceof RejectedExecutionException) || z10) {
                                throw e7;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f45083b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f45082a + "}";
    }
}
