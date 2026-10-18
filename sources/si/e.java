package si;

import android.os.Handler;
public final class e implements Runnable {
    public final int f46631a;
    public final k f46632b;
    public final n f46633c;

    public e(k kVar, n nVar, int i10) {
        this.f46631a = i10;
        this.f46632b = kVar;
        this.f46633c = nVar;
    }

    @Override
    public final void run() {
        u uVar;
        switch (this.f46631a) {
            case 0:
                k kVar = this.f46632b;
                e eVar = new e(kVar, this.f46633c, 3);
                Handler handler = kVar.f46710n;
                if (handler != null) {
                    handler.post(eVar);
                    return;
                }
                return;
            case 1:
                k kVar2 = this.f46632b;
                e eVar2 = new e(kVar2, this.f46633c, 2);
                Handler handler2 = kVar2.f46710n;
                if (handler2 != null) {
                    handler2.post(eVar2);
                    return;
                }
                return;
            case 2:
                k kVar3 = this.f46632b;
                n nVar = this.f46633c;
                if (kVar3.V && !kVar3.f46680b0 && kVar3.f46736x == nVar) {
                    kVar3.k();
                    o oVar = kVar3.f46700j;
                    oVar.b("common A/V start completed: segmentElapsedMs=" + k.z(kVar3.E0));
                    s0 s0Var = (s0) kVar3.f46703k.f15844b;
                    s0Var.f46809i.post(new i0(s0Var, 2));
                    return;
                }
                return;
            default:
                k kVar4 = this.f46632b;
                n nVar2 = this.f46633c;
                if (kVar4.V && !kVar4.f46680b0 && kVar4.f46736x == nVar2 && kVar4.A != null && (uVar = kVar4.f46734w) != null) {
                    try {
                        long j10 = nVar2.A;
                        if (j10 > 0) {
                            uVar.f46855p = j10;
                            uVar.Q = -1L;
                            uVar.R = 0L;
                            uVar.S = -1L;
                            uVar.f46857q = Long.MAX_VALUE;
                            uVar.f46862s0 = true;
                            o oVar2 = kVar4.f46700j;
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
