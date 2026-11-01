package u2;

import android.net.Uri;
import e9.x1;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import v7.t6;
public final class n1 extends a {
    public final g2.n h;
    public final g2.g f49964i;
    public final b2.x f49965j;
    public final hb.a f49967l;
    public final j1 f49969n;
    public final b2.p0 f49970o;
    public g2.d0 f49971p;
    public final long f49966k = -9223372036854775807L;
    public final boolean f49968m = true;

    public n1(b2.o0 o0Var, hf.b bVar, hb.a aVar) {
        b2.k0 k0Var;
        b2.h0 h0Var;
        this.f49964i = bVar;
        this.f49967l = aVar;
        boolean z10 = true;
        b2.d0 d0Var = new b2.d0();
        b2.g0 g0Var = new b2.g0();
        List list = Collections.EMPTY_LIST;
        x1 x1Var = x1.e;
        b2.i0 i0Var = new b2.i0();
        b2.l0 l0Var = b2.l0.d;
        Uri uri = Uri.EMPTY;
        String uri2 = o0Var.f2167a.toString();
        uri2.getClass();
        e9.n0 u10 = e9.n0.u(e9.n0.y(o0Var));
        if (g0Var.f2042b != null && g0Var.f2041a == null) {
            z10 = false;
        }
        t6.p(z10);
        if (uri != null) {
            if (g0Var.f2041a != null) {
                h0Var = new b2.h0(g0Var);
            } else {
                h0Var = null;
            }
            k0Var = new b2.k0(uri, null, h0Var, null, list, null, u10, -9223372036854775807L);
        } else {
            k0Var = null;
        }
        b2.p0 p0Var = new b2.p0(uri2, new b2.e0(d0Var), k0Var, new b2.j0(i0Var), b2.s0.L, l0Var);
        this.f49970o = p0Var;
        b2.w wVar = new b2.w();
        String str = o0Var.f2168b;
        wVar.f2370r = b2.v0.n(str == null ? "text/x-unknown" : str);
        wVar.d = o0Var.f2169c;
        wVar.e = o0Var.d;
        wVar.f2359f = o0Var.e;
        wVar.f2357b = o0Var.f2170f;
        String str2 = o0Var.f2171g;
        wVar.f2356a = str2 != null ? str2 : null;
        this.f49965j = new b2.x(wVar);
        Map map = Collections.EMPTY_MAP;
        Uri uri3 = o0Var.f2167a;
        t6.l(uri3, "The uri must be set.");
        this.h = new g2.n(uri3, 1, null, map, 0L, -1L, null, 1);
        this.f49969n = new j1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, p0Var, null);
    }

    @Override
    public final e0 c(g0 g0Var, android.support.v4.media.session.a0 a0Var, long j10) {
        return new m1(this.h, this.f49964i, this.f49971p, this.f49965j, this.f49966k, this.f49967l, b(g0Var), this.f49968m, null);
    }

    @Override
    public final b2.p0 i() {
        return this.f49970o;
    }

    @Override
    public final void m(g2.d0 d0Var) {
        this.f49971p = d0Var;
        n(this.f49969n);
    }

    @Override
    public final void o(e0 e0Var) {
        ((m1) e0Var).f49955r.e(null);
    }

    @Override
    public final void k() {
    }

    @Override
    public final void q() {
    }
}
