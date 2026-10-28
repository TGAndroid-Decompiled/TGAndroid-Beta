package t9;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import m5.p;
import o6.l;
public final class j implements Executor {
    public static final Logger f48786f = Logger.getLogger(j.class.getName());
    public final Executor f48787a;
    public final ArrayDeque f48788b = new ArrayDeque();
    public int f48789c = 1;
    public long d = 0;
    public final i e = new i(this);

    public j(Executor executor) {
        l.h(executor);
        this.f48787a = executor;
    }

    @Override
    public final void execute(Runnable runnable) {
        l.h(runnable);
        synchronized (this.f48788b) {
            int i10 = this.f48789c;
            if (i10 != 4 && i10 != 3) {
                long j10 = this.d;
                p pVar = new p(1, runnable);
                this.f48788b.add(pVar);
                this.f48789c = 2;
                try {
                    this.f48787a.execute(this.e);
                    if (this.f48789c == 2) {
                        synchronized (this.f48788b) {
                            try {
                                if (this.d == j10 && this.f48789c == 2) {
                                    this.f48789c = 3;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f48788b) {
                        try {
                            int i11 = this.f48789c;
                            boolean z10 = true;
                            if ((i11 != 1 && i11 != 2) || !this.f48788b.removeLastOccurrence(pVar)) {
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
            this.f48788b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f48787a + "}";
    }
}
