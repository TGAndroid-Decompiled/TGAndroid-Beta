package v9;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import o5.o;
import org.telegram.ui.fx;
import q6.m;
public final class i implements Executor {
    public static final Logger f57182f = Logger.getLogger(i.class.getName());
    public final Executor f57183a;
    public final ArrayDeque f57184b = new ArrayDeque();
    public int f57185c = 1;
    public long d = 0;
    public final fx f57186e = new fx(this);

    public i(Executor executor) {
        m.g(executor);
        this.f57183a = executor;
    }

    @Override
    public final void execute(Runnable runnable) {
        m.g(runnable);
        synchronized (this.f57184b) {
            int i7 = this.f57185c;
            if (i7 != 4 && i7 != 3) {
                long j3 = this.d;
                o oVar = new o(1, runnable);
                this.f57184b.add(oVar);
                this.f57185c = 2;
                try {
                    this.f57183a.execute(this.f57186e);
                    if (this.f57185c == 2) {
                        synchronized (this.f57184b) {
                            try {
                                if (this.d == j3 && this.f57185c == 2) {
                                    this.f57185c = 3;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f57184b) {
                        try {
                            int i10 = this.f57185c;
                            boolean z9 = true;
                            if ((i10 != 1 && i10 != 2) || !this.f57184b.removeLastOccurrence(oVar)) {
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
            this.f57184b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f57183a + "}";
    }
}
