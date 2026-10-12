package r9;

import i9.s;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import l5.p;
import n6.m;
public final class i implements Executor {
    public static final Logger f47333f = Logger.getLogger(i.class.getName());
    public final Executor f47334a;
    public final ArrayDeque f47335b = new ArrayDeque();
    public int f47336c = 1;
    public long d = 0;
    public final s f47337e = new s(this);

    public i(Executor executor) {
        m.h(executor);
        this.f47334a = executor;
    }

    @Override
    public final void execute(Runnable runnable) {
        m.h(runnable);
        synchronized (this.f47335b) {
            int i10 = this.f47336c;
            if (i10 != 4 && i10 != 3) {
                long j3 = this.d;
                p pVar = new p(1, runnable);
                this.f47335b.add(pVar);
                this.f47336c = 2;
                try {
                    this.f47334a.execute(this.f47337e);
                    if (this.f47336c == 2) {
                        synchronized (this.f47335b) {
                            try {
                                if (this.d == j3 && this.f47336c == 2) {
                                    this.f47336c = 3;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e7) {
                    synchronized (this.f47335b) {
                        try {
                            int i11 = this.f47336c;
                            boolean z10 = true;
                            if ((i11 != 1 && i11 != 2) || !this.f47335b.removeLastOccurrence(pVar)) {
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
            this.f47335b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f47334a + "}";
    }
}
