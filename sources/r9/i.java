package r9;

import i9.s;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import l5.o;
import n6.l;
public final class i implements Executor {
    public static final Logger f47163f = Logger.getLogger(i.class.getName());
    public final Executor f47164a;
    public final ArrayDeque f47165b = new ArrayDeque();
    public int f47166c = 1;
    public long d = 0;
    public final s f47167e = new s(this);

    public i(Executor executor) {
        l.h(executor);
        this.f47164a = executor;
    }

    @Override
    public final void execute(Runnable runnable) {
        l.h(runnable);
        synchronized (this.f47165b) {
            int i10 = this.f47166c;
            if (i10 != 4 && i10 != 3) {
                long j3 = this.d;
                o oVar = new o(1, runnable);
                this.f47165b.add(oVar);
                this.f47166c = 2;
                try {
                    this.f47164a.execute(this.f47167e);
                    if (this.f47166c == 2) {
                        synchronized (this.f47165b) {
                            try {
                                if (this.d == j3 && this.f47166c == 2) {
                                    this.f47166c = 3;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e7) {
                    synchronized (this.f47165b) {
                        try {
                            int i11 = this.f47166c;
                            boolean z10 = true;
                            if ((i11 != 1 && i11 != 2) || !this.f47165b.removeLastOccurrence(oVar)) {
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
            this.f47165b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f47164a + "}";
    }
}
