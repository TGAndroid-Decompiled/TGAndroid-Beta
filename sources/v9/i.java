package v9;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import o5.o;
import org.telegram.ui.fx;
import q6.m;
public final class i implements Executor {
    public static final Logger f57275f = Logger.getLogger(i.class.getName());
    public final Executor f57276a;
    public final ArrayDeque f57277b = new ArrayDeque();
    public int f57278c = 1;
    public long d = 0;
    public final fx f57279e = new fx(this);

    public i(Executor executor) {
        m.g(executor);
        this.f57276a = executor;
    }

    @Override
    public final void execute(Runnable runnable) {
        m.g(runnable);
        synchronized (this.f57277b) {
            int i7 = this.f57278c;
            if (i7 != 4 && i7 != 3) {
                long j3 = this.d;
                o oVar = new o(1, runnable);
                this.f57277b.add(oVar);
                this.f57278c = 2;
                try {
                    this.f57276a.execute(this.f57279e);
                    if (this.f57278c == 2) {
                        synchronized (this.f57277b) {
                            try {
                                if (this.d == j3 && this.f57278c == 2) {
                                    this.f57278c = 3;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f57277b) {
                        try {
                            int i10 = this.f57278c;
                            boolean z9 = true;
                            if ((i10 != 1 && i10 != 2) || !this.f57277b.removeLastOccurrence(oVar)) {
                                z9 = false;
                            }
                            if (!(e10 instanceof RejectedExecutionException) || z9) {
                                throw e10;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f57277b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f57276a + "}";
    }
}
