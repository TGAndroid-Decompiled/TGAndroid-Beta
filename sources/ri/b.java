package ri;

import android.os.Handler;
import j$.util.Objects;
public final class b implements Runnable {
    public final int f44477a;
    public final j f44478b;
    public final k0 f44479c;
    public final long d;

    public b(j jVar, k0 k0Var, long j10, int i10) {
        this.f44477a = i10;
        this.f44478b = jVar;
        this.f44479c = k0Var;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f44477a) {
            case 0:
                j jVar = this.f44478b;
                jVar.f44556c.post(new b(jVar, this.f44479c, this.d, 1));
                return;
            default:
                j jVar2 = this.f44478b;
                k0 k0Var = this.f44479c;
                long j10 = this.d;
                if (jVar2.V && jVar2.G == k0Var) {
                    n nVar = jVar2.f44574j;
                    nVar.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + j.z(j10));
                    r0 r0Var = (r0) jVar2.f44577k.f14848b;
                    Handler handler = r0Var.f44680i;
                    m.h hVar = r0Var.d;
                    Objects.requireNonNull(hVar);
                    handler.post(new h0(hVar, 0));
                    return;
                }
                return;
        }
    }
}
