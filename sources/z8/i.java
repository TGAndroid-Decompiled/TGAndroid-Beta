package z8;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import org.telegram.ui.fm;
import x5.l;
public final class i implements Executor {
    public static final Logger f50379f = Logger.getLogger(i.class.getName());
    public final Executor f50380a;
    public final ArrayDeque f50381b = new ArrayDeque();
    public int f50382c = 1;
    public long d = 0;
    public final fm f50383e = new fm(this);

    public i(Executor executor) {
        l.h(executor);
        this.f50380a = executor;
    }

    @Override
    public final void execute(Runnable runnable) {
        l.h(runnable);
        synchronized (this.f50381b) {
            int i9 = this.f50382c;
            if (i9 != 4 && i9 != 3) {
                long j10 = this.d;
                f6.c cVar = new f6.c(2, runnable);
                this.f50381b.add(cVar);
                this.f50382c = 2;
                try {
                    this.f50380a.execute(this.f50383e);
                    if (this.f50382c == 2) {
                        synchronized (this.f50381b) {
                            try {
                                if (this.d == j10 && this.f50382c == 2) {
                                    this.f50382c = 3;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f50381b) {
                        try {
                            int i10 = this.f50382c;
                            boolean z10 = true;
                            if ((i10 != 1 && i10 != 2) || !this.f50381b.removeLastOccurrence(cVar)) {
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
            this.f50381b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f50380a + "}";
    }
}
