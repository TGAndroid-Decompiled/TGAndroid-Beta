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
public final class m extends o4.a {
    public final j h;
    public final y0 f44578i;
    public final o3.c f44579j;
    public final h7.u f44580k;
    public final o3.p f44581l;
    public final z9.d f44582m;
    public final boolean f44583n;
    public final int f44584o;
    public final u4.c f44585p;
    public final long f44586q;
    public final c1 f44587r;
    public x0 f44588s;
    public v0 f44589t;

    static {
        l0.a("goog.exo.hls");
    }

    public m(c1 c1Var, o3.c cVar, c cVar2, h7.u uVar, o3.p pVar, z9.d dVar, u4.c cVar3, long j10, boolean z4, int i10) {
        y0 y0Var = c1Var.f8431b;
        y0Var.getClass();
        this.f44578i = y0Var;
        this.f44587r = c1Var;
        this.f44588s = c1Var.f8432c;
        this.f44579j = cVar;
        this.h = cVar2;
        this.f44580k = uVar;
        this.f44581l = pVar;
        this.f44582m = dVar;
        this.f44585p = cVar3;
        this.f44586q = j10;
        this.f44583n = z4;
        this.f44584o = i10;
    }

    public static u4.d s(long j10, List list) {
        u4.d dVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            u4.d dVar2 = (u4.d) list.get(i10);
            long j11 = dVar2.e;
            if (j11 <= j10 && dVar2.f45079w) {
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
        o3.m mVar = new o3.m(this.d.f16256c, 0, vVar);
        v0 v0Var = this.f44589t;
        k3.k kVar = this.f16273g;
        h5.a.j(kVar);
        return new l(this.h, this.f44585p, this.f44579j, v0Var, this.f44581l, mVar, this.f44582m, a2, qVar, this.f44580k, this.f44583n, this.f44584o, kVar);
    }

    @Override
    public final c1 h() {
        return this.f44587r;
    }

    @Override
    public final void j() {
        u4.c cVar = this.f44585p;
        m0 m0Var = cVar.h;
        if (m0Var != null) {
            m0Var.a();
        }
        Uri uri = cVar.v;
        if (uri != null) {
            u4.b bVar = (u4.b) cVar.d.get(uri);
            bVar.f45063b.a();
            IOException iOException = bVar.f45068s;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override
    public final void l(v0 v0Var) {
        boolean z4;
        this.f44589t = v0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        k3.k kVar = this.f16273g;
        h5.a.j(kVar);
        o3.p pVar = this.f44581l;
        pVar.e0(myLooper, kVar);
        pVar.b();
        e0 a2 = a(null);
        Uri uri = this.f44578i.f8871a;
        u4.c cVar = this.f44585p;
        cVar.getClass();
        cVar.f45073n = d0.l(null);
        cVar.f45072f = a2;
        cVar.f45074r = this;
        p0 p0Var = new p0(((g5.l) cVar.f45069a.f16228b).createDataSource(), uri, 4, cVar.f45070b.l());
        if (cVar.h == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.i(z4);
        m0 m0Var = new m0("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.h = m0Var;
        z9.d dVar = cVar.f45071c;
        int i10 = p0Var.f6408c;
        m0Var.f(p0Var, cVar, dVar.p(i10));
        a2.u(new o4.j(p0Var.f6407b), i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public final void n(o4.t tVar) {
        r[] rVarArr;
        q[] qVarArr;
        l lVar = (l) tVar;
        lVar.f44569b.e.remove(lVar);
        for (r rVar : lVar.G) {
            if (rVar.Q) {
                for (q qVar : rVar.I) {
                    qVar.i();
                    o3.j jVar = qVar.h;
                    if (jVar != null) {
                        jVar.c(qVar.e);
                        qVar.h = null;
                        qVar.f16343g = null;
                    }
                }
            }
            rVar.f44618s.e(rVar);
            rVar.E.removeCallbacksAndMessages(null);
            rVar.U = true;
            rVar.F.clear();
        }
        lVar.D = null;
    }

    @Override
    public final void p() {
        u4.c cVar = this.f44585p;
        cVar.v = null;
        cVar.f45076w = null;
        cVar.f45075s = null;
        cVar.f45078y = -9223372036854775807L;
        cVar.h.e(null);
        cVar.h = null;
        HashMap hashMap = cVar.d;
        for (u4.b bVar : hashMap.values()) {
            bVar.f45063b.e(null);
        }
        cVar.f45073n.removeCallbacksAndMessages(null);
        cVar.f45073n = null;
        hashMap.clear();
        this.f44581l.release();
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
        boolean z12 = iVar.f45105p;
        boolean z13 = iVar.f45097g;
        s8.v vVar = iVar.f45107r;
        long j18 = iVar.f45110u;
        long j19 = iVar.e;
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
        u4.c cVar = this.f44585p;
        cVar.f45075s.getClass();
        ?? obj = new Object();
        long j21 = 0;
        if (cVar.f45077x) {
            u4.h hVar = iVar.v;
            long j22 = j20 - cVar.f45078y;
            boolean z14 = iVar.f45104o;
            if (z14) {
                j13 = j22 + j18;
            } else {
                j13 = -9223372036854775807L;
            }
            if (iVar.f45105p) {
                z4 = z13;
                j14 = d0.G(d0.u(this.f44586q)) - (j20 + j18);
            } else {
                z4 = z13;
                j14 = 0;
            }
            long j23 = this.f44588s.f8862a;
            if (j23 != -9223372036854775807L) {
                j16 = d0.G(j23);
            } else {
                if (j19 != -9223372036854775807L) {
                    j15 = j18 - j19;
                } else {
                    j15 = hVar.d;
                    if (j15 == -9223372036854775807L || iVar.f45103n == -9223372036854775807L) {
                        j15 = hVar.f45095c;
                        if (j15 == -9223372036854775807L) {
                            j15 = 3 * iVar.f45102m;
                        }
                    }
                }
                j16 = j15 + j14;
            }
            long j24 = j18 + j14;
            long i11 = d0.i(j16, j14, j24);
            x0 x0Var = this.f44587r.f8432c;
            if (x0Var.d == -3.4028235E38f && x0Var.e == -3.4028235E38f && hVar.f45095c == -9223372036854775807L && hVar.d == -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            long S = d0.S(i11);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = this.f44588s.d;
            }
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = this.f44588s.e;
            }
            this.f44588s = new x0(S, -9223372036854775807L, -9223372036854775807L, f10, f11);
            if (j19 == -9223372036854775807L) {
                j19 = j24 - d0.G(S);
            }
            if (z4) {
                j21 = j19;
            } else {
                u4.d s6 = s(j19, iVar.f45108s);
                if (s6 != null) {
                    j17 = s6.e;
                } else if (!vVar.isEmpty()) {
                    u4.f fVar = (u4.f) vVar.get(d0.c(vVar, Long.valueOf(j19), true));
                    u4.d s9 = s(j19, fVar.f45085x);
                    if (s9 != null) {
                        j17 = s9.e;
                    } else {
                        j17 = fVar.e;
                    }
                }
                j21 = j17;
            }
            if (i10 == 2 && iVar.f45096f) {
                z11 = true;
            } else {
                z11 = false;
            }
            r0Var = new r0(j11, j10, j13, iVar.f45110u, j22, j21, true, !z14, z11, obj, this.f44587r, this.f44588s);
        } else {
            if (j19 != -9223372036854775807L && !vVar.isEmpty()) {
                if (!z13 && j19 != j18) {
                    j19 = ((u4.f) vVar.get(d0.c(vVar, Long.valueOf(j19), true))).e;
                }
                j12 = j19;
            } else {
                j12 = 0;
            }
            long j25 = iVar.f45110u;
            r0Var = new r0(j11, j10, j25, j25, 0L, j12, true, false, true, obj, this.f44587r, null);
        }
        m(r0Var);
    }
}
