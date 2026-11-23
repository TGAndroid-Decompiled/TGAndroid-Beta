package x2;

import a8.ma;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public final class n1 extends a {
    public final j2.m h;
    public final j2.g f60177i;
    public final e2.u f60178j;
    public final qb.a f60180l;
    public final j1 f60182n;
    public final e2.l0 f60183o;
    public j2.c0 f60184p;
    public final long f60179k = -9223372036854775807L;
    public final boolean f60181m = true;

    public n1(e2.k0 k0Var, wf.b bVar, qb.a aVar) {
        e2.g0 g0Var;
        e2.d0 d0Var;
        this.f60177i = bVar;
        this.f60180l = aVar;
        boolean z10 = true;
        e2.z zVar = new e2.z();
        e2.c0 c0Var = new e2.c0();
        List list = Collections.EMPTY_LIST;
        h9.t1 t1Var = h9.t1.f14066e;
        e2.e0 e0Var = new e2.e0();
        e2.h0 h0Var = e2.h0.d;
        Uri uri = Uri.EMPTY;
        String uri2 = k0Var.f10455a.toString();
        uri2.getClass();
        h9.i0 q10 = h9.i0.q(h9.i0.u(k0Var));
        if (c0Var.f10341b != null && c0Var.f10340a == null) {
            z10 = false;
        }
        ma.p(z10);
        if (uri != null) {
            if (c0Var.f10340a != null) {
                d0Var = new e2.d0(c0Var);
            } else {
                d0Var = null;
            }
            g0Var = new e2.g0(uri, null, d0Var, null, list, null, q10, -9223372036854775807L);
        } else {
            g0Var = null;
        }
        e2.l0 l0Var = new e2.l0(uri2, new e2.a0(zVar), g0Var, new e2.f0(e0Var), e2.o0.L, h0Var);
        this.f60183o = l0Var;
        e2.t tVar = new e2.t();
        String str = k0Var.f10456b;
        tVar.f10709r = e2.s0.n(str == null ? "text/x-unknown" : str);
        tVar.d = k0Var.f10457c;
        tVar.f10697e = k0Var.d;
        tVar.f10698f = k0Var.f10458e;
        tVar.f10695b = k0Var.f10459f;
        String str2 = k0Var.f10460g;
        tVar.f10694a = str2 != null ? str2 : null;
        this.f60178j = new e2.u(tVar);
        Map map = Collections.EMPTY_MAP;
        Uri uri3 = k0Var.f10455a;
        ma.k(uri3, "The uri must be set.");
        this.h = new j2.m(uri3, 1, null, map, 0L, -1L, null, 1);
        this.f60182n = new j1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, l0Var, null);
    }

    @Override
    public final e0 c(g0 g0Var, h6.m mVar, long j3) {
        return new m1(this.h, this.f60177i, this.f60184p, this.f60178j, this.f60179k, this.f60180l, b(g0Var), this.f60181m, null);
    }

    @Override
    public final e2.l0 i() {
        return this.f60183o;
    }

    @Override
    public final void m(j2.c0 c0Var) {
        this.f60184p = c0Var;
        n(this.f60182n);
    }

    @Override
    public final void o(e0 e0Var) {
        ((m1) e0Var).f60168r.e(null);
    }

    @Override
    public final void k() {
    }

    @Override
    public final void q() {
    }
}
