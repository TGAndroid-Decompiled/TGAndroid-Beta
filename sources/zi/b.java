package zi;

import android.os.Handler;
import j$.util.Objects;
import org.telegram.ui.Components.of;
public final class b implements Runnable {
    public final int f62035a;
    public final k f62036b;
    public final n0 f62037c;
    public final long d;

    public b(k kVar, n0 n0Var, long j3, int i7) {
        this.f62035a = i7;
        this.f62036b = kVar;
        this.f62037c = n0Var;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f62035a) {
            case 0:
                k kVar = this.f62036b;
                kVar.f62123c.post(new b(kVar, this.f62037c, this.d, 1));
                return;
            default:
                k kVar2 = this.f62036b;
                n0 n0Var = this.f62037c;
                long j3 = this.d;
                if (kVar2.U && kVar2.F == n0Var) {
                    o oVar = kVar2.f62142j;
                    oVar.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + k.z(j3));
                    u0 u0Var = (u0) kVar2.f62145k.f62182a;
                    Handler handler = u0Var.f62316i;
                    of ofVar = u0Var.d;
                    Objects.requireNonNull(ofVar);
                    handler.post(new v4.p(ofVar, 16));
                    return;
                }
                return;
        }
    }
}
