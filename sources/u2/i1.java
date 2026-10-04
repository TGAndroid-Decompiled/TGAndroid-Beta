package u2;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
public final class i1 extends b2.k1 {
    public static final Object f47290q = new Object();
    public final long f47291e;
    public final long f47292f;
    public final long f47293g;
    public final long h;
    public final long f47294i;
    public final long f47295j;
    public final boolean f47296k;
    public final boolean f47297l;
    public final boolean f47298m;
    public final Object f47299n;
    public final b2.k0 f47300o;
    public final b2.e0 f47301p;

    static {
        boolean z10;
        b2.c0 c0Var;
        b2.y yVar = new b2.y();
        b2.b0 b0Var = new b2.b0();
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var = e9.a1.f8721e;
        b2.d0 d0Var = new b2.d0();
        b2.g0 g0Var = b2.g0.d;
        Uri uri = Uri.EMPTY;
        if (b0Var.f3165b != null && b0Var.f3164a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        if (uri != null) {
            if (b0Var.f3164a != null) {
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

    public i1(long j3, long j10, long j11, long j12, long j13, long j14, boolean z10, boolean z11, boolean z12, na.d dVar, b2.k0 k0Var, b2.e0 e0Var) {
        this.f47291e = j3;
        this.f47292f = j10;
        this.f47293g = j11;
        this.h = j12;
        this.f47294i = j13;
        this.f47295j = j14;
        this.f47296k = z10;
        this.f47297l = z11;
        this.f47298m = z12;
        this.f47299n = dVar;
        k0Var.getClass();
        this.f47300o = k0Var;
        this.f47301p = e0Var;
    }

    @Override
    public final int b(Object obj) {
        if (f47290q.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final b2.h1 f(int i10, b2.h1 h1Var, boolean z10) {
        Object obj;
        e2.d.c(i10, 1);
        if (z10) {
            obj = f47290q;
        } else {
            obj = null;
        }
        Object obj2 = obj;
        h1Var.getClass();
        b2.b bVar = b2.b.f3160c;
        h1Var.h(null, obj2, 0, this.f47293g, -this.f47294i, bVar, false);
        return h1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i10) {
        e2.d.c(i10, 1);
        return f47290q;
    }

    @Override
    public final b2.j1 m(int r25, b2.j1 r26, long r27) {
        throw new UnsupportedOperationException("Method not decompiled: u2.i1.m(int, b2.j1, long):b2.j1");
    }

    @Override
    public final int o() {
        return 1;
    }
}
