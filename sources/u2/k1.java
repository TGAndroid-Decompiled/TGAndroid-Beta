package u2;

import android.net.Uri;
import e9.x1;
import java.util.Collections;
import java.util.List;
import v7.u6;
public final class k1 extends b2.o1 {
    public static final Object f47349q = new Object();
    public final long e;
    public final long f47350f;
    public final long f47351g;
    public final long h;
    public final long f47352i;
    public final long f47353j;
    public final boolean f47354k;
    public final boolean f47355l;
    public final boolean f47356m;
    public final Object f47357n;
    public final b2.o0 f47358o;
    public final b2.i0 f47359p;

    static {
        boolean z10;
        b2.g0 g0Var;
        b2.c0 c0Var = new b2.c0();
        b2.f0 f0Var = new b2.f0();
        List list = Collections.EMPTY_LIST;
        x1 x1Var = x1.e;
        b2.h0 h0Var = new b2.h0();
        b2.k0 k0Var = b2.k0.d;
        Uri uri = Uri.EMPTY;
        if (f0Var.f3751b != null && f0Var.f3750a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.p(z10);
        if (uri != null) {
            if (f0Var.f3750a != null) {
                g0Var = new b2.g0(f0Var);
            } else {
                g0Var = null;
            }
            new b2.j0(uri, null, g0Var, null, list, null, x1Var, -9223372036854775807L);
        }
        new b2.d0(c0Var);
        new b2.i0(h0Var);
        b2.r0 r0Var = b2.r0.L;
    }

    public k1(long j10, long j11, long j12, long j13, long j14, long j15, boolean z10, boolean z11, boolean z12, t7.u uVar, b2.o0 o0Var, b2.i0 i0Var) {
        this.e = j10;
        this.f47350f = j11;
        this.f47351g = j12;
        this.h = j13;
        this.f47352i = j14;
        this.f47353j = j15;
        this.f47354k = z10;
        this.f47355l = z11;
        this.f47356m = z12;
        this.f47357n = uVar;
        o0Var.getClass();
        this.f47358o = o0Var;
        this.f47359p = i0Var;
    }

    @Override
    public final int b(Object obj) {
        if (f47349q.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final b2.l1 f(int i10, b2.l1 l1Var, boolean z10) {
        Object obj;
        u6.j(i10, 1);
        if (z10) {
            obj = f47349q;
        } else {
            obj = null;
        }
        Object obj2 = obj;
        l1Var.getClass();
        b2.c cVar = b2.c.f3701c;
        l1Var.h(null, obj2, 0, this.f47351g, -this.f47352i, cVar, false);
        return l1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i10) {
        u6.j(i10, 1);
        return f47349q;
    }

    @Override
    public final b2.n1 m(int r25, b2.n1 r26, long r27) {
        throw new UnsupportedOperationException("Method not decompiled: u2.k1.m(int, b2.n1, long):b2.n1");
    }

    @Override
    public final int o() {
        return 1;
    }
}
