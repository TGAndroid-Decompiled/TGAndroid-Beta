package u2;

import android.net.Uri;
import e9.x1;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import v7.u6;
public final class o1 extends a {
    public final g2.m h;
    public final g2.g f47392i;
    public final b2.w f47393j;
    public final oa.d f47395l;
    public final k1 f47397n;
    public final b2.o0 f47398o;
    public g2.c0 f47399p;
    public final long f47394k = -9223372036854775807L;
    public final boolean f47396m = true;

    public o1(b2.n0 n0Var, qf.b bVar, oa.d dVar) {
        b2.j0 j0Var;
        b2.g0 g0Var;
        this.f47392i = bVar;
        this.f47395l = dVar;
        boolean z10 = true;
        b2.c0 c0Var = new b2.c0();
        b2.f0 f0Var = new b2.f0();
        List list = Collections.EMPTY_LIST;
        x1 x1Var = x1.e;
        b2.h0 h0Var = new b2.h0();
        b2.k0 k0Var = b2.k0.d;
        Uri uri = Uri.EMPTY;
        String uri2 = n0Var.f3853a.toString();
        uri2.getClass();
        e9.n0 u10 = e9.n0.u(e9.n0.y(n0Var));
        if (f0Var.f3751b != null && f0Var.f3750a == null) {
            z10 = false;
        }
        u6.p(z10);
        if (uri != null) {
            if (f0Var.f3750a != null) {
                g0Var = new b2.g0(f0Var);
            } else {
                g0Var = null;
            }
            j0Var = new b2.j0(uri, null, g0Var, null, list, null, u10, -9223372036854775807L);
        } else {
            j0Var = null;
        }
        b2.o0 o0Var = new b2.o0(uri2, new b2.d0(c0Var), j0Var, new b2.i0(h0Var), b2.r0.L, k0Var);
        this.f47398o = o0Var;
        b2.v vVar = new b2.v();
        String str = n0Var.f3854b;
        vVar.f4075r = b2.v0.n(str == null ? "text/x-unknown" : str);
        vVar.d = n0Var.f3855c;
        vVar.e = n0Var.d;
        vVar.f4064f = n0Var.e;
        vVar.f4062b = n0Var.f3856f;
        String str2 = n0Var.f3857g;
        vVar.f4061a = str2 != null ? str2 : null;
        this.f47393j = new b2.w(vVar);
        Map map = Collections.EMPTY_MAP;
        Uri uri3 = n0Var.f3853a;
        u6.l(uri3, "The uri must be set.");
        this.h = new g2.m(uri3, 1, null, map, 0L, -1L, null, 1);
        this.f47397n = new k1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, o0Var, null);
    }

    @Override
    public final e0 c(g0 g0Var, androidx.biometric.e eVar, long j10) {
        return new n1(this.h, this.f47392i, this.f47399p, this.f47393j, this.f47394k, this.f47395l, b(g0Var), this.f47396m, null);
    }

    @Override
    public final b2.o0 i() {
        return this.f47398o;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f47399p = c0Var;
        n(this.f47397n);
    }

    @Override
    public final void o(e0 e0Var) {
        ((n1) e0Var).f47383r.e(null);
    }

    @Override
    public final void k() {
    }

    @Override
    public final void q() {
    }
}
