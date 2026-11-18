package r2;

import a8.la;
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
import org.telegram.ui.Cells.b5;
import x2.e0;
import x2.j1;
public final class k extends x2.a {
    public final c h;
    public final b5 f56387i;
    public final nb.a f56388j;
    public final q2.m f56389k;
    public final qb.a f56390l;
    public final boolean f56391m;
    public final int f56392n;
    public final s2.d f56393o;
    public final long f56394p;
    public f0 f56395q;
    public c0 f56396r;
    public l0 f56397s;

    static {
        m0.a("media3.exoplayer.hls");
    }

    public k(l0 l0Var, b5 b5Var, c cVar, nb.a aVar, q2.m mVar, qb.a aVar2, s2.d dVar, long j3, boolean z10, int i7) {
        this.f56397s = l0Var;
        this.f56395q = l0Var.f10505c;
        this.f56387i = b5Var;
        this.h = cVar;
        this.f56388j = aVar;
        this.f56389k = mVar;
        this.f56390l = aVar2;
        this.f56393o = dVar;
        this.f56394p = j3;
        this.f56391m = z10;
        this.f56392n = i7;
    }

    public static s2.h u(long j3, List list) {
        s2.h hVar = null;
        for (int i7 = 0; i7 < list.size(); i7++) {
            s2.h hVar2 = (s2.h) list.get(i7);
            long j10 = hVar2.f56817e;
            if (j10 <= j3 && hVar2.f56807x) {
                hVar = hVar2;
            } else if (j10 > j3) {
                break;
            }
        }
        return hVar;
    }

