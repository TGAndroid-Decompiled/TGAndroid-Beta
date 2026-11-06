package r2;

import a8.ia;
import a8.wa;
import android.net.Uri;
import android.os.Looper;
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
import x2.e0;
import x2.i1;
public final class l extends x2.a {
    public final c h;
    public final org.telegram.ui.Components.n f54239i;
    public final sa.d f54240j;
    public final q2.m f54241k;
    public final pb.b f54242l;
    public final boolean f54243m;
    public final int f54244n;
    public final s2.d f54245o;
    public final long f54246p;
    public f0 f54247q;
    public d0 f54248r;
    public l0 f54249s;

    static {
        m0.a("media3.exoplayer.hls");
    }

    public l(l0 l0Var, org.telegram.ui.Components.n nVar, c cVar, sa.d dVar, q2.m mVar, pb.b bVar, s2.d dVar2, long j3, boolean z9, int i7) {
        this.f54249s = l0Var;
        this.f54247q = l0Var.f10351c;
        this.f54239i = nVar;
        this.h = cVar;
        this.f54240j = dVar;
        this.f54241k = mVar;
        this.f54242l = bVar;
        this.f54245o = dVar2;
        this.f54246p = j3;
        this.f54243m = z9;
        this.f54244n = i7;
    }

    public static s2.h u(long j3, List list) {
        s2.h hVar = null;
        for (int i7 = 0; i7 < list.size(); i7++) {
            s2.h hVar2 = (s2.h) list.get(i7);
            long j10 = hVar2.f54586e;
            if (j10 <= j3 && hVar2.f54576x) {
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
        g0 g0Var = i7.f10350b;
        g0Var.getClass();
        g0 g0Var2 = l0Var.f10350b;
        if (g0Var2 != null && g0Var2.f10259a.equals(g0Var.f10259a) && g0Var2.f10262e.equals(g0Var.f10262e) && Objects.equals(g0Var2.f10261c, g0Var.f10261c) && i7.f10351c.equals(l0Var.f10351c)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(x2.g0 g0Var, h6.m mVar, long j3) {
        wa b10 = b(g0Var);
        q2.j jVar = new q2.j(this.d.f53646c, 0, g0Var);
        d0 d0Var = this.f54248r;
        m2.j jVar2 = this.f58175g;
        jVar2.getClass();
        return new k(this.h, this.f54245o, this.f54239i, d0Var, this.f54241k, jVar, this.f54242l, b10, mVar, this.f54240j, this.f54243m, this.f54244n, jVar2);
    }

    @Override
    public final synchronized l0 i() {
        return this.f54249s;
    }

    @Override
    public final void k() {
        s2.d dVar = this.f54245o;
        b3.o oVar = dVar.h;
        if (oVar != null) {
            oVar.a();
        }
        t0 t0Var = dVar.f54534w;
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
        this.f54248r = d0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        m2.j jVar = this.f58175g;
        jVar.getClass();
        q2.m mVar = this.f54241k;
        mVar.E(myLooper, jVar);
        mVar.a();
        wa b10 = b(null);
        g0 g0Var = i().f10350b;
        g0Var.getClass();
        Uri uri = g0Var.f10259a;
        s2.d dVar = this.f54245o;
        dVar.getClass();
        dVar.f54531n = h2.m0.q(null);
        dVar.f54530f = b10;
        dVar.f54532r = this;
        Map map = Collections.EMPTY_MAP;
        ia.k(uri, "The uri must be set.");
        b3.r rVar = new b3.r(((j2.g) dVar.f54526a.f36104a).createDataSource(), new j2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, dVar.f54527b.Y());
        if (dVar.h == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.p(z9);
        b3.o oVar = new b3.o("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        dVar.h = oVar;
        oVar.f(rVar, dVar, dVar.f54528c.X0(rVar.f2967c));
    }

    @Override
    public final void o(e0 e0Var) {
        q[] qVarArr;
        p[] pVarArr;
        k kVar = (k) e0Var;
        kVar.f54229b.f54529e.remove(kVar);
        for (q qVar : kVar.J) {
            if (qVar.T) {
                for (p pVar : qVar.L) {
                    pVar.l();
                    q2.g gVar = pVar.h;
                    if (gVar != null) {
                        gVar.c(pVar.f58188e);
                        pVar.h = null;
                        pVar.f58190g = null;
                    }
                }
            }
            i iVar = qVar.d;
            int m10 = iVar.f54220r.m();
            s2.d dVar = iVar.f54210g;
            Uri c10 = iVar.f54208e[m10].c();
            s2.c cVar = (s2.c) dVar.d.get(c10);
            if (cVar != null) {
                s2.b bVar = (s2.b) f1.l(cVar.f54524b, c10, c10);
                bVar.getClass();
                bVar.f54521x = false;
            }
            iVar.f54216n = null;
            qVar.f54283s.e(qVar);
            qVar.H.removeCallbacksAndMessages(null);
            qVar.X = true;
            qVar.I.clear();
        }
        kVar.G = null;
    }

    @Override
    public final void q() {
        s2.d dVar = this.f54245o;
        dVar.F = null;
        dVar.G = null;
        dVar.f54533s = null;
        dVar.f54535x = null;
        dVar.f54536y = null;
        dVar.D = null;
        dVar.E = null;
        dVar.f54534w = null;
        dVar.I = -9223372036854775807L;
        dVar.h.e(null);
        dVar.h = null;
        HashMap hashMap = dVar.d;
        for (s2.c cVar : hashMap.values()) {
            for (s2.b bVar : cVar.f54524b.values()) {
                bVar.f54514c.e(null);
            }
        }
        dVar.f54531n.removeCallbacksAndMessages(null);
        dVar.f54531n = null;
        hashMap.clear();
        this.f54241k.release();
    }

    @Override
    public final synchronized void t(l0 l0Var) {
        this.f54249s = l0Var;
    }

    public final void v(s2.m mVar) {
        long j3;
        long j10;
        long j11;
        i1 i1Var;
        long j12;
        long j13;
        long j14;
        long j15;
        boolean z9;
        float f10;
        long j16;
        boolean z10;
        boolean z11 = mVar.f54606p;
        boolean z12 = mVar.f54598g;
        i0 i0Var = mVar.f54608r;
        long j17 = mVar.f54611u;
        long j18 = mVar.f54596e;
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
        s2.d dVar = this.f54245o;
        dVar.f54533s.getClass();
        qb.a aVar = new qb.a(22);
        long j20 = 0;
        if (dVar.H) {
            s2.l lVar = mVar.v;
            long j21 = j19 - dVar.I;
            boolean z13 = mVar.f54605o;
            if (z13) {
                j12 = j21 + j17;
            } else {
                j12 = -9223372036854775807L;
            }
            if (mVar.f54606p) {
                j13 = h2.m0.S(h2.m0.C(this.f54246p)) - (j19 + j17);
            } else {
                j13 = 0;
            }
            long j22 = this.f54247q.f10241a;
            if (j22 != -9223372036854775807L) {
                j15 = h2.m0.S(j22);
            } else {
                if (j18 != -9223372036854775807L) {
                    j14 = j17 - j18;
                } else {
                    j14 = lVar.d;
                    if (j14 == -9223372036854775807L || mVar.f54604n == -9223372036854775807L) {
                        j14 = lVar.f54594c;
                        if (j14 == -9223372036854775807L) {
                            j14 = 3 * mVar.f54603m;
                        }
                    }
                }
                j15 = j14 + j13;
            }
            long j23 = j17 + j13;
            long j24 = h2.m0.j(j15, j13, j23);
            f0 f0Var = i().f10351c;
            if (f0Var.d == -3.4028235E38f && f0Var.f10244e == -3.4028235E38f && lVar.f54594c == -9223372036854775807L && lVar.d == -9223372036854775807L) {
                z9 = true;
            } else {
                z9 = false;
            }
            e2.e0 a10 = this.f54247q.a();
            a10.f10229a = h2.m0.h0(j24);
            float f11 = 1.0f;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = this.f54247q.d;
            }
            a10.d = f10;
            if (!z9) {
                f11 = this.f54247q.f10244e;
            }
            a10.f10232e = f11;
            f0 f0Var2 = new f0(a10);
            this.f54247q = f0Var2;
            if (j18 == -9223372036854775807L) {
                j18 = j23 - h2.m0.S(f0Var2.f10241a);
            }
            if (z12) {
                j20 = j18;
            } else {
                s2.h u10 = u(j18, mVar.f54609s);
                if (u10 != null) {
                    j16 = u10.f54586e;
                } else if (!i0Var.isEmpty()) {
                    s2.j jVar = (s2.j) i0Var.get(h2.m0.d(i0Var, Long.valueOf(j18), true));
                    s2.h u11 = u(j18, jVar.f54582y);
                    if (u11 != null) {
                        j16 = u11.f54586e;
                    } else {
                        j16 = jVar.f54586e;
                    }
                }
                j20 = j16;
            }
            if (i7 == 2 && mVar.f54597f) {
                z10 = true;
            } else {
                z10 = false;
            }
            i1Var = new i1(j10, j3, j12, mVar.f54611u, j21, j20, true, !z13, z10, aVar, i(), this.f54247q);
        } else {
            if (j18 != -9223372036854775807L && !i0Var.isEmpty()) {
                if (!z12 && j18 != j17) {
                    j18 = ((s2.j) i0Var.get(h2.m0.d(i0Var, Long.valueOf(j18), true))).f54586e;
                }
                j11 = j18;
            } else {
                j11 = 0;
            }
            long j25 = mVar.f54611u;
            i1Var = new i1(j10, j3, j25, j25, 0L, j11, true, false, true, aVar, i(), null);
        }
        n(i1Var);
    }
}
