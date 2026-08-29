package q4;

import ag.j2;
import android.net.Uri;
import android.os.Looper;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.t0;
import com.google.android.exoplayer2.upstream.y0;
import f5.d0;
import j3.b1;
import j3.c1;
import j3.f1;
import j3.r0;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import l4.c0;
import l4.g0;
import l4.i1;
import l4.z;
public final class m extends l4.a {
    public final j h;
    public final c1 f46297i;
    public final o1.a f46298j;
    public final bb.a f46299k;
    public final n3.i f46300l;
    public final f7.v f46301m;
    public final boolean f46302n;
    public final int f46303o;
    public final r4.c f46304p;
    public final long f46305q;
    public final f1 f46306r;
    public b1 f46307s;
    public y0 f46308t;

    static {
        r0.a("goog.exo.hls");
    }

    public m(f1 f1Var, o1.a aVar, c cVar, bb.a aVar2, n3.i iVar, f7.v vVar, r4.c cVar2, long j10, boolean z10, int i10) {
        c1 c1Var = f1Var.f10437b;
        c1Var.getClass();
        this.f46297i = c1Var;
        this.f46306r = f1Var;
        this.f46307s = f1Var.f10438c;
        this.f46298j = aVar;
        this.h = cVar;
        this.f46299k = aVar2;
        this.f46300l = iVar;
        this.f46301m = vVar;
        this.f46304p = cVar2;
        this.f46305q = j10;
        this.f46302n = z10;
        this.f46303o = i10;
    }