    @Override
    public final boolean a(l0 l0Var) {
        l0 i7 = i();
        g0 g0Var = i7.f10504b;
        g0Var.getClass();
        g0 g0Var2 = l0Var.f10504b;
        if (g0Var2 != null && g0Var2.f10413a.equals(g0Var.f10413a) && g0Var2.f10416e.equals(g0Var.f10416e) && Objects.equals(g0Var2.f10415c, g0Var.f10415c) && i7.f10505c.equals(l0Var.f10505c)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(x2.g0 g0Var, h6.m mVar, long j3) {
        xa b10 = b(g0Var);
        q2.j jVar = new q2.j(this.d.f55761c, 0, g0Var);
        c0 c0Var = this.f56396r;
        m2.i iVar = this.f60028g;
        iVar.getClass();
        return new j(this.h, this.f56393o, this.f56387i, c0Var, this.f56389k, jVar, this.f56390l, b10, mVar, this.f56388j, this.f56391m, this.f56392n, iVar);
    }

    @Override
    public final synchronized l0 i() {
        return this.f56397s;
    }

    @Override
    public final void k() {
        s2.d dVar = this.f56393o;
        b3.p pVar = dVar.h;
        if (pVar != null) {
            pVar.a();
        }
        t0 t0Var = dVar.f56765w;
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
        this.f56396r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        m2.i iVar = this.f60028g;
        iVar.getClass();
        q2.m mVar = this.f56389k;
        mVar.r1(myLooper, iVar);
        mVar.a();
        xa b10 = b(null);
        g0 g0Var = i().f10504b;
        g0Var.getClass();
        Uri uri = g0Var.f10413a;
        s2.d dVar = this.f56393o;
        dVar.getClass();
        dVar.f56762n = h2.l0.q(null);
        dVar.f56761f = b10;
        dVar.f56763r = this;
        Map map = Collections.EMPTY_MAP;
        la.k(uri, "The uri must be set.");
        b3.s sVar = new b3.s(((j2.g) dVar.f56757a.f30431a).createDataSource(), new j2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, dVar.f56758b.f0());
        if (dVar.h == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.p(z10);
        b3.p pVar = new b3.p("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        dVar.h = pVar;
        pVar.f(sVar, dVar, dVar.f56759c.R4(sVar.f2918c));
    }

    @Override
    public final void o(e0 e0Var) {
        p[] pVarArr;
        o[] oVarArr;
        j jVar = (j) e0Var;
        jVar.f56377b.f56760e.remove(jVar);
        for (p pVar : jVar.K) {
            if (pVar.U) {
                for (o oVar : pVar.M) {
                    oVar.l();
                    q2.g gVar = oVar.h;
                    if (gVar != null) {
                        gVar.c(oVar.f60052e);
                        oVar.h = null;
                        oVar.f60054g = null;
                    }
                }
            }
            h hVar = pVar.d;
            int m10 = hVar.f56367r.m();
            s2.d dVar = hVar.f56357g;
            Uri c10 = hVar.f56355e[m10].c();
            s2.c cVar = (s2.c) dVar.d.get(c10);
            if (cVar != null) {
                s2.b bVar = (s2.b) p5.c.i(cVar.f56755b, c10, c10);
                bVar.getClass();
                bVar.f56752x = false;
            }
            hVar.f56363n = null;
            pVar.f56432s.e(pVar);
            pVar.I.removeCallbacksAndMessages(null);
            pVar.Y = true;
            pVar.J.clear();
        }
        jVar.H = null;
    }

    @Override
    public final void q() {
        s2.d dVar = this.f56393o;
        dVar.G = null;
        dVar.H = null;
        dVar.f56764s = null;
        dVar.f56766x = null;
        dVar.f56767y = null;
        dVar.E = null;
        dVar.F = null;
        dVar.f56765w = null;
        dVar.J = -9223372036854775807L;
        dVar.h.e(null);
        dVar.h = null;
        HashMap hashMap = dVar.d;
        for (s2.c cVar : hashMap.values()) {
            for (s2.b bVar : cVar.f56755b.values()) {
                bVar.f56745c.e(null);
            }
        }
        dVar.f56762n.removeCallbacksAndMessages(null);
        dVar.f56762n = null;
        hashMap.clear();
        this.f56389k.release();
    }

    @Override
    public final synchronized void t(l0 l0Var) {
        this.f56397s = l0Var;
    }

    public final void v(s2.m mVar) {
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
        boolean z12 = mVar.f56837p;
        boolean z13 = mVar.f56829g;
        i0 i0Var = mVar.f56839r;
        long j17 = mVar.f56842u;
        long j18 = mVar.f56827e;
        int i7 = mVar.d;
        long j19 = mVar.h;
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
        s2.d dVar = this.f56393o;
        dVar.f56764s.getClass();
        nb.a aVar = new nb.a(23);
        long j20 = 0;
        if (dVar.I) {
            s2.l lVar = mVar.v;
            long j21 = j19 - dVar.J;
            boolean z14 = mVar.f56836o;
            if (z14) {
                j12 = j21 + j17;
            } else {
                j12 = -9223372036854775807L;
            }
            if (mVar.f56837p) {
                j13 = h2.l0.S(h2.l0.C(this.f56394p)) - (j19 + j17);
            } else {
                j13 = 0;
            }
            long j22 = this.f56395q.f10395a;
            if (j22 != -9223372036854775807L) {
                j15 = h2.l0.S(j22);
            } else {
                if (j18 != -9223372036854775807L) {
                    j14 = j17 - j18;
                } else {
                    j14 = lVar.d;
                    if (j14 == -9223372036854775807L || mVar.f56835n == -9223372036854775807L) {
                        j14 = lVar.f56825c;
                        if (j14 == -9223372036854775807L) {
                            j14 = 3 * mVar.f56834m;
                        }
                    }
                }
                j15 = j14 + j13;
            }
            long j23 = j17 + j13;
            long j24 = h2.l0.j(j15, j13, j23);
            f0 f0Var = i().f10505c;
            if (f0Var.d == -3.4028235E38f && f0Var.f10398e == -3.4028235E38f && lVar.f56825c == -9223372036854775807L && lVar.d == -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.e0 a10 = this.f56395q.a();
            a10.f10383a = h2.l0.h0(j24);
            float f11 = 1.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = this.f56395q.d;
            }
            a10.d = f10;
            if (!z10) {
                f11 = this.f56395q.f10398e;
            }
            a10.f10386e = f11;
            f0 f0Var2 = new f0(a10);
            this.f56395q = f0Var2;
            if (j18 == -9223372036854775807L) {
                j18 = j23 - h2.l0.S(f0Var2.f10395a);
            }
            if (z13) {
                j20 = j18;
            } else {
                s2.h u10 = u(j18, mVar.f56840s);
                if (u10 != null) {
                    j16 = u10.f56817e;
                } else if (!i0Var.isEmpty()) {
                    s2.j jVar = (s2.j) i0Var.get(h2.l0.d(i0Var, Long.valueOf(j18), true));
                    s2.h u11 = u(j18, jVar.f56813y);
                    if (u11 != null) {
                        j16 = u11.f56817e;
                    } else {
                        j16 = jVar.f56817e;
                    }
                }
                j20 = j16;
            }
            if (i7 == 2 && mVar.f56828f) {
                z11 = true;
            } else {
                z11 = false;
            }
            j1Var = new j1(j10, j3, j12, mVar.f56842u, j21, j20, true, !z14, z11, aVar, i(), this.f56395q);
        } else {
            if (j18 != -9223372036854775807L && !i0Var.isEmpty()) {
                if (!z13 && j18 != j17) {
                    j18 = ((s2.j) i0Var.get(h2.l0.d(i0Var, Long.valueOf(j18), true))).f56817e;
                }
                j11 = j18;
            } else {
                j11 = 0;
            }
            long j25 = mVar.f56842u;
            j1Var = new j1(j10, j3, j25, j25, 0L, j11, true, false, true, aVar, i(), null);
        }
        n(j1Var);
    }
}
