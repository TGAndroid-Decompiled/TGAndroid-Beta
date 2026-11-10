package x2;

import a8.ia;
import android.net.Uri;
import h9.t1;
import java.util.Collections;
import java.util.List;
public final class h1 extends e2.l1 {
    public static final Object f58361q = new Object();
    public final long f58362e;
    public final long f58363f;
    public final long f58364g;
    public final long h;
    public final long f58365i;
    public final long f58366j;
    public final boolean f58367k;
    public final boolean f58368l;
    public final boolean f58369m;
    public final Object f58370n;
    public final e2.l0 f58371o;
    public final e2.f0 f58372p;

    static {
        boolean z9;
        e2.d0 d0Var;
        e2.z zVar = new e2.z();
        e2.c0 c0Var = new e2.c0();
        List list = Collections.EMPTY_LIST;
        t1 t1Var = t1.f14399e;
        e2.e0 e0Var = new e2.e0();
        e2.h0 h0Var = e2.h0.d;
        Uri uri = Uri.EMPTY;
        if (c0Var.f10200b != null && c0Var.f10199a == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        ia.p(z9);
        if (uri != null) {
            if (c0Var.f10199a != null) {
                d0Var = new e2.d0(c0Var);
            } else {
                d0Var = null;
            }
            new e2.g0(uri, null, d0Var, null, list, null, t1Var, -9223372036854775807L);
        }
        new e2.a0(zVar);
        new e2.f0(e0Var);
        e2.o0 o0Var = e2.o0.L;
    }

    public h1(long j3, long j10, long j11, long j12, long j13, long j14, boolean z9, boolean z10, boolean z11, qb.a aVar, e2.l0 l0Var, e2.f0 f0Var) {
        this.f58362e = j3;
        this.f58363f = j10;
        this.f58364g = j11;
        this.h = j12;
        this.f58365i = j13;
        this.f58366j = j14;
        this.f58367k = z9;
        this.f58368l = z10;
        this.f58369m = z11;
        this.f58370n = aVar;
        l0Var.getClass();
        this.f58371o = l0Var;
        this.f58372p = f0Var;
    }

    @Override
    public final int b(Object obj) {
        if (f58361q.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final e2.i1 f(int i7, e2.i1 i1Var, boolean z9) {
        Object obj;
        ia.j(i7, 1);
        if (z9) {
            obj = f58361q;
        } else {
            obj = null;
        }
        Object obj2 = obj;
        i1Var.getClass();
        e2.c cVar = e2.c.f10195c;
        i1Var.h(null, obj2, 0, this.f58364g, -this.f58365i, cVar, false);
        return i1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i7) {
        ia.j(i7, 1);
        return f58361q;
    }

    @Override
    public final e2.k1 m(int r25, e2.k1 r26, long r27) {
        throw new UnsupportedOperationException("Method not decompiled: x2.h1.m(int, e2.k1, long):e2.k1");
    }

    @Override
    public final int o() {
        return 1;
    }
}
