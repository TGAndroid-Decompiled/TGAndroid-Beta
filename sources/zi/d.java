package zi;

import android.os.Handler;
public final class d implements Runnable {
    public final int f61478a;
    public final l f61479b;
    public final o f61480c;

    public d(l lVar, o oVar, int i7) {
        this.f61478a = i7;
        this.f61479b = lVar;
        this.f61480c = oVar;
    }

    @Override
    public final void run() {
        u uVar;
        switch (this.f61478a) {
            case 0:
                l lVar = this.f61479b;
                d dVar = new d(lVar, this.f61480c, 3);
                Handler handler = lVar.f61589n;
                if (handler != null) {
                    handler.post(dVar);
                    return;
                }
                return;
            case 1:
                l lVar2 = this.f61479b;
                d dVar2 = new d(lVar2, this.f61480c, 2);
                Handler handler2 = lVar2.f61589n;
                if (handler2 != null) {
                    handler2.post(dVar2);
                    return;
                }
                return;
            case 2:
                l lVar3 = this.f61479b;
                o oVar = this.f61480c;
                if (lVar3.U && !lVar3.Y && lVar3.f61611w == oVar) {
                    lVar3.j();
                    if (lVar3.f61569f0 == 0) {
                        lVar3.f61569f0 = oVar.f61646e;
                    }
                    p pVar = lVar3.f61579j;
                    pVar.b("common A/V start completed: segmentElapsedMs=" + l.z(lVar3.C0));
                    v0 v0Var = (v0) lVar3.f61582k.f57880a;
                    v0Var.f61752i.post(new j0(v0Var, 2));
                    return;
                }
                return;
            default:
                l lVar4 = this.f61479b;
                o oVar2 = this.f61480c;
                if (lVar4.U && !lVar4.Y && lVar4.f61611w == oVar2 && lVar4.f61617z != null && (uVar = lVar4.v) != null) {
                    try {
                        long j3 = oVar2.F;
                        if (j3 > 0) {
                            uVar.f61718p = j3;
                            uVar.Q = -1L;
                            uVar.R = 0L;
                            uVar.S = -1L;
                            uVar.f61720q = Long.MAX_VALUE;
                            uVar.f61727t0 = true;
                            p pVar2 = lVar4.f61579j;
                            pVar2.b("common A/V start armed; waiting for next camera frame: segmentElapsedMs=" + l.z(lVar4.C0));
                            return;
                        }
                        throw new IllegalArgumentException("Invalid recording time origin");
                    } catch (RuntimeException e10) {
                        lVar4.j();
                        lVar4.M(e10);
                        return;
                    }
                }
                return;
        }
    }
}
