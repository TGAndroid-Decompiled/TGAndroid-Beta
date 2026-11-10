package x2;

import a8.ia;
import android.net.Uri;
import h9.t1;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public final class l1 extends a {
    public final j2.m h;
    public final j2.g f58412i;
    public final e2.u f58413j;
    public final pb.b f58415l;
    public final h1 f58417n;
    public final e2.l0 f58418o;
    public j2.d0 f58419p;
    public final long f58414k = -9223372036854775807L;
    public final boolean f58416m = true;

    public l1(e2.k0 k0Var, j2.n nVar, pb.b bVar) {
        e2.g0 g0Var;
        e2.d0 d0Var;
        this.f58412i = nVar;
        this.f58415l = bVar;
        boolean z9 = true;
        e2.z zVar = new e2.z();
        e2.c0 c0Var = new e2.c0();
        List list = Collections.EMPTY_LIST;
        t1 t1Var = t1.f14399e;
        e2.e0 e0Var = new e2.e0();
        e2.h0 h0Var = e2.h0.d;
        Uri uri = Uri.EMPTY;
        String uri2 = k0Var.f10314a.toString();
        uri2.getClass();
        h9.i0 q10 = h9.i0.q(h9.i0.u(k0Var));
        if (c0Var.f10200b != null && c0Var.f10199a == null) {
            z9 = false;
        }
        ia.p(z9);
        if (uri != null) {
            if (c0Var.f10199a != null) {
                d0Var = new e2.d0(c0Var);
            } else {
                d0Var = null;
            }
            g0Var = new e2.g0(uri, null, d0Var, null, list, null, q10, -9223372036854775807L);
        } else {
            g0Var = null;
        }
        e2.l0 l0Var = new e2.l0(uri2, new e2.a0(zVar), g0Var, new e2.f0(e0Var), e2.o0.L, h0Var);
        this.f58418o = l0Var;
        e2.t tVar = new e2.t();
        String str = k0Var.f10315b;
        tVar.f10568r = e2.s0.n(str == null ? "text/x-unknown" : str);
        tVar.d = k0Var.f10316c;
        tVar.f10556e = k0Var.d;
        tVar.f10557f = k0Var.f10317e;
        tVar.f10554b = k0Var.f10318f;
        String str2 = k0Var.f10319g;
        tVar.f10553a = str2 != null ? str2 : null;
        this.f58413j = new e2.u(tVar);
        Map map = Collections.EMPTY_MAP;
        Uri uri3 = k0Var.f10314a;
        ia.k(uri3, "The uri must be set.");
        this.h = new j2.m(uri3, 1, null, map, 0L, -1L, null, 1);
        this.f58417n = new h1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, l0Var, null);
    }

    @Override
    public final d0 c(f0 f0Var, h6.m mVar, long j3) {
        return new k1(this.h, this.f58412i, this.f58419p, this.f58413j, this.f58414k, this.f58415l, b(f0Var), this.f58416m, null);
    }

    @Override
    public final e2.l0 i() {
        return this.f58418o;
    }

    @Override
    public final void m(j2.d0 d0Var) {
        this.f58419p = d0Var;
        n(this.f58417n);
    }

    @Override
    public final void o(d0 d0Var) {
        ((k1) d0Var).f58397r.e(null);
    }

    @Override
    public final void k() {
    }

    @Override
    public final void q() {
    }
}
