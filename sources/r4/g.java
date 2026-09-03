package r4;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import b4.e0;
import b7.y0;
import com.google.firebase.messaging.s;
import g5.m0;
import g5.n0;
import g5.o0;
import g5.p0;
import g5.q;
import g5.v0;
import h5.d0;
import j3.c1;
import j3.l0;
import j3.x0;
import java.util.HashMap;
import java.util.List;
import o4.t;
import o4.v;
import oh.h4;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.ai;
public final class g extends o4.a {
    public g5.m A;
    public m0 B;
    public v0 C;
    public y0 D;
    public Handler E;
    public x0 F;
    public Uri G;
    public final Uri H;
    public s4.c I;
    public boolean J;
    public long K;
    public long L;
    public long M;
    public int N;
    public long O;
    public int P;
    public final c1 h;
    public final boolean f46656i;
    public final g5.l f46657j;
    public final f1 f46658k;
    public final z9.d f46659l;
    public final o3.o f46660m;
    public final ab.a f46661n;
    public final s f46662o;
    public final long f46663p;
    public final long f46664q;
    public final e0 f46665r;
    public final o0 f46666s;
    public final ai f46667t;
    public final Object f46668u;
    public final SparseArray v;
    public final c f46669w;
    public final c f46670x;
    public final f1 f46671y;
    public final n0 f46672z;

    static {
        l0.a("goog.exo.dash");
    }

    public g(c1 c1Var, g5.l lVar, o0 o0Var, f1 f1Var, z9.d dVar, o3.o oVar, ab.a aVar, long j10, long j11) {
        this.h = c1Var;
        this.F = c1Var.f9009c;
        j3.y0 y0Var = c1Var.f9008b;
        y0Var.getClass();
        Uri uri = y0Var.f9487a;
        this.G = uri;
        this.H = uri;
        this.I = null;
        this.f46657j = lVar;
        this.f46666s = o0Var;
        this.f46658k = f1Var;
        this.f46660m = oVar;
        this.f46661n = aVar;
        this.f46663p = j10;
        this.f46664q = j11;
        this.f46659l = dVar;
        this.f46662o = new s(13);
        this.f46656i = false;
        this.f46665r = a(null);
        this.f46668u = new Object();
        this.v = new SparseArray();
        this.f46671y = new f1(this, 13);
        this.O = -9223372036854775807L;
        this.M = -9223372036854775807L;
        this.f46667t = new ai(this, 10);
        this.f46672z = new h4(this, 13);
        this.f46669w = new Runnable(this) {
            public final g f46646b;

            {
                this.f46646b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f46646b.v();
                        return;
                    default:
                        this.f46646b.u(false);
                        return;
                }
            }
        };
        this.f46670x = new Runnable(this) {
            public final g f46646b;

            {
                this.f46646b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f46646b.v();
                        return;
                    default:
                        this.f46646b.u(false);
                        return;
                }
            }
        };
    }

    public static boolean s(s4.h hVar) {
        List list = hVar.f47008c;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int i11 = ((s4.a) list.get(i10)).f46972b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final t b(v vVar, q qVar, long j10) {
        int intValue = ((Integer) vVar.f16581a).intValue() - this.P;
        e0 a2 = a(vVar);
        o3.l lVar = new o3.l(this.d.f16414c, 0, vVar);
        int i10 = this.P + intValue;
        s4.c cVar = this.I;
        v0 v0Var = this.C;
        long j11 = this.M;
        k3.k kVar = this.f16435g;
        h5.a.j(kVar);
        b bVar = new b(i10, cVar, this.f46662o, intValue, this.f46658k, v0Var, this.f46660m, lVar, this.f46661n, a2, j11, this.f46672z, qVar, this.f46659l, this.f46671y, kVar);
        this.v.put(i10, bVar);
        return bVar;
    }

    @Override
    public final c1 h() {
        return this.h;
    }

    @Override
    public final void j() {
        this.f46672z.a();
    }

    @Override
    public final void l(v0 v0Var) {
        this.C = v0Var;
        Looper myLooper = Looper.myLooper();
        k3.k kVar = this.f16435g;
        h5.a.j(kVar);
        o3.o oVar = this.f46660m;
        oVar.h(myLooper, kVar);
        oVar.a();
        if (this.f46656i) {
            u(false);
            return;
        }
        this.A = this.f46657j.createDataSource();
        this.B = new m0("DashMediaSource");
        this.E = d0.l(null);
        v();
    }

    @Override
    public final void n(t tVar) {
        b bVar = (b) tVar;
        o oVar = bVar.f46643x;
        oVar.f46707r = true;
        oVar.d.removeCallbacksAndMessages(null);
        for (q4.h hVar : bVar.E) {
            hVar.B(bVar);
        }
        bVar.D = null;
        this.v.remove(bVar.f46634a);
    }

    @Override
    public final void p() {
        s4.c cVar;
        this.J = false;
        this.A = null;
        m0 m0Var = this.B;
        if (m0Var != null) {
            m0Var.e(null);
            this.B = null;
        }
        this.K = 0L;
        this.L = 0L;
        if (this.f46656i) {
            cVar = this.I;
        } else {
            cVar = null;
        }
        this.I = cVar;
        this.G = this.H;
        this.D = null;
        Handler handler = this.E;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.E = null;
        }
        this.M = -9223372036854775807L;
        this.N = 0;
        this.O = -9223372036854775807L;
        this.v.clear();
        s sVar = this.f46662o;
        ((HashMap) sVar.f4080a).clear();
        ((HashMap) sVar.f4081b).clear();
        ((HashMap) sVar.f4082c).clear();
        this.f46660m.release();
    }

    public final void t() {
        boolean z4;
        m0 m0Var = this.B;
        d dVar = new d(this);
        synchronized (h5.a.f7222i) {
            z4 = h5.a.f7223j;
        }
        if (z4) {
            dVar.a();
            return;
        }
        if (m0Var == null) {
            m0Var = new m0("SntpClient");
        }
        m0Var.f(new ab.a(8), new ja.c(dVar), 1);
    }

    public final void u(boolean r45) {
        throw new UnsupportedOperationException("Method not decompiled: r4.g.u(boolean):void");
    }

    public final void v() {
        Uri uri;
        this.E.removeCallbacks(this.f46669w);
        if (this.B.c()) {
            return;
        }
        if (this.B.d()) {
            this.J = true;
            return;
        }
        synchronized (this.f46668u) {
            uri = this.G;
        }
        this.J = false;
        p0 p0Var = new p0(this.A, uri, 4, this.f46666s);
        ai aiVar = this.f46667t;
        this.f46661n.getClass();
        this.B.f(p0Var, aiVar, 3);
        this.f46665r.u(new o4.j(p0Var.f6892b), p0Var.f6893c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
