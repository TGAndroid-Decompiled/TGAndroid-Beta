package u2;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
public final class g1 extends b2.k1 {
    public static final Object f48785q = new Object();
    public final long f48786e;
    public final long f48787f;
    public final long f48788g;
    public final long h;
    public final long f48789i;
    public final long f48790j;
    public final boolean f48791k;
    public final boolean f48792l;
    public final boolean f48793m;
    public final Object f48794n;
    public final b2.k0 f48795o;
    public final b2.e0 f48796p;

    static {
        boolean z10;
        b2.c0 c0Var;
        b2.y yVar = new b2.y();
        b2.b0 b0Var = new b2.b0();
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var = e9.a1.f8712e;
        b2.d0 d0Var = new b2.d0();
        b2.g0 g0Var = b2.g0.d;
        Uri uri = Uri.EMPTY;
        if (b0Var.f3242b != null && b0Var.f3241a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        if (uri != null) {
            if (b0Var.f3241a != null) {
                c0Var = new b2.c0(b0Var);
            } else {
                c0Var = null;
            }
            new b2.f0(uri, null, c0Var, null, list, null, a1Var, -9223372036854775807L);
        }
        new b2.z(yVar);
        new b2.e0(d0Var);
        b2.n0 n0Var = b2.n0.K;
    }

    public g1(long j3, long j10, long j11, long j12, long j13, long j14, boolean z10, boolean z11, boolean z12, t7.t tVar, b2.k0 k0Var, b2.e0 e0Var) {
        this.f48786e = j3;
        this.f48787f = j10;
        this.f48788g = j11;
        this.h = j12;
        this.f48789i = j13;
        this.f48790j = j14;
        this.f48791k = z10;
        this.f48792l = z11;
        this.f48793m = z12;
        this.f48794n = tVar;
        k0Var.getClass();
        this.f48795o = k0Var;
        this.f48796p = e0Var;
    }

    @Override
    public final int b(Object obj) {
        if (f48785q.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final b2.h1 f(int i10, b2.h1 h1Var, boolean z10) {
        Object obj;
        e2.d.c(i10, 1);
        if (z10) {
            obj = f48785q;
        } else {
            obj = null;
        }
        Object obj2 = obj;
        h1Var.getClass();
        b2.b bVar = b2.b.f3237c;
        h1Var.h(null, obj2, 0, this.f48788g, -this.f48789i, bVar, false);
        return h1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i10) {
        e2.d.c(i10, 1);
        return f48785q;
    }

    @Override
    public final b2.j1 m(int r25, b2.j1 r26, long r27) {
        throw new UnsupportedOperationException("Method not decompiled: u2.g1.m(int, b2.j1, long):b2.j1");
    }

    @Override
    public final int o() {
        return 1;
    }
}
