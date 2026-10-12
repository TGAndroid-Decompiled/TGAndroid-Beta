package u2;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public final class k1 extends a {
    public final g2.m h;
    public final g2.g f48848i;
    public final b2.s f48849j;
    public final t7.t f48851l;
    public final g1 f48853n;
    public final b2.k0 f48854o;
    public g2.c0 f48855p;
    public final long f48850k = -9223372036854775807L;
    public final boolean f48852m = true;

    public k1(b2.j0 j0Var, pf.b bVar, t7.t tVar) {
        b2.f0 f0Var;
        b2.c0 c0Var;
        this.f48848i = bVar;
        this.f48851l = tVar;
        boolean z10 = true;
        b2.y yVar = new b2.y();
        b2.b0 b0Var = new b2.b0();
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var = e9.a1.f8712e;
        b2.d0 d0Var = new b2.d0();
        b2.g0 g0Var = b2.g0.d;
        Uri uri = Uri.EMPTY;
        String uri2 = j0Var.f3362a.toString();
        uri2.getClass();
        e9.i0 v = e9.i0.v(e9.i0.z(j0Var));
        if (b0Var.f3242b != null && b0Var.f3241a == null) {
            z10 = false;
        }
        e2.d.g(z10);
        if (uri != null) {
            if (b0Var.f3241a != null) {
                c0Var = new b2.c0(b0Var);
            } else {
                c0Var = null;
            }
            f0Var = new b2.f0(uri, null, c0Var, null, list, null, v, -9223372036854775807L);
        } else {
            f0Var = null;
        }
        b2.k0 k0Var = new b2.k0(uri2, new b2.z(yVar), f0Var, new b2.e0(d0Var), b2.n0.K, g0Var);
        this.f48854o = k0Var;
        b2.r rVar = new b2.r();
        String str = j0Var.f3363b;
        rVar.f3583q = b2.r0.n(str == null ? "text/x-unknown" : str);
        rVar.d = j0Var.f3364c;
        rVar.f3572e = j0Var.d;
        rVar.f3573f = j0Var.f3365e;
        rVar.f3570b = j0Var.f3366f;
        String str2 = j0Var.f3367g;
        rVar.f3569a = str2 != null ? str2 : null;
        this.f48849j = new b2.s(rVar);
        Map map = Collections.EMPTY_MAP;
        Uri uri3 = j0Var.f3362a;
        e2.d.i(uri3, "The uri must be set.");
        this.h = new g2.m(uri3, 1, null, map, 0L, -1L, null, 1);
        this.f48853n = new g1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, k0Var, null);
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        return new j1(this.h, this.f48848i, this.f48855p, this.f48849j, this.f48850k, this.f48851l, b(f0Var), this.f48852m, null);
    }

    @Override
    public final b2.k0 i() {
        return this.f48854o;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f48855p = c0Var;
        n(this.f48853n);
    }

    @Override
    public final void o(d0 d0Var) {
        ((j1) d0Var).f48838r.e(null);
    }

    @Override
    public final void k() {
    }

    @Override
    public final void q() {
    }
}
