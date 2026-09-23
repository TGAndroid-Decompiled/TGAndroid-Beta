package r9;

import i9.s;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import l5.p;
import n6.l;
public final class i implements Executor {
    public static final Logger f42120f = Logger.getLogger(i.class.getName());
    public final Executor f42121a;
    public final ArrayDeque f42122b = new ArrayDeque();
    public int f42123c = 1;
    public long d = 0;
    public final s e = new s(this);

    public i(Executor executor) {
        l.h(executor);
        this.f42121a = executor;
    }

    @Override
    public final void execute(Runnable runnable) {
        l.h(runnable);
        synchronized (this.f42122b) {
            int i10 = this.f42123c;
            if (i10 != 4 && i10 != 3) {
                long j3 = this.d;
                p pVar = new p(1, runnable);
                this.f42122b.add(pVar);
                this.f42123c = 2;
                try {
                    this.f42121a.execute(this.e);
                    if (this.f42123c == 2) {
                        synchronized (this.f42122b) {
                            try {
                                if (this.d == j3 && this.f42123c == 2) {
                                    this.f42123c = 3;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f42122b) {
                        try {
                            int i11 = this.f42123c;
                            boolean z10 = true;
                            if ((i11 != 1 && i11 != 2) || !this.f42122b.removeLastOccurrence(pVar)) {
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
            this.f42122b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f42121a + "}";
    }
}
