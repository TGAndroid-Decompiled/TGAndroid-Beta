package sd;

import java.util.concurrent.Executor;
import ld.a0;
import ld.x0;
import qd.v;
public final class d extends x0 implements Executor {
    public static final d f47264c = new a0();
    public static final a0 d;

    static {
        a0 a0Var = l.f47276c;
        int i10 = v.f44822a;
        if (64 >= i10) {
            i10 = 64;
        }
        int j10 = qd.a.j(i10, 12, "kotlinx.coroutines.io.parallelism");
        a0Var.getClass();
        if (j10 >= 1) {
            if (j10 < k.d) {
                if (j10 >= 1) {
                    a0Var = new qd.i(a0Var, j10);
                } else {
                    throw new IllegalArgumentException(l.d.j(j10, "Expected positive parallelism level, but got ").toString());
                }
            }
            d = a0Var;
            return;
        }
        throw new IllegalArgumentException(l.d.j(j10, "Expected positive parallelism level, but got ").toString());
    }

    @Override
    public final void c(uc.h hVar, Runnable runnable) {
        d.c(hVar, runnable);
    }

    @Override
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override
    public final void execute(Runnable runnable) {
        c(uc.i.f48480a, runnable);
    }

    @Override
    public final String toString() {
        return "Dispatchers.IO";
    }
}
