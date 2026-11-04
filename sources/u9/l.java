package u9;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import n5.o;
public final class l implements Executor {
    public static final Logger f55771f = Logger.getLogger(l.class.getName());
    public final Executor f55772a;
    public final ArrayDeque f55773b = new ArrayDeque();
    public int f55774c = 1;
    public long d = 0;
    public final k f55775e = new k(this);

    public l(Executor executor) {
        p6.m.g(executor);
        this.f55772a = executor;
    }

    @Override
    public final void execute(Runnable runnable) {
        p6.m.g(runnable);
        synchronized (this.f55773b) {
            int i3 = this.f55774c;
            if (i3 != 4 && i3 != 3) {
                long j10 = this.d;
                o oVar = new o(1, runnable);
                this.f55773b.add(oVar);
                this.f55774c = 2;
                try {
                    this.f55772a.execute(this.f55775e);
                    if (this.f55774c == 2) {
                        synchronized (this.f55773b) {
                            try {
                                if (this.d == j10 && this.f55774c == 2) {
                                    this.f55774c = 3;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f55773b) {
                        try {
                            int i10 = this.f55774c;
                            boolean z10 = true;
                            if ((i10 != 1 && i10 != 2) || !this.f55773b.removeLastOccurrence(oVar)) {
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
            this.f55773b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f55772a + "}";
    }
}
