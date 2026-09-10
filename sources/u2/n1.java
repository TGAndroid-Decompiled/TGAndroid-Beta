package u2;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public final class n1 extends a {
    public final g2.m h;
    public final g2.g f42394i;
    public final b2.s f42395j;
    public final rb.a f42397l;
    public final j1 f42399n;
    public final b2.k0 f42400o;
    public g2.c0 f42401p;
    public final long f42396k = -9223372036854775807L;
    public final boolean f42398m = true;

    public n1(b2.j0 j0Var, n4.y yVar, rb.a aVar) {
        b2.f0 f0Var;
        b2.c0 c0Var;
        this.f42394i = yVar;
        this.f42397l = aVar;
        boolean z10 = true;
        b2.y yVar2 = new b2.y();
        b2.b0 b0Var = new b2.b0();
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var = e9.a1.e;
        b2.d0 d0Var = new b2.d0();
        b2.g0 g0Var = b2.g0.d;
        Uri uri = Uri.EMPTY;
        String uri2 = j0Var.f1737a.toString();
        uri2.getClass();
        e9.i0 v = e9.i0.v(e9.i0.z(j0Var));
        if (b0Var.f1632b != null && b0Var.f1631a == null) {
            z10 = false;
        }
        e2.d.g(z10);
        if (uri != null) {
            if (b0Var.f1631a != null) {
                c0Var = new b2.c0(b0Var);
            } else {
                c0Var = null;
            }
            f0Var = new b2.f0(uri, null, c0Var, null, list, null, v, -9223372036854775807L);
        } else {
            f0Var = null;
        }
        b2.k0 k0Var = new b2.k0(uri2, new b2.z(yVar2), f0Var, new b2.e0(d0Var), b2.n0.K, g0Var);
        this.f42400o = k0Var;
        b2.r rVar = new b2.r();
        String str = j0Var.f1738b;
        rVar.f1946q = b2.r0.n(str == null ? "text/x-unknown" : str);
        rVar.d = j0Var.f1739c;
        rVar.e = j0Var.d;
        rVar.f1936f = j0Var.e;
        rVar.f1934b = j0Var.f1740f;
        String str2 = j0Var.f1741g;
        rVar.f1933a = str2 != null ? str2 : null;
        this.f42395j = new b2.s(rVar);
        Map map = Collections.EMPTY_MAP;
        Uri uri3 = j0Var.f1737a;
        e2.d.i(uri3, "The uri must be set.");
        this.h = new g2.m(uri3, 1, null, map, 0L, -1L, null, 1);
        this.f42399n = new j1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, k0Var, null);
    }

    @Override
    public final e0 c(g0 g0Var, y2.d dVar, long j3) {
        return new m1(this.h, this.f42394i, this.f42401p, this.f42395j, this.f42396k, this.f42397l, b(g0Var), this.f42398m, null);
    }

    @Override
    public final b2.k0 i() {
        return this.f42400o;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f42401p = c0Var;
        n(this.f42399n);
    }

    @Override
    public final void o(e0 e0Var) {
        ((m1) e0Var).f42385r.e(null);
    }

    @Override
    public final void k() {
    }

    @Override
    public final void q() {
    }
}
