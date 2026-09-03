package t4;

import android.net.Uri;
import android.os.Looper;
import b4.e0;
import g5.m0;
import g5.p0;
import g5.v0;
import h5.d0;
import j3.c1;
import j3.l0;
import j3.x0;
import j3.y0;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import o4.r0;
import oh.h4;
public final class m extends o4.a {
    public final j h;
    public final y0 f47957i;
    public final h4 f47958j;
    public final z9.d f47959k;
    public final o3.o f47960l;
    public final ab.a f47961m;
    public final boolean f47962n;
    public final int f47963o;
    public final u4.c f47964p;
    public final long f47965q;
    public final c1 f47966r;
    public x0 f47967s;
    public v0 f47968t;

    static {
        l0.a("goog.exo.hls");
    }

    public m(c1 c1Var, h4 h4Var, c cVar, z9.d dVar, o3.o oVar, ab.a aVar, u4.c cVar2, long j10, boolean z4, int i10) {
        y0 y0Var = c1Var.f9008b;
        y0Var.getClass();
        this.f47957i = y0Var;
        this.f47966r = c1Var;
        this.f47967s = c1Var.f9009c;
        this.f47958j = h4Var;
        this.h = cVar;
        this.f47959k = dVar;
        this.f47960l = oVar;
        this.f47961m = aVar;
        this.f47964p = cVar2;
        this.f47965q = j10;
        this.f47962n = z4;
        this.f47963o = i10;
    }

