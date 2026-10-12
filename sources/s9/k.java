package s9;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import l5.o;
public final class k implements Executor {
    public static final Logger f45070f = Logger.getLogger(k.class.getName());
    public final Executor f45071a;
    public final ArrayDeque f45072b = new ArrayDeque();
    public int f45073c = 1;
    public long d = 0;
    public final j e = new j(this);

    public k(Executor executor) {
        n6.l.h(executor);
        this.f45071a = executor;
    }

    @Override
    public final void execute(Runnable runnable) {
        n6.l.h(runnable);
        synchronized (this.f45072b) {
            int i10 = this.f45073c;
            if (i10 != 4 && i10 != 3) {
                long j10 = this.d;
                o oVar = new o(1, runnable);
                this.f45072b.add(oVar);
                this.f45073c = 2;
                try {
                    this.f45071a.execute(this.e);
                    if (this.f45073c == 2) {
                        synchronized (this.f45072b) {
                            try {
                                if (this.d == j10 && this.f45073c == 2) {
                                    this.f45073c = 3;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f45072b) {
                        try {
                            int i11 = this.f45073c;
                            boolean z10 = true;
                            if ((i11 != 1 && i11 != 2) || !this.f45072b.removeLastOccurrence(oVar)) {
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
            this.f45072b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f45071a + "}";
    }
}
