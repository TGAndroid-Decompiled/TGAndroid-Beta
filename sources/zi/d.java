package zi;

import android.os.Handler;
public final class d implements Runnable {
    public final int f62060a;
    public final k f62061b;
    public final n f62062c;

    public d(k kVar, n nVar, int i7) {
        this.f62060a = i7;
        this.f62061b = kVar;
        this.f62062c = nVar;
    }

    @Override
    public final void run() {
        t tVar;
        switch (this.f62060a) {
            case 0:
                k kVar = this.f62061b;
                d dVar = new d(kVar, this.f62062c, 3);
                Handler handler = kVar.f62163n;
                if (handler != null) {
                    handler.post(dVar);
                    return;
                }
                return;
            case 1:
                k kVar2 = this.f62061b;
                d dVar2 = new d(kVar2, this.f62062c, 2);
                Handler handler2 = kVar2.f62163n;
                if (handler2 != null) {
                    handler2.post(dVar2);
                    return;
                }
                return;
            case 2:
                k kVar3 = this.f62061b;
                n nVar = this.f62062c;
                if (kVar3.U && !kVar3.Y && kVar3.f62185w == nVar) {
                    kVar3.j();
                    if (kVar3.f62143f0 == 0) {
                        kVar3.f62143f0 = nVar.f62218e;
                    }
                    o oVar = kVar3.f62153j;
                    oVar.b("common A/V start completed: segmentElapsedMs=" + k.z(kVar3.C0));
                    u0 u0Var = (u0) kVar3.f62156k.f62193a;
                    u0Var.f62327i.post(new i0(u0Var, 2));
                    return;
                }
                return;
            default:
                k kVar4 = this.f62061b;
                n nVar2 = this.f62062c;
                if (kVar4.U && !kVar4.Y && kVar4.f62185w == nVar2 && kVar4.f62191z != null && (tVar = kVar4.v) != null) {
                    try {
                        long j3 = nVar2.F;
                        if (j3 > 0) {
                            tVar.f62293p = j3;
                            tVar.Q = -1L;
                            tVar.R = 0L;
                            tVar.S = -1L;
                            tVar.f62295q = Long.MAX_VALUE;
                            tVar.f62302t0 = true;
                            o oVar2 = kVar4.f62153j;
                            oVar2.b("common A/V start armed; waiting for next camera frame: segmentElapsedMs=" + k.z(kVar4.C0));
                            return;
                        }
                        throw new IllegalArgumentException("Invalid recording time origin");
                    } catch (RuntimeException e10) {
                        kVar4.j();
                        kVar4.M(e10);
                        return;
                    }
                }
                return;
        }
    }
}
