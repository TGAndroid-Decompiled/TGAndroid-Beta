package u2;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public final class l1 extends a {
    public final g2.m h;
    public final g2.g f43419i;
    public final b2.s f43420j;
    public final qb.b f43422l;
    public final h1 f43424n;
    public final b2.k0 f43425o;
    public g2.c0 f43426p;
    public final long f43421k = -9223372036854775807L;
    public final boolean f43423m = true;

    public l1(b2.j0 j0Var, of.b bVar, qb.b bVar2) {
        b2.f0 f0Var;
        b2.c0 c0Var;
        this.f43419i = bVar;
        this.f43422l = bVar2;
        boolean z10 = true;
        b2.y yVar = new b2.y();
        b2.b0 b0Var = new b2.b0();
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var = e9.a1.e;
        b2.d0 d0Var = new b2.d0();
        b2.g0 g0Var = b2.g0.d;
        Uri uri = Uri.EMPTY;
        String uri2 = j0Var.f3039a.toString();
        uri2.getClass();
        e9.i0 v = e9.i0.v(e9.i0.z(j0Var));
        if (b0Var.f2934b != null && b0Var.f2933a == null) {
            z10 = false;
        }
        e2.d.g(z10);
        if (uri != null) {
            if (b0Var.f2933a != null) {
                c0Var = new b2.c0(b0Var);
            } else {
                c0Var = null;
            }
            f0Var = new b2.f0(uri, null, c0Var, null, list, null, v, -9223372036854775807L);
        } else {
            f0Var = null;
        }
        b2.k0 k0Var = new b2.k0(uri2, new b2.z(yVar), f0Var, new b2.e0(d0Var), b2.n0.K, g0Var);
        this.f43425o = k0Var;
        b2.r rVar = new b2.r();
        String str = j0Var.f3040b;
        rVar.f3248q = b2.r0.n(str == null ? "text/x-unknown" : str);
        rVar.d = j0Var.f3041c;
        rVar.e = j0Var.d;
        rVar.f3238f = j0Var.e;
        rVar.f3236b = j0Var.f3042f;
        String str2 = j0Var.f3043g;
        rVar.f3235a = str2 != null ? str2 : null;
        this.f43420j = new b2.s(rVar);
        Map map = Collections.EMPTY_MAP;
        Uri uri3 = j0Var.f3039a;
        e2.d.i(uri3, "The uri must be set.");
        this.h = new g2.m(uri3, 1, null, map, 0L, -1L, null, 1);
        this.f43424n = new h1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, k0Var, null);
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        return new k1(this.h, this.f43419i, this.f43426p, this.f43420j, this.f43421k, this.f43422l, b(f0Var), this.f43423m, null);
    }

    @Override
    public final b2.k0 i() {
        return this.f43425o;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f43426p = c0Var;
        n(this.f43424n);
    }

    @Override
    public final void o(d0 d0Var) {
        ((k1) d0Var).f43410r.e(null);
    }

    @Override
    public final void k() {
    }

    @Override
    public final void q() {
    }
}
