package qi;

import android.os.Handler;
public final class c implements Runnable {
    public final int f46681a;
    public final h f46682b;
    public final k f46683c;

    public c(h hVar, k kVar, int i10) {
        this.f46681a = i10;
        this.f46682b = hVar;
        this.f46683c = kVar;
    }

    @Override
    public final void run() {
        p pVar;
        switch (this.f46681a) {
            case 0:
                h hVar = this.f46682b;
                c cVar = new c(hVar, this.f46683c, 2);
                Handler handler = hVar.f46740n;
                if (handler != null) {
                    handler.post(cVar);
                    return;
                }
                return;
            case 1:
                h hVar2 = this.f46682b;
                c cVar2 = new c(hVar2, this.f46683c, 3);
                Handler handler2 = hVar2.f46740n;
                if (handler2 != null) {
                    handler2.post(cVar2);
                    return;
                }
                return;
            case 2:
                h hVar3 = this.f46682b;
                k kVar = this.f46683c;
                if (hVar3.S && !hVar3.Y && hVar3.f46757w == kVar && hVar3.f46763z != null && (pVar = hVar3.v) != null) {
                    try {
                        long j3 = kVar.A;
                        if (j3 > 0) {
                            pVar.f46838j = j3;
                            pVar.J = -1L;
                            pVar.K = 0L;
                            pVar.L = -1L;
                            pVar.f46840k = Long.MAX_VALUE;
                            pVar.f46843l0 = true;
                            l lVar = hVar3.f46733j;
                            lVar.b("common A/V start armed; waiting for next camera frame: segmentElapsedMs=" + h.m(hVar3.f46727f0));
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
                h hVar4 = this.f46682b;
                k kVar2 = this.f46683c;
                if (hVar4.S && !hVar4.Y && hVar4.f46757w == kVar2) {
                    hVar4.d();
                    l lVar2 = hVar4.f46733j;
                    lVar2.b("common A/V start completed: segmentElapsedMs=" + h.m(hVar4.f46727f0));
                    p0 p0Var = (p0) hVar4.f46735k.f14467b;
                    p0Var.f46867j.post(new f0(p0Var, 1));
                    return;
                }
                return;
        }
    }
}
