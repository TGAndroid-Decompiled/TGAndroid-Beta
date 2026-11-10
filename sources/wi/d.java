package wi;

import android.os.Handler;
public final class d implements Runnable {
    public final int f57947a;
    public final k f57948b;
    public final n f57949c;

    public d(k kVar, n nVar, int i7) {
        this.f57947a = i7;
        this.f57948b = kVar;
        this.f57949c = nVar;
    }

    @Override
    public final void run() {
        t tVar;
        switch (this.f57947a) {
            case 0:
                k kVar = this.f57948b;
                d dVar = new d(kVar, this.f57949c, 3);
                Handler handler = kVar.f58050n;
                if (handler != null) {
                    handler.post(dVar);
                    return;
                }
                return;
            case 1:
                k kVar2 = this.f57948b;
                d dVar2 = new d(kVar2, this.f57949c, 2);
                Handler handler2 = kVar2.f58050n;
                if (handler2 != null) {
                    handler2.post(dVar2);
                    return;
                }
                return;
            case 2:
                k kVar3 = this.f57948b;
                n nVar = this.f57949c;
                if (kVar3.U && !kVar3.Y && kVar3.f58072w == nVar) {
                    kVar3.j();
                    if (kVar3.f58030f0 == 0) {
                        kVar3.f58030f0 = nVar.f58107e;
                    }
                    o oVar = kVar3.f58040j;
                    oVar.b("common A/V start completed: segmentElapsedMs=" + k.z(kVar3.C0));
                    t0 t0Var = (t0) kVar3.f58043k.f37395b;
                    t0Var.f58213i.post(new i0(t0Var, 2));
                    return;
                }
                return;
            default:
                k kVar4 = this.f57948b;
                n nVar2 = this.f57949c;
                if (kVar4.U && !kVar4.Y && kVar4.f58072w == nVar2 && kVar4.f58078z != null && (tVar = kVar4.v) != null) {
                    try {
                        long j3 = nVar2.F;
                        if (j3 > 0) {
                            tVar.f58185p = j3;
                            tVar.Q = -1L;
                            tVar.R = 0L;
                            tVar.S = -1L;
                            tVar.f58187q = Long.MAX_VALUE;
                            tVar.f58194t0 = true;
                            o oVar2 = kVar4.f58040j;
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
