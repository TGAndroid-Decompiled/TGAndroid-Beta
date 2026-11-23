package v9;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import o5.o;
import pb.l;
import q6.m;
public final class i implements Executor {
    public static final Logger f59368f = Logger.getLogger(i.class.getName());
    public final Executor f59369a;
    public final ArrayDeque f59370b = new ArrayDeque();
    public int f59371c = 1;
    public long d = 0;
    public final l f59372e = new l(this);

    public i(Executor executor) {
        m.h(executor);
        this.f59369a = executor;
    }

    @Override
    public final void execute(Runnable runnable) {
        m.h(runnable);
        synchronized (this.f59370b) {
            int i7 = this.f59371c;
            if (i7 != 4 && i7 != 3) {
                long j3 = this.d;
                o oVar = new o(1, runnable);
                this.f59370b.add(oVar);
                this.f59371c = 2;
                try {
                    this.f59369a.execute(this.f59372e);
                    if (this.f59371c == 2) {
                        synchronized (this.f59370b) {
                            try {
                                if (this.d == j3 && this.f59371c == 2) {
                                    this.f59371c = 3;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f59370b) {
                        try {
                            int i10 = this.f59371c;
                            boolean z10 = true;
                            if ((i10 != 1 && i10 != 2) || !this.f59370b.removeLastOccurrence(oVar)) {
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
            this.f59370b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f59369a + "}";
    }
}
