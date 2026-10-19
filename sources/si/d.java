package si;

import android.os.Handler;
public final class d implements Runnable {
    public final int f46560a;
    public final j f46561b;
    public final m f46562c;

    public d(j jVar, m mVar, int i10) {
        this.f46560a = i10;
        this.f46561b = jVar;
        this.f46562c = mVar;
    }

    @Override
    public final void run() {
        t tVar;
        switch (this.f46560a) {
            case 0:
                j jVar = this.f46561b;
                d dVar = new d(jVar, this.f46562c, 3);
                Handler handler = jVar.f46652n;
                if (handler != null) {
                    handler.post(dVar);
                    return;
                }
                return;
            case 1:
                j jVar2 = this.f46561b;
                d dVar2 = new d(jVar2, this.f46562c, 2);
                Handler handler2 = jVar2.f46652n;
                if (handler2 != null) {
                    handler2.post(dVar2);
                    return;
                }
                return;
            case 2:
                j jVar3 = this.f46561b;
                m mVar = this.f46562c;
                if (jVar3.V && !jVar3.f46622b0 && jVar3.f46678x == mVar) {
                    jVar3.k();
                    n nVar = jVar3.f46642j;
                    nVar.b("common A/V start completed: segmentElapsedMs=" + j.z(jVar3.E0));
                    s0 s0Var = (s0) jVar3.f46645k.f14832b;
                    s0Var.f46760i.post(new i0(s0Var, 2));
                    return;
                }
                return;
            default:
                j jVar4 = this.f46561b;
                m mVar2 = this.f46562c;
                if (jVar4.V && !jVar4.f46622b0 && jVar4.f46678x == mVar2 && jVar4.A != null && (tVar = jVar4.f46676w) != null) {
                    try {
                        long j10 = mVar2.A;
                        if (j10 > 0) {
                            tVar.f46803p = j10;
                            tVar.Q = -1L;
                            tVar.R = 0L;
                            tVar.S = -1L;
                            tVar.f46805q = Long.MAX_VALUE;
                            tVar.f46810s0 = true;
                            n nVar2 = jVar4.f46642j;
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
