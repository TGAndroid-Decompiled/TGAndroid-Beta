package s9;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import l5.p;
import n6.l;
public final class j implements Executor {
    public static final Logger f46571f = Logger.getLogger(j.class.getName());
    public final Executor f46572a;
    public final ArrayDeque f46573b = new ArrayDeque();
    public int f46574c = 1;
    public long d = 0;
    public final i e = new i(this);

    public j(Executor executor) {
        l.h(executor);
        this.f46572a = executor;
    }

    @Override
    public final void execute(Runnable runnable) {
        l.h(runnable);
        synchronized (this.f46573b) {
            int i10 = this.f46574c;
            if (i10 != 4 && i10 != 3) {
                long j10 = this.d;
                p pVar = new p(1, runnable);
                this.f46573b.add(pVar);
                this.f46574c = 2;
                try {
                    this.f46572a.execute(this.e);
                    if (this.f46574c == 2) {
                        synchronized (this.f46573b) {
                            try {
                                if (this.d == j10 && this.f46574c == 2) {
                                    this.f46574c = 3;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f46573b) {
                        try {
                            int i11 = this.f46574c;
                            boolean z10 = true;
                            if ((i11 != 1 && i11 != 2) || !this.f46573b.removeLastOccurrence(pVar)) {
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
            this.f46573b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f46572a + "}";
    }
}
