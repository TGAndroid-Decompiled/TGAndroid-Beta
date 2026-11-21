package zi;

import android.os.Handler;
public final class d implements Runnable {
    public final int f62091a;
    public final k f62092b;
    public final n f62093c;

    public d(k kVar, n nVar, int i7) {
        this.f62091a = i7;
        this.f62092b = kVar;
        this.f62093c = nVar;
    }

    @Override
    public final void run() {
        t tVar;
        switch (this.f62091a) {
            case 0:
                k kVar = this.f62092b;
                d dVar = new d(kVar, this.f62093c, 3);
                Handler handler = kVar.f62194n;
                if (handler != null) {
                    handler.post(dVar);
                    return;
                }
                return;
            case 1:
                k kVar2 = this.f62092b;
                d dVar2 = new d(kVar2, this.f62093c, 2);
                Handler handler2 = kVar2.f62194n;
                if (handler2 != null) {
                    handler2.post(dVar2);
                    return;
                }
                return;
            case 2:
                k kVar3 = this.f62092b;
                n nVar = this.f62093c;
                if (kVar3.U && !kVar3.Y && kVar3.f62216w == nVar) {
                    kVar3.j();
                    if (kVar3.f62174f0 == 0) {
                        kVar3.f62174f0 = nVar.f62249e;
                    }
                    o oVar = kVar3.f62184j;
                    oVar.b("common A/V start completed: segmentElapsedMs=" + k.z(kVar3.C0));
                    u0 u0Var = (u0) kVar3.f62187k.f62224a;
                    u0Var.f62358i.post(new i0(u0Var, 2));
                    return;
                }
                return;
            default:
                k kVar4 = this.f62092b;
                n nVar2 = this.f62093c;
                if (kVar4.U && !kVar4.Y && kVar4.f62216w == nVar2 && kVar4.f62222z != null && (tVar = kVar4.v) != null) {
                    try {
                        long j3 = nVar2.F;
                        if (j3 > 0) {
                            tVar.f62324p = j3;
                            tVar.Q = -1L;
                            tVar.R = 0L;
                            tVar.S = -1L;
                            tVar.f62326q = Long.MAX_VALUE;
                            tVar.f62333t0 = true;
                            o oVar2 = kVar4.f62184j;
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
