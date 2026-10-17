package si;

import android.os.Handler;
public final class e implements Runnable {
    public final int f46610a;
    public final k f46611b;
    public final n f46612c;

    public e(k kVar, n nVar, int i10) {
        this.f46610a = i10;
        this.f46611b = kVar;
        this.f46612c = nVar;
    }

    @Override
    public final void run() {
        u uVar;
        switch (this.f46610a) {
            case 0:
                k kVar = this.f46611b;
                e eVar = new e(kVar, this.f46612c, 3);
                Handler handler = kVar.f46683n;
                if (handler != null) {
                    handler.post(eVar);
                    return;
                }
                return;
            case 1:
                k kVar2 = this.f46611b;
                e eVar2 = new e(kVar2, this.f46612c, 2);
                Handler handler2 = kVar2.f46683n;
                if (handler2 != null) {
                    handler2.post(eVar2);
                    return;
                }
                return;
            case 2:
                k kVar3 = this.f46611b;
                n nVar = this.f46612c;
                if (kVar3.V && !kVar3.f46653b0 && kVar3.f46709x == nVar) {
                    kVar3.k();
                    o oVar = kVar3.f46673j;
                    oVar.b("common A/V start completed: segmentElapsedMs=" + k.z(kVar3.E0));
                    t0 t0Var = (t0) kVar3.f46676k.f15837b;
                    t0Var.f46791i.post(new j0(t0Var, 2));
                    return;
                }
                return;
            default:
                k kVar4 = this.f46611b;
                n nVar2 = this.f46612c;
                if (kVar4.V && !kVar4.f46653b0 && kVar4.f46709x == nVar2 && kVar4.A != null && (uVar = kVar4.f46707w) != null) {
                    try {
                        long j10 = nVar2.A;
                        if (j10 > 0) {
                            uVar.f46834p = j10;
                            uVar.Q = -1L;
                            uVar.R = 0L;
                            uVar.S = -1L;
                            uVar.f46836q = Long.MAX_VALUE;
                            uVar.f46841s0 = true;
                            o oVar2 = kVar4.f46673j;
                            oVar2.b("common A/V start armed; waiting for next camera frame: segmentElapsedMs=" + k.z(kVar4.E0));
                            return;
                        }
                        throw new IllegalArgumentException("Invalid recording time origin");
                    } catch (RuntimeException e) {
                        kVar4.k();
                        kVar4.N(e);
                        return;
                    }
                }
                return;
        }
    }
}
