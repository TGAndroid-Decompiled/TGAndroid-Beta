package si;

import android.os.Handler;
import j$.util.Objects;
import org.telegram.ui.web.z1;
public final class c implements Runnable {
    public final int f46601a;
    public final k f46602b;
    public final l0 f46603c;
    public final long d;

    public c(k kVar, l0 l0Var, long j10, int i10) {
        this.f46601a = i10;
        this.f46602b = kVar;
        this.f46603c = l0Var;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f46601a) {
            case 0:
                k kVar = this.f46602b;
                kVar.f46682c.post(new c(kVar, this.f46603c, this.d, 1));
                return;
            default:
                k kVar2 = this.f46602b;
                l0 l0Var = this.f46603c;
                long j10 = this.d;
                if (kVar2.V && kVar2.G == l0Var) {
                    o oVar = kVar2.f46700j;
                    oVar.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + k.z(j10));
                    s0 s0Var = (s0) kVar2.f46703k.f15844b;
                    Handler handler = s0Var.f46809i;
                    l2.f fVar = s0Var.d;
                    Objects.requireNonNull(fVar);
                    handler.post(new z1(fVar, 27));
                    return;
                }
                return;
        }
    }
}
