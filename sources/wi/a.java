package wi;

import android.os.Handler;
import org.telegram.ui.Wallet.f2;
public final class a implements Runnable {
    public final int f57929a;
    public final k f57930b;

    public a(k kVar, int i7) {
        this.f57929a = i7;
        this.f57930b = kVar;
    }

    @Override
    public final void run() {
        t tVar;
        n nVar;
        boolean z9;
        switch (this.f57929a) {
            case 0:
                this.f57930b.t();
                return;
            case 1:
                k kVar = this.f57930b;
                int y10 = kVar.y();
                if (y10 != kVar.B0 && (tVar = kVar.v) != null) {
                    kVar.B0 = y10;
                    tVar.f58192s0 = y10;
                    Handler handler = tVar.f58195u;
                    if (tVar.f58190r0 && handler != null) {
                        handler.post(new f2(tVar, y10, 11));
                    }
                    o oVar = kVar.f58040j;
                    oVar.b("display rotation applied: degrees=" + y10);
                    return;
                }
                return;
            case 2:
                this.f57930b.a0();
                return;
            case 3:
                k kVar2 = this.f57930b;
                Handler handler2 = kVar2.f58050n;
                if (handler2 != null) {
                    handler2.post(new a(kVar2, 4));
                    return;
                }
                return;
            case 4:
                k kVar3 = this.f57930b;
                if (kVar3.U && kVar3.f58078z != null && (nVar = kVar3.f58072w) != null) {
                    synchronized (nVar) {
                        z9 = nVar.E;
                    }
                    if (!z9) {
                        try {
                            n nVar2 = kVar3.f58072w;
                            kVar3.f58074x = nVar2;
                            Handler handler3 = kVar3.f58050n;
                            if (handler3 != null) {
                                handler3.removeCallbacks(kVar3.f58045k1);
                                handler3.postDelayed(kVar3.f58045k1, 3000L);
                            }
                            nVar2.t(new d(kVar3, nVar2, 0), new d(kVar3, nVar2, 1));
                            o oVar2 = kVar3.f58040j;
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
                k kVar4 = this.f57930b;
                n nVar3 = kVar4.f58074x;
                if (kVar4.U && !kVar4.Y && nVar3 != null && kVar4.f58072w == nVar3) {
                    kVar4.f58074x = null;
                    kVar4.M(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                    return;
                }
                return;
            case 6:
                this.f57930b.f();
                return;
            case 7:
                k kVar5 = this.f57930b;
                kVar5.U = false;
                kVar5.j();
                n nVar4 = kVar5.f58072w;
                if (nVar4 != null) {
                    long p10 = nVar4.p();
                    t tVar2 = kVar5.v;
                    if (tVar2 != null && p10 != Long.MAX_VALUE) {
                        tVar2.f58187q = Math.max(0L, p10) * 1000;
                        Handler handler4 = tVar2.f58195u;
                        if (handler4 != null) {
                            handler4.removeCallbacks(tVar2.f58203y0);
                        }
                    }
                }
                kVar5.n();
                n nVar5 = kVar5.f58072w;
                if (nVar5 != null) {
                    nVar5.u();
                    kVar5.f58072w = null;
                }
                kVar5.Y = false;
                t0 t0Var = (t0) kVar5.f58043k.f37395b;
                t0Var.f58213i.post(new i0(t0Var, 3));
                return;
            case 8:
                this.f57930b.G();
                return;
            default:
                this.f57930b.a0();
                return;
        }
    }
}
