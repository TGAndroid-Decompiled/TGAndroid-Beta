package w2;

import android.net.Uri;
import b8.zb;
import java.util.Collections;
import java.util.List;
public final class j1 extends d2.n1 {
    public static final Object f57110q = new Object();
    public final long f57111e;
    public final long f57112f;
    public final long f57113g;
    public final long h;
    public final long f57114i;
    public final long f57115j;
    public final boolean f57116k;
    public final boolean f57117l;
    public final boolean f57118m;
    public final Object f57119n;
    public final d2.n0 f57120o;
    public final d2.h0 f57121p;

    static {
        boolean z10;
        d2.f0 f0Var;
        d2.b0 b0Var = new d2.b0();
        d2.e0 e0Var = new d2.e0();
        List list = Collections.EMPTY_LIST;
        g9.s1 s1Var = g9.s1.f12146e;
        d2.g0 g0Var = new d2.g0();
        d2.j0 j0Var = d2.j0.d;
        Uri uri = Uri.EMPTY;
        if (e0Var.f8074b != null && e0Var.f8073a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        zb.p(z10);
        if (uri != null) {
            if (e0Var.f8073a != null) {
                f0Var = new d2.f0(e0Var);
            } else {
                f0Var = null;
            }
            new d2.i0(uri, null, f0Var, null, list, null, s1Var, -9223372036854775807L);
        }
        new d2.c0(b0Var);
        new d2.h0(g0Var);
        d2.q0 q0Var = d2.q0.L;
    }

    public j1(long j10, long j11, long j12, long j13, long j14, long j15, boolean z10, boolean z11, boolean z12, kb.a aVar, d2.n0 n0Var, d2.h0 h0Var) {
        this.f57111e = j10;
        this.f57112f = j11;
        this.f57113g = j12;
        this.h = j13;
        this.f57114i = j14;
        this.f57115j = j15;
        this.f57116k = z10;
        this.f57117l = z11;
        this.f57118m = z12;
        this.f57119n = aVar;
        n0Var.getClass();
        this.f57120o = n0Var;
        this.f57121p = h0Var;
    }

    @Override
    public final int b(Object obj) {
        if (f57110q.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final d2.k1 f(int i3, d2.k1 k1Var, boolean z10) {
        Object obj;
        zb.j(i3, 1);
        if (z10) {
            obj = f57110q;
        } else {
            obj = null;
        }
        Object obj2 = obj;
        k1Var.getClass();
        d2.c cVar = d2.c.f8039c;
        k1Var.h(null, obj2, 0, this.f57113g, -this.f57114i, cVar, false);
        return k1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i3) {
        zb.j(i3, 1);
        return f57110q;
    }

    @Override
    public final d2.m1 m(int r25, d2.m1 r26, long r27) {
        throw new UnsupportedOperationException("Method not decompiled: w2.j1.m(int, d2.m1, long):d2.m1");
    }

    @Override
    public final int o() {
        return 1;
    }
}
