package zi;

import android.os.Handler;
import org.telegram.ui.jw0;
public final class a implements Runnable {
    public final int f62073a;
    public final k f62074b;

    public a(k kVar, int i7) {
        this.f62073a = i7;
        this.f62074b = kVar;
    }

    @Override
    public final void run() {
        t tVar;
        n nVar;
        boolean z10;
        switch (this.f62073a) {
            case 0:
                this.f62074b.t();
                return;
            case 1:
                k kVar = this.f62074b;
                int y10 = kVar.y();
                if (y10 != kVar.B0 && (tVar = kVar.v) != null) {
                    kVar.B0 = y10;
                    tVar.f62331s0 = y10;
                    Handler handler = tVar.f62334u;
                    if (tVar.f62329r0 && handler != null) {
                        handler.post(new jw0(tVar, y10, 17));
                    }
                    o oVar = kVar.f62184j;
                    oVar.b("display rotation applied: degrees=" + y10);
                    return;
                }
                return;
            case 2:
                this.f62074b.a0();
                return;
            case 3:
                k kVar2 = this.f62074b;
                Handler handler2 = kVar2.f62194n;
                if (handler2 != null) {
                    handler2.post(new a(kVar2, 4));
                    return;
                }
                return;
            case 4:
                k kVar3 = this.f62074b;
                if (kVar3.U && kVar3.f62222z != null && (nVar = kVar3.f62216w) != null) {
                    synchronized (nVar) {
                        z10 = nVar.E;
                    }
                    if (!z10) {
                        try {
                            n nVar2 = kVar3.f62216w;
                            kVar3.f62218x = nVar2;
                            Handler handler3 = kVar3.f62194n;
                            if (handler3 != null) {
                                handler3.removeCallbacks(kVar3.f62189k1);
                                handler3.postDelayed(kVar3.f62189k1, 3000L);
                            }
                            nVar2.t(new d(kVar3, nVar2, 0), new d(kVar3, nVar2, 1));
                            o oVar2 = kVar3.f62184j;
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
                k kVar4 = this.f62074b;
                n nVar3 = kVar4.f62218x;
                if (kVar4.U && !kVar4.Y && nVar3 != null && kVar4.f62216w == nVar3) {
                    kVar4.f62218x = null;
                    kVar4.M(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                    return;
                }
                return;
            case 6:
                k kVar5 = this.f62074b;
                if (kVar5.f62188k0 && kVar5.M > 0.0f) {
                    if (kVar5.U && !kVar5.V && kVar5.f62222z != null && kVar5.f62191l0) {
                        kVar5.x("zoom requested", null, 5);
                        return;
                    }
                    return;
                }
                kVar5.f();
                return;
            case 7:
                k kVar6 = this.f62074b;
                kVar6.U = false;
                kVar6.j();
                n nVar4 = kVar6.f62216w;
                if (nVar4 != null) {
                    long p10 = nVar4.p();
                    t tVar2 = kVar6.v;
                    if (tVar2 != null && p10 != Long.MAX_VALUE) {
                        tVar2.f62326q = Math.max(0L, p10) * 1000;
                        Handler handler4 = tVar2.f62334u;
                        if (handler4 != null) {
                            handler4.removeCallbacks(tVar2.f62342y0);
                        }
                    }
                }
                kVar6.n();
                n nVar5 = kVar6.f62216w;
                if (nVar5 != null) {
                    nVar5.u();
                    kVar6.f62216w = null;
                }
                kVar6.Y = false;
                u0 u0Var = (u0) kVar6.f62187k.f62224a;
                u0Var.f62358i.post(new i0(u0Var, 3));
                return;
            case 8:
                this.f62074b.G();
                return;
            default:
                this.f62074b.a0();
                return;
        }
    }
}
