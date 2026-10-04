package r9;

import i9.s;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import l5.p;
import n6.l;
public final class i implements Executor {
    public static final Logger f45960f = Logger.getLogger(i.class.getName());
    public final Executor f45961a;
    public final ArrayDeque f45962b = new ArrayDeque();
    public int f45963c = 1;
    public long d = 0;
    public final s f45964e = new s(this);

    public i(Executor executor) {
        l.h(executor);
        this.f45961a = executor;
    }

    @Override
    public final void execute(Runnable runnable) {
        l.h(runnable);
        synchronized (this.f45962b) {
            int i10 = this.f45963c;
            if (i10 != 4 && i10 != 3) {
                long j3 = this.d;
                p pVar = new p(1, runnable);
                this.f45962b.add(pVar);
                this.f45963c = 2;
                try {
                    this.f45961a.execute(this.f45964e);
                    if (this.f45963c == 2) {
                        synchronized (this.f45962b) {
                            try {
                                if (this.d == j3 && this.f45963c == 2) {
                                    this.f45963c = 3;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e7) {
                    synchronized (this.f45962b) {
                        try {
                            int i11 = this.f45963c;
                            boolean z10 = true;
                            if ((i11 != 1 && i11 != 2) || !this.f45962b.removeLastOccurrence(pVar)) {
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
            this.f45962b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f45961a + "}";
    }
}
