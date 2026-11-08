package wi;

import android.os.Handler;
import j$.util.Objects;
import org.telegram.ui.Components.rt;
public final class b implements Runnable {
    public final int f57916a;
    public final k f57917b;
    public final m0 f57918c;
    public final long d;

    public b(k kVar, m0 m0Var, long j3, int i7) {
        this.f57916a = i7;
        this.f57917b = kVar;
        this.f57918c = m0Var;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f57916a) {
            case 0:
                k kVar = this.f57917b;
                kVar.f58006c.post(new b(kVar, this.f57918c, this.d, 1));
                return;
            default:
                k kVar2 = this.f57917b;
                m0 m0Var = this.f57918c;
                long j3 = this.d;
                if (kVar2.V && kVar2.G == m0Var) {
                    o oVar = kVar2.f58025j;
                    oVar.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + k.A(j3));
                    t0 t0Var = (t0) kVar2.f58028k.f37758b;
                    Handler handler = t0Var.f58199i;
                    rt rtVar = t0Var.d;
                    Objects.requireNonNull(rtVar);
                    handler.post(new wg.p(rtVar, 3));
                    return;
                }
                return;
        }
    }
}
