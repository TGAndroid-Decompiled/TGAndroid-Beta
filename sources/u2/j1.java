package u2;

import a8.yb;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
public final class j1 extends b2.p1 {
    public static final Object f49322q = new Object();
    public final long e;
    public final long f49323f;
    public final long f49324g;
    public final long h;
    public final long f49325i;
    public final long f49326j;
    public final boolean f49327k;
    public final boolean f49328l;
    public final boolean f49329m;
    public final Object f49330n;
    public final b2.p0 f49331o;
    public final b2.j0 f49332p;

    static {
        boolean z10;
        b2.h0 h0Var;
        b2.d0 d0Var = new b2.d0();
        b2.g0 g0Var = new b2.g0();
        List list = Collections.EMPTY_LIST;
        f9.s1 s1Var = f9.s1.e;
        b2.i0 i0Var = new b2.i0();
        b2.l0 l0Var = b2.l0.d;
        Uri uri = Uri.EMPTY;
        if (g0Var.f3208b != null && g0Var.f3207a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        yb.p(z10);
        if (uri != null) {
            if (g0Var.f3207a != null) {
                h0Var = new b2.h0(g0Var);
            } else {
                h0Var = null;
            }
            new b2.k0(uri, null, h0Var, null, list, null, s1Var, -9223372036854775807L);
        }
        new b2.e0(d0Var);
        new b2.j0(i0Var);
        b2.s0 s0Var = b2.s0.L;
    }

    public j1(long j10, long j11, long j12, long j13, long j14, long j15, boolean z10, boolean z11, boolean z12, sb.b bVar, b2.p0 p0Var, b2.j0 j0Var) {
        this.e = j10;
        this.f49323f = j11;
        this.f49324g = j12;
        this.h = j13;
        this.f49325i = j14;
        this.f49326j = j15;
        this.f49327k = z10;
        this.f49328l = z11;
        this.f49329m = z12;
        this.f49330n = bVar;
        p0Var.getClass();
        this.f49331o = p0Var;
        this.f49332p = j0Var;
    }

    @Override
    public final int b(Object obj) {
        if (f49322q.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final b2.m1 f(int i10, b2.m1 m1Var, boolean z10) {
        Object obj;
        yb.j(i10, 1);
        if (z10) {
            obj = f49322q;
        } else {
            obj = null;
        }
        Object obj2 = obj;
        m1Var.getClass();
        b2.c cVar = b2.c.f3153c;
        m1Var.h(null, obj2, 0, this.f49324g, -this.f49325i, cVar, false);
        return m1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i10) {
        yb.j(i10, 1);
        return f49322q;
    }

    @Override
    public final b2.o1 m(int r25, b2.o1 r26, long r27) {
        throw new UnsupportedOperationException("Method not decompiled: u2.j1.m(int, b2.o1, long):b2.o1");
    }

    @Override
    public final int o() {
        return 1;
    }
}
