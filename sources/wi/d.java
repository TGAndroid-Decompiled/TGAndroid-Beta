package wi;

import android.os.Handler;
public final class d implements Runnable {
    public final int f57943a;
    public final k f57944b;
    public final n f57945c;

    public d(k kVar, n nVar, int i7) {
        this.f57943a = i7;
        this.f57944b = kVar;
        this.f57945c = nVar;
    }

    @Override
    public final void run() {
        t tVar;
        switch (this.f57943a) {
            case 0:
                k kVar = this.f57944b;
                d dVar = new d(kVar, this.f57945c, 3);
                Handler handler = kVar.f58046n;
                if (handler != null) {
                    handler.post(dVar);
                    return;
                }
                return;
            case 1:
                k kVar2 = this.f57944b;
                d dVar2 = new d(kVar2, this.f57945c, 2);
                Handler handler2 = kVar2.f58046n;
                if (handler2 != null) {
                    handler2.post(dVar2);
                    return;
                }
                return;
            case 2:
                k kVar3 = this.f57944b;
                n nVar = this.f57945c;
                if (kVar3.U && !kVar3.Y && kVar3.f58068w == nVar) {
                    kVar3.j();
                    if (kVar3.f58026f0 == 0) {
                        kVar3.f58026f0 = nVar.f58103e;
                    }
                    o oVar = kVar3.f58036j;
                    oVar.b("common A/V start completed: segmentElapsedMs=" + k.z(kVar3.C0));
                    t0 t0Var = (t0) kVar3.f58039k.f37805b;
                    t0Var.f58209i.post(new i0(t0Var, 2));
                    return;
                }
                return;
            default:
                k kVar4 = this.f57944b;
                n nVar2 = this.f57945c;
                if (kVar4.U && !kVar4.Y && kVar4.f58068w == nVar2 && kVar4.f58074z != null && (tVar = kVar4.v) != null) {
                    try {
                        long j3 = nVar2.F;
                        if (j3 > 0) {
                            tVar.f58181p = j3;
                            tVar.Q = -1L;
                            tVar.R = 0L;
                            tVar.S = -1L;
                            tVar.f58183q = Long.MAX_VALUE;
                            tVar.f58190t0 = true;
                            o oVar2 = kVar4.f58036j;
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