    public static r4.e s(long j10, List list) {
        r4.e eVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            r4.e eVar2 = (r4.e) list.get(i10);
            long j11 = eVar2.f46965e;
            if (j11 <= j10 && eVar2.f46955w) {
                eVar = eVar2;
            } else if (j11 > j10) {
                break;
            }
        }
        return eVar;
    }

    @Override
    public final z b(c0 c0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        g0 a2 = a(c0Var);
        j2 j2Var = new j2((CopyOnWriteArrayList) this.d.d, 0, c0Var);
        y0 y0Var = this.f46308t;
        k3.k kVar = this.f14261g;
        f5.a.j(kVar);
        return new l(this.h, this.f46304p, this.f46298j, y0Var, this.f46300l, j2Var, this.f46301m, a2, rVar, this.f46299k, this.f46302n, this.f46303o, kVar);
    }

    @Override
    public final f1 h() {
        return this.f46306r;
    }

    @Override
    public final void j() {
        r4.c cVar = this.f46304p;
        q0 q0Var = cVar.h;
        if (q0Var != null) {
            q0Var.a();
        }
        Uri uri = cVar.v;
        if (uri != null) {
            r4.b bVar = (r4.b) cVar.d.get(uri);
            bVar.f46937b.a();
            IOException iOException = bVar.f46943s;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override
    public final void l(y0 y0Var) {
        boolean z10;
        this.f46308t = y0Var;
        n3.i iVar = this.f46300l;
        iVar.a();
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        k3.k kVar = this.f14261g;
        f5.a.j(kVar);
        iVar.q(myLooper, kVar);
        g0 a2 = a(null);
        Uri uri = this.f46297i.f10401a;
        r4.c cVar = this.f46304p;
        cVar.getClass();
        cVar.f46949n = d0.k(null);
        cVar.f46948f = a2;
        cVar.f46950r = this;
        t0 t0Var = new t0(((com.google.android.exoplayer2.upstream.l) cVar.f46944a.f19014b).createDataSource(), uri, 4, cVar.f46945b.v1());
        if (cVar.h == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.i(z10);
        q0 q0Var = new q0("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.h = q0Var;
        f7.v vVar = cVar.f46946c;
        int i10 = t0Var.f3622c;
        q0Var.f(t0Var, cVar, vVar.B(i10));
        a2.k(new l4.p(t0Var.f3621b), i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public final void n(z zVar) {
        r[] rVarArr;
        q[] qVarArr;
        l lVar = (l) zVar;
        lVar.f46287b.f46947e.remove(lVar);
        for (r rVar : lVar.F) {
            if (rVar.P) {
                for (q qVar : rVar.H) {
                    qVar.i();
                    n3.e eVar = qVar.h;
                    if (eVar != null) {
                        eVar.p(qVar.f14269e);
                        qVar.h = null;
                        qVar.f14271g = null;
                    }
                }
            }
            rVar.f46338s.e(rVar);
            rVar.D.removeCallbacksAndMessages(null);
            rVar.T = true;
            rVar.E.clear();
        }
        lVar.C = null;
    }

    @Override
    public final void p() {
        r4.c cVar = this.f46304p;
        cVar.v = null;
        cVar.f46952w = null;
        cVar.f46951s = null;
        cVar.f46954y = -9223372036854775807L;
        cVar.h.e(null);
        cVar.h = null;
        HashMap hashMap = cVar.d;
        for (r4.b bVar : hashMap.values()) {
            bVar.f46937b.e(null);
        }
        cVar.f46949n.removeCallbacksAndMessages(null);
        cVar.f46949n = null;
        hashMap.clear();
        this.f46300l.release();
    }

    public final void t(r4.j jVar) {
        long j10;
        long j11;
        long j12;
        i1 i1Var;
        long j13;
        long j14;
        long j15;
        long j16;
        boolean z10;
        float f9;
        float f10;
        long j17;
        boolean z11;
        boolean z12 = jVar.f46984p;
        boolean z13 = jVar.f46976g;
        q8.z zVar = jVar.f46986r;
        long j18 = jVar.f46989u;
        long j19 = jVar.f46974e;
        int i10 = jVar.d;
        long j20 = jVar.h;
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
        r4.c cVar = this.f46304p;
        r4.m mVar = cVar.f46951s;
        mVar.getClass();
        ?? obj = new Object();
        new r4.m(mVar.f47007a, mVar.f47008b, mVar.f46999e, mVar.f47000f, mVar.f47001g, mVar.h, mVar.f47002i, mVar.f47003j, mVar.f47004k, mVar.f47009c, mVar.f47005l, mVar.f47006m);
        if (cVar.f46953x) {
            r4.i iVar = jVar.v;
            long j21 = j20 - cVar.f46954y;
            boolean z14 = jVar.f46983o;
            if (z14) {
                j13 = j21 + j18;
            } else {
                j13 = -9223372036854775807L;
            }
            if (jVar.f46984p) {
                j14 = d0.H(d0.t(this.f46305q)) - (j20 + j18);
            } else {
                j14 = 0;
            }
            long j22 = this.f46307s.f10386a;
            if (j22 != -9223372036854775807L) {
                j16 = d0.H(j22);
            } else {
                if (j19 != -9223372036854775807L) {
                    j15 = j18 - j19;
                } else {
                    j15 = iVar.d;
                    if (j15 == -9223372036854775807L || jVar.f46982n == -9223372036854775807L) {
                        j15 = iVar.f46972c;
                        if (j15 == -9223372036854775807L) {
                            j15 = 3 * jVar.f46981m;
                        }
                    }
                }
                j16 = j15 + j14;
            }
            long j23 = j18 + j14;
            long i11 = d0.i(j16, j14, j23);
            b1 b1Var = this.f46306r.f10438c;
            if (b1Var.d == -3.4028235E38f && b1Var.f10389e == -3.4028235E38f && iVar.f46972c == -9223372036854775807L && iVar.d == -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            long S = d0.S(i11);
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = this.f46307s.d;
            }
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = this.f46307s.f10389e;
            }
            this.f46307s = new b1(S, -9223372036854775807L, -9223372036854775807L, f9, f10);
            if (j19 == -9223372036854775807L) {
                j19 = j23 - d0.H(S);
            }
            if (z13) {
                j17 = j19;
            } else {
                r4.e s10 = s(j19, jVar.f46987s);
                if (s10 != null) {
                    j17 = s10.f46965e;
                } else if (zVar.isEmpty()) {
                    j17 = 0;
                } else {
                    r4.g gVar = (r4.g) zVar.get(d0.c(zVar, Long.valueOf(j19), true));
                    r4.e s11 = s(j19, gVar.f46961x);
                    if (s11 != null) {
                        j17 = s11.f46965e;
                    } else {
                        j17 = gVar.f46965e;
                    }
                }
            }
            if (i10 == 2 && jVar.f46975f) {
                z11 = true;
            } else {
                z11 = false;
            }
            i1Var = new i1(j11, j10, j13, jVar.f46989u, j21, j17, true, !z14, z11, obj, this.f46306r, this.f46307s);
        } else {
            if (j19 != -9223372036854775807L && !zVar.isEmpty()) {
                if (!z13 && j19 != j18) {
                    j19 = ((r4.g) zVar.get(d0.c(zVar, Long.valueOf(j19), true))).f46965e;
                }
                j12 = j19;
            } else {
                j12 = 0;
            }
            long j24 = jVar.f46989u;
            i1Var = new i1(j11, j10, j24, j24, 0L, j12, true, false, true, obj, this.f46306r, null);
        }
        m(i1Var);
    }
}
