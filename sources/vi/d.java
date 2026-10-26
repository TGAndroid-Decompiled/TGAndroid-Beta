package vi;

import android.os.Handler;
public final class d implements Runnable {
    public final int f50365a;
    public final j f50366b;
    public final m f50367c;

    public d(j jVar, m mVar, int i10) {
        this.f50365a = i10;
        this.f50366b = jVar;
        this.f50367c = mVar;
    }

    @Override
    public final void run() {
        s sVar;
        switch (this.f50365a) {
            case 0:
                j jVar = this.f50366b;
                d dVar = new d(jVar, this.f50367c, 3);
                Handler handler = jVar.f50438n;
                if (handler != null) {
                    handler.post(dVar);
                    return;
                }
                return;
            case 1:
                j jVar2 = this.f50366b;
                d dVar2 = new d(jVar2, this.f50367c, 2);
                Handler handler2 = jVar2.f50438n;
                if (handler2 != null) {
                    handler2.post(dVar2);
                    return;
                }
                return;
            case 2:
                j jVar3 = this.f50366b;
                m mVar = this.f50367c;
                if (jVar3.V && !jVar3.f50408b0 && jVar3.f50464x == mVar) {
                    jVar3.k();
                    n nVar = jVar3.f50428j;
                    nVar.b("common A/V start completed: segmentElapsedMs=" + j.z(jVar3.E0));
                    s0 s0Var = (s0) jVar3.f50431k.f17210b;
                    s0Var.f50588i.post(new h0(s0Var, 2));
                    return;
                }
                return;
            default:
                j jVar4 = this.f50366b;
                m mVar2 = this.f50367c;
                if (jVar4.V && !jVar4.f50408b0 && jVar4.f50464x == mVar2 && jVar4.A != null && (sVar = jVar4.f50462w) != null) {
                    try {
                        long j10 = mVar2.A;
                        if (j10 > 0) {
                            sVar.f50564p = j10;
                            sVar.Q = -1L;
                            sVar.R = 0L;
                            sVar.S = -1L;
                            sVar.f50566q = Long.MAX_VALUE;
                            sVar.f50571s0 = true;
                            n nVar2 = jVar4.f50428j;
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
