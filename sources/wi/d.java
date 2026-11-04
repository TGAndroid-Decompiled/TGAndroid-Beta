package wi;

import android.os.Handler;
public final class d implements Runnable {
    public final int f57818a;
    public final j f57819b;
    public final m f57820c;

    public d(j jVar, m mVar, int i3) {
        this.f57818a = i3;
        this.f57819b = jVar;
        this.f57820c = mVar;
    }

    @Override
    public final void run() {
        s sVar;
        switch (this.f57818a) {
            case 0:
                j jVar = this.f57819b;
                d dVar = new d(jVar, this.f57820c, 3);
                Handler handler = jVar.f57893n;
                if (handler != null) {
                    handler.post(dVar);
                    return;
                }
                return;
            case 1:
                j jVar2 = this.f57819b;
                d dVar2 = new d(jVar2, this.f57820c, 2);
                Handler handler2 = jVar2.f57893n;
                if (handler2 != null) {
                    handler2.post(dVar2);
                    return;
                }
                return;
            case 2:
                j jVar3 = this.f57819b;
                m mVar = this.f57820c;
                if (jVar3.V && !jVar3.f57863b0 && jVar3.f57920x == mVar) {
                    jVar3.k();
                    if (jVar3.f57882i0 == 0) {
                        jVar3.f57882i0 = mVar.f57953e;
                    }
                    n nVar = jVar3.f57884j;
                    nVar.b("common A/V start completed: segmentElapsedMs=" + j.z(jVar3.F0));
                    t0 t0Var = (t0) jVar3.f57887k.f36540b;
                    t0Var.f58060i.post(new h0(t0Var, 2));
                    return;
                }
                return;
            default:
                j jVar4 = this.f57819b;
                m mVar2 = this.f57820c;
                if (jVar4.V && !jVar4.f57863b0 && jVar4.f57920x == mVar2 && jVar4.A != null && (sVar = jVar4.f57918w) != null) {
                    try {
                        long j10 = mVar2.F;
                        if (j10 > 0) {
                            sVar.f58028p = j10;
                            sVar.Q = -1L;
                            sVar.R = 0L;
                            sVar.S = -1L;
                            sVar.f58030q = Long.MAX_VALUE;
                            sVar.f58035s0 = true;
                            n nVar2 = jVar4.f57884j;
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
