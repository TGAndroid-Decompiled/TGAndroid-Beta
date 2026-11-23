package r2;

import a8.ma;
import a8.xa;
import android.net.Uri;
import android.os.Looper;
import e2.f0;
import e2.g0;
import e2.l0;
import e2.m0;
import e2.t0;
import h9.i0;
import j$.util.Objects;
import j2.c0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.telegram.ui.ActionBar.i5;
import x2.e0;
import x2.j1;
public final class k extends x2.a {
    public final c h;
    public final i5 f56510i;
    public final nb.a f56511j;
    public final q2.m f56512k;
    public final qb.a f56513l;
    public final boolean f56514m;
    public final int f56515n;
    public final s2.d f56516o;
    public final long f56517p;
    public f0 f56518q;
    public c0 f56519r;
    public l0 f56520s;

    static {
        m0.a("media3.exoplayer.hls");
    }

    public k(l0 l0Var, i5 i5Var, c cVar, nb.a aVar, q2.m mVar, qb.a aVar2, s2.d dVar, long j3, boolean z10, int i7) {
        this.f56520s = l0Var;
        this.f56518q = l0Var.f10495c;
        this.f56510i = i5Var;
        this.h = cVar;
        this.f56511j = aVar;
        this.f56512k = mVar;
        this.f56513l = aVar2;
        this.f56516o = dVar;
        this.f56517p = j3;
        this.f56514m = z10;
        this.f56515n = i7;
    }

    public static s2.i u(long j3, List list) {
        s2.i iVar = null;
        for (int i7 = 0; i7 < list.size(); i7++) {
            s2.i iVar2 = (s2.i) list.get(i7);
            long j10 = iVar2.f56943e;
            if (j10 <= j3 && iVar2.f56933x) {
                iVar = iVar2;
            } else if (j10 > j3) {
                break;
            }
        }
        return iVar;
    }

