package si;

import android.os.Handler;
import j$.util.Objects;
import org.telegram.ui.web.a2;
public final class b implements Runnable {
    public final int f46991a;
    public final j f46992b;
    public final m0 f46993c;
    public final long d;

    public b(j jVar, m0 m0Var, long j10, int i10) {
        this.f46991a = i10;
        this.f46992b = jVar;
        this.f46993c = m0Var;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f46991a) {
            case 0:
                j jVar = this.f46992b;
                jVar.f47067c.post(new b(jVar, this.f46993c, this.d, 1));
                return;
            default:
                j jVar2 = this.f46992b;
                m0 m0Var = this.f46993c;
                long j10 = this.d;
                if (jVar2.V && jVar2.G == m0Var) {
                    n nVar = jVar2.f47085j;
                    nVar.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + j.z(j10));
                    u0 u0Var = (u0) jVar2.f47088k.f14874b;
                    Handler handler = u0Var.f47253i;
                    l2.f fVar = u0Var.d;
                    Objects.requireNonNull(fVar);
                    handler.post(new a2(fVar, 27));
                    return;
                }
                return;
        }
    }
}
