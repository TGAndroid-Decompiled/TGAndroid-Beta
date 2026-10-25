package vi;

import android.os.Handler;
public final class d implements Runnable {
    public final int f50362a;
    public final j f50363b;
    public final m f50364c;

    public d(j jVar, m mVar, int i10) {
        this.f50362a = i10;
        this.f50363b = jVar;
        this.f50364c = mVar;
    }

    @Override
    public final void run() {
        s sVar;
        switch (this.f50362a) {
            case 0:
                j jVar = this.f50363b;
                d dVar = new d(jVar, this.f50364c, 3);
                Handler handler = jVar.f50435n;
                if (handler != null) {
                    handler.post(dVar);
                    return;
                }
                return;
            case 1:
                j jVar2 = this.f50363b;
                d dVar2 = new d(jVar2, this.f50364c, 2);
                Handler handler2 = jVar2.f50435n;
                if (handler2 != null) {
                    handler2.post(dVar2);
                    return;
                }
                return;
            case 2:
                j jVar3 = this.f50363b;
                m mVar = this.f50364c;
                if (jVar3.V && !jVar3.f50405b0 && jVar3.f50461x == mVar) {
                    jVar3.k();
                    n nVar = jVar3.f50425j;
                    nVar.b("common A/V start completed: segmentElapsedMs=" + j.z(jVar3.E0));
                    s0 s0Var = (s0) jVar3.f50428k.f17210b;
                    s0Var.f50585i.post(new h0(s0Var, 2));
                    return;
                }
                return;
            default:
                j jVar4 = this.f50363b;
                m mVar2 = this.f50364c;
                if (jVar4.V && !jVar4.f50405b0 && jVar4.f50461x == mVar2 && jVar4.A != null && (sVar = jVar4.f50459w) != null) {
                    try {
                        long j10 = mVar2.A;
                        if (j10 > 0) {
                            sVar.f50561p = j10;
                            sVar.Q = -1L;
                            sVar.R = 0L;
                            sVar.S = -1L;
                            sVar.f50563q = Long.MAX_VALUE;
                            sVar.f50568s0 = true;
                            n nVar2 = jVar4.f50425j;
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
