package zi;

import android.os.Handler;
import j$.util.Objects;
import org.telegram.ui.Components.qf;
public final class b implements Runnable {
    public final int f62081a;
    public final k f62082b;
    public final n0 f62083c;
    public final long d;

    public b(k kVar, n0 n0Var, long j3, int i7) {
        this.f62081a = i7;
        this.f62082b = kVar;
        this.f62083c = n0Var;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f62081a) {
            case 0:
                k kVar = this.f62082b;
                kVar.f62169c.post(new b(kVar, this.f62083c, this.d, 1));
                return;
            default:
                k kVar2 = this.f62082b;
                n0 n0Var = this.f62083c;
                long j3 = this.d;
                if (kVar2.U && kVar2.F == n0Var) {
                    o oVar = kVar2.f62188j;
                    oVar.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + k.z(j3));
                    u0 u0Var = (u0) kVar2.f62191k.f62228a;
                    Handler handler = u0Var.f62362i;
                    qf qfVar = u0Var.d;
                    Objects.requireNonNull(qfVar);
                    handler.post(new v4.p(qfVar, 16));
                    return;
                }
                return;
        }
    }
}
