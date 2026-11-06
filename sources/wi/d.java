package wi;

import android.os.Handler;
public final class d implements Runnable {
    public final int f57838a;
    public final j f57839b;
    public final m f57840c;

    public d(j jVar, m mVar, int i7) {
        this.f57838a = i7;
        this.f57839b = jVar;
        this.f57840c = mVar;
    }

    @Override
    public final void run() {
        t tVar;
        switch (this.f57838a) {
            case 0:
                j jVar = this.f57839b;
                d dVar = new d(jVar, this.f57840c, 3);
                Handler handler = jVar.f57935n;
                if (handler != null) {
                    handler.post(dVar);
                    return;
                }
                return;
            case 1:
                j jVar2 = this.f57839b;
                d dVar2 = new d(jVar2, this.f57840c, 2);
                Handler handler2 = jVar2.f57935n;
                if (handler2 != null) {
                    handler2.post(dVar2);
                    return;
                }
                return;
            case 2:
                j jVar3 = this.f57839b;
                m mVar = this.f57840c;
                if (jVar3.V && !jVar3.f57904b0 && jVar3.f57961x == mVar) {
                    jVar3.k();
                    if (jVar3.f57923i0 == 0) {
                        jVar3.f57923i0 = mVar.f57994e;
                    }
                    n nVar = jVar3.f57925j;
                    nVar.b("common A/V start completed: segmentElapsedMs=" + j.z(jVar3.F0));
                    t0 t0Var = (t0) jVar3.f57928k.f37389b;
                    t0Var.f58104i.post(new i0(t0Var, 2));
                    return;
                }
                return;
            default:
                j jVar4 = this.f57839b;
                m mVar2 = this.f57840c;
                if (jVar4.V && !jVar4.f57904b0 && jVar4.f57961x == mVar2 && jVar4.A != null && (tVar = jVar4.f57959w) != null) {
                    try {
                        long j3 = mVar2.F;
                        if (j3 > 0) {
                            tVar.f58078p = j3;
                            tVar.Q = -1L;
                            tVar.R = 0L;
                            tVar.S = -1L;
                            tVar.f58080q = Long.MAX_VALUE;
                            tVar.f58085s0 = true;
                            n nVar2 = jVar4.f57925j;
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
