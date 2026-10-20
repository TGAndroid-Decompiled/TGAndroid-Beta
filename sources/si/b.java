package si;

import android.os.Handler;
import j$.util.Objects;
import org.telegram.ui.web.z1;
public final class b implements Runnable {
    public final int f46556a;
    public final j f46557b;
    public final l0 f46558c;
    public final long d;

    public b(j jVar, l0 l0Var, long j10, int i10) {
        this.f46556a = i10;
        this.f46557b = jVar;
        this.f46558c = l0Var;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f46556a) {
            case 0:
                j jVar = this.f46557b;
                jVar.f46631c.post(new b(jVar, this.f46558c, this.d, 1));
                return;
            default:
                j jVar2 = this.f46557b;
                l0 l0Var = this.f46558c;
                long j10 = this.d;
                if (jVar2.V && jVar2.G == l0Var) {
                    n nVar = jVar2.f46649j;
                    nVar.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + j.z(j10));
                    s0 s0Var = (s0) jVar2.f46652k.f14830b;
                    Handler handler = s0Var.f46767i;
                    l2.f fVar = s0Var.d;
                    Objects.requireNonNull(fVar);
                    handler.post(new z1(fVar, 27));
                    return;
                }
                return;
        }
    }
}
