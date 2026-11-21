package zi;

import android.os.Handler;
import j$.util.Objects;
import org.telegram.ui.Components.qf;
public final class b implements Runnable {
    public final int f62077a;
    public final k f62078b;
    public final n0 f62079c;
    public final long d;

    public b(k kVar, n0 n0Var, long j3, int i7) {
        this.f62077a = i7;
        this.f62078b = kVar;
        this.f62079c = n0Var;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f62077a) {
            case 0:
                k kVar = this.f62078b;
                kVar.f62165c.post(new b(kVar, this.f62079c, this.d, 1));
                return;
            default:
                k kVar2 = this.f62078b;
                n0 n0Var = this.f62079c;
                long j3 = this.d;
                if (kVar2.U && kVar2.F == n0Var) {
                    o oVar = kVar2.f62184j;
                    oVar.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + k.z(j3));
                    u0 u0Var = (u0) kVar2.f62187k.f62224a;
                    Handler handler = u0Var.f62358i;
                    qf qfVar = u0Var.d;
                    Objects.requireNonNull(qfVar);
                    handler.post(new v4.p(qfVar, 16));
                    return;
                }
                return;
        }
    }
}
