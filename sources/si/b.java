package si;

import android.os.Handler;
public final class b implements Runnable {
    public final int f46595a;
    public final k f46596b;

    public b(k kVar, int i10) {
        this.f46595a = i10;
        this.f46596b = kVar;
    }

    @Override
    public final void run() {
        n nVar;
        boolean z10;
        switch (this.f46595a) {
            case 0:
                this.f46596b.u();
                return;
            case 1:
                this.f46596b.d0();
                return;
            case 2:
                k kVar = this.f46596b;
                Handler handler = kVar.f46710n;
                if (handler != null) {
                    handler.post(new b(kVar, 3));
                    return;
                }
                return;
            case 3:
                k kVar2 = this.f46596b;
                if (kVar2.V && kVar2.A != null && (nVar = kVar2.f46736x) != null) {
                    synchronized (nVar) {
                        z10 = nVar.f46776z;
                    }
                    if (!z10) {
                        try {
                            n nVar2 = kVar2.f46736x;
                            kVar2.f46738y = nVar2;
                            Handler handler2 = kVar2.f46710n;
                            if (handler2 != null) {
                                handler2.removeCallbacks(kVar2.f46709m1);
                                handler2.postDelayed(kVar2.f46709m1, 3000L);
                            }
                            nVar2.p(new e(kVar2, nVar2, 0), new e(kVar2, nVar2, 1));
                            o oVar = kVar2.f46700j;
                            oVar.b("first camera frame received; audio startup requested: segmentElapsedMs=" + k.z(kVar2.E0));
                            return;
                        } catch (RuntimeException e) {
                            kVar2.k();
                            kVar2.N(e);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 4:
                k kVar3 = this.f46596b;
                n nVar3 = kVar3.f46738y;
                if (kVar3.V && !kVar3.f46680b0 && nVar3 != null && kVar3.f46736x == nVar3) {
                    kVar3.f46738y = null;
                    kVar3.N(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                    return;
                }
                return;
            case 5:
                this.f46596b.g();
                return;
            case 6:
                k kVar4 = this.f46596b;
                kVar4.V = false;
                kVar4.k();
                n nVar4 = kVar4.f46736x;
                if (nVar4 != null) {
                    long l4 = nVar4.l();
                    u uVar = kVar4.f46734w;
                    if (uVar != null && l4 != Long.MAX_VALUE) {
                        uVar.f46857q = Math.max(0L, l4) * 1000;
                        Handler handler3 = uVar.f46865u;
                        if (handler3 != null) {
                            handler3.removeCallbacks(uVar.f46871x0);
                        }
                    }
                }
                kVar4.p();
                n nVar5 = kVar4.f46736x;
                if (nVar5 != null) {
                    nVar5.q();
                    kVar4.f46736x = null;
                }
                kVar4.f46680b0 = false;
                s0 s0Var = (s0) kVar4.f46703k.f15844b;
                s0Var.f46809i.post(new i0(s0Var, 3));
                return;
            case 7:
                this.f46596b.I();
                return;
            default:
                this.f46596b.d0();
                return;
        }
    }
}
