package zi;

import android.os.Handler;
import org.telegram.ui.zn0;
public final class a implements Runnable {
    public final int f62042a;
    public final k f62043b;

    public a(k kVar, int i7) {
        this.f62042a = i7;
        this.f62043b = kVar;
    }

    @Override
    public final void run() {
        t tVar;
        n nVar;
        boolean z10;
        switch (this.f62042a) {
            case 0:
                this.f62043b.t();
                return;
            case 1:
                k kVar = this.f62043b;
                int y10 = kVar.y();
                if (y10 != kVar.B0 && (tVar = kVar.v) != null) {
                    kVar.B0 = y10;
                    tVar.f62300s0 = y10;
                    Handler handler = tVar.f62303u;
                    if (tVar.f62298r0 && handler != null) {
                        handler.post(new zn0(tVar, y10, 19));
                    }
                    o oVar = kVar.f62153j;
                    oVar.b("display rotation applied: degrees=" + y10);
                    return;
                }
                return;
            case 2:
                this.f62043b.a0();
                return;
            case 3:
                k kVar2 = this.f62043b;
                Handler handler2 = kVar2.f62163n;
                if (handler2 != null) {
                    handler2.post(new a(kVar2, 4));
                    return;
                }
                return;
            case 4:
                k kVar3 = this.f62043b;
                if (kVar3.U && kVar3.f62191z != null && (nVar = kVar3.f62185w) != null) {
                    synchronized (nVar) {
                        z10 = nVar.E;
                    }
                    if (!z10) {
                        try {
                            n nVar2 = kVar3.f62185w;
                            kVar3.f62187x = nVar2;
                            Handler handler3 = kVar3.f62163n;
                            if (handler3 != null) {
                                handler3.removeCallbacks(kVar3.f62158k1);
                                handler3.postDelayed(kVar3.f62158k1, 3000L);
                            }
                            nVar2.t(new d(kVar3, nVar2, 0), new d(kVar3, nVar2, 1));
                            o oVar2 = kVar3.f62153j;
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
                k kVar4 = this.f62043b;
                n nVar3 = kVar4.f62187x;
                if (kVar4.U && !kVar4.Y && nVar3 != null && kVar4.f62185w == nVar3) {
                    kVar4.f62187x = null;
                    kVar4.M(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                    return;
                }
                return;
            case 6:
                k kVar5 = this.f62043b;
                if (kVar5.f62157k0 && kVar5.M > 0.0f) {
                    if (kVar5.U && !kVar5.V && kVar5.f62191z != null && kVar5.f62160l0) {
                        kVar5.x("zoom requested", null, 5);
                        return;
                    }
                    return;
                }
                kVar5.f();
                return;
            case 7:
                k kVar6 = this.f62043b;
                kVar6.U = false;
                kVar6.j();
                n nVar4 = kVar6.f62185w;
                if (nVar4 != null) {
                    long p10 = nVar4.p();
                    t tVar2 = kVar6.v;
                    if (tVar2 != null && p10 != Long.MAX_VALUE) {
                        tVar2.f62295q = Math.max(0L, p10) * 1000;
                        Handler handler4 = tVar2.f62303u;
                        if (handler4 != null) {
                            handler4.removeCallbacks(tVar2.f62311y0);
                        }
                    }
                }
                kVar6.n();
                n nVar5 = kVar6.f62185w;
                if (nVar5 != null) {
                    nVar5.u();
                    kVar6.f62185w = null;
                }
                kVar6.Y = false;
                u0 u0Var = (u0) kVar6.f62156k.f62193a;
                u0Var.f62327i.post(new i0(u0Var, 3));
                return;
            case 8:
                this.f62043b.G();
                return;
            default:
                this.f62043b.a0();
                return;
        }
    }
}
