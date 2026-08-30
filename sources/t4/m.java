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
import org.telegram.ui.Components.qk0;
public final class m extends o4.a {
    public final j h;
    public final y0 f44516i;
    public final qk0 f44517j;
    public final z9.d f44518k;
    public final o3.o f44519l;
    public final ab.a f44520m;
    public final boolean f44521n;
    public final int f44522o;
    public final u4.c f44523p;
    public final long f44524q;
    public final c1 f44525r;
    public x0 f44526s;
    public v0 f44527t;

    static {
        l0.a("goog.exo.hls");
    }

    public m(c1 c1Var, qk0 qk0Var, c cVar, z9.d dVar, o3.o oVar, ab.a aVar, u4.c cVar2, long j10, boolean z4, int i10) {
        y0 y0Var = c1Var.f8449b;
        y0Var.getClass();
        this.f44516i = y0Var;
        this.f44525r = c1Var;
        this.f44526s = c1Var.f8450c;
        this.f44517j = qk0Var;
        this.h = cVar;
        this.f44518k = dVar;
        this.f44519l = oVar;
        this.f44520m = aVar;
        this.f44523p = cVar2;
        this.f44524q = j10;
        this.f44521n = z4;
        this.f44522o = i10;
    }

    public static u4.d s(long j10, List list) {
        u4.d dVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            u4.d dVar2 = (u4.d) list.get(i10);
            long j11 = dVar2.e;
            if (j11 <= j10 && dVar2.f45017w) {
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
        o3.l lVar = new o3.l(this.d.f16271c, 0, vVar);
        v0 v0Var = this.f44527t;
        k3.k kVar = this.f16291g;
        h5.a.j(kVar);
        return new l(this.h, this.f44523p, this.f44517j, v0Var, this.f44519l, lVar, this.f44520m, a2, qVar, this.f44518k, this.f44521n, this.f44522o, kVar);
    }

    @Override
    public final c1 h() {
        return this.f44525r;
    }

    @Override
    public final void j() {
        u4.c cVar = this.f44523p;
        m0 m0Var = cVar.h;
        if (m0Var != null) {
            m0Var.a();
        }
        Uri uri = cVar.v;
        if (uri != null) {
            u4.b bVar = (u4.b) cVar.d.get(uri);
            bVar.f45001b.a();
            IOException iOException = bVar.f45006s;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override
    public final void l(v0 v0Var) {
        boolean z4;
        this.f44527t = v0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        k3.k kVar = this.f16291g;
        h5.a.j(kVar);
        o3.o oVar = this.f44519l;
        oVar.h(myLooper, kVar);
        oVar.a();
        e0 a2 = a(null);
        Uri uri = this.f44516i.f8889a;
        u4.c cVar = this.f44523p;
        cVar.getClass();
        cVar.f45011n = d0.l(null);
        cVar.f45010f = a2;
        cVar.f45012r = this;
        p0 p0Var = new p0(((g5.l) cVar.f45007a.f28149b).createDataSource(), uri, 4, cVar.f45008b.J());
        if (cVar.h == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.i(z4);
        m0 m0Var = new m0("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.h = m0Var;
        ab.a aVar = cVar.f45009c;
        int i10 = p0Var.f6408c;
        m0Var.f(p0Var, cVar, aVar.n3(i10));
        a2.t(new o4.j(p0Var.f6407b), i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public final void n(o4.t tVar) {
        r[] rVarArr;
        q[] qVarArr;
        l lVar = (l) tVar;
        lVar.f44507b.e.remove(lVar);
        for (r rVar : lVar.G) {
            if (rVar.Q) {
                for (q qVar : rVar.I) {
                    qVar.i();
                    o3.i iVar = qVar.h;
                    if (iVar != null) {
                        iVar.c(qVar.e);
                        qVar.h = null;
                        qVar.f16361g = null;
                    }
                }
            }
            rVar.f44556s.e(rVar);
            rVar.E.removeCallbacksAndMessages(null);
            rVar.U = true;
            rVar.F.clear();
        }
        lVar.D = null;
    }

    @Override
    public final void p() {
        u4.c cVar = this.f44523p;
        cVar.v = null;
        cVar.f45014w = null;
        cVar.f45013s = null;
        cVar.f45016y = -9223372036854775807L;
        cVar.h.e(null);
        cVar.h = null;
        HashMap hashMap = cVar.d;
        for (u4.b bVar : hashMap.values()) {
            bVar.f45001b.e(null);
        }
        cVar.f45011n.removeCallbacksAndMessages(null);
        cVar.f45011n = null;
        hashMap.clear();
        this.f44519l.release();
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
        boolean z12 = iVar.f45043p;
        boolean z13 = iVar.f45035g;
        s8.v vVar = iVar.f45045r;
        long j18 = iVar.f45048u;
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
        u4.c cVar = this.f44523p;
        cVar.f45013s.getClass();
        ?? obj = new Object();
        long j21 = 0;
        if (cVar.f45015x) {
            u4.h hVar = iVar.v;
            long j22 = j20 - cVar.f45016y;
            boolean z14 = iVar.f45042o;
            if (z14) {
                j13 = j22 + j18;
            } else {
                j13 = -9223372036854775807L;
            }
            if (iVar.f45043p) {
                z4 = z13;
                j14 = d0.G(d0.u(this.f44524q)) - (j20 + j18);
            } else {
                z4 = z13;
                j14 = 0;
            }
            long j23 = this.f44526s.f8880a;
            if (j23 != -9223372036854775807L) {
                j16 = d0.G(j23);
            } else {
                if (j19 != -9223372036854775807L) {
                    j15 = j18 - j19;
                } else {
                    j15 = hVar.d;
                    if (j15 == -9223372036854775807L || iVar.f45041n == -9223372036854775807L) {
                        j15 = hVar.f45033c;
                        if (j15 == -9223372036854775807L) {
                            j15 = 3 * iVar.f45040m;
                        }
                    }
                }
                j16 = j15 + j14;
            }
            long j24 = j18 + j14;
            long i11 = d0.i(j16, j14, j24);
            x0 x0Var = this.f44525r.f8450c;
            if (x0Var.d == -3.4028235E38f && x0Var.e == -3.4028235E38f && hVar.f45033c == -9223372036854775807L && hVar.d == -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            long S = d0.S(i11);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = this.f44526s.d;
            }
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = this.f44526s.e;
            }
            this.f44526s = new x0(S, -9223372036854775807L, -9223372036854775807L, f10, f11);
            if (j19 == -9223372036854775807L) {
                j19 = j24 - d0.G(S);
            }
            if (z4) {
                j21 = j19;
            } else {
                u4.d s6 = s(j19, iVar.f45046s);
                if (s6 != null) {
                    j17 = s6.e;
                } else if (!vVar.isEmpty()) {
                    u4.f fVar = (u4.f) vVar.get(d0.c(vVar, Long.valueOf(j19), true));
                    u4.d s9 = s(j19, fVar.f45023x);
                    if (s9 != null) {
                        j17 = s9.e;
                    } else {
                        j17 = fVar.e;
                    }
                }
                j21 = j17;
            }
            if (i10 == 2 && iVar.f45034f) {
                z11 = true;
            } else {
                z11 = false;
            }
            r0Var = new r0(j11, j10, j13, iVar.f45048u, j22, j21, true, !z14, z11, obj, this.f44525r, this.f44526s);
        } else {
            if (j19 != -9223372036854775807L && !vVar.isEmpty()) {
                if (!z13 && j19 != j18) {
                    j19 = ((u4.f) vVar.get(d0.c(vVar, Long.valueOf(j19), true))).e;
                }
                j12 = j19;
            } else {
                j12 = 0;
            }
            long j25 = iVar.f45048u;
            r0Var = new r0(j11, j10, j25, j25, 0L, j12, true, false, true, obj, this.f44525r, null);
        }
        m(r0Var);
    }
}
