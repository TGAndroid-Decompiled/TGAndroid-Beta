package wi;

import android.os.Handler;
import j$.util.Objects;
import org.telegram.ui.Components.rt;
public final class b implements Runnable {
    public final int f57929a;
    public final k f57930b;
    public final m0 f57931c;
    public final long d;

    public b(k kVar, m0 m0Var, long j3, int i7) {
        this.f57929a = i7;
        this.f57930b = kVar;
        this.f57931c = m0Var;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f57929a) {
            case 0:
                k kVar = this.f57930b;
                kVar.f58017c.post(new b(kVar, this.f57931c, this.d, 1));
                return;
            default:
                k kVar2 = this.f57930b;
                m0 m0Var = this.f57931c;
                long j3 = this.d;
                if (kVar2.U && kVar2.F == m0Var) {
                    o oVar = kVar2.f58036j;
                    oVar.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + k.z(j3));
                    t0 t0Var = (t0) kVar2.f58039k.f37805b;
                    Handler handler = t0Var.f58209i;
                    rt rtVar = t0Var.d;
                    Objects.requireNonNull(rtVar);
                    handler.post(new wg.a0(rtVar, 1));
                    return;
                }
                return;
        }
    }
}
