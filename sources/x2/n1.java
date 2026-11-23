package x2;

import a8.la;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public final class n1 extends a {
    public final j2.m h;
    public final j2.g f60212i;
    public final e2.u f60213j;
    public final qb.a f60215l;
    public final j1 f60217n;
    public final e2.l0 f60218o;
    public j2.c0 f60219p;
    public final long f60214k = -9223372036854775807L;
    public final boolean f60216m = true;

    public n1(e2.k0 k0Var, wf.b bVar, qb.a aVar) {
        e2.g0 g0Var;
        e2.d0 d0Var;
        this.f60212i = bVar;
        this.f60215l = aVar;
        boolean z10 = true;
        e2.z zVar = new e2.z();
        e2.c0 c0Var = new e2.c0();
        List list = Collections.EMPTY_LIST;
        h9.t1 t1Var = h9.t1.f14103e;
        e2.e0 e0Var = new e2.e0();
        e2.h0 h0Var = e2.h0.d;
        Uri uri = Uri.EMPTY;
        String uri2 = k0Var.f10492a.toString();
        uri2.getClass();
        h9.i0 q10 = h9.i0.q(h9.i0.u(k0Var));
        if (c0Var.f10378b != null && c0Var.f10377a == null) {
            z10 = false;
        }
        la.p(z10);
        if (uri != null) {
            if (c0Var.f10377a != null) {
                d0Var = new e2.d0(c0Var);
            } else {
                d0Var = null;
            }
            g0Var = new e2.g0(uri, null, d0Var, null, list, null, q10, -9223372036854775807L);
        } else {
            g0Var = null;
        }
        e2.l0 l0Var = new e2.l0(uri2, new e2.a0(zVar), g0Var, new e2.f0(e0Var), e2.o0.L, h0Var);
        this.f60218o = l0Var;
        e2.t tVar = new e2.t();
        String str = k0Var.f10493b;
        tVar.f10746r = e2.s0.n(str == null ? "text/x-unknown" : str);
        tVar.d = k0Var.f10494c;
        tVar.f10734e = k0Var.d;
        tVar.f10735f = k0Var.f10495e;
        tVar.f10732b = k0Var.f10496f;
        String str2 = k0Var.f10497g;
        tVar.f10731a = str2 != null ? str2 : null;
        this.f60213j = new e2.u(tVar);
        Map map = Collections.EMPTY_MAP;
        Uri uri3 = k0Var.f10492a;
        la.k(uri3, "The uri must be set.");
        this.h = new j2.m(uri3, 1, null, map, 0L, -1L, null, 1);
        this.f60217n = new j1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, l0Var, null);
    }

    @Override
    public final e0 c(g0 g0Var, h6.m mVar, long j3) {
        return new m1(this.h, this.f60212i, this.f60219p, this.f60213j, this.f60214k, this.f60215l, b(g0Var), this.f60216m, null);
    }

    @Override
    public final e2.l0 i() {
        return this.f60218o;
    }

    @Override
    public final void m(j2.c0 c0Var) {
        this.f60219p = c0Var;
        n(this.f60217n);
    }

    @Override
    public final void o(e0 e0Var) {
        ((m1) e0Var).f60203r.e(null);
    }

    @Override
    public final void k() {
    }

    @Override
    public final void q() {
    }
}
