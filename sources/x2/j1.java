package x2;

import a8.la;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
public final class j1 extends e2.l1 {
    public static final Object f60158q = new Object();
    public final long f60159e;
    public final long f60160f;
    public final long f60161g;
    public final long h;
    public final long f60162i;
    public final long f60163j;
    public final boolean f60164k;
    public final boolean f60165l;
    public final boolean f60166m;
    public final Object f60167n;
    public final e2.l0 f60168o;
    public final e2.f0 f60169p;

    static {
        boolean z10;
        e2.d0 d0Var;
        e2.z zVar = new e2.z();
        e2.c0 c0Var = new e2.c0();
        List list = Collections.EMPTY_LIST;
        h9.t1 t1Var = h9.t1.f14100e;
        e2.e0 e0Var = new e2.e0();
        e2.h0 h0Var = e2.h0.d;
        Uri uri = Uri.EMPTY;
        if (c0Var.f10375b != null && c0Var.f10374a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        la.p(z10);
        if (uri != null) {
            if (c0Var.f10374a != null) {
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

    public j1(long j3, long j10, long j11, long j12, long j13, long j14, boolean z10, boolean z11, boolean z12, nb.a aVar, e2.l0 l0Var, e2.f0 f0Var) {
        this.f60159e = j3;
        this.f60160f = j10;
        this.f60161g = j11;
        this.h = j12;
        this.f60162i = j13;
        this.f60163j = j14;
        this.f60164k = z10;
        this.f60165l = z11;
        this.f60166m = z12;
        this.f60167n = aVar;
        l0Var.getClass();
        this.f60168o = l0Var;
        this.f60169p = f0Var;
    }

    @Override
    public final int b(Object obj) {
        if (f60158q.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final e2.i1 f(int i7, e2.i1 i1Var, boolean z10) {
        Object obj;
        la.j(i7, 1);
        if (z10) {
            obj = f60158q;
        } else {
            obj = null;
        }
        Object obj2 = obj;
        i1Var.getClass();
        e2.c cVar = e2.c.f10370c;
        i1Var.h(null, obj2, 0, this.f60161g, -this.f60162i, cVar, false);
        return i1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i7) {
        la.j(i7, 1);
        return f60158q;
    }

    @Override
    public final e2.k1 m(int r25, e2.k1 r26, long r27) {
        throw new UnsupportedOperationException("Method not decompiled: x2.j1.m(int, e2.k1, long):e2.k1");
    }

    @Override
    public final int o() {
        return 1;
    }
}
