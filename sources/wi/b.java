package wi;

import android.os.Handler;
import j$.util.Objects;
import org.telegram.ui.Components.qt;
public final class b implements Runnable {
    public final int f57822a;
    public final k f57823b;
    public final n0 f57824c;
    public final long d;

    public b(k kVar, n0 n0Var, long j3, int i7) {
        this.f57822a = i7;
        this.f57823b = kVar;
        this.f57824c = n0Var;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f57822a) {
            case 0:
                k kVar = this.f57823b;
                kVar.f57911c.post(new b(kVar, this.f57824c, this.d, 1));
                return;
            default:
                k kVar2 = this.f57823b;
                n0 n0Var = this.f57824c;
                long j3 = this.d;
                if (kVar2.V && kVar2.G == n0Var) {
                    o oVar = kVar2.f57930j;
                    oVar.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + k.A(j3));
                    u0 u0Var = (u0) kVar2.f57933k.f37389b;
                    Handler handler = u0Var.f58110i;
                    qt qtVar = u0Var.d;
                    Objects.requireNonNull(qtVar);
                    handler.post(new wg.p(qtVar, 3));
                    return;
                }
                return;
        }
    }
}
