package qi;

import android.os.Handler;
public final class c implements Runnable {
    public final int f46673a;
    public final h f46674b;
    public final k f46675c;

    public c(h hVar, k kVar, int i10) {
        this.f46673a = i10;
        this.f46674b = hVar;
        this.f46675c = kVar;
    }

    @Override
    public final void run() {
        p pVar;
        switch (this.f46673a) {
            case 0:
                h hVar = this.f46674b;
                c cVar = new c(hVar, this.f46675c, 2);
                Handler handler = hVar.f46732n;
                if (handler != null) {
                    handler.post(cVar);
                    return;
                }
                return;
            case 1:
                h hVar2 = this.f46674b;
                c cVar2 = new c(hVar2, this.f46675c, 3);
                Handler handler2 = hVar2.f46732n;
                if (handler2 != null) {
                    handler2.post(cVar2);
                    return;
                }
                return;
            case 2:
                h hVar3 = this.f46674b;
                k kVar = this.f46675c;
                if (hVar3.S && !hVar3.Y && hVar3.f46749w == kVar && hVar3.f46755z != null && (pVar = hVar3.v) != null) {
                    try {
                        long j3 = kVar.A;
                        if (j3 > 0) {
                            pVar.f46830j = j3;
                            pVar.J = -1L;
                            pVar.K = 0L;
                            pVar.L = -1L;
                            pVar.f46832k = Long.MAX_VALUE;
                            pVar.f46835l0 = true;
                            l lVar = hVar3.f46725j;
                            lVar.b("common A/V start armed; waiting for next camera frame: segmentElapsedMs=" + h.m(hVar3.f46719f0));
                            return;
                        }
                        throw new IllegalArgumentException("Invalid recording time origin");
                    } catch (RuntimeException e7) {
                        hVar3.d();
                        hVar3.t(e7);
                        return;
                    }
                }
                return;
            default:
                h hVar4 = this.f46674b;
                k kVar2 = this.f46675c;
                if (hVar4.S && !hVar4.Y && hVar4.f46749w == kVar2) {
                    hVar4.d();
                    l lVar2 = hVar4.f46725j;
                    lVar2.b("common A/V start completed: segmentElapsedMs=" + h.m(hVar4.f46719f0));
                    p0 p0Var = (p0) hVar4.f46727k.f14466b;
                    p0Var.f46859j.post(new f0(p0Var, 1));
                    return;
                }
                return;
        }
    }
}
