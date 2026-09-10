package u2;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
public final class j1 extends b2.k1 {
    public static final Object f42350q = new Object();
    public final long e;
    public final long f42351f;
    public final long f42352g;
    public final long h;
    public final long f42353i;
    public final long f42354j;
    public final boolean f42355k;
    public final boolean f42356l;
    public final boolean f42357m;
    public final Object f42358n;
    public final b2.k0 f42359o;
    public final b2.e0 f42360p;

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
        if (b0Var.f1632b != null && b0Var.f1631a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        if (uri != null) {
            if (b0Var.f1631a != null) {
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

    public j1(long j3, long j10, long j11, long j12, long j13, long j14, boolean z10, boolean z11, boolean z12, na.d dVar, b2.k0 k0Var, b2.e0 e0Var) {
        this.e = j3;
        this.f42351f = j10;
        this.f42352g = j11;
        this.h = j12;
        this.f42353i = j13;
        this.f42354j = j14;
        this.f42355k = z10;
        this.f42356l = z11;
        this.f42357m = z12;
        this.f42358n = dVar;
        k0Var.getClass();
        this.f42359o = k0Var;
        this.f42360p = e0Var;
    }

    @Override
    public final int b(Object obj) {
        if (f42350q.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final b2.h1 f(int i10, b2.h1 h1Var, boolean z10) {
        Object obj;
        e2.d.c(i10, 1);
        if (z10) {
            obj = f42350q;
        } else {
            obj = null;
        }
        Object obj2 = obj;
        h1Var.getClass();
        b2.b bVar = b2.b.f1628c;
        h1Var.h(null, obj2, 0, this.f42352g, -this.f42353i, bVar, false);
        return h1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i10) {
        e2.d.c(i10, 1);
        return f42350q;
    }

    @Override
    public final b2.j1 m(int r25, b2.j1 r26, long r27) {
        throw new UnsupportedOperationException("Method not decompiled: u2.j1.m(int, b2.j1, long):b2.j1");
    }

    @Override
    public final int o() {
        return 1;
    }
}
