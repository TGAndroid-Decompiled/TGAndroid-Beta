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
import h7.u;
import j3.c1;
import j3.l0;
import j3.x0;
import java.util.HashMap;
import java.util.List;
import o3.p;
import o4.t;
import o4.v;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.zz;
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
    public final boolean f43308i;
    public final g5.l f43309j;
    public final zz f43310k;
    public final u f43311l;
    public final p f43312m;
    public final z9.d f43313n;
    public final r f43314o;
    public final long f43315p;
    public final long f43316q;
    public final e0 f43317r;
    public final o0 f43318s;
    public final o2.i f43319t;
    public final Object f43320u;
    public final SparseArray v;
    public final c f43321w;
    public final c f43322x;
    public final zz f43323y;
    public final n0 f43324z;

    static {
        l0.a("goog.exo.dash");
    }

    public g(c1 c1Var, g5.l lVar, o0 o0Var, zz zzVar, u uVar, p pVar, z9.d dVar, long j10, long j11) {
        this.h = c1Var;
        this.F = c1Var.f8432c;
        j3.y0 y0Var = c1Var.f8431b;
        y0Var.getClass();
        Uri uri = y0Var.f8871a;
        this.G = uri;
        this.H = uri;
        this.I = null;
        this.f43309j = lVar;
        this.f43318s = o0Var;
        this.f43310k = zzVar;
        this.f43312m = pVar;
        this.f43313n = dVar;
        this.f43315p = j10;
        this.f43316q = j11;
        this.f43311l = uVar;
        this.f43314o = new r(13);
        this.f43308i = false;
        this.f43317r = a(null);
        this.f43320u = new Object();
        this.v = new SparseArray();
        this.f43323y = new zz(this, 10);
        this.O = -9223372036854775807L;
        this.M = -9223372036854775807L;
        this.f43319t = new o2.i(this, 14);
        this.f43324z = new tp0(this, 9);
        this.f43321w = new Runnable(this) {
            public final g f43299b;

            {
                this.f43299b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f43299b.v();
                        return;
                    default:
                        this.f43299b.u(false);
                        return;
                }
            }
        };
        this.f43322x = new Runnable(this) {
            public final g f43299b;

            {
                this.f43299b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f43299b.v();
                        return;
                    default:
                        this.f43299b.u(false);
                        return;
                }
            }
        };
    }

    public static boolean s(s4.h hVar) {
        List list = hVar.f44077c;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int i11 = ((s4.a) list.get(i10)).f44045b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final t b(v vVar, q qVar, long j10) {
        int intValue = ((Integer) vVar.f16406a).intValue() - this.P;
        e0 a2 = a(vVar);
        o3.m mVar = new o3.m(this.d.f16256c, 0, vVar);
        int i10 = this.P + intValue;
        s4.c cVar = this.I;
        v0 v0Var = this.C;
        long j11 = this.M;
        k3.k kVar = this.f16273g;
        h5.a.j(kVar);
        b bVar = new b(i10, cVar, this.f43314o, intValue, this.f43310k, v0Var, this.f43312m, mVar, this.f43313n, a2, j11, this.f43324z, qVar, this.f43311l, this.f43323y, kVar);
        this.v.put(i10, bVar);
        return bVar;
    }

    @Override
    public final c1 h() {
        return this.h;
    }

    @Override
    public final void j() {
        this.f43324z.a();
    }

    @Override
    public final void l(v0 v0Var) {
        this.C = v0Var;
        Looper myLooper = Looper.myLooper();
        k3.k kVar = this.f16273g;
        h5.a.j(kVar);
        p pVar = this.f43312m;
        pVar.e0(myLooper, kVar);
        pVar.b();
        if (this.f43308i) {
            u(false);
            return;
        }
        this.A = this.f43309j.createDataSource();
        this.B = new m0("DashMediaSource");
        this.E = d0.l(null);
        v();
    }

    @Override
    public final void n(t tVar) {
        b bVar = (b) tVar;
        o oVar = bVar.f43296x;
        oVar.f43354r = true;
        oVar.d.removeCallbacksAndMessages(null);
        for (q4.h hVar : bVar.E) {
            hVar.m(bVar);
        }
        bVar.D = null;
        this.v.remove(bVar.f43288a);
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
        if (this.f43308i) {
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
        r rVar = this.f43314o;
        ((HashMap) rVar.f4004a).clear();
        ((HashMap) rVar.f4005b).clear();
        ((HashMap) rVar.f4006c).clear();
        this.f43312m.release();
    }

    public final void t() {
        boolean z4;
        m0 m0Var = this.B;
        d dVar = new d(this);
        synchronized (h5.a.f6909i) {
            z4 = h5.a.f6910j;
        }
        if (z4) {
            dVar.a();
            return;
        }
        if (m0Var == null) {
            m0Var = new m0("SntpClient");
        }
        m0Var.f(new z9.d(7), new bb.b(dVar, 17), 1);
    }

    public final void u(boolean r45) {
        throw new UnsupportedOperationException("Method not decompiled: r4.g.u(boolean):void");
    }

    public final void v() {
        Uri uri;
        this.E.removeCallbacks(this.f43321w);
        if (this.B.c()) {
            return;
        }
        if (this.B.d()) {
            this.J = true;
            return;
        }
        synchronized (this.f43320u) {
            uri = this.G;
        }
        this.J = false;
        p0 p0Var = new p0(this.A, uri, 4, this.f43318s);
        o2.i iVar = this.f43319t;
        this.f43313n.getClass();
        this.B.f(p0Var, iVar, 3);
        this.f43317r.u(new o4.j(p0Var.f6407b), p0Var.f6408c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
