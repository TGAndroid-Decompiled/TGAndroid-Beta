package u2;

import android.net.Uri;
import e9.x1;
import java.util.Collections;
import java.util.List;
import v7.t6;
public final class j1 extends b2.o1 {
    public static final Object f49917q = new Object();
    public final long e;
    public final long f49918f;
    public final long f49919g;
    public final long h;
    public final long f49920i;
    public final long f49921j;
    public final boolean f49922k;
    public final boolean f49923l;
    public final boolean f49924m;
    public final Object f49925n;
    public final b2.p0 f49926o;
    public final b2.j0 f49927p;

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
        this.f49918f = j11;
        this.f49919g = j12;
        this.h = j13;
        this.f49920i = j14;
        this.f49921j = j15;
        this.f49922k = z10;
        this.f49923l = z11;
        this.f49924m = z12;
        this.f49925n = aVar;
        p0Var.getClass();
        this.f49926o = p0Var;
        this.f49927p = j0Var;
    }

    @Override
    public final int b(Object obj) {
        if (f49917q.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final b2.l1 f(int i10, b2.l1 l1Var, boolean z10) {
        Object obj;
        t6.j(i10, 1);
        if (z10) {
            obj = f49917q;
        } else {
            obj = null;
        }
        Object obj2 = obj;
        l1Var.getClass();
        b2.c cVar = b2.c.f1990c;
        l1Var.h(null, obj2, 0, this.f49919g, -this.f49920i, cVar, false);
        return l1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i10) {
        t6.j(i10, 1);
        return f49917q;
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
