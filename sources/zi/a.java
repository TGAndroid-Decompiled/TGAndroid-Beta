package zi;

import android.os.Handler;
import org.telegram.ui.jw0;
public final class a implements Runnable {
    public final int f62031a;
    public final k f62032b;

    public a(k kVar, int i7) {
        this.f62031a = i7;
        this.f62032b = kVar;
    }

    @Override
    public final void run() {
        t tVar;
        n nVar;
        boolean z10;
        switch (this.f62031a) {
            case 0:
                this.f62032b.t();
                return;
            case 1:
                k kVar = this.f62032b;
                int y10 = kVar.y();
                if (y10 != kVar.B0 && (tVar = kVar.v) != null) {
                    kVar.B0 = y10;
                    tVar.f62289s0 = y10;
                    Handler handler = tVar.f62292u;
                    if (tVar.f62287r0 && handler != null) {
                        handler.post(new jw0(tVar, y10, 17));
                    }
                    o oVar = kVar.f62142j;
                    oVar.b("display rotation applied: degrees=" + y10);
                    return;
                }
                return;
            case 2:
                this.f62032b.a0();
                return;
            case 3:
                k kVar2 = this.f62032b;
                Handler handler2 = kVar2.f62152n;
                if (handler2 != null) {
                    handler2.post(new a(kVar2, 4));
                    return;
                }
                return;
            case 4:
                k kVar3 = this.f62032b;
                if (kVar3.U && kVar3.f62180z != null && (nVar = kVar3.f62174w) != null) {
                    synchronized (nVar) {
                        z10 = nVar.E;
                    }
                    if (!z10) {
                        try {
                            n nVar2 = kVar3.f62174w;
                            kVar3.f62176x = nVar2;
                            Handler handler3 = kVar3.f62152n;
                            if (handler3 != null) {
                                handler3.removeCallbacks(kVar3.f62147k1);
                                handler3.postDelayed(kVar3.f62147k1, 3000L);
                            }
                            nVar2.t(new d(kVar3, nVar2, 0), new d(kVar3, nVar2, 1));
                            o oVar2 = kVar3.f62142j;
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
                k kVar4 = this.f62032b;
                n nVar3 = kVar4.f62176x;
                if (kVar4.U && !kVar4.Y && nVar3 != null && kVar4.f62174w == nVar3) {
                    kVar4.f62176x = null;
                    kVar4.M(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                    return;
                }
                return;
            case 6:
                k kVar5 = this.f62032b;
                if (kVar5.f62146k0 && kVar5.M > 0.0f) {
                    if (kVar5.U && !kVar5.V && kVar5.f62180z != null && kVar5.f62149l0) {
                        kVar5.x("zoom requested", null, 5);
                        return;
                    }
                    return;
                }
                kVar5.f();
                return;
            case 7:
                k kVar6 = this.f62032b;
                kVar6.U = false;
                kVar6.j();
                n nVar4 = kVar6.f62174w;
                if (nVar4 != null) {
                    long p10 = nVar4.p();
                    t tVar2 = kVar6.v;
                    if (tVar2 != null && p10 != Long.MAX_VALUE) {
                        tVar2.f62284q = Math.max(0L, p10) * 1000;
                        Handler handler4 = tVar2.f62292u;
                        if (handler4 != null) {
                            handler4.removeCallbacks(tVar2.f62300y0);
                        }
                    }
                }
                kVar6.n();
                n nVar5 = kVar6.f62174w;
                if (nVar5 != null) {
                    nVar5.u();
                    kVar6.f62174w = null;
                }
                kVar6.Y = false;
                u0 u0Var = (u0) kVar6.f62145k.f62182a;
                u0Var.f62316i.post(new i0(u0Var, 3));
                return;
            case 8:
                this.f62032b.G();
                return;
            default:
                this.f62032b.a0();
                return;
        }
    }
}
