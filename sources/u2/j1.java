package u2;

import android.net.Uri;
import e9.x1;
import java.util.Collections;
import java.util.List;
import v7.u6;
public final class j1 extends b2.p1 {
    public static final Object f45945q = new Object();
    public final long e;
    public final long f45946f;
    public final long f45947g;
    public final long h;
    public final long f45948i;
    public final long f45949j;
    public final boolean f45950k;
    public final boolean f45951l;
    public final boolean f45952m;
    public final Object f45953n;
    public final b2.p0 f45954o;
    public final b2.j0 f45955p;

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
        if (g0Var.f2145b != null && g0Var.f2144a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.p(z10);
        if (uri != null) {
            if (g0Var.f2144a != null) {
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

    public j1(long j10, long j11, long j12, long j13, long j14, long j15, boolean z10, boolean z11, boolean z12, t7.u uVar, b2.p0 p0Var, b2.j0 j0Var) {
        this.e = j10;
        this.f45946f = j11;
        this.f45947g = j12;
        this.h = j13;
        this.f45948i = j14;
        this.f45949j = j15;
        this.f45950k = z10;
        this.f45951l = z11;
        this.f45952m = z12;
        this.f45953n = uVar;
        p0Var.getClass();
        this.f45954o = p0Var;
        this.f45955p = j0Var;
    }

    @Override
    public final int b(Object obj) {
        if (f45945q.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final b2.m1 f(int i10, b2.m1 m1Var, boolean z10) {
        Object obj;
        u6.j(i10, 1);
        if (z10) {
            obj = f45945q;
        } else {
            obj = null;
        }
        Object obj2 = obj;
        m1Var.getClass();
        b2.c cVar = b2.c.f2090c;
        m1Var.h(null, obj2, 0, this.f45947g, -this.f45948i, cVar, false);
        return m1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i10) {
        u6.j(i10, 1);
        return f45945q;
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
