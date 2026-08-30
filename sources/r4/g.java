package r4;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import b4.e0;
import b7.y0;
import com.google.firebase.messaging.r;
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
import org.telegram.ui.Cells.f1;
import ph.j5;
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
    public final boolean f43284i;
    public final g5.l f43285j;
    public final f1 f43286k;
    public final z9.d f43287l;
    public final o3.o f43288m;
    public final ab.a f43289n;
    public final r f43290o;
    public final long f43291p;
    public final long f43292q;
    public final e0 f43293r;
    public final o0 f43294s;
    public final j5 f43295t;
    public final Object f43296u;
    public final SparseArray v;
    public final c f43297w;
    public final c f43298x;
    public final f1 f43299y;
    public final n0 f43300z;

    static {
        l0.a("goog.exo.dash");
    }

    public g(c1 c1Var, g5.l lVar, o0 o0Var, f1 f1Var, z9.d dVar, o3.o oVar, ab.a aVar, long j10, long j11) {
        this.h = c1Var;
        this.F = c1Var.f8450c;
        j3.y0 y0Var = c1Var.f8449b;
        y0Var.getClass();
        Uri uri = y0Var.f8889a;
        this.G = uri;
        this.H = uri;
        this.I = null;
        this.f43285j = lVar;
        this.f43294s = o0Var;
        this.f43286k = f1Var;
        this.f43288m = oVar;
        this.f43289n = aVar;
        this.f43291p = j10;
        this.f43292q = j11;
        this.f43287l = dVar;
        this.f43290o = new r(25);
        this.f43284i = false;
        this.f43293r = a(null);
        this.f43296u = new Object();
        this.v = new SparseArray();
        this.f43299y = new f1(this, 14);
        this.O = -9223372036854775807L;
        this.M = -9223372036854775807L;
        this.f43295t = new j5(this, 3);
        this.f43300z = new o2.o(this, 16);
        this.f43297w = new Runnable(this) {
            public final g f43275b;

            {
                this.f43275b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f43275b.v();
                        return;
                    default:
                        this.f43275b.u(false);
                        return;
                }
            }
        };
        this.f43298x = new Runnable(this) {
            public final g f43275b;

            {
                this.f43275b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f43275b.v();
                        return;
                    default:
                        this.f43275b.u(false);
                        return;
                }
            }
        };
    }

    public static boolean s(s4.h hVar) {
        List list = hVar.f44012c;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int i11 = ((s4.a) list.get(i10)).f43980b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final t b(v vVar, q qVar, long j10) {
        int intValue = ((Integer) vVar.f16424a).intValue() - this.P;
        e0 a2 = a(vVar);
        o3.l lVar = new o3.l(this.d.f16271c, 0, vVar);
        int i10 = this.P + intValue;
        s4.c cVar = this.I;
        v0 v0Var = this.C;
        long j11 = this.M;
        k3.k kVar = this.f16291g;
        h5.a.j(kVar);
        b bVar = new b(i10, cVar, this.f43290o, intValue, this.f43286k, v0Var, this.f43288m, lVar, this.f43289n, a2, j11, this.f43300z, qVar, this.f43287l, this.f43299y, kVar);
        this.v.put(i10, bVar);
        return bVar;
    }

    @Override
    public final c1 h() {
        return this.h;
    }

    @Override
    public final void j() {
        this.f43300z.a();
    }

    @Override
    public final void l(v0 v0Var) {
        this.C = v0Var;
        Looper myLooper = Looper.myLooper();
        k3.k kVar = this.f16291g;
        h5.a.j(kVar);
        o3.o oVar = this.f43288m;
        oVar.h(myLooper, kVar);
        oVar.a();
        if (this.f43284i) {
            u(false);
            return;
        }
        this.A = this.f43285j.createDataSource();
        this.B = new m0("DashMediaSource");
        this.E = d0.l(null);
        v();
    }

    @Override
    public final void n(t tVar) {
        b bVar = (b) tVar;
        o oVar = bVar.f43272x;
        oVar.f43330r = true;
        oVar.d.removeCallbacksAndMessages(null);
        for (q4.h hVar : bVar.E) {
            hVar.q(bVar);
        }
        bVar.D = null;
        this.v.remove(bVar.f43264a);
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
        if (this.f43284i) {
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
        r rVar = this.f43290o;
        ((HashMap) rVar.f4028b).clear();
        ((HashMap) rVar.f4029c).clear();
        ((HashMap) rVar.d).clear();
        this.f43288m.release();
    }

    public final void t() {
        boolean z4;
        m0 m0Var = this.B;
        d dVar = new d(this);
        synchronized (h5.a.f6922i) {
            z4 = h5.a.f6923j;
        }
        if (z4) {
            dVar.a();
            return;
        }
        if (m0Var == null) {
            m0Var = new m0("SntpClient");
        }
        m0Var.f(new ab.a(8), new a3.c(dVar, 17), 1);
    }

    public final void u(boolean r45) {
        throw new UnsupportedOperationException("Method not decompiled: r4.g.u(boolean):void");
    }

    public final void v() {
        Uri uri;
        this.E.removeCallbacks(this.f43297w);
        if (this.B.c()) {
            return;
        }
        if (this.B.d()) {
            this.J = true;
            return;
        }
        synchronized (this.f43296u) {
            uri = this.G;
        }
        this.J = false;
        p0 p0Var = new p0(this.A, uri, 4, this.f43294s);
        j5 j5Var = this.f43295t;
        this.f43289n.getClass();
        this.B.f(p0Var, j5Var, 3);
        this.f43293r.t(new o4.j(p0Var.f6407b), p0Var.f6408c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
