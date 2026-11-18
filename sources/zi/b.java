package zi;

import android.os.Handler;
import j$.util.Objects;
import org.telegram.ui.Components.of;
public final class b implements Runnable {
    public final int f62036a;
    public final k f62037b;
    public final n0 f62038c;
    public final long d;

    public b(k kVar, n0 n0Var, long j3, int i7) {
        this.f62036a = i7;
        this.f62037b = kVar;
        this.f62038c = n0Var;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f62036a) {
            case 0:
                k kVar = this.f62037b;
                kVar.f62124c.post(new b(kVar, this.f62038c, this.d, 1));
                return;
            default:
                k kVar2 = this.f62037b;
                n0 n0Var = this.f62038c;
                long j3 = this.d;
                if (kVar2.U && kVar2.F == n0Var) {
                    o oVar = kVar2.f62143j;
                    oVar.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + k.z(j3));
                    u0 u0Var = (u0) kVar2.f62146k.f62183a;
                    Handler handler = u0Var.f62317i;
                    of ofVar = u0Var.d;
                    Objects.requireNonNull(ofVar);
                    handler.post(new v4.p(ofVar, 16));
                    return;
                }
                return;
        }
    }
}
