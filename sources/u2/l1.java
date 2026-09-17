package u2;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public final class l1 extends a {
    public final g2.m h;
    public final g2.g f46762i;
    public final b2.s f46763j;
    public final rb.a f46765l;
    public final h1 f46767n;
    public final b2.k0 f46768o;
    public g2.c0 f46769p;
    public final long f46764k = -9223372036854775807L;
    public final boolean f46766m = true;

    public l1(b2.j0 j0Var, pf.b bVar, rb.a aVar) {
        b2.f0 f0Var;
        b2.c0 c0Var;
        this.f46762i = bVar;
        this.f46765l = aVar;
        boolean z10 = true;
        b2.y yVar = new b2.y();
        b2.b0 b0Var = new b2.b0();
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var = e9.a1.f8948e;
        b2.d0 d0Var = new b2.d0();
        b2.g0 g0Var = b2.g0.d;
        Uri uri = Uri.EMPTY;
        String uri2 = j0Var.f2118a.toString();
        uri2.getClass();
        e9.i0 v = e9.i0.v(e9.i0.z(j0Var));
        if (b0Var.f1998b != null && b0Var.f1997a == null) {
            z10 = false;
        }
        e2.d.g(z10);
        if (uri != null) {
            if (b0Var.f1997a != null) {
                c0Var = new b2.c0(b0Var);
            } else {
                c0Var = null;
            }
            f0Var = new b2.f0(uri, null, c0Var, null, list, null, v, -9223372036854775807L);
        } else {
            f0Var = null;
        }
        b2.k0 k0Var = new b2.k0(uri2, new b2.z(yVar), f0Var, new b2.e0(d0Var), b2.n0.K, g0Var);
        this.f46768o = k0Var;
        b2.r rVar = new b2.r();
        String str = j0Var.f2119b;
        rVar.f2339q = b2.r0.n(str == null ? "text/x-unknown" : str);
        rVar.d = j0Var.f2120c;
        rVar.f2328e = j0Var.d;
        rVar.f2329f = j0Var.f2121e;
        rVar.f2326b = j0Var.f2122f;
        String str2 = j0Var.f2123g;
        rVar.f2325a = str2 != null ? str2 : null;
        this.f46763j = new b2.s(rVar);
        Map map = Collections.EMPTY_MAP;
        Uri uri3 = j0Var.f2118a;
        e2.d.i(uri3, "The uri must be set.");
        this.h = new g2.m(uri3, 1, null, map, 0L, -1L, null, 1);
        this.f46767n = new h1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, k0Var, null);
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        return new k1(this.h, this.f46762i, this.f46769p, this.f46763j, this.f46764k, this.f46765l, b(f0Var), this.f46766m, null);
    }

    @Override
    public final b2.k0 i() {
        return this.f46768o;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f46769p = c0Var;
        n(this.f46767n);
    }

    @Override
    public final void o(d0 d0Var) {
        ((k1) d0Var).f46753r.e(null);
    }

    @Override
    public final void k() {
    }

    @Override
    public final void q() {
    }
}
