package si;

import android.os.Handler;
public final class d implements Runnable {
    public final int f47003a;
    public final j f47004b;
    public final m f47005c;

    public d(j jVar, m mVar, int i10) {
        this.f47003a = i10;
        this.f47004b = jVar;
        this.f47005c = mVar;
    }

    @Override
    public final void run() {
        t tVar;
        switch (this.f47003a) {
            case 0:
                j jVar = this.f47004b;
                d dVar = new d(jVar, this.f47005c, 3);
                Handler handler = jVar.f47096n;
                if (handler != null) {
                    handler.post(dVar);
                    return;
                }
                return;
            case 1:
                j jVar2 = this.f47004b;
                d dVar2 = new d(jVar2, this.f47005c, 2);
                Handler handler2 = jVar2.f47096n;
                if (handler2 != null) {
                    handler2.post(dVar2);
                    return;
                }
                return;
            case 2:
                j jVar3 = this.f47004b;
                m mVar = this.f47005c;
                if (jVar3.V && !jVar3.f47066b0 && jVar3.f47122x == mVar) {
                    jVar3.k();
                    n nVar = jVar3.f47086j;
                    nVar.b("common A/V start completed: segmentElapsedMs=" + j.z(jVar3.E0));
                    u0 u0Var = (u0) jVar3.f47089k.f14874b;
                    u0Var.f47254i.post(new j0(u0Var, 2));
                    return;
                }
                return;
            default:
                j jVar4 = this.f47004b;
                m mVar2 = this.f47005c;
                if (jVar4.V && !jVar4.f47066b0 && jVar4.f47122x == mVar2 && jVar4.A != null && (tVar = jVar4.f47120w) != null) {
                    try {
                        long j10 = mVar2.A;
                        if (j10 > 0) {
                            tVar.f47223p = j10;
                            tVar.Q = -1L;
                            tVar.R = 0L;
                            tVar.S = -1L;
                            tVar.f47225q = Long.MAX_VALUE;
                            tVar.f47230s0 = true;
                            n nVar2 = jVar4.f47086j;
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
