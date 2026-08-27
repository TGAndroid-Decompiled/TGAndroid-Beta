package pd;

import id.a0;
import id.y0;
import java.util.concurrent.Executor;
import nd.v;

public final class d extends y0 implements Executor {

    public static final d f45717c = new d();
    public static final a0 d;

    static {
        a0 iVar = l.f45729c;
        int i10 = v.f18508a;
        if (64 >= i10) {
            i10 = 64;
        }
        int iJ = nd.a.j(i10, 12, "kotlinx.coroutines.io.parallelism");
        iVar.getClass();
        if (iJ < 1) {
            throw new IllegalArgumentException(i0.a.k(iJ, "Expected positive parallelism level, but got ").toString());
        }
        if (iJ < k.d) {
            if (iJ < 1) {
                throw new IllegalArgumentException(i0.a.k(iJ, "Expected positive parallelism level, but got ").toString());
            }
            iVar = new nd.i(iVar, iJ);
        }
        d = iVar;
    }

    @Override
    public final void c(rc.h hVar, Runnable runnable) {
        d.c(hVar, runnable);
    }

    @Override
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override
    public final void execute(Runnable runnable) {
        c(rc.i.f46899a, runnable);
    }

    @Override
    public final String toString() {
        return "Dispatchers.IO";
    }
}
