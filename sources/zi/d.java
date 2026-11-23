package zi;

import android.os.Handler;
public final class d implements Runnable {
    public final int f62178a;
    public final k f62179b;
    public final n f62180c;

    public d(k kVar, n nVar, int i7) {
        this.f62178a = i7;
        this.f62179b = kVar;
        this.f62180c = nVar;
    }

    @Override
    public final void run() {
        t tVar;
        switch (this.f62178a) {
            case 0:
                k kVar = this.f62179b;
                d dVar = new d(kVar, this.f62180c, 3);
                Handler handler = kVar.f62281n;
                if (handler != null) {
                    handler.post(dVar);
                    return;
                }
                return;
            case 1:
                k kVar2 = this.f62179b;
                d dVar2 = new d(kVar2, this.f62180c, 2);
                Handler handler2 = kVar2.f62281n;
                if (handler2 != null) {
                    handler2.post(dVar2);
                    return;
                }
                return;
            case 2:
                k kVar3 = this.f62179b;
                n nVar = this.f62180c;
                if (kVar3.U && !kVar3.Y && kVar3.f62303w == nVar) {
                    kVar3.j();
                    if (kVar3.f62261f0 == 0) {
                        kVar3.f62261f0 = nVar.f62338e;
                    }
                    o oVar = kVar3.f62271j;
                    oVar.b("common A/V start completed: segmentElapsedMs=" + k.z(kVar3.C0));
                    u0 u0Var = (u0) kVar3.f62274k.f60952a;
                    u0Var.f62447i.post(new i0(u0Var, 2));
                    return;
                }
                return;
            default:
                k kVar4 = this.f62179b;
                n nVar2 = this.f62180c;
                if (kVar4.U && !kVar4.Y && kVar4.f62303w == nVar2 && kVar4.f62309z != null && (tVar = kVar4.v) != null) {
                    try {
                        long j3 = nVar2.F;
                        if (j3 > 0) {
                            tVar.f62413p = j3;
                            tVar.Q = -1L;
                            tVar.R = 0L;
                            tVar.S = -1L;
                            tVar.f62415q = Long.MAX_VALUE;
                            tVar.f62422t0 = true;
                            o oVar2 = kVar4.f62271j;
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
