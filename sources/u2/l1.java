package u2;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public final class l1 extends a {
    public final g2.m h;
    public final g2.g f46761i;
    public final b2.s f46762j;
    public final rb.a f46764l;
    public final h1 f46766n;
    public final b2.k0 f46767o;
    public g2.c0 f46768p;
    public final long f46763k = -9223372036854775807L;
    public final boolean f46765m = true;

    public l1(b2.j0 j0Var, pf.b bVar, rb.a aVar) {
        b2.f0 f0Var;
        b2.c0 c0Var;
        this.f46761i = bVar;
        this.f46764l = aVar;
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
        this.f46767o = k0Var;
        b2.r rVar = new b2.r();
        String str = j0Var.f2119b;
        rVar.f2339q = b2.r0.n(str == null ? "text/x-unknown" : str);
        rVar.d = j0Var.f2120c;
        rVar.f2328e = j0Var.d;
        rVar.f2329f = j0Var.f2121e;
        rVar.f2326b = j0Var.f2122f;
        String str2 = j0Var.f2123g;
        rVar.f2325a = str2 != null ? str2 : null;
        this.f46762j = new b2.s(rVar);
        Map map = Collections.EMPTY_MAP;
        Uri uri3 = j0Var.f2118a;
        e2.d.i(uri3, "The uri must be set.");
        this.h = new g2.m(uri3, 1, null, map, 0L, -1L, null, 1);
        this.f46766n = new h1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, k0Var, null);
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        return new k1(this.h, this.f46761i, this.f46768p, this.f46762j, this.f46763k, this.f46764l, b(f0Var), this.f46765m, null);
    }

    @Override
    public final b2.k0 i() {
        return this.f46767o;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f46768p = c0Var;
        n(this.f46766n);
    }

    @Override
    public final void o(d0 d0Var) {
        ((k1) d0Var).f46752r.e(null);
    }

    @Override
    public final void k() {
    }

    @Override
    public final void q() {
    }
}
