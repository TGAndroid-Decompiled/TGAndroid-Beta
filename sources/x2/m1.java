package x2;

import a8.ia;
import android.net.Uri;
import h9.t1;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public final class m1 extends a {
    public final j2.m h;
    public final j2.g f58401i;
    public final e2.u f58402j;
    public final pb.b f58404l;
    public final i1 f58406n;
    public final e2.l0 f58407o;
    public j2.d0 f58408p;
    public final long f58403k = -9223372036854775807L;
    public final boolean f58405m = true;

    public m1(e2.k0 k0Var, j2.n nVar, pb.b bVar) {
        e2.g0 g0Var;
        e2.d0 d0Var;
        this.f58401i = nVar;
        this.f58404l = bVar;
        boolean z9 = true;
        e2.z zVar = new e2.z();
        e2.c0 c0Var = new e2.c0();
        List list = Collections.EMPTY_LIST;
        t1 t1Var = t1.f14397e;
        e2.e0 e0Var = new e2.e0();
        e2.h0 h0Var = e2.h0.d;
        Uri uri = Uri.EMPTY;
        String uri2 = k0Var.f10309a.toString();
        uri2.getClass();
        h9.i0 q10 = h9.i0.q(h9.i0.u(k0Var));
        if (c0Var.f10195b != null && c0Var.f10194a == null) {
            z9 = false;
        }
        ia.p(z9);
        if (uri != null) {
            if (c0Var.f10194a != null) {
                d0Var = new e2.d0(c0Var);
            } else {
                d0Var = null;
            }
            g0Var = new e2.g0(uri, null, d0Var, null, list, null, q10, -9223372036854775807L);
        } else {
            g0Var = null;
        }
        e2.l0 l0Var = new e2.l0(uri2, new e2.a0(zVar), g0Var, new e2.f0(e0Var), e2.o0.L, h0Var);
        this.f58407o = l0Var;
        e2.t tVar = new e2.t();
        String str = k0Var.f10310b;
        tVar.f10563r = e2.s0.n(str == null ? "text/x-unknown" : str);
        tVar.d = k0Var.f10311c;
        tVar.f10551e = k0Var.d;
        tVar.f10552f = k0Var.f10312e;
        tVar.f10549b = k0Var.f10313f;
        String str2 = k0Var.f10314g;
        tVar.f10548a = str2 != null ? str2 : null;
        this.f58402j = new e2.u(tVar);
        Map map = Collections.EMPTY_MAP;
        Uri uri3 = k0Var.f10309a;
        ia.k(uri3, "The uri must be set.");
        this.h = new j2.m(uri3, 1, null, map, 0L, -1L, null, 1);
        this.f58406n = new i1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, l0Var, null);
    }

    @Override
    public final e0 c(g0 g0Var, h6.m mVar, long j3) {
        return new l1(this.h, this.f58401i, this.f58408p, this.f58402j, this.f58403k, this.f58404l, b(g0Var), this.f58405m, null);
    }

    @Override
    public final e2.l0 i() {
        return this.f58407o;
    }

    @Override
    public final void m(j2.d0 d0Var) {
        this.f58408p = d0Var;
        n(this.f58406n);
    }

    @Override
    public final void o(e0 e0Var) {
        ((l1) e0Var).f58386r.e(null);
    }

    @Override
    public final void k() {
    }

    @Override
    public final void q() {
    }
}
