package qd;

import j7.l1;
import java.util.concurrent.Executor;
import jd.a0;
import jd.x0;
import od.w;
public final class d extends x0 implements Executor {
    public static final d f46624c = new a0();
    public static final a0 d;

    static {
        a0 a0Var = l.f46636c;
        int i10 = w.f19538a;
        if (64 >= i10) {
            i10 = 64;
        }
        int j10 = od.a.j(i10, 12, "kotlinx.coroutines.io.parallelism");
        a0Var.getClass();
        if (j10 >= 1) {
            if (j10 < k.d) {
                if (j10 >= 1) {
                    a0Var = new od.j(a0Var, j10);
                } else {
                    throw new IllegalArgumentException(l1.k(j10, "Expected positive parallelism level, but got ").toString());
                }
            }
            d = a0Var;
            return;
        }
        throw new IllegalArgumentException(l1.k(j10, "Expected positive parallelism level, but got ").toString());
    }

    @Override
    public final void c(sc.h hVar, Runnable runnable) {
        d.c(hVar, runnable);
    }

    @Override
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override
    public final void execute(Runnable runnable) {
        c(sc.i.f47711a, runnable);
    }

    @Override
    public final String toString() {
        return "Dispatchers.IO";
    }
}
