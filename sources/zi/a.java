package zi;

import android.os.Handler;
import org.telegram.ui.ao0;
public final class a implements Runnable {
    public final int f62160a;
    public final k f62161b;

    public a(k kVar, int i7) {
        this.f62160a = i7;
        this.f62161b = kVar;
    }

    @Override
    public final void run() {
        t tVar;
        n nVar;
        boolean z10;
        switch (this.f62160a) {
            case 0:
                this.f62161b.t();
                return;
            case 1:
                k kVar = this.f62161b;
                int y10 = kVar.y();
                if (y10 != kVar.B0 && (tVar = kVar.v) != null) {
                    kVar.B0 = y10;
                    tVar.f62420s0 = y10;
                    Handler handler = tVar.f62423u;
                    if (tVar.f62418r0 && handler != null) {
                        handler.post(new ao0(tVar, y10, 19));
                    }
                    o oVar = kVar.f62271j;
                    oVar.b("display rotation applied: degrees=" + y10);
                    return;
                }
                return;
            case 2:
                this.f62161b.a0();
                return;
            case 3:
                k kVar2 = this.f62161b;
                Handler handler2 = kVar2.f62281n;
                if (handler2 != null) {
                    handler2.post(new a(kVar2, 4));
                    return;
                }
                return;
            case 4:
                k kVar3 = this.f62161b;
                if (kVar3.U && kVar3.f62309z != null && (nVar = kVar3.f62303w) != null) {
                    synchronized (nVar) {
                        z10 = nVar.E;
                    }
                    if (!z10) {
                        try {
                            n nVar2 = kVar3.f62303w;
                            kVar3.f62305x = nVar2;
                            Handler handler3 = kVar3.f62281n;
                            if (handler3 != null) {
                                handler3.removeCallbacks(kVar3.f62276k1);
                                handler3.postDelayed(kVar3.f62276k1, 3000L);
                            }
                            nVar2.t(new d(kVar3, nVar2, 0), new d(kVar3, nVar2, 1));
                            o oVar2 = kVar3.f62271j;
                            oVar2.b("first camera frame received; audio startup requested: segmentElapsedMs=" + k.z(kVar3.C0));
                            return;
                        } catch (RuntimeException e10) {
                            kVar3.j();
                            kVar3.M(e10);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                k kVar4 = this.f62161b;
                n nVar3 = kVar4.f62305x;
                if (kVar4.U && !kVar4.Y && nVar3 != null && kVar4.f62303w == nVar3) {
                    kVar4.f62305x = null;
                    kVar4.M(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                    return;
                }
                return;
            case 6:
                k kVar5 = this.f62161b;
                if (kVar5.f62275k0 && kVar5.M > 0.0f) {
                    if (kVar5.U && !kVar5.V && kVar5.f62309z != null && kVar5.f62278l0) {
                        kVar5.x("zoom requested", null, 5);
                        return;
                    }
                    return;
                }
                kVar5.f();
                return;
            case 7:
                k kVar6 = this.f62161b;
                kVar6.U = false;
                kVar6.j();
                n nVar4 = kVar6.f62303w;
                if (nVar4 != null) {
                    long p10 = nVar4.p();
                    t tVar2 = kVar6.v;
                    if (tVar2 != null && p10 != Long.MAX_VALUE) {
                        tVar2.f62415q = Math.max(0L, p10) * 1000;
                        Handler handler4 = tVar2.f62423u;
                        if (handler4 != null) {
                            handler4.removeCallbacks(tVar2.f62431y0);
                        }
                    }
                }
                kVar6.n();
                n nVar5 = kVar6.f62303w;
                if (nVar5 != null) {
                    nVar5.u();
                    kVar6.f62303w = null;
                }
                kVar6.Y = false;
                u0 u0Var = (u0) kVar6.f62274k.f60952a;
                u0Var.f62447i.post(new i0(u0Var, 3));
                return;
            case 8:
                this.f62161b.G();
                return;
            default:
                this.f62161b.a0();
                return;
        }
    }
}
