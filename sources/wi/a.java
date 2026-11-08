package wi;

import android.os.Handler;
import org.telegram.ui.Wallet.g2;
public final class a implements Runnable {
    public final int f57912a;
    public final k f57913b;

    public a(k kVar, int i7) {
        this.f57912a = i7;
        this.f57913b = kVar;
    }

    @Override
    public final void run() {
        t tVar;
        n nVar;
        boolean z9;
        switch (this.f57912a) {
            case 0:
                this.f57913b.u();
                return;
            case 1:
                k kVar = this.f57913b;
                int z10 = kVar.z();
                if (z10 != kVar.C0 && (tVar = kVar.f58058w) != null) {
                    kVar.C0 = z10;
                    tVar.f58178s0 = z10;
                    Handler handler = tVar.f58181u;
                    if (tVar.f58176r0 && handler != null) {
                        handler.post(new g2(tVar, z10, 11));
                    }
                    o oVar = kVar.f58025j;
                    oVar.b("display rotation applied: degrees=" + z10);
                    return;
                }
                return;
            case 2:
                this.f57913b.b0();
                return;
            case 3:
                k kVar2 = this.f57913b;
                Handler handler2 = kVar2.f58035n;
                if (handler2 != null) {
                    handler2.post(new a(kVar2, 4));
                    return;
                }
                return;
            case 4:
                k kVar3 = this.f57913b;
                if (kVar3.V && kVar3.A != null && (nVar = kVar3.f58060x) != null) {
                    synchronized (nVar) {
                        z9 = nVar.E;
                    }
                    if (!z9) {
                        try {
                            n nVar2 = kVar3.f58060x;
                            kVar3.f58062y = nVar2;
                            Handler handler3 = kVar3.f58035n;
                            if (handler3 != null) {
                                handler3.removeCallbacks(kVar3.l1);
                                handler3.postDelayed(kVar3.l1, 3000L);
                            }
                            nVar2.t(new d(kVar3, nVar2, 0), new d(kVar3, nVar2, 1));
                            o oVar2 = kVar3.f58025j;
                            oVar2.b("first camera frame received; audio startup requested: segmentElapsedMs=" + k.A(kVar3.D0));
                            return;
                        } catch (RuntimeException e10) {
                            kVar3.j();
                            kVar3.N(e10);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                k kVar4 = this.f57913b;
                n nVar3 = kVar4.f58062y;
                if (kVar4.V && !kVar4.Z && nVar3 != null && kVar4.f58060x == nVar3) {
                    kVar4.f58062y = null;
                    kVar4.N(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                    return;
                }
                return;
            case 6:
                this.f57913b.f();
                return;
            case 7:
                k kVar5 = this.f57913b;
                kVar5.V = false;
                kVar5.j();
                n nVar4 = kVar5.f58060x;
                if (nVar4 != null) {
                    long p10 = nVar4.p();
                    t tVar2 = kVar5.f58058w;
                    if (tVar2 != null && p10 != Long.MAX_VALUE) {
                        tVar2.f58173q = Math.max(0L, p10) * 1000;
                        Handler handler4 = tVar2.f58181u;
                        if (handler4 != null) {
                            handler4.removeCallbacks(tVar2.f58189y0);
                        }
                    }
                }
                kVar5.o();
                n nVar5 = kVar5.f58060x;
                if (nVar5 != null) {
                    nVar5.u();
                    kVar5.f58060x = null;
                }
                kVar5.Z = false;
                t0 t0Var = (t0) kVar5.f58028k.f37758b;
                t0Var.f58199i.post(new i0(t0Var, 3));
                return;
            case 8:
                this.f57913b.H();
                return;
            default:
                this.f57913b.b0();
                return;
        }
    }
}
