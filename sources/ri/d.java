package ri;

import android.os.Handler;
public final class d implements Runnable {
    public final int f44506a;
    public final j f44507b;
    public final m f44508c;

    public d(j jVar, m mVar, int i10) {
        this.f44506a = i10;
        this.f44507b = jVar;
        this.f44508c = mVar;
    }

    @Override
    public final void run() {
        s sVar;
        switch (this.f44506a) {
            case 0:
                j jVar = this.f44507b;
                d dVar = new d(jVar, this.f44508c, 3);
                Handler handler = jVar.f44584n;
                if (handler != null) {
                    handler.post(dVar);
                    return;
                }
                return;
            case 1:
                j jVar2 = this.f44507b;
                d dVar2 = new d(jVar2, this.f44508c, 2);
                Handler handler2 = jVar2.f44584n;
                if (handler2 != null) {
                    handler2.post(dVar2);
                    return;
                }
                return;
            case 2:
                j jVar3 = this.f44507b;
                m mVar = this.f44508c;
                if (jVar3.V && !jVar3.f44554b0 && jVar3.f44610x == mVar) {
                    jVar3.k();
                    n nVar = jVar3.f44574j;
                    nVar.b("common A/V start completed: segmentElapsedMs=" + j.z(jVar3.E0));
                    r0 r0Var = (r0) jVar3.f44577k.f14848b;
                    r0Var.f44680i.post(new g0(r0Var, 2));
                    return;
                }
                return;
            default:
                j jVar4 = this.f44507b;
                m mVar2 = this.f44508c;
                if (jVar4.V && !jVar4.f44554b0 && jVar4.f44610x == mVar2 && jVar4.A != null && (sVar = jVar4.f44608w) != null) {
                    try {
                        long j10 = mVar2.A;
                        if (j10 > 0) {
                            sVar.f44723p = j10;
                            sVar.Q = -1L;
                            sVar.R = 0L;
                            sVar.S = -1L;
                            sVar.f44725q = Long.MAX_VALUE;
                            sVar.f44730s0 = true;
                            n nVar2 = jVar4.f44574j;
                            nVar2.b("common A/V start armed; waiting for next camera frame: segmentElapsedMs=" + j.z(jVar4.E0));
                            return;
                        }
                        throw new IllegalArgumentException("Invalid recording time origin");
                    } catch (RuntimeException e) {
                        jVar4.k();
                        jVar4.N(e);
                        return;
                    }
                }
                return;
        }
    }
}
