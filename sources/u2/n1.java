package u2;

import android.net.Uri;
import e9.x1;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import v7.u6;
public final class n1 extends a {
    public final g2.m h;
    public final g2.g f45993i;
    public final b2.x f45994j;
    public final oa.d f45996l;
    public final j1 f45998n;
    public final b2.p0 f45999o;
    public g2.c0 f46000p;
    public final long f45995k = -9223372036854775807L;
    public final boolean f45997m = true;

    public n1(b2.o0 o0Var, qf.b bVar, oa.d dVar) {
        b2.k0 k0Var;
        b2.h0 h0Var;
        this.f45993i = bVar;
        this.f45996l = dVar;
        boolean z10 = true;
        b2.d0 d0Var = new b2.d0();
        b2.g0 g0Var = new b2.g0();
        List list = Collections.EMPTY_LIST;
        x1 x1Var = x1.e;
        b2.i0 i0Var = new b2.i0();
        b2.l0 l0Var = b2.l0.d;
        Uri uri = Uri.EMPTY;
        String uri2 = o0Var.f2244a.toString();
        uri2.getClass();
        e9.n0 u10 = e9.n0.u(e9.n0.y(o0Var));
        if (g0Var.f2141b != null && g0Var.f2140a == null) {
            z10 = false;
        }
        u6.p(z10);
        if (uri != null) {
            if (g0Var.f2140a != null) {
                h0Var = new b2.h0(g0Var);
            } else {
                h0Var = null;
            }
            k0Var = new b2.k0(uri, null, h0Var, null, list, null, u10, -9223372036854775807L);
        } else {
            k0Var = null;
        }
        b2.p0 p0Var = new b2.p0(uri2, new b2.e0(d0Var), k0Var, new b2.j0(i0Var), b2.s0.L, l0Var);
        this.f45999o = p0Var;
        b2.w wVar = new b2.w();
        String str = o0Var.f2245b;
        wVar.f2466r = b2.w0.n(str == null ? "text/x-unknown" : str);
        wVar.d = o0Var.f2246c;
        wVar.e = o0Var.d;
        wVar.f2455f = o0Var.e;
        wVar.f2453b = o0Var.f2247f;
        String str2 = o0Var.f2248g;
        wVar.f2452a = str2 != null ? str2 : null;
        this.f45994j = new b2.x(wVar);
        Map map = Collections.EMPTY_MAP;
        Uri uri3 = o0Var.f2244a;
        u6.l(uri3, "The uri must be set.");
        this.h = new g2.m(uri3, 1, null, map, 0L, -1L, null, 1);
        this.f45998n = new j1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, p0Var, null);
    }

    @Override
    public final e0 c(g0 g0Var, androidx.biometric.e eVar, long j10) {
        return new m1(this.h, this.f45993i, this.f46000p, this.f45994j, this.f45995k, this.f45996l, b(g0Var), this.f45997m, null);
    }

    @Override
    public final b2.p0 i() {
        return this.f45999o;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f46000p = c0Var;
        n(this.f45998n);
    }

    @Override
    public final void o(e0 e0Var) {
        ((m1) e0Var).f45984r.e(null);
    }

    @Override
    public final void k() {
    }

    @Override
    public final void q() {
    }
}
