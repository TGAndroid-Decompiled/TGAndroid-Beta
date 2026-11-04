package q2;

import android.net.Uri;
import android.os.Looper;
import android.support.v4.media.session.a0;
import b8.kg;
import b8.zb;
import d2.h0;
import d2.i0;
import d2.n0;
import d2.o0;
import d2.v0;
import i2.d0;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.i9;
import w2.e0;
import w2.g0;
import w2.j1;
public final class l extends w2.a {
    public final c h;
    public final i9 f53718i;
    public final ra.e f53719j;
    public final p2.m f53720k;
    public final kb.a f53721l;
    public final boolean f53722m;
    public final int f53723n;
    public final r2.d f53724o;
    public final long f53725p;
    public h0 f53726q;
    public d0 f53727r;
    public n0 f53728s;

    static {
        o0.a("media3.exoplayer.hls");
    }

    public l(n0 n0Var, i9 i9Var, c cVar, ra.e eVar, p2.m mVar, kb.a aVar, r2.d dVar, long j10, boolean z10, int i3) {
        this.f53728s = n0Var;
        this.f53726q = n0Var.f8242c;
        this.f53718i = i9Var;
        this.h = cVar;
        this.f53719j = eVar;
        this.f53720k = mVar;
        this.f53721l = aVar;
        this.f53724o = dVar;
        this.f53725p = j10;
        this.f53722m = z10;
        this.f53723n = i3;
    }

    public static r2.h u(long j10, List list) {
        r2.h hVar = null;
        for (int i3 = 0; i3 < list.size(); i3++) {
            r2.h hVar2 = (r2.h) list.get(i3);
            long j11 = hVar2.f54143e;
            if (j11 <= j10 && hVar2.f54133x) {
                hVar = hVar2;
            } else if (j11 > j10) {
                break;
            }
        }
        return hVar;
    }

