package r9;

import i9.s;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import l5.p;
import n6.m;
public final class i implements Executor {
    public static final Logger f47341f = Logger.getLogger(i.class.getName());
    public final Executor f47342a;
    public final ArrayDeque f47343b = new ArrayDeque();
    public int f47344c = 1;
    public long d = 0;
    public final s f47345e = new s(this);

    public i(Executor executor) {
        m.h(executor);
        this.f47342a = executor;
    }

    @Override
    public final void execute(Runnable runnable) {
        m.h(runnable);
        synchronized (this.f47343b) {
            int i10 = this.f47344c;
            if (i10 != 4 && i10 != 3) {
                long j3 = this.d;
                p pVar = new p(1, runnable);
                this.f47343b.add(pVar);
                this.f47344c = 2;
                try {
                    this.f47342a.execute(this.f47345e);
                    if (this.f47344c == 2) {
                        synchronized (this.f47343b) {
                            try {
                                if (this.d == j3 && this.f47344c == 2) {
                                    this.f47344c = 3;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e7) {
                    synchronized (this.f47343b) {
                        try {
                            int i11 = this.f47344c;
                            boolean z10 = true;
                            if ((i11 != 1 && i11 != 2) || !this.f47343b.removeLastOccurrence(pVar)) {
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
            this.f47343b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f47342a + "}";
    }
}
