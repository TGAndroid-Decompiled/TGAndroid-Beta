package wi;

import android.os.Handler;
public final class d implements Runnable {
    public final int f57930a;
    public final k f57931b;
    public final n f57932c;

    public d(k kVar, n nVar, int i7) {
        this.f57930a = i7;
        this.f57931b = kVar;
        this.f57932c = nVar;
    }

    @Override
    public final void run() {
        t tVar;
        switch (this.f57930a) {
            case 0:
                k kVar = this.f57931b;
                d dVar = new d(kVar, this.f57932c, 3);
                Handler handler = kVar.f58035n;
                if (handler != null) {
                    handler.post(dVar);
                    return;
                }
                return;
            case 1:
                k kVar2 = this.f57931b;
                d dVar2 = new d(kVar2, this.f57932c, 2);
                Handler handler2 = kVar2.f58035n;
                if (handler2 != null) {
                    handler2.post(dVar2);
                    return;
                }
                return;
            case 2:
                k kVar3 = this.f57931b;
                n nVar = this.f57932c;
                if (kVar3.V && !kVar3.Z && kVar3.f58060x == nVar) {
                    kVar3.j();
                    if (kVar3.f58018g0 == 0) {
                        kVar3.f58018g0 = nVar.f58093e;
                    }
                    o oVar = kVar3.f58025j;
                    oVar.b("common A/V start completed: segmentElapsedMs=" + k.A(kVar3.D0));
                    t0 t0Var = (t0) kVar3.f58028k.f37758b;
                    t0Var.f58199i.post(new i0(t0Var, 2));
                    return;
                }
                return;
            default:
                k kVar4 = this.f57931b;
                n nVar2 = this.f57932c;
                if (kVar4.V && !kVar4.Z && kVar4.f58060x == nVar2 && kVar4.A != null && (tVar = kVar4.f58058w) != null) {
                    try {
                        long j3 = nVar2.F;
                        if (j3 > 0) {
                            tVar.f58171p = j3;
                            tVar.Q = -1L;
                            tVar.R = 0L;
                            tVar.S = -1L;
                            tVar.f58173q = Long.MAX_VALUE;
                            tVar.f58180t0 = true;
                            o oVar2 = kVar4.f58025j;
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
