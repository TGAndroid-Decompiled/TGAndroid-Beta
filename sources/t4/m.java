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
    public final y0 f47921i;
    public final h4 f47922j;
    public final z9.d f47923k;
    public final o3.o f47924l;
    public final ab.a f47925m;
    public final boolean f47926n;
    public final int f47927o;
    public final u4.c f47928p;
    public final long f47929q;
    public final c1 f47930r;
    public x0 f47931s;
    public v0 f47932t;

    static {
        l0.a("goog.exo.hls");
    }

    public m(c1 c1Var, h4 h4Var, c cVar, z9.d dVar, o3.o oVar, ab.a aVar, u4.c cVar2, long j10, boolean z4, int i10) {
        y0 y0Var = c1Var.f9008b;
        y0Var.getClass();
        this.f47921i = y0Var;
        this.f47930r = c1Var;
        this.f47931s = c1Var.f9009c;
        this.f47922j = h4Var;
        this.h = cVar;
        this.f47923k = dVar;
        this.f47924l = oVar;
        this.f47925m = aVar;
        this.f47928p = cVar2;
        this.f47929q = j10;
        this.f47926n = z4;
        this.f47927o = i10;
    }

    public static u4.d s(long j10, List list) {
        u4.d dVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            u4.d dVar2 = (u4.d) list.get(i10);
            long j11 = dVar2.f48272e;
            if (j11 <= j10 && dVar2.f48262w) {
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
        o3.l lVar = new o3.l(this.d.f16412c, 0, vVar);
        v0 v0Var = this.f47932t;
        k3.k kVar = this.f16433g;
        h5.a.j(kVar);
        return new l(this.h, this.f47928p, this.f47922j, v0Var, this.f47924l, lVar, this.f47925m, a2, qVar, this.f47923k, this.f47926n, this.f47927o, kVar);
    }

    @Override
    public final c1 h() {
        return this.f47930r;
    }

    @Override
    public final void j() {
        u4.c cVar = this.f47928p;
        m0 m0Var = cVar.h;
        if (m0Var != null) {
            m0Var.a();
        }
        Uri uri = cVar.v;
        if (uri != null) {
            u4.b bVar = (u4.b) cVar.d.get(uri);
            bVar.f48244b.a();
            IOException iOException = bVar.f48250s;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override
    public final void l(v0 v0Var) {
        boolean z4;
        this.f47932t = v0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        k3.k kVar = this.f16433g;
        h5.a.j(kVar);
        o3.o oVar = this.f47924l;
        oVar.h(myLooper, kVar);
        oVar.a();
        e0 a2 = a(null);
        Uri uri = this.f47921i.f9487a;
        u4.c cVar = this.f47928p;
        cVar.getClass();
        cVar.f48256n = d0.l(null);
        cVar.f48255f = a2;
        cVar.f48257r = this;
        p0 p0Var = new p0(((g5.l) cVar.f48251a.f17180b).createDataSource(), uri, 4, cVar.f48252b.G());
        if (cVar.h == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.i(z4);
        m0 m0Var = new m0("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.h = m0Var;
        ab.a aVar = cVar.f48253c;
        int i10 = p0Var.f6893c;
        m0Var.f(p0Var, cVar, aVar.n3(i10));
        a2.u(new o4.j(p0Var.f6892b), i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public final void n(o4.t tVar) {
        r[] rVarArr;
        q[] qVarArr;
        l lVar = (l) tVar;
        lVar.f47911b.f48254e.remove(lVar);
        for (r rVar : lVar.G) {
            if (rVar.Q) {
                for (q qVar : rVar.I) {
                    qVar.i();
                    o3.i iVar = qVar.h;
                    if (iVar != null) {
                        iVar.c(qVar.f16507e);
                        qVar.h = null;
                        qVar.f16509g = null;
                    }
                }
            }
            rVar.f47963s.e(rVar);
            rVar.E.removeCallbacksAndMessages(null);
            rVar.U = true;
            rVar.F.clear();
        }
        lVar.D = null;
    }

    @Override
    public final void p() {
        u4.c cVar = this.f47928p;
        cVar.v = null;
        cVar.f48259w = null;
        cVar.f48258s = null;
        cVar.f48261y = -9223372036854775807L;
        cVar.h.e(null);
        cVar.h = null;
        HashMap hashMap = cVar.d;
        for (u4.b bVar : hashMap.values()) {
            bVar.f48244b.e(null);
        }
        cVar.f48256n.removeCallbacksAndMessages(null);
        cVar.f48256n = null;
        hashMap.clear();
        this.f47924l.release();
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
        boolean z12 = iVar.f48291p;
        boolean z13 = iVar.f48283g;
        s8.v vVar = iVar.f48293r;
        long j18 = iVar.f48296u;
        long j19 = iVar.f48281e;
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
        u4.c cVar = this.f47928p;
        cVar.f48258s.getClass();
        ?? obj = new Object();
        long j21 = 0;
        if (cVar.f48260x) {
            u4.h hVar = iVar.v;
            long j22 = j20 - cVar.f48261y;
            boolean z14 = iVar.f48290o;
            if (z14) {
                j13 = j22 + j18;
            } else {
                j13 = -9223372036854775807L;
            }
            if (iVar.f48291p) {
                z4 = z13;
                j14 = d0.G(d0.u(this.f47929q)) - (j20 + j18);
            } else {
                z4 = z13;
                j14 = 0;
            }
            long j23 = this.f47931s.f9477a;
            if (j23 != -9223372036854775807L) {
                j16 = d0.G(j23);
            } else {
                if (j19 != -9223372036854775807L) {
                    j15 = j18 - j19;
                } else {
                    j15 = hVar.d;
                    if (j15 == -9223372036854775807L || iVar.f48289n == -9223372036854775807L) {
                        j15 = hVar.f48279c;
                        if (j15 == -9223372036854775807L) {
                            j15 = 3 * iVar.f48288m;
                        }
                    }
                }
                j16 = j15 + j14;
            }
            long j24 = j18 + j14;
            long i11 = d0.i(j16, j14, j24);
            x0 x0Var = this.f47930r.f9009c;
            if (x0Var.d == -3.4028235E38f && x0Var.f9480e == -3.4028235E38f && hVar.f48279c == -9223372036854775807L && hVar.d == -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            long S = d0.S(i11);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = this.f47931s.d;
            }
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = this.f47931s.f9480e;
            }
            this.f47931s = new x0(S, -9223372036854775807L, -9223372036854775807L, f10, f11);
            if (j19 == -9223372036854775807L) {
                j19 = j24 - d0.G(S);
            }
            if (z4) {
                j21 = j19;
            } else {
                u4.d s6 = s(j19, iVar.f48294s);
                if (s6 != null) {
                    j17 = s6.f48272e;
                } else if (!vVar.isEmpty()) {
                    u4.f fVar = (u4.f) vVar.get(d0.c(vVar, Long.valueOf(j19), true));
                    u4.d s9 = s(j19, fVar.f48268x);
                    if (s9 != null) {
                        j17 = s9.f48272e;
                    } else {
                        j17 = fVar.f48272e;
                    }
                }
                j21 = j17;
            }
            if (i10 == 2 && iVar.f48282f) {
                z11 = true;
            } else {
                z11 = false;
            }
            r0Var = new r0(j11, j10, j13, iVar.f48296u, j22, j21, true, !z14, z11, obj, this.f47930r, this.f47931s);
        } else {
            if (j19 != -9223372036854775807L && !vVar.isEmpty()) {
                if (!z13 && j19 != j18) {
                    j19 = ((u4.f) vVar.get(d0.c(vVar, Long.valueOf(j19), true))).f48272e;
                }
                j12 = j19;
            } else {
                j12 = 0;
            }
            long j25 = iVar.f48296u;
            r0Var = new r0(j11, j10, j25, j25, 0L, j12, true, false, true, obj, this.f47930r, null);
        }
        m(r0Var);
    }
}
