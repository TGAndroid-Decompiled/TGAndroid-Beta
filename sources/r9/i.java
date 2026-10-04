package r9;

import i9.s;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import l5.p;
import n6.l;
public final class i implements Executor {
    public static final Logger f45952f = Logger.getLogger(i.class.getName());
    public final Executor f45953a;
    public final ArrayDeque f45954b = new ArrayDeque();
    public int f45955c = 1;
    public long d = 0;
    public final s f45956e = new s(this);

    public i(Executor executor) {
        l.h(executor);
        this.f45953a = executor;
    }

    @Override
    public final void execute(Runnable runnable) {
        l.h(runnable);
        synchronized (this.f45954b) {
            int i10 = this.f45955c;
            if (i10 != 4 && i10 != 3) {
                long j3 = this.d;
                p pVar = new p(1, runnable);
                this.f45954b.add(pVar);
                this.f45955c = 2;
                try {
                    this.f45953a.execute(this.f45956e);
                    if (this.f45955c == 2) {
                        synchronized (this.f45954b) {
                            try {
                                if (this.d == j3 && this.f45955c == 2) {
                                    this.f45955c = 3;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e7) {
                    synchronized (this.f45954b) {
                        try {
                            int i11 = this.f45955c;
                            boolean z10 = true;
                            if ((i11 != 1 && i11 != 2) || !this.f45954b.removeLastOccurrence(pVar)) {
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
            this.f45954b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f45953a + "}";
    }
}
