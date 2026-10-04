package u2;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public final class m1 extends a {
    public final g2.m h;
    public final g2.g f47326i;
    public final b2.s f47327j;
    public final qb.b f47329l;
    public final i1 f47331n;
    public final b2.k0 f47332o;
    public g2.c0 f47333p;
    public final long f47328k = -9223372036854775807L;
    public final boolean f47330m = true;

    public m1(b2.j0 j0Var, of.b bVar, qb.b bVar2) {
        b2.f0 f0Var;
        b2.c0 c0Var;
        this.f47326i = bVar;
        this.f47329l = bVar2;
        boolean z10 = true;
        b2.y yVar = new b2.y();
        b2.b0 b0Var = new b2.b0();
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var = e9.a1.f8720e;
        b2.d0 d0Var = new b2.d0();
        b2.g0 g0Var = b2.g0.d;
        Uri uri = Uri.EMPTY;
        String uri2 = j0Var.f3285a.toString();
        uri2.getClass();
        e9.i0 v = e9.i0.v(e9.i0.z(j0Var));
        if (b0Var.f3165b != null && b0Var.f3164a == null) {
            z10 = false;
        }
        e2.d.g(z10);
        if (uri != null) {
            if (b0Var.f3164a != null) {
                c0Var = new b2.c0(b0Var);
            } else {
                c0Var = null;
            }
            f0Var = new b2.f0(uri, null, c0Var, null, list, null, v, -9223372036854775807L);
        } else {
            f0Var = null;
        }
        b2.k0 k0Var = new b2.k0(uri2, new b2.z(yVar), f0Var, new b2.e0(d0Var), b2.n0.K, g0Var);
        this.f47332o = k0Var;
        b2.r rVar = new b2.r();
        String str = j0Var.f3286b;
        rVar.f3506q = b2.r0.n(str == null ? "text/x-unknown" : str);
        rVar.d = j0Var.f3287c;
        rVar.f3495e = j0Var.d;
        rVar.f3496f = j0Var.f3288e;
        rVar.f3493b = j0Var.f3289f;
        String str2 = j0Var.f3290g;
        rVar.f3492a = str2 != null ? str2 : null;
        this.f47327j = new b2.s(rVar);
        Map map = Collections.EMPTY_MAP;
        Uri uri3 = j0Var.f3285a;
        e2.d.i(uri3, "The uri must be set.");
        this.h = new g2.m(uri3, 1, null, map, 0L, -1L, null, 1);
        this.f47331n = new i1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, k0Var, null);
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        return new l1(this.h, this.f47326i, this.f47333p, this.f47327j, this.f47328k, this.f47329l, b(f0Var), this.f47330m, null);
    }

    @Override
    public final b2.k0 i() {
        return this.f47332o;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f47333p = c0Var;
        n(this.f47331n);
    }

    @Override
    public final void o(d0 d0Var) {
        ((l1) d0Var).f47317r.e(null);
    }

    @Override
    public final void k() {
    }

    @Override
    public final void q() {
    }
}
