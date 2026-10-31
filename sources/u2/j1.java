package u2;

import android.net.Uri;
import e9.x1;
import java.util.Collections;
import java.util.List;
import v7.t6;
public final class j1 extends b2.o1 {
    public static final Object f49903q = new Object();
    public final long e;
    public final long f49904f;
    public final long f49905g;
    public final long h;
    public final long f49906i;
    public final long f49907j;
    public final boolean f49908k;
    public final boolean f49909l;
    public final boolean f49910m;
    public final Object f49911n;
    public final b2.p0 f49912o;
    public final b2.j0 f49913p;

    static {
        boolean z10;
        b2.h0 h0Var;
        b2.d0 d0Var = new b2.d0();
        b2.g0 g0Var = new b2.g0();
        List list = Collections.EMPTY_LIST;
        x1 x1Var = x1.e;
        b2.i0 i0Var = new b2.i0();
        b2.l0 l0Var = b2.l0.d;
        Uri uri = Uri.EMPTY;
        if (g0Var.f2042b != null && g0Var.f2041a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        t6.p(z10);
        if (uri != null) {
            if (g0Var.f2041a != null) {
                h0Var = new b2.h0(g0Var);
            } else {
                h0Var = null;
            }
            new b2.k0(uri, null, h0Var, null, list, null, x1Var, -9223372036854775807L);
        }
        new b2.e0(d0Var);
        new b2.j0(i0Var);
        b2.s0 s0Var = b2.s0.L;
    }

    public j1(long j10, long j11, long j12, long j13, long j14, long j15, boolean z10, boolean z11, boolean z12, kb.a aVar, b2.p0 p0Var, b2.j0 j0Var) {
        this.e = j10;
        this.f49904f = j11;
        this.f49905g = j12;
        this.h = j13;
        this.f49906i = j14;
        this.f49907j = j15;
        this.f49908k = z10;
        this.f49909l = z11;
        this.f49910m = z12;
        this.f49911n = aVar;
        p0Var.getClass();
        this.f49912o = p0Var;
        this.f49913p = j0Var;
    }

    @Override
    public final int b(Object obj) {
        if (f49903q.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final b2.l1 f(int i10, b2.l1 l1Var, boolean z10) {
        Object obj;
        t6.j(i10, 1);
        if (z10) {
            obj = f49903q;
        } else {
            obj = null;
        }
        Object obj2 = obj;
        l1Var.getClass();
        b2.c cVar = b2.c.f1990c;
        l1Var.h(null, obj2, 0, this.f49905g, -this.f49906i, cVar, false);
        return l1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i10) {
        t6.j(i10, 1);
        return f49903q;
    }

    @Override
    public final b2.n1 m(int r25, b2.n1 r26, long r27) {
        throw new UnsupportedOperationException("Method not decompiled: u2.j1.m(int, b2.n1, long):b2.n1");
    }

    @Override
    public final int o() {
        return 1;
    }
}
