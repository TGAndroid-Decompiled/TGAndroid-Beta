package zi;

import android.os.Handler;
import org.telegram.ui.jw0;
public final class a implements Runnable {
    public final int f62032a;
    public final k f62033b;

    public a(k kVar, int i7) {
        this.f62032a = i7;
        this.f62033b = kVar;
    }

    @Override
    public final void run() {
        t tVar;
        n nVar;
        boolean z10;
        switch (this.f62032a) {
            case 0:
                this.f62033b.t();
                return;
            case 1:
                k kVar = this.f62033b;
                int y10 = kVar.y();
                if (y10 != kVar.B0 && (tVar = kVar.v) != null) {
                    kVar.B0 = y10;
                    tVar.f62290s0 = y10;
                    Handler handler = tVar.f62293u;
                    if (tVar.f62288r0 && handler != null) {
                        handler.post(new jw0(tVar, y10, 17));
                    }
                    o oVar = kVar.f62143j;
                    oVar.b("display rotation applied: degrees=" + y10);
                    return;
                }
                return;
            case 2:
                this.f62033b.a0();
                return;
            case 3:
                k kVar2 = this.f62033b;
                Handler handler2 = kVar2.f62153n;
                if (handler2 != null) {
                    handler2.post(new a(kVar2, 4));
                    return;
                }
                return;
            case 4:
                k kVar3 = this.f62033b;
                if (kVar3.U && kVar3.f62181z != null && (nVar = kVar3.f62175w) != null) {
                    synchronized (nVar) {
                        z10 = nVar.E;
                    }
                    if (!z10) {
                        try {
                            n nVar2 = kVar3.f62175w;
                            kVar3.f62177x = nVar2;
                            Handler handler3 = kVar3.f62153n;
                            if (handler3 != null) {
                                handler3.removeCallbacks(kVar3.f62148k1);
                                handler3.postDelayed(kVar3.f62148k1, 3000L);
                            }
                            nVar2.t(new d(kVar3, nVar2, 0), new d(kVar3, nVar2, 1));
                            o oVar2 = kVar3.f62143j;
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
                k kVar4 = this.f62033b;
                n nVar3 = kVar4.f62177x;
                if (kVar4.U && !kVar4.Y && nVar3 != null && kVar4.f62175w == nVar3) {
                    kVar4.f62177x = null;
                    kVar4.M(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                    return;
                }
                return;
            case 6:
                k kVar5 = this.f62033b;
                if (kVar5.f62147k0 && kVar5.M > 0.0f) {
                    if (kVar5.U && !kVar5.V && kVar5.f62181z != null && kVar5.f62150l0) {
                        kVar5.x("zoom requested", null, 5);
                        return;
                    }
                    return;
                }
                kVar5.f();
                return;
            case 7:
                k kVar6 = this.f62033b;
                kVar6.U = false;
                kVar6.j();
                n nVar4 = kVar6.f62175w;
                if (nVar4 != null) {
                    long p10 = nVar4.p();
                    t tVar2 = kVar6.v;
                    if (tVar2 != null && p10 != Long.MAX_VALUE) {
                        tVar2.f62285q = Math.max(0L, p10) * 1000;
                        Handler handler4 = tVar2.f62293u;
                        if (handler4 != null) {
                            handler4.removeCallbacks(tVar2.f62301y0);
                        }
                    }
                }
                kVar6.n();
                n nVar5 = kVar6.f62175w;
                if (nVar5 != null) {
                    nVar5.u();
                    kVar6.f62175w = null;
                }
                kVar6.Y = false;
                u0 u0Var = (u0) kVar6.f62146k.f62183a;
                u0Var.f62317i.post(new i0(u0Var, 3));
                return;
            case 8:
                this.f62033b.G();
                return;
            default:
                this.f62033b.a0();
                return;
        }
    }
}
