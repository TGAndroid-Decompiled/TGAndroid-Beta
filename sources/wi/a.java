package wi;

import android.os.Handler;
import org.telegram.ui.Wallet.h2;
public final class a implements Runnable {
    public final int f57820a;
    public final k f57821b;

    public a(k kVar, int i7) {
        this.f57820a = i7;
        this.f57821b = kVar;
    }

    @Override
    public final void run() {
        u uVar;
        n nVar;
        boolean z9;
        switch (this.f57820a) {
            case 0:
                this.f57821b.u();
                return;
            case 1:
                k kVar = this.f57821b;
                int z10 = kVar.z();
                if (z10 != kVar.C0 && (uVar = kVar.f57963w) != null) {
                    kVar.C0 = z10;
                    uVar.f58089s0 = z10;
                    Handler handler = uVar.f58092u;
                    if (uVar.f58087r0 && handler != null) {
                        handler.post(new h2(uVar, z10, 12));
                    }
                    o oVar = kVar.f57930j;
                    oVar.b("display rotation applied: degrees=" + z10);
                    return;
                }
                return;
            case 2:
                this.f57821b.b0();
                return;
            case 3:
                k kVar2 = this.f57821b;
                Handler handler2 = kVar2.f57940n;
                if (handler2 != null) {
                    handler2.post(new a(kVar2, 4));
                    return;
                }
                return;
            case 4:
                k kVar3 = this.f57821b;
                if (kVar3.V && kVar3.A != null && (nVar = kVar3.f57965x) != null) {
                    synchronized (nVar) {
                        z9 = nVar.E;
                    }
                    if (!z9) {
                        try {
                            n nVar2 = kVar3.f57965x;
                            kVar3.f57967y = nVar2;
                            Handler handler3 = kVar3.f57940n;
                            if (handler3 != null) {
                                handler3.removeCallbacks(kVar3.l1);
                                handler3.postDelayed(kVar3.l1, 3000L);
                            }
                            nVar2.t(new d(kVar3, nVar2, 0), new d(kVar3, nVar2, 1));
                            o oVar2 = kVar3.f57930j;
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
                k kVar4 = this.f57821b;
                n nVar3 = kVar4.f57967y;
                if (kVar4.V && !kVar4.Z && nVar3 != null && kVar4.f57965x == nVar3) {
                    kVar4.f57967y = null;
                    kVar4.N(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                    return;
                }
                return;
            case 6:
                this.f57821b.f();
                return;
            case 7:
                k kVar5 = this.f57821b;
                kVar5.V = false;
                kVar5.j();
                n nVar4 = kVar5.f57965x;
                if (nVar4 != null) {
                    long p10 = nVar4.p();
                    u uVar2 = kVar5.f57963w;
                    if (uVar2 != null && p10 != Long.MAX_VALUE) {
                        uVar2.f58084q = Math.max(0L, p10) * 1000;
                        Handler handler4 = uVar2.f58092u;
                        if (handler4 != null) {
                            handler4.removeCallbacks(uVar2.f58100y0);
                        }
                    }
                }
                kVar5.o();
                n nVar5 = kVar5.f57965x;
                if (nVar5 != null) {
                    nVar5.u();
                    kVar5.f57965x = null;
                }
                kVar5.Z = false;
                u0 u0Var = (u0) kVar5.f57933k.f37389b;
                u0Var.f58110i.post(new j0(u0Var, 3));
                return;
            case 8:
                this.f57821b.H();
                return;
            default:
                this.f57821b.b0();
                return;
        }
    }
}
