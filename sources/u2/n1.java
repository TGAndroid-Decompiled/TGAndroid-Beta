package u2;

import a8.yb;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public final class n1 extends a {
    public final g2.m h;
    public final g2.g f49407i;
    public final b2.x f49408j;
    public final u7.s f49410l;
    public final j1 f49412n;
    public final b2.p0 f49413o;
    public g2.c0 f49414p;
    public final long f49409k = -9223372036854775807L;
    public final boolean f49411m = true;

    public n1(b2.o0 o0Var, rf.b bVar, u7.s sVar) {
        b2.k0 k0Var;
        b2.h0 h0Var;
        this.f49407i = bVar;
        this.f49410l = sVar;
        boolean z10 = true;
        b2.d0 d0Var = new b2.d0();
        b2.g0 g0Var = new b2.g0();
        List list = Collections.EMPTY_LIST;
        f9.s1 s1Var = f9.s1.e;
        b2.i0 i0Var = new b2.i0();
        b2.l0 l0Var = b2.l0.d;
        Uri uri = Uri.EMPTY;
        String uri2 = o0Var.f3311a.toString();
        uri2.getClass();
        f9.i0 u10 = f9.i0.u(f9.i0.y(o0Var));
        if (g0Var.f3208b != null && g0Var.f3207a == null) {
            z10 = false;
        }
        yb.p(z10);
        if (uri != null) {
            if (g0Var.f3207a != null) {
                h0Var = new b2.h0(g0Var);
            } else {
                h0Var = null;
            }
            k0Var = new b2.k0(uri, null, h0Var, null, list, null, u10, -9223372036854775807L);
        } else {
            k0Var = null;
        }
        b2.p0 p0Var = new b2.p0(uri2, new b2.e0(d0Var), k0Var, new b2.j0(i0Var), b2.s0.L, l0Var);
        this.f49413o = p0Var;
        b2.w wVar = new b2.w();
        String str = o0Var.f3312b;
        wVar.f3533r = b2.w0.n(str == null ? "text/x-unknown" : str);
        wVar.d = o0Var.f3313c;
        wVar.e = o0Var.d;
        wVar.f3522f = o0Var.e;
        wVar.f3520b = o0Var.f3314f;
        String str2 = o0Var.f3315g;
        wVar.f3519a = str2 != null ? str2 : null;
        this.f49408j = new b2.x(wVar);
        Map map = Collections.EMPTY_MAP;
        Uri uri3 = o0Var.f3311a;
        yb.l(uri3, "The uri must be set.");
        this.h = new g2.m(uri3, 1, null, map, 0L, -1L, null, 1);
        this.f49412n = new j1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, p0Var, null);
    }

    @Override
    public final e0 c(g0 g0Var, a8.h0 h0Var, long j10) {
        return new m1(this.h, this.f49407i, this.f49414p, this.f49408j, this.f49409k, this.f49410l, b(g0Var), this.f49411m, null);
    }

    @Override
    public final b2.p0 i() {
        return this.f49413o;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f49414p = c0Var;
        n(this.f49412n);
    }

    @Override
    public final void o(e0 e0Var) {
        ((m1) e0Var).f49398r.e(null);
    }

    @Override
    public final void k() {
    }

    @Override
    public final void q() {
    }
}
