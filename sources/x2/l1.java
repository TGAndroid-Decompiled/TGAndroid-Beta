package x2;

import a8.ja;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public final class l1 extends a {
    public final j2.m h;
    public final j2.g f59593i;
    public final e2.u f59594j;
    public final qb.a f59596l;
    public final h1 f59598n;
    public final e2.l0 f59599o;
    public j2.c0 f59600p;
    public final long f59595k = -9223372036854775807L;
    public final boolean f59597m = true;

    public l1(e2.k0 k0Var, wf.b bVar, qb.a aVar) {
        e2.g0 g0Var;
        e2.d0 d0Var;
        this.f59593i = bVar;
        this.f59596l = aVar;
        boolean z10 = true;
        e2.z zVar = new e2.z();
        e2.c0 c0Var = new e2.c0();
        List list = Collections.EMPTY_LIST;
        h9.s1 s1Var = h9.s1.f13749e;
        e2.e0 e0Var = new e2.e0();
        e2.h0 h0Var = e2.h0.d;
        Uri uri = Uri.EMPTY;
        String uri2 = k0Var.f10145a.toString();
        uri2.getClass();
        h9.i0 q10 = h9.i0.q(h9.i0.u(k0Var));
        if (c0Var.f10031b != null && c0Var.f10030a == null) {
            z10 = false;
        }
        ja.p(z10);
        if (uri != null) {
            if (c0Var.f10030a != null) {
                d0Var = new e2.d0(c0Var);
            } else {
                d0Var = null;
            }
            g0Var = new e2.g0(uri, null, d0Var, null, list, null, q10, -9223372036854775807L);
        } else {
            g0Var = null;
        }
        e2.l0 l0Var = new e2.l0(uri2, new e2.a0(zVar), g0Var, new e2.f0(e0Var), e2.o0.L, h0Var);
        this.f59599o = l0Var;
        e2.t tVar = new e2.t();
        String str = k0Var.f10146b;
        tVar.f10399r = e2.s0.n(str == null ? "text/x-unknown" : str);
        tVar.d = k0Var.f10147c;
        tVar.f10387e = k0Var.d;
        tVar.f10388f = k0Var.f10148e;
        tVar.f10385b = k0Var.f10149f;
        String str2 = k0Var.f10150g;
        tVar.f10384a = str2 != null ? str2 : null;
        this.f59594j = new e2.u(tVar);
        Map map = Collections.EMPTY_MAP;
        Uri uri3 = k0Var.f10145a;
        ja.k(uri3, "The uri must be set.");
        this.h = new j2.m(uri3, 1, null, map, 0L, -1L, null, 1);
        this.f59598n = new h1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, l0Var, null);
    }

    @Override
    public final d0 c(f0 f0Var, h6.m mVar, long j3) {
        return new k1(this.h, this.f59593i, this.f59600p, this.f59594j, this.f59595k, this.f59596l, b(f0Var), this.f59597m, null);
    }

    @Override
    public final e2.l0 i() {
        return this.f59599o;
    }

    @Override
    public final void m(j2.c0 c0Var) {
        this.f59600p = c0Var;
        n(this.f59598n);
    }

    @Override
    public final void o(d0 d0Var) {
        ((k1) d0Var).f59578r.e(null);
    }

    @Override
    public final void k() {
    }

    @Override
    public final void q() {
    }
}
