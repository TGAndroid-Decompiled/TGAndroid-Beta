package vi;

import android.os.Handler;
public final class d implements Runnable {
    public final int f50381a;
    public final j f50382b;
    public final m f50383c;

    public d(j jVar, m mVar, int i10) {
        this.f50381a = i10;
        this.f50382b = jVar;
        this.f50383c = mVar;
    }

    @Override
    public final void run() {
        s sVar;
        switch (this.f50381a) {
            case 0:
                j jVar = this.f50382b;
                d dVar = new d(jVar, this.f50383c, 3);
                Handler handler = jVar.f50473n;
                if (handler != null) {
                    handler.post(dVar);
                    return;
                }
                return;
            case 1:
                j jVar2 = this.f50382b;
                d dVar2 = new d(jVar2, this.f50383c, 2);
                Handler handler2 = jVar2.f50473n;
                if (handler2 != null) {
                    handler2.post(dVar2);
                    return;
                }
                return;
            case 2:
                j jVar3 = this.f50382b;
                m mVar = this.f50383c;
                if (jVar3.V && !jVar3.f50443b0 && jVar3.f50500x == mVar) {
                    jVar3.k();
                    if (jVar3.f50461i0 == 0) {
                        jVar3.f50461i0 = mVar.e;
                    }
                    n nVar = jVar3.f50463j;
                    nVar.b("common A/V start completed: segmentElapsedMs=" + j.z(jVar3.F0));
                    u0 u0Var = (u0) jVar3.f50466k.f17209b;
                    u0Var.f50639i.post(new i0(u0Var, 2));
                    return;
                }
                return;
            default:
                j jVar4 = this.f50382b;
                m mVar2 = this.f50383c;
                if (jVar4.V && !jVar4.f50443b0 && jVar4.f50500x == mVar2 && jVar4.A != null && (sVar = jVar4.f50498w) != null) {
                    try {
                        long j10 = mVar2.F;
                        if (j10 > 0) {
                            sVar.f50603p = j10;
                            sVar.Q = -1L;
                            sVar.R = 0L;
                            sVar.S = -1L;
                            sVar.f50605q = Long.MAX_VALUE;
                            sVar.f50610s0 = true;
                            n nVar2 = jVar4.f50463j;
                            nVar2.b("common A/V start armed; waiting for next camera frame: segmentElapsedMs=" + j.z(jVar4.F0));
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
