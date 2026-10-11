package u2;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public final class k1 extends a {
    public final g2.m h;
    public final g2.g f48699i;
    public final b2.s f48700j;
    public final rb.a f48702l;
    public final g1 f48704n;
    public final b2.k0 f48705o;
    public g2.c0 f48706p;
    public final long f48701k = -9223372036854775807L;
    public final boolean f48703m = true;

    public k1(b2.j0 j0Var, pf.b bVar, rb.a aVar) {
        b2.f0 f0Var;
        b2.c0 c0Var;
        this.f48699i = bVar;
        this.f48702l = aVar;
        boolean z10 = true;
        b2.y yVar = new b2.y();
        b2.b0 b0Var = new b2.b0();
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var = e9.a1.f8714e;
        b2.d0 d0Var = new b2.d0();
        b2.g0 g0Var = b2.g0.d;
        Uri uri = Uri.EMPTY;
        String uri2 = j0Var.f3364a.toString();
        uri2.getClass();
        e9.i0 v = e9.i0.v(e9.i0.z(j0Var));
        if (b0Var.f3244b != null && b0Var.f3243a == null) {
            z10 = false;
        }
        e2.d.g(z10);
        if (uri != null) {
            if (b0Var.f3243a != null) {
                c0Var = new b2.c0(b0Var);
            } else {
                c0Var = null;
            }
            f0Var = new b2.f0(uri, null, c0Var, null, list, null, v, -9223372036854775807L);
        } else {
            f0Var = null;
        }
        b2.k0 k0Var = new b2.k0(uri2, new b2.z(yVar), f0Var, new b2.e0(d0Var), b2.n0.K, g0Var);
        this.f48705o = k0Var;
        b2.r rVar = new b2.r();
        String str = j0Var.f3365b;
        rVar.f3585q = b2.r0.n(str == null ? "text/x-unknown" : str);
        rVar.d = j0Var.f3366c;
        rVar.f3574e = j0Var.d;
        rVar.f3575f = j0Var.f3367e;
        rVar.f3572b = j0Var.f3368f;
        String str2 = j0Var.f3369g;
        rVar.f3571a = str2 != null ? str2 : null;
        this.f48700j = new b2.s(rVar);
        Map map = Collections.EMPTY_MAP;
        Uri uri3 = j0Var.f3364a;
        e2.d.i(uri3, "The uri must be set.");
        this.h = new g2.m(uri3, 1, null, map, 0L, -1L, null, 1);
        this.f48704n = new g1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, k0Var, null);
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        return new j1(this.h, this.f48699i, this.f48706p, this.f48700j, this.f48701k, this.f48702l, b(f0Var), this.f48703m, null);
    }

    @Override
    public final b2.k0 i() {
        return this.f48705o;
    }

    @Override
    public final void m(g2.c0 c0Var) {
        this.f48706p = c0Var;
        n(this.f48704n);
    }

    @Override
    public final void o(d0 d0Var) {
        ((j1) d0Var).f48689r.e(null);
    }

    @Override
    public final void k() {
    }

    @Override
    public final void q() {
    }
}
