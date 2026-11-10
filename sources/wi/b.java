package wi;

import android.os.Handler;
import j$.util.Objects;
import org.telegram.ui.Components.qt;
public final class b implements Runnable {
    public final int f57933a;
    public final k f57934b;
    public final m0 f57935c;
    public final long d;

    public b(k kVar, m0 m0Var, long j3, int i7) {
        this.f57933a = i7;
        this.f57934b = kVar;
        this.f57935c = m0Var;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f57933a) {
            case 0:
                k kVar = this.f57934b;
                kVar.f58021c.post(new b(kVar, this.f57935c, this.d, 1));
                return;
            default:
                k kVar2 = this.f57934b;
                m0 m0Var = this.f57935c;
                long j3 = this.d;
                if (kVar2.U && kVar2.F == m0Var) {
                    o oVar = kVar2.f58040j;
                    oVar.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + k.z(j3));
                    t0 t0Var = (t0) kVar2.f58043k.f37395b;
                    Handler handler = t0Var.f58213i;
                    qt qtVar = t0Var.d;
                    Objects.requireNonNull(qtVar);
                    handler.post(new wg.a0(qtVar, 1));
                    return;
                }
                return;
        }
    }
}
