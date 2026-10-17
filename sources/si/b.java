package si;

import android.os.Handler;
public final class b implements Runnable {
    public final int f46575a;
    public final k f46576b;

    public b(k kVar, int i10) {
        this.f46575a = i10;
        this.f46576b = kVar;
    }

    @Override
    public final void run() {
        n nVar;
        boolean z10;
        switch (this.f46575a) {
            case 0:
                this.f46576b.u();
                return;
            case 1:
                this.f46576b.d0();
                return;
            case 2:
                k kVar = this.f46576b;
                Handler handler = kVar.f46683n;
                if (handler != null) {
                    handler.post(new b(kVar, 3));
                    return;
                }
                return;
            case 3:
                k kVar2 = this.f46576b;
                if (kVar2.V && kVar2.A != null && (nVar = kVar2.f46709x) != null) {
                    synchronized (nVar) {
                        z10 = nVar.f46755z;
                    }
                    if (!z10) {
                        try {
                            n nVar2 = kVar2.f46709x;
                            kVar2.f46711y = nVar2;
                            Handler handler2 = kVar2.f46683n;
                            if (handler2 != null) {
                                handler2.removeCallbacks(kVar2.f46682m1);
                                handler2.postDelayed(kVar2.f46682m1, 3000L);
                            }
                            nVar2.p(new e(kVar2, nVar2, 0), new e(kVar2, nVar2, 1));
                            o oVar = kVar2.f46673j;
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
                k kVar3 = this.f46576b;
                n nVar3 = kVar3.f46711y;
                if (kVar3.V && !kVar3.f46653b0 && nVar3 != null && kVar3.f46709x == nVar3) {
                    kVar3.f46711y = null;
                    kVar3.N(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                    return;
                }
                return;
            case 5:
                this.f46576b.g();
                return;
            case 6:
                k kVar4 = this.f46576b;
                kVar4.V = false;
                kVar4.k();
                n nVar4 = kVar4.f46709x;
                if (nVar4 != null) {
                    long l4 = nVar4.l();
                    u uVar = kVar4.f46707w;
                    if (uVar != null && l4 != Long.MAX_VALUE) {
                        uVar.f46836q = Math.max(0L, l4) * 1000;
                        Handler handler3 = uVar.f46844u;
                        if (handler3 != null) {
                            handler3.removeCallbacks(uVar.f46850x0);
                        }
                    }
                }
                kVar4.p();
                n nVar5 = kVar4.f46709x;
                if (nVar5 != null) {
                    nVar5.q();
                    kVar4.f46709x = null;
                }
                kVar4.f46653b0 = false;
                t0 t0Var = (t0) kVar4.f46676k.f15837b;
                t0Var.f46791i.post(new j0(t0Var, 3));
                return;
            case 7:
                this.f46576b.I();
                return;
            default:
                this.f46576b.d0();
                return;
        }
    }
}
