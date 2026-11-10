package r2;

import a8.ia;
import a8.wa;
import android.net.Uri;
import android.os.Looper;
import e2.e0;
import e2.f0;
import e2.g0;
import e2.l0;
import e2.m0;
import e2.t0;
import h9.i0;
import j$.util.Objects;
import j2.d0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.telegram.ui.Cells.f1;
import x2.h1;
public final class k extends x2.a {
    public final c h;
    public final org.telegram.ui.Components.m f54342i;
    public final sa.d f54343j;
    public final q2.m f54344k;
    public final pb.b f54345l;
    public final boolean f54346m;
    public final int f54347n;
    public final s2.d f54348o;
    public final long f54349p;
    public f0 f54350q;
    public d0 f54351r;
    public l0 f54352s;

    static {
        m0.a("media3.exoplayer.hls");
    }

    public k(l0 l0Var, org.telegram.ui.Components.m mVar, c cVar, sa.d dVar, q2.m mVar2, pb.b bVar, s2.d dVar2, long j3, boolean z9, int i7) {
        this.f54352s = l0Var;
        this.f54350q = l0Var.f10356c;
        this.f54342i = mVar;
        this.h = cVar;
        this.f54343j = dVar;
        this.f54344k = mVar2;
        this.f54345l = bVar;
        this.f54348o = dVar2;
        this.f54349p = j3;
        this.f54346m = z9;
        this.f54347n = i7;
    }

