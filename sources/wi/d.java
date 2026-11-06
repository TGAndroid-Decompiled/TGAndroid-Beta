package wi;

import android.os.Handler;
public final class d implements Runnable {
    public final int f57839a;
    public final j f57840b;
    public final m f57841c;

    public d(j jVar, m mVar, int i7) {
        this.f57839a = i7;
        this.f57840b = jVar;
        this.f57841c = mVar;
    }

    @Override
    public final void run() {
        t tVar;
        switch (this.f57839a) {
            case 0:
                j jVar = this.f57840b;
                d dVar = new d(jVar, this.f57841c, 3);
                Handler handler = jVar.f57936n;
                if (handler != null) {
                    handler.post(dVar);
                    return;
                }
                return;
            case 1:
                j jVar2 = this.f57840b;
                d dVar2 = new d(jVar2, this.f57841c, 2);
                Handler handler2 = jVar2.f57936n;
                if (handler2 != null) {
                    handler2.post(dVar2);
                    return;
                }
                return;
            case 2:
                j jVar3 = this.f57840b;
                m mVar = this.f57841c;
                if (jVar3.V && !jVar3.f57905b0 && jVar3.f57962x == mVar) {
                    jVar3.k();
                    if (jVar3.f57924i0 == 0) {
                        jVar3.f57924i0 = mVar.f57995e;
                    }
                    n nVar = jVar3.f57926j;
                    nVar.b("common A/V start completed: segmentElapsedMs=" + j.z(jVar3.F0));
                    t0 t0Var = (t0) jVar3.f57929k.f37394b;
                    t0Var.f58105i.post(new i0(t0Var, 2));
                    return;
                }
                return;
            default:
                j jVar4 = this.f57840b;
                m mVar2 = this.f57841c;
                if (jVar4.V && !jVar4.f57905b0 && jVar4.f57962x == mVar2 && jVar4.A != null && (tVar = jVar4.f57960w) != null) {
                    try {
                        long j3 = mVar2.F;
                        if (j3 > 0) {
                            tVar.f58079p = j3;
                            tVar.Q = -1L;
                            tVar.R = 0L;
                            tVar.S = -1L;
                            tVar.f58081q = Long.MAX_VALUE;
                            tVar.f58086s0 = true;
                            n nVar2 = jVar4.f57926j;
                            nVar2.b("common A/V start armed; waiting for next camera frame: segmentElapsedMs=" + j.z(jVar4.F0));
                            return;
                        }
                        throw new IllegalArgumentException("Invalid recording time origin");
                    } catch (RuntimeException e10) {
                        jVar4.k();
                        jVar4.N(e10);
                        return;
                    }
                }
                return;
        }
    }
}
