package v9;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import o5.o;
import org.telegram.ui.fx;
import q6.m;
public final class i implements Executor {
    public static final Logger f57158f = Logger.getLogger(i.class.getName());
    public final Executor f57159a;
    public final ArrayDeque f57160b = new ArrayDeque();
    public int f57161c = 1;
    public long d = 0;
    public final fx f57162e = new fx(this);

    public i(Executor executor) {
        m.g(executor);
        this.f57159a = executor;
    }

    @Override
    public final void execute(Runnable runnable) {
        m.g(runnable);
        synchronized (this.f57160b) {
            int i7 = this.f57161c;
            if (i7 != 4 && i7 != 3) {
                long j3 = this.d;
                o oVar = new o(1, runnable);
                this.f57160b.add(oVar);
                this.f57161c = 2;
                try {
                    this.f57159a.execute(this.f57162e);
                    if (this.f57161c == 2) {
                        synchronized (this.f57160b) {
                            try {
                                if (this.d == j3 && this.f57161c == 2) {
                                    this.f57161c = 3;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f57160b) {
                        try {
                            int i10 = this.f57161c;
                            boolean z9 = true;
                            if ((i10 != 1 && i10 != 2) || !this.f57160b.removeLastOccurrence(oVar)) {
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
            this.f57160b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f57159a + "}";
    }
}
