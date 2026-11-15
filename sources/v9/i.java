package v9;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import o5.p;
import pb.l;
import q6.m;
public final class i implements Executor {
    public static final Logger f58756f = Logger.getLogger(i.class.getName());
    public final Executor f58757a;
    public final ArrayDeque f58758b = new ArrayDeque();
    public int f58759c = 1;
    public long d = 0;
    public final l f58760e = new l(this);

    public i(Executor executor) {
        m.g(executor);
        this.f58757a = executor;
    }

    @Override
    public final void execute(Runnable runnable) {
        m.g(runnable);
        synchronized (this.f58758b) {
            int i7 = this.f58759c;
            if (i7 != 4 && i7 != 3) {
                long j3 = this.d;
                p pVar = new p(1, runnable);
                this.f58758b.add(pVar);
                this.f58759c = 2;
                try {
                    this.f58757a.execute(this.f58760e);
                    if (this.f58759c == 2) {
                        synchronized (this.f58758b) {
                            try {
                                if (this.d == j3 && this.f58759c == 2) {
                                    this.f58759c = 3;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f58758b) {
                        try {
                            int i10 = this.f58759c;
                            boolean z10 = true;
                            if ((i10 != 1 && i10 != 2) || !this.f58758b.removeLastOccurrence(pVar)) {
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
            this.f58758b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f58757a + "}";
    }
}
