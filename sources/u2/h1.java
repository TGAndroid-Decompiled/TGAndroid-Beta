package u2;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
public final class h1 extends b2.k1 {
    public static final Object f43375q = new Object();
    public final long e;
    public final long f43376f;
    public final long f43377g;
    public final long h;
    public final long f43378i;
    public final long f43379j;
    public final boolean f43380k;
    public final boolean f43381l;
    public final boolean f43382m;
    public final Object f43383n;
    public final b2.k0 f43384o;
    public final b2.e0 f43385p;

    static {
        boolean z10;
        b2.c0 c0Var;
        b2.y yVar = new b2.y();
        b2.b0 b0Var = new b2.b0();
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var = e9.a1.e;
        b2.d0 d0Var = new b2.d0();
        b2.g0 g0Var = b2.g0.d;
        Uri uri = Uri.EMPTY;
        if (b0Var.f2934b != null && b0Var.f2933a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        if (uri != null) {
            if (b0Var.f2933a != null) {
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

    public h1(long j3, long j10, long j11, long j12, long j13, long j14, boolean z10, boolean z11, boolean z12, na.d dVar, b2.k0 k0Var, b2.e0 e0Var) {
        this.e = j3;
        this.f43376f = j10;
        this.f43377g = j11;
        this.h = j12;
        this.f43378i = j13;
        this.f43379j = j14;
        this.f43380k = z10;
        this.f43381l = z11;
        this.f43382m = z12;
        this.f43383n = dVar;
        k0Var.getClass();
        this.f43384o = k0Var;
        this.f43385p = e0Var;
    }

    @Override
    public final int b(Object obj) {
        if (f43375q.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final b2.h1 f(int i10, b2.h1 h1Var, boolean z10) {
        Object obj;
        e2.d.c(i10, 1);
        if (z10) {
            obj = f43375q;
        } else {
            obj = null;
        }
        Object obj2 = obj;
        h1Var.getClass();
        b2.b bVar = b2.b.f2930c;
        h1Var.h(null, obj2, 0, this.f43377g, -this.f43378i, bVar, false);
        return h1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i10) {
        e2.d.c(i10, 1);
        return f43375q;
    }

    @Override
    public final b2.j1 m(int r25, b2.j1 r26, long r27) {
        throw new UnsupportedOperationException("Method not decompiled: u2.h1.m(int, b2.j1, long):b2.j1");
    }

    @Override
    public final int o() {
        return 1;
    }
}
