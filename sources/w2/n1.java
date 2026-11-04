package w2;

import android.net.Uri;
import b8.zb;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public final class n1 extends a {
    public final i2.n h;
    public final i2.g f57160i;
    public final d2.v f57161j;
    public final kb.a f57163l;
    public final j1 f57165n;
    public final d2.n0 f57166o;
    public i2.d0 f57167p;
    public final long f57162k = -9223372036854775807L;
    public final boolean f57164m = true;

    public n1(d2.m0 m0Var, tf.b bVar, kb.a aVar) {
        d2.i0 i0Var;
        d2.f0 f0Var;
        this.f57160i = bVar;
        this.f57163l = aVar;
        boolean z10 = true;
        d2.b0 b0Var = new d2.b0();
        d2.e0 e0Var = new d2.e0();
        List list = Collections.EMPTY_LIST;
        g9.s1 s1Var = g9.s1.f12146e;
        d2.g0 g0Var = new d2.g0();
        d2.j0 j0Var = d2.j0.d;
        Uri uri = Uri.EMPTY;
        String uri2 = m0Var.f8193a.toString();
        uri2.getClass();
        g9.i0 q10 = g9.i0.q(g9.i0.u(m0Var));
        if (e0Var.f8074b != null && e0Var.f8073a == null) {
            z10 = false;
        }
        zb.p(z10);
        if (uri != null) {
            if (e0Var.f8073a != null) {
                f0Var = new d2.f0(e0Var);
            } else {
                f0Var = null;
            }
            i0Var = new d2.i0(uri, null, f0Var, null, list, null, q10, -9223372036854775807L);
        } else {
            i0Var = null;
        }
        d2.n0 n0Var = new d2.n0(uri2, new d2.c0(b0Var), i0Var, new d2.h0(g0Var), d2.q0.L, j0Var);
        this.f57166o = n0Var;
        d2.u uVar = new d2.u();
        String str = m0Var.f8194b;
        uVar.f8431r = d2.u0.n(str == null ? "text/x-unknown" : str);
        uVar.d = m0Var.f8195c;
        uVar.f8419e = m0Var.d;
        uVar.f8420f = m0Var.f8196e;
        uVar.f8417b = m0Var.f8197f;
        String str2 = m0Var.f8198g;
        uVar.f8416a = str2 != null ? str2 : null;
        this.f57161j = new d2.v(uVar);
        Map map = Collections.EMPTY_MAP;
        Uri uri3 = m0Var.f8193a;
        zb.k(uri3, "The uri must be set.");
        this.h = new i2.n(uri3, 1, null, map, 0L, -1L, null, 1);
        this.f57165n = new j1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, n0Var, null);
    }

    @Override
    public final e0 c(g0 g0Var, android.support.v4.media.session.a0 a0Var, long j10) {
        return new m1(this.h, this.f57160i, this.f57167p, this.f57161j, this.f57162k, this.f57163l, b(g0Var), this.f57164m, null);
    }

    @Override
    public final d2.n0 i() {
        return this.f57166o;
    }

    @Override
    public final void m(i2.d0 d0Var) {
        this.f57167p = d0Var;
        n(this.f57165n);
    }

    @Override
    public final void o(e0 e0Var) {
        ((m1) e0Var).f57151r.e(null);
    }

    @Override
    public final void k() {
    }

    @Override
    public final void q() {
    }
}
