package si;

import android.os.Handler;
public final class d implements Runnable {
    public final int f47002a;
    public final j f47003b;
    public final m f47004c;

    public d(j jVar, m mVar, int i10) {
        this.f47002a = i10;
        this.f47003b = jVar;
        this.f47004c = mVar;
    }

    @Override
    public final void run() {
        t tVar;
        switch (this.f47002a) {
            case 0:
                j jVar = this.f47003b;
                d dVar = new d(jVar, this.f47004c, 3);
                Handler handler = jVar.f47095n;
                if (handler != null) {
                    handler.post(dVar);
                    return;
                }
                return;
            case 1:
                j jVar2 = this.f47003b;
                d dVar2 = new d(jVar2, this.f47004c, 2);
                Handler handler2 = jVar2.f47095n;
                if (handler2 != null) {
                    handler2.post(dVar2);
                    return;
                }
                return;
            case 2:
                j jVar3 = this.f47003b;
                m mVar = this.f47004c;
                if (jVar3.V && !jVar3.f47065b0 && jVar3.f47121x == mVar) {
                    jVar3.k();
                    n nVar = jVar3.f47085j;
                    nVar.b("common A/V start completed: segmentElapsedMs=" + j.z(jVar3.E0));
                    u0 u0Var = (u0) jVar3.f47088k.f14874b;
                    u0Var.f47253i.post(new j0(u0Var, 2));
                    return;
                }
                return;
            default:
                j jVar4 = this.f47003b;
                m mVar2 = this.f47004c;
                if (jVar4.V && !jVar4.f47065b0 && jVar4.f47121x == mVar2 && jVar4.A != null && (tVar = jVar4.f47119w) != null) {
                    try {
                        long j10 = mVar2.A;
                        if (j10 > 0) {
                            tVar.f47222p = j10;
                            tVar.Q = -1L;
                            tVar.R = 0L;
                            tVar.S = -1L;
                            tVar.f47224q = Long.MAX_VALUE;
                            tVar.f47229s0 = true;
                            n nVar2 = jVar4.f47085j;
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