    @Override
    public final boolean a(n0 n0Var) {
        n0 i3 = i();
        i0 i0Var = i3.f8241b;
        i0Var.getClass();
        i0 i0Var2 = n0Var.f8241b;
        if (i0Var2 != null && i0Var2.f8139a.equals(i0Var.f8139a) && i0Var2.f8142e.equals(i0Var.f8142e) && Objects.equals(i0Var2.f8141c, i0Var.f8141c) && i3.f8242c.equals(n0Var.f8242c)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, a0 a0Var, long j10) {
        kg b10 = b(g0Var);
        p2.j jVar = new p2.j(this.d.f53117c, 0, g0Var);
        d0 d0Var = this.f53727r;
        l2.k kVar = this.f57022g;
        kVar.getClass();
        return new k(this.h, this.f53724o, this.f53718i, d0Var, this.f53720k, jVar, this.f53721l, b10, a0Var, this.f53719j, this.f53722m, this.f53723n, kVar);
    }

    @Override
    public final synchronized n0 i() {
        return this.f53728s;
    }

    @Override
    public final void k() {
        r2.d dVar = this.f53724o;
        a3.q qVar = dVar.h;
        if (qVar != null) {
            qVar.a();
        }
        v0 v0Var = dVar.f54091w;
        if (v0Var == null) {
            Uri uri = dVar.G;
            if (uri != null) {
                dVar.i(uri);
                return;
            }
            return;
        }
        throw v0Var;
    }

    @Override
    public final void m(d0 d0Var) {
        boolean z10;
        this.f53727r = d0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        l2.k kVar = this.f57022g;
        kVar.getClass();
        p2.m mVar = this.f53720k;
        mVar.k(myLooper, kVar);
        mVar.a();
        kg b10 = b(null);
        i0 i0Var = i().f8241b;
        i0Var.getClass();
        Uri uri = i0Var.f8139a;
        r2.d dVar = this.f53724o;
        dVar.getClass();
        dVar.f54088n = g2.n0.q(null);
        dVar.f54087f = b10;
        dVar.f54089r = this;
        Map map = Collections.EMPTY_MAP;
        zb.k(uri, "The uri must be set.");
        a3.t tVar = new a3.t(((i2.g) dVar.f54083a.f34636b).createDataSource(), new i2.n(uri, 1, null, map, 0L, -1L, null, 1), 4, dVar.f54084b.R1());
        if (dVar.h == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.p(z10);
        a3.q qVar = new a3.q("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        dVar.h = qVar;
        qVar.f(tVar, dVar, dVar.f54085c.F4(tVar.f112c));
    }

    @Override
    public final void o(e0 e0Var) {
        q[] qVarArr;
        p[] pVarArr;
        k kVar = (k) e0Var;
        kVar.f53708b.f54086e.remove(kVar);
        for (q qVar : kVar.K) {
            if (qVar.U) {
                for (p pVar : qVar.M) {
                    pVar.l();
                    p2.g gVar = pVar.h;
                    if (gVar != null) {
                        gVar.b(pVar.f57046e);
                        pVar.h = null;
                        pVar.f57048g = null;
                    }
                }
            }
            i iVar = qVar.d;
            int l10 = iVar.f53698r.l();
            r2.d dVar = iVar.f53688g;
            Uri c2 = iVar.f53686e[l10].c();
            r2.c cVar = (r2.c) dVar.d.get(c2);
            if (cVar != null) {
                r2.b bVar = (r2.b) f1.p(cVar.f54081b, c2, c2);
                bVar.getClass();
                bVar.f54078x = false;
            }
            iVar.f53694n = null;
            qVar.f53763s.e(qVar);
            qVar.I.removeCallbacksAndMessages(null);
            qVar.Y = true;
            qVar.J.clear();
        }
        kVar.H = null;
    }

    @Override
    public final void q() {
        r2.d dVar = this.f53724o;
        dVar.G = null;
        dVar.H = null;
        dVar.f54090s = null;
        dVar.f54092x = null;
        dVar.f54093y = null;
        dVar.E = null;
        dVar.F = null;
        dVar.f54091w = null;
        dVar.J = -9223372036854775807L;
        dVar.h.e(null);
        dVar.h = null;
        HashMap hashMap = dVar.d;
        for (r2.c cVar : hashMap.values()) {
            for (r2.b bVar : cVar.f54081b.values()) {
                bVar.f54071c.e(null);
            }
        }
        dVar.f54088n.removeCallbacksAndMessages(null);
        dVar.f54088n = null;
        hashMap.clear();
        this.f53720k.release();
    }

    @Override
    public final synchronized void t(n0 n0Var) {
        this.f53728s = n0Var;
    }

    public final void v(r2.m mVar) {
        long j10;
        long j11;
        long j12;
        j1 j1Var;
        long j13;
        long j14;
        long j15;
        long j16;
        boolean z10;
        float f10;
        long j17;
        boolean z11;
        boolean z12 = mVar.f54163p;
        boolean z13 = mVar.f54155g;
        g9.i0 i0Var = mVar.f54165r;
        long j18 = mVar.f54168u;
        long j19 = mVar.f54153e;
        int i3 = mVar.d;
        long j20 = mVar.h;
        if (z12) {
            j10 = g2.n0.h0(j20);
        } else {
            j10 = -9223372036854775807L;
        }
        if (i3 != 2 && i3 != 1) {
            j11 = -9223372036854775807L;
        } else {
            j11 = j10;
        }
        r2.d dVar = this.f53724o;
        dVar.f54090s.getClass();
        kb.a aVar = new kb.a(22);
        long j21 = 0;
        if (dVar.I) {
            r2.l lVar = mVar.v;
            long j22 = j20 - dVar.J;
            boolean z14 = mVar.f54162o;
            if (z14) {
                j13 = j22 + j18;
            } else {
                j13 = -9223372036854775807L;
            }
            if (mVar.f54163p) {
                j14 = g2.n0.S(g2.n0.C(this.f53725p)) - (j20 + j18);
            } else {
                j14 = 0;
            }
            long j23 = this.f53726q.f8121a;
            if (j23 != -9223372036854775807L) {
                j16 = g2.n0.S(j23);
            } else {
                if (j19 != -9223372036854775807L) {
                    j15 = j18 - j19;
                } else {
                    j15 = lVar.d;
                    if (j15 == -9223372036854775807L || mVar.f54161n == -9223372036854775807L) {
                        j15 = lVar.f54151c;
                        if (j15 == -9223372036854775807L) {
                            j15 = 3 * mVar.f54160m;
                        }
                    }
                }
                j16 = j15 + j14;
            }
            long j24 = j18 + j14;
            long j25 = g2.n0.j(j16, j14, j24);
            h0 h0Var = i().f8242c;
            if (h0Var.d == -3.4028235E38f && h0Var.f8124e == -3.4028235E38f && lVar.f54151c == -9223372036854775807L && lVar.d == -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            d2.g0 a10 = this.f53726q.a();
            a10.f8108a = g2.n0.h0(j25);
            float f11 = 1.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = this.f53726q.d;
            }
            a10.d = f10;
            if (!z10) {
                f11 = this.f53726q.f8124e;
            }
            a10.f8111e = f11;
            h0 h0Var2 = new h0(a10);
            this.f53726q = h0Var2;
            if (j19 == -9223372036854775807L) {
                j19 = j24 - g2.n0.S(h0Var2.f8121a);
            }
            if (z13) {
                j21 = j19;
            } else {
                r2.h u10 = u(j19, mVar.f54166s);
                if (u10 != null) {
                    j17 = u10.f54143e;
                } else if (!i0Var.isEmpty()) {
                    r2.j jVar = (r2.j) i0Var.get(g2.n0.d(i0Var, Long.valueOf(j19), true));
                    r2.h u11 = u(j19, jVar.f54139y);
                    if (u11 != null) {
                        j17 = u11.f54143e;
                    } else {
                        j17 = jVar.f54143e;
                    }
                }
                j21 = j17;
            }
            if (i3 == 2 && mVar.f54154f) {
                z11 = true;
            } else {
                z11 = false;
            }
            j1Var = new j1(j11, j10, j13, mVar.f54168u, j22, j21, true, !z14, z11, aVar, i(), this.f53726q);
        } else {
            if (j19 != -9223372036854775807L && !i0Var.isEmpty()) {
                if (!z13 && j19 != j18) {
                    j19 = ((r2.j) i0Var.get(g2.n0.d(i0Var, Long.valueOf(j19), true))).f54143e;
                }
                j12 = j19;
            } else {
                j12 = 0;
            }
            long j26 = mVar.f54168u;
            j1Var = new j1(j11, j10, j26, j26, 0L, j12, true, false, true, aVar, i(), null);
        }
        n(j1Var);
    }
}
