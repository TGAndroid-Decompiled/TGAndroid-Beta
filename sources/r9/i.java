package r9;

import i9.s;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import l5.o;
import n6.l;
public final class i implements Executor {
    public static final Logger f47117f = Logger.getLogger(i.class.getName());
    public final Executor f47118a;
    public final ArrayDeque f47119b = new ArrayDeque();
    public int f47120c = 1;
    public long d = 0;
    public final s f47121e = new s(this);

    public i(Executor executor) {
        l.h(executor);
        this.f47118a = executor;
    }

    @Override
    public final void execute(Runnable runnable) {
        l.h(runnable);
        synchronized (this.f47119b) {
            int i10 = this.f47120c;
            if (i10 != 4 && i10 != 3) {
                long j3 = this.d;
                o oVar = new o(1, runnable);
                this.f47119b.add(oVar);
                this.f47120c = 2;
                try {
                    this.f47118a.execute(this.f47121e);
                    if (this.f47120c == 2) {
                        synchronized (this.f47119b) {
                            try {
                                if (this.d == j3 && this.f47120c == 2) {
                                    this.f47120c = 3;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e7) {
                    synchronized (this.f47119b) {
                        try {
                            int i11 = this.f47120c;
                            boolean z10 = true;
                            if ((i11 != 1 && i11 != 2) || !this.f47119b.removeLastOccurrence(oVar)) {
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
            this.f47119b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f47118a + "}";
    }
}