    @Override
    public final boolean a(l0 l0Var) {
        l0 i7 = i();
        g0 g0Var = i7.f10494b;
        g0Var.getClass();
        g0 g0Var2 = l0Var.f10494b;
        if (g0Var2 != null && g0Var2.f10403a.equals(g0Var.f10403a) && g0Var2.f10406e.equals(g0Var.f10406e) && Objects.equals(g0Var2.f10405c, g0Var.f10405c) && i7.f10495c.equals(l0Var.f10495c)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(x2.g0 g0Var, h6.m mVar, long j3) {
        xa b10 = b(g0Var);
        q2.j jVar = new q2.j(this.d.f55884c, 0, g0Var);
        c0 c0Var = this.f56519r;
        m2.i iVar = this.f60157g;
        iVar.getClass();
        return new j(this.h, this.f56516o, this.f56510i, c0Var, this.f56512k, jVar, this.f56513l, b10, mVar, this.f56511j, this.f56514m, this.f56515n, iVar);
    }

    @Override
    public final synchronized l0 i() {
        return this.f56520s;
    }

    @Override
    public final void k() {
        s2.d dVar = this.f56516o;
        b3.p pVar = dVar.h;
        if (pVar != null) {
            pVar.a();
        }
        t0 t0Var = dVar.f56888w;
        if (t0Var == null) {
            Uri uri = dVar.G;
            if (uri != null) {
                dVar.h(uri);
                return;
            }
            return;
        }
        throw t0Var;
    }

    @Override
    public final void m(c0 c0Var) {
        boolean z10;
        this.f56519r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        m2.i iVar = this.f60157g;
        iVar.getClass();
        q2.m mVar = this.f56512k;
        mVar.r1(myLooper, iVar);
        mVar.a();
        xa b10 = b(null);
        g0 g0Var = i().f10494b;
        g0Var.getClass();
        Uri uri = g0Var.f10403a;
        s2.d dVar = this.f56516o;
        dVar.getClass();
        dVar.f56885n = h2.l0.q(null);
        dVar.f56884f = b10;
        dVar.f56886r = this;
        Map map = Collections.EMPTY_MAP;
        ma.k(uri, "The uri must be set.");
        b3.s sVar = new b3.s(((j2.g) dVar.f56880a.f29095a).createDataSource(), new j2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, dVar.f56881b.U());
        if (dVar.h == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.p(z10);
        b3.p pVar = new b3.p("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        dVar.h = pVar;
        pVar.f(sVar, dVar, dVar.f56882c.R4(sVar.f2890c));
    }

    @Override
    public final void o(e0 e0Var) {
        p[] pVarArr;
        o[] oVarArr;
        j jVar = (j) e0Var;
        jVar.f56500b.f56883e.remove(jVar);
        for (p pVar : jVar.K) {
            if (pVar.U) {
                for (o oVar : pVar.M) {
                    oVar.l();
                    q2.g gVar = oVar.h;
                    if (gVar != null) {
                        gVar.c(oVar.f60181e);
                        oVar.h = null;
                        oVar.f60183g = null;
                    }
                }
            }
            h hVar = pVar.d;
            int m10 = hVar.f56490r.m();
            s2.d dVar = hVar.f56480g;
            Uri c10 = hVar.f56478e[m10].c();
            s2.c cVar = (s2.c) dVar.d.get(c10);
            if (cVar != null) {
                s2.b bVar = (s2.b) p5.c.i(cVar.f56878b, c10, c10);
                bVar.getClass();
                bVar.f56875x = false;
            }
            hVar.f56486n = null;
            pVar.f56555s.e(pVar);
            pVar.I.removeCallbacksAndMessages(null);
            pVar.Y = true;
            pVar.J.clear();
        }
        jVar.H = null;
    }

    @Override
    public final void q() {
        s2.d dVar = this.f56516o;
        dVar.G = null;
        dVar.H = null;
        dVar.f56887s = null;
        dVar.f56889x = null;
        dVar.f56890y = null;
        dVar.E = null;
        dVar.F = null;
        dVar.f56888w = null;
        dVar.J = -9223372036854775807L;
        dVar.h.e(null);
        dVar.h = null;
        HashMap hashMap = dVar.d;
        for (s2.c cVar : hashMap.values()) {
            for (s2.b bVar : cVar.f56878b.values()) {
                bVar.f56868c.e(null);
            }
        }
        dVar.f56885n.removeCallbacksAndMessages(null);
        dVar.f56885n = null;
        hashMap.clear();
        this.f56512k.release();
    }

    @Override
    public final synchronized void t(l0 l0Var) {
        this.f56520s = l0Var;
    }

    public final void v(s2.n nVar) {
        long j3;
        long j10;
        long j11;
        j1 j1Var;
        long j12;
        long j13;
        long j14;
        long j15;
        boolean z10;
        float f10;
        long j16;
        boolean z11;
        boolean z12 = nVar.f56963p;
        boolean z13 = nVar.f56955g;
        i0 i0Var = nVar.f56965r;
        long j17 = nVar.f56968u;
        long j18 = nVar.f56953e;
        int i7 = nVar.d;
        long j19 = nVar.h;
        if (z12) {
            j3 = h2.l0.h0(j19);
        } else {
            j3 = -9223372036854775807L;
        }
        if (i7 != 2 && i7 != 1) {
            j10 = -9223372036854775807L;
        } else {
            j10 = j3;
        }
        s2.d dVar = this.f56516o;
        dVar.f56887s.getClass();
        nb.a aVar = new nb.a(23);
        long j20 = 0;
        if (dVar.I) {
            s2.m mVar = nVar.v;
            long j21 = j19 - dVar.J;
            boolean z14 = nVar.f56962o;
            if (z14) {
                j12 = j21 + j17;
            } else {
                j12 = -9223372036854775807L;
            }
            if (nVar.f56963p) {
                j13 = h2.l0.S(h2.l0.C(this.f56517p)) - (j19 + j17);
            } else {
                j13 = 0;
            }
            long j22 = this.f56518q.f10385a;
            if (j22 != -9223372036854775807L) {
                j15 = h2.l0.S(j22);
            } else {
                if (j18 != -9223372036854775807L) {
                    j14 = j17 - j18;
                } else {
                    j14 = mVar.d;
                    if (j14 == -9223372036854775807L || nVar.f56961n == -9223372036854775807L) {
                        j14 = mVar.f56951c;
                        if (j14 == -9223372036854775807L) {
                            j14 = 3 * nVar.f56960m;
                        }
                    }
                }
                j15 = j14 + j13;
            }
            long j23 = j17 + j13;
            long j24 = h2.l0.j(j15, j13, j23);
            f0 f0Var = i().f10495c;
            if (f0Var.d == -3.4028235E38f && f0Var.f10388e == -3.4028235E38f && mVar.f56951c == -9223372036854775807L && mVar.d == -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.e0 a10 = this.f56518q.a();
            a10.f10373a = h2.l0.h0(j24);
            float f11 = 1.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = this.f56518q.d;
            }
            a10.d = f10;
            if (!z10) {
                f11 = this.f56518q.f10388e;
            }
            a10.f10376e = f11;
            f0 f0Var2 = new f0(a10);
            this.f56518q = f0Var2;
            if (j18 == -9223372036854775807L) {
                j18 = j23 - h2.l0.S(f0Var2.f10385a);
            }
            if (z13) {
                j20 = j18;
            } else {
                s2.i u10 = u(j18, nVar.f56966s);
                if (u10 != null) {
                    j16 = u10.f56943e;
                } else if (!i0Var.isEmpty()) {
                    s2.k kVar = (s2.k) i0Var.get(h2.l0.d(i0Var, Long.valueOf(j18), true));
                    s2.i u11 = u(j18, kVar.f56939y);
                    if (u11 != null) {
                        j16 = u11.f56943e;
                    } else {
                        j16 = kVar.f56943e;
                    }
                }
                j20 = j16;
            }
            if (i7 == 2 && nVar.f56954f) {
                z11 = true;
            } else {
                z11 = false;
            }
            j1Var = new j1(j10, j3, j12, nVar.f56968u, j21, j20, true, !z14, z11, aVar, i(), this.f56518q);
        } else {
            if (j18 != -9223372036854775807L && !i0Var.isEmpty()) {
                if (!z13 && j18 != j17) {
                    j18 = ((s2.k) i0Var.get(h2.l0.d(i0Var, Long.valueOf(j18), true))).f56943e;
                }
                j11 = j18;
            } else {
                j11 = 0;
            }
            long j25 = nVar.f56968u;
            j1Var = new j1(j10, j3, j25, j25, 0L, j11, true, false, true, aVar, i(), null);
        }
        n(j1Var);
    }
}
