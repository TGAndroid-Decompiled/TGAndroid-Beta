package wi;

import android.os.Handler;
public final class d implements Runnable {
    public final int f57833a;
    public final k f57834b;
    public final n f57835c;

    public d(k kVar, n nVar, int i7) {
        this.f57833a = i7;
        this.f57834b = kVar;
        this.f57835c = nVar;
    }

    @Override
    public final void run() {
        u uVar;
        switch (this.f57833a) {
            case 0:
                k kVar = this.f57834b;
                d dVar = new d(kVar, this.f57835c, 3);
                Handler handler = kVar.f57940n;
                if (handler != null) {
                    handler.post(dVar);
                    return;
                }
                return;
            case 1:
                k kVar2 = this.f57834b;
                d dVar2 = new d(kVar2, this.f57835c, 2);
                Handler handler2 = kVar2.f57940n;
                if (handler2 != null) {
                    handler2.post(dVar2);
                    return;
                }
                return;
            case 2:
                k kVar3 = this.f57834b;
                n nVar = this.f57835c;
                if (kVar3.V && !kVar3.Z && kVar3.f57965x == nVar) {
                    kVar3.j();
                    if (kVar3.f57923g0 == 0) {
                        kVar3.f57923g0 = nVar.f57998e;
                    }
                    o oVar = kVar3.f57930j;
                    oVar.b("common A/V start completed: segmentElapsedMs=" + k.A(kVar3.D0));
                    u0 u0Var = (u0) kVar3.f57933k.f37389b;
                    u0Var.f58110i.post(new j0(u0Var, 2));
                    return;
                }
                return;
            default:
                k kVar4 = this.f57834b;
                n nVar2 = this.f57835c;
                if (kVar4.V && !kVar4.Z && kVar4.f57965x == nVar2 && kVar4.A != null && (uVar = kVar4.f57963w) != null) {
                    try {
                        long j3 = nVar2.F;
                        if (j3 > 0) {
                            uVar.f58082p = j3;
                            uVar.Q = -1L;
                            uVar.R = 0L;
                            uVar.S = -1L;
                            uVar.f58084q = Long.MAX_VALUE;
                            uVar.f58091t0 = true;
                            o oVar2 = kVar4.f57930j;
                            oVar2.b("common A/V start armed; waiting for next camera frame: segmentElapsedMs=" + k.A(kVar4.D0));
                            return;
                        }
                        throw new IllegalArgumentException("Invalid recording time origin");
                    } catch (RuntimeException e10) {
                        kVar4.j();
                        kVar4.N(e10);
                        return;
                    }
                }
                return;
        }
    }
}