    public static s2.h u(long j3, List list) {
        s2.h hVar = null;
        for (int i7 = 0; i7 < list.size(); i7++) {
            s2.h hVar2 = (s2.h) list.get(i7);
            long j10 = hVar2.f54689e;
            if (j10 <= j3 && hVar2.f54679x) {
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
        g0 g0Var = i7.f10355b;
        g0Var.getClass();
        g0 g0Var2 = l0Var.f10355b;
        if (g0Var2 != null && g0Var2.f10264a.equals(g0Var.f10264a) && g0Var2.f10267e.equals(g0Var.f10267e) && Objects.equals(g0Var2.f10266c, g0Var.f10266c) && i7.f10356c.equals(l0Var.f10356c)) {
            return true;
        }
        return false;
    }

    @Override
    public final x2.d0 c(x2.f0 f0Var, h6.m mVar, long j3) {
        wa b10 = b(f0Var);
        q2.j jVar = new q2.j(this.d.f53750c, 0, f0Var);
        d0 d0Var = this.f54351r;
        m2.j jVar2 = this.f58283g;
        jVar2.getClass();
        return new j(this.h, this.f54348o, this.f54342i, d0Var, this.f54344k, jVar, this.f54345l, b10, mVar, this.f54343j, this.f54346m, this.f54347n, jVar2);
    }

    @Override
    public final synchronized l0 i() {
        return this.f54352s;
    }

    @Override
    public final void k() {
        s2.d dVar = this.f54348o;
        b3.o oVar = dVar.h;
        if (oVar != null) {
            oVar.a();
        }
        t0 t0Var = dVar.f54637w;
        if (t0Var == null) {
            Uri uri = dVar.F;
            if (uri != null) {
                dVar.h(uri);
                return;
            }
            return;
        }
        throw t0Var;
    }

    @Override
    public final void m(d0 d0Var) {
        boolean z9;
        this.f54351r = d0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        m2.j jVar = this.f58283g;
        jVar.getClass();
        q2.m mVar = this.f54344k;
        mVar.E(myLooper, jVar);
        mVar.a();
        wa b10 = b(null);
        g0 g0Var = i().f10355b;
        g0Var.getClass();
        Uri uri = g0Var.f10264a;
        s2.d dVar = this.f54348o;
        dVar.getClass();
        dVar.f54634n = h2.m0.q(null);
        dVar.f54633f = b10;
        dVar.f54635r = this;
        Map map = Collections.EMPTY_MAP;
        ia.k(uri, "The uri must be set.");
        b3.r rVar = new b3.r(((j2.g) dVar.f54629a.f35778a).createDataSource(), new j2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, dVar.f54630b.Y());
        if (dVar.h == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.p(z9);
        b3.o oVar = new b3.o("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        dVar.h = oVar;
        oVar.f(rVar, dVar, dVar.f54631c.X0(rVar.f2967c));
    }

    @Override
    public final void o(x2.d0 d0Var) {
        p[] pVarArr;
        o[] oVarArr;
        j jVar = (j) d0Var;
        jVar.f54332b.f54632e.remove(jVar);
        for (p pVar : jVar.J) {
            if (pVar.T) {
                for (o oVar : pVar.L) {
                    oVar.l();
                    q2.g gVar = oVar.h;
                    if (gVar != null) {
                        gVar.c(oVar.f58295e);
                        oVar.h = null;
                        oVar.f58297g = null;
                    }
                }
            }
            h hVar = pVar.d;
            int m10 = hVar.f54323r.m();
            s2.d dVar = hVar.f54313g;
            Uri c10 = hVar.f54311e[m10].c();
            s2.c cVar = (s2.c) dVar.d.get(c10);
            if (cVar != null) {
                s2.b bVar = (s2.b) f1.l(cVar.f54627b, c10, c10);
                bVar.getClass();
                bVar.f54624x = false;
            }
            hVar.f54319n = null;
            pVar.f54386s.e(pVar);
            pVar.H.removeCallbacksAndMessages(null);
            pVar.X = true;
            pVar.I.clear();
        }
        jVar.G = null;
    }

    @Override
    public final void q() {
        s2.d dVar = this.f54348o;
        dVar.F = null;
        dVar.G = null;
        dVar.f54636s = null;
        dVar.f54638x = null;
        dVar.f54639y = null;
        dVar.D = null;
        dVar.E = null;
        dVar.f54637w = null;
        dVar.I = -9223372036854775807L;
        dVar.h.e(null);
        dVar.h = null;
        HashMap hashMap = dVar.d;
        for (s2.c cVar : hashMap.values()) {
            for (s2.b bVar : cVar.f54627b.values()) {
                bVar.f54617c.e(null);
            }
        }
        dVar.f54634n.removeCallbacksAndMessages(null);
        dVar.f54634n = null;
        hashMap.clear();
        this.f54344k.release();
    }

    @Override
    public final synchronized void t(l0 l0Var) {
        this.f54352s = l0Var;
    }

    public final void v(s2.m mVar) {
        long j3;
        long j10;
        long j11;
        h1 h1Var;
        long j12;
        long j13;
        long j14;
        long j15;
        boolean z9;
        float f10;
        long j16;
        boolean z10;
        boolean z11 = mVar.f54709p;
        boolean z12 = mVar.f54701g;
        i0 i0Var = mVar.f54711r;
        long j17 = mVar.f54714u;
        long j18 = mVar.f54699e;
        int i7 = mVar.d;
        long j19 = mVar.h;
        if (z11) {
            j3 = h2.m0.h0(j19);
        } else {
            j3 = -9223372036854775807L;
        }
        if (i7 != 2 && i7 != 1) {
            j10 = -9223372036854775807L;
        } else {
            j10 = j3;
        }
        s2.d dVar = this.f54348o;
        dVar.f54636s.getClass();
        qb.a aVar = new qb.a(22);
        long j20 = 0;
        if (dVar.H) {
            s2.l lVar = mVar.v;
            long j21 = j19 - dVar.I;
            boolean z13 = mVar.f54708o;
            if (z13) {
                j12 = j21 + j17;
            } else {
                j12 = -9223372036854775807L;
            }
            if (mVar.f54709p) {
                j13 = h2.m0.S(h2.m0.C(this.f54349p)) - (j19 + j17);
            } else {
                j13 = 0;
            }
            long j22 = this.f54350q.f10246a;
            if (j22 != -9223372036854775807L) {
                j15 = h2.m0.S(j22);
            } else {
                if (j18 != -9223372036854775807L) {
                    j14 = j17 - j18;
                } else {
                    j14 = lVar.d;
                    if (j14 == -9223372036854775807L || mVar.f54707n == -9223372036854775807L) {
                        j14 = lVar.f54697c;
                        if (j14 == -9223372036854775807L) {
                            j14 = 3 * mVar.f54706m;
                        }
                    }
                }
                j15 = j14 + j13;
            }
            long j23 = j17 + j13;
            long j24 = h2.m0.j(j15, j13, j23);
            f0 f0Var = i().f10356c;
            if (f0Var.d == -3.4028235E38f && f0Var.f10249e == -3.4028235E38f && lVar.f54697c == -9223372036854775807L && lVar.d == -9223372036854775807L) {
                z9 = true;
            } else {
                z9 = false;
            }
            e0 a10 = this.f54350q.a();
            a10.f10234a = h2.m0.h0(j24);
            float f11 = 1.0f;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = this.f54350q.d;
            }
            a10.d = f10;
            if (!z9) {
                f11 = this.f54350q.f10249e;
            }
            a10.f10237e = f11;
            f0 f0Var2 = new f0(a10);
            this.f54350q = f0Var2;
            if (j18 == -9223372036854775807L) {
                j18 = j23 - h2.m0.S(f0Var2.f10246a);
            }
            if (z12) {
                j20 = j18;
            } else {
                s2.h u10 = u(j18, mVar.f54712s);
                if (u10 != null) {
                    j16 = u10.f54689e;
                } else if (!i0Var.isEmpty()) {
                    s2.j jVar = (s2.j) i0Var.get(h2.m0.d(i0Var, Long.valueOf(j18), true));
                    s2.h u11 = u(j18, jVar.f54685y);
                    if (u11 != null) {
                        j16 = u11.f54689e;
                    } else {
                        j16 = jVar.f54689e;
                    }
                }
                j20 = j16;
            }
            if (i7 == 2 && mVar.f54700f) {
                z10 = true;
            } else {
                z10 = false;
            }
            h1Var = new h1(j10, j3, j12, mVar.f54714u, j21, j20, true, !z13, z10, aVar, i(), this.f54350q);
        } else {
            if (j18 != -9223372036854775807L && !i0Var.isEmpty()) {
                if (!z12 && j18 != j17) {
                    j18 = ((s2.j) i0Var.get(h2.m0.d(i0Var, Long.valueOf(j18), true))).f54689e;
                }
                j11 = j18;
            } else {
                j11 = 0;
            }
            long j25 = mVar.f54714u;
            h1Var = new h1(j10, j3, j25, j25, 0L, j11, true, false, true, aVar, i(), null);
        }
        n(h1Var);
    }
}
