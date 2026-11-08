package wi;

import android.os.Handler;
import j$.util.Objects;
import org.telegram.ui.Components.rt;
public final class b implements Runnable {
    public final int f57917a;
    public final k f57918b;
    public final m0 f57919c;
    public final long d;

    public b(k kVar, m0 m0Var, long j3, int i7) {
        this.f57917a = i7;
        this.f57918b = kVar;
        this.f57919c = m0Var;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f57917a) {
            case 0:
                k kVar = this.f57918b;
                kVar.f58007c.post(new b(kVar, this.f57919c, this.d, 1));
                return;
            default:
                k kVar2 = this.f57918b;
                m0 m0Var = this.f57919c;
                long j3 = this.d;
                if (kVar2.V && kVar2.G == m0Var) {
                    o oVar = kVar2.f58026j;
                    oVar.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + k.A(j3));
                    t0 t0Var = (t0) kVar2.f58029k.f37758b;
                    Handler handler = t0Var.f58200i;
                    rt rtVar = t0Var.d;
                    Objects.requireNonNull(rtVar);
                    handler.post(new wg.p(rtVar, 3));
                    return;
                }
                return;
        }
    }
}