    public static u4.d s(long j10, List list) {
        u4.d dVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            u4.d dVar2 = (u4.d) list.get(i10);
            long j11 = dVar2.f48308e;
            if (j11 <= j10 && dVar2.f48298w) {
                dVar = dVar2;
            } else if (j11 > j10) {
                break;
            }
        }
        return dVar;
    }

    @Override
    public final o4.t b(o4.v vVar, g5.q qVar, long j10) {
        e0 a2 = a(vVar);
        o3.l lVar = new o3.l(this.d.f16414c, 0, vVar);
        v0 v0Var = this.f47968t;
        k3.k kVar = this.f16435g;
        h5.a.j(kVar);
        return new l(this.h, this.f47964p, this.f47958j, v0Var, this.f47960l, lVar, this.f47961m, a2, qVar, this.f47959k, this.f47962n, this.f47963o, kVar);
    }

    @Override
    public final c1 h() {
        return this.f47966r;
    }

    @Override
    public final void j() {
        u4.c cVar = this.f47964p;
        m0 m0Var = cVar.h;
        if (m0Var != null) {
            m0Var.a();
        }
        Uri uri = cVar.v;
        if (uri != null) {
            u4.b bVar = (u4.b) cVar.d.get(uri);
            bVar.f48280b.a();
            IOException iOException = bVar.f48286s;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override
    public final void l(v0 v0Var) {
        boolean z4;
        this.f47968t = v0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        k3.k kVar = this.f16435g;
        h5.a.j(kVar);
        o3.o oVar = this.f47960l;
        oVar.h(myLooper, kVar);
        oVar.a();
        e0 a2 = a(null);
        Uri uri = this.f47957i.f9487a;
        u4.c cVar = this.f47964p;
        cVar.getClass();
        cVar.f48292n = d0.l(null);
        cVar.f48291f = a2;
        cVar.f48293r = this;
        p0 p0Var = new p0(((g5.l) cVar.f48287a.f17182b).createDataSource(), uri, 4, cVar.f48288b.G());
        if (cVar.h == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.i(z4);
        m0 m0Var = new m0("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.h = m0Var;
        ab.a aVar = cVar.f48289c;
        int i10 = p0Var.f6893c;
        m0Var.f(p0Var, cVar, aVar.n3(i10));
        a2.u(new o4.j(p0Var.f6892b), i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public final void n(o4.t tVar) {
        r[] rVarArr;
        q[] qVarArr;
        l lVar = (l) tVar;
        lVar.f47947b.f48290e.remove(lVar);
        for (r rVar : lVar.G) {
            if (rVar.Q) {
                for (q qVar : rVar.I) {
                    qVar.i();
                    o3.i iVar = qVar.h;
                    if (iVar != null) {
                        iVar.c(qVar.f16509e);
                        qVar.h = null;
                        qVar.f16511g = null;
                    }
                }
            }
            rVar.f47999s.e(rVar);
            rVar.E.removeCallbacksAndMessages(null);
            rVar.U = true;
            rVar.F.clear();
        }
        lVar.D = null;
    }

    @Override
    public final void p() {
        u4.c cVar = this.f47964p;
        cVar.v = null;
        cVar.f48295w = null;
        cVar.f48294s = null;
        cVar.f48297y = -9223372036854775807L;
        cVar.h.e(null);
        cVar.h = null;
        HashMap hashMap = cVar.d;
        for (u4.b bVar : hashMap.values()) {
            bVar.f48280b.e(null);
        }
        cVar.f48292n.removeCallbacksAndMessages(null);
        cVar.f48292n = null;
        hashMap.clear();
        this.f47960l.release();
    }

    public final void t(u4.i iVar) {
        long j10;
        long j11;
        long j12;
        r0 r0Var;
        long j13;
        boolean z4;
        long j14;
        long j15;
        long j16;
        boolean z10;
        float f10;
        float f11;
        long j17;
        boolean z11;
        boolean z12 = iVar.f48327p;
        boolean z13 = iVar.f48319g;
        s8.v vVar = iVar.f48329r;
        long j18 = iVar.f48332u;
        long j19 = iVar.f48317e;
        int i10 = iVar.d;
        long j20 = iVar.h;
        if (z12) {
            j10 = d0.S(j20);
        } else {
            j10 = -9223372036854775807L;
        }
        if (i10 != 2 && i10 != 1) {
            j11 = -9223372036854775807L;
        } else {
            j11 = j10;
        }
        u4.c cVar = this.f47964p;
        cVar.f48294s.getClass();
        ?? obj = new Object();
        long j21 = 0;
        if (cVar.f48296x) {
            u4.h hVar = iVar.v;
            long j22 = j20 - cVar.f48297y;
            boolean z14 = iVar.f48326o;
            if (z14) {
                j13 = j22 + j18;
            } else {
                j13 = -9223372036854775807L;
            }
            if (iVar.f48327p) {
                z4 = z13;
                j14 = d0.G(d0.u(this.f47965q)) - (j20 + j18);
            } else {
                z4 = z13;
                j14 = 0;
            }
            long j23 = this.f47967s.f9477a;
            if (j23 != -9223372036854775807L) {
                j16 = d0.G(j23);
            } else {
                if (j19 != -9223372036854775807L) {
                    j15 = j18 - j19;
                } else {
                    j15 = hVar.d;
                    if (j15 == -9223372036854775807L || iVar.f48325n == -9223372036854775807L) {
                        j15 = hVar.f48315c;
                        if (j15 == -9223372036854775807L) {
                            j15 = 3 * iVar.f48324m;
                        }
                    }
                }
                j16 = j15 + j14;
            }
            long j24 = j18 + j14;
            long i11 = d0.i(j16, j14, j24);
            x0 x0Var = this.f47966r.f9009c;
            if (x0Var.d == -3.4028235E38f && x0Var.f9480e == -3.4028235E38f && hVar.f48315c == -9223372036854775807L && hVar.d == -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            long S = d0.S(i11);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = this.f47967s.d;
            }
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = this.f47967s.f9480e;
            }
            this.f47967s = new x0(S, -9223372036854775807L, -9223372036854775807L, f10, f11);
            if (j19 == -9223372036854775807L) {
                j19 = j24 - d0.G(S);
            }
            if (z4) {
                j21 = j19;
            } else {
                u4.d s6 = s(j19, iVar.f48330s);
                if (s6 != null) {
                    j17 = s6.f48308e;
                } else if (!vVar.isEmpty()) {
                    u4.f fVar = (u4.f) vVar.get(d0.c(vVar, Long.valueOf(j19), true));
                    u4.d s9 = s(j19, fVar.f48304x);
                    if (s9 != null) {
                        j17 = s9.f48308e;
                    } else {
                        j17 = fVar.f48308e;
                    }
                }
                j21 = j17;
            }
            if (i10 == 2 && iVar.f48318f) {
                z11 = true;
            } else {
                z11 = false;
            }
            r0Var = new r0(j11, j10, j13, iVar.f48332u, j22, j21, true, !z14, z11, obj, this.f47966r, this.f47967s);
        } else {
            if (j19 != -9223372036854775807L && !vVar.isEmpty()) {
                if (!z13 && j19 != j18) {
                    j19 = ((u4.f) vVar.get(d0.c(vVar, Long.valueOf(j19), true))).f48308e;
                }
                j12 = j19;
            } else {
                j12 = 0;
            }
            long j25 = iVar.f48332u;
            r0Var = new r0(j11, j10, j25, j25, 0L, j12, true, false, true, obj, this.f47966r, null);
        }
        m(r0Var);
    }
}
