package x2;

import a8.ja;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
public final class h1 extends e2.l1 {
    public static final Object f59542q = new Object();
    public final long f59543e;
    public final long f59544f;
    public final long f59545g;
    public final long h;
    public final long f59546i;
    public final long f59547j;
    public final boolean f59548k;
    public final boolean f59549l;
    public final boolean f59550m;
    public final Object f59551n;
    public final e2.l0 f59552o;
    public final e2.f0 f59553p;

    static {
        boolean z10;
        e2.d0 d0Var;
        e2.z zVar = new e2.z();
        e2.c0 c0Var = new e2.c0();
        List list = Collections.EMPTY_LIST;
        h9.s1 s1Var = h9.s1.f13749e;
        e2.e0 e0Var = new e2.e0();
        e2.h0 h0Var = e2.h0.d;
        Uri uri = Uri.EMPTY;
        if (c0Var.f10031b != null && c0Var.f10030a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        ja.p(z10);
        if (uri != null) {
            if (c0Var.f10030a != null) {
                d0Var = new e2.d0(c0Var);
            } else {
                d0Var = null;
            }
            new e2.g0(uri, null, d0Var, null, list, null, s1Var, -9223372036854775807L);
        }
        new e2.a0(zVar);
        new e2.f0(e0Var);
        e2.o0 o0Var = e2.o0.L;
    }

    public h1(long j3, long j10, long j11, long j12, long j13, long j14, boolean z10, boolean z11, boolean z12, nb.a aVar, e2.l0 l0Var, e2.f0 f0Var) {
        this.f59543e = j3;
        this.f59544f = j10;
        this.f59545g = j11;
        this.h = j12;
        this.f59546i = j13;
        this.f59547j = j14;
        this.f59548k = z10;
        this.f59549l = z11;
        this.f59550m = z12;
        this.f59551n = aVar;
        l0Var.getClass();
        this.f59552o = l0Var;
        this.f59553p = f0Var;
    }

    @Override
    public final int b(Object obj) {
        if (f59542q.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final e2.i1 f(int i7, e2.i1 i1Var, boolean z10) {
        Object obj;
        ja.j(i7, 1);
        if (z10) {
            obj = f59542q;
        } else {
            obj = null;
        }
        Object obj2 = obj;
        i1Var.getClass();
        e2.c cVar = e2.c.f10026c;
        i1Var.h(null, obj2, 0, this.f59545g, -this.f59546i, cVar, false);
        return i1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i7) {
        ja.j(i7, 1);
        return f59542q;
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
