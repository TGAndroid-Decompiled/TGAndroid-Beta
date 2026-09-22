package r9;

import i9.s;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import l5.p;
import n6.l;
public final class j implements Executor {
    public static final Logger f42165f = Logger.getLogger(j.class.getName());
    public final Executor f42166a;
    public final ArrayDeque f42167b = new ArrayDeque();
    public int f42168c = 1;
    public long d = 0;
    public final s e = new s(this);

    public j(Executor executor) {
        l.h(executor);
        this.f42166a = executor;
    }

    @Override
    public final void execute(Runnable runnable) {
        l.h(runnable);
        synchronized (this.f42167b) {
            int i10 = this.f42168c;
            if (i10 != 4 && i10 != 3) {
                long j3 = this.d;
                p pVar = new p(1, runnable);
                this.f42167b.add(pVar);
                this.f42168c = 2;
                try {
                    this.f42166a.execute(this.e);
                    if (this.f42168c == 2) {
                        synchronized (this.f42167b) {
                            try {
                                if (this.d == j3 && this.f42168c == 2) {
                                    this.f42168c = 3;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f42167b) {
                        try {
                            int i11 = this.f42168c;
                            boolean z10 = true;
                            if ((i11 != 1 && i11 != 2) || !this.f42167b.removeLastOccurrence(pVar)) {
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
            this.f42167b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f42166a + "}";
    }
}
