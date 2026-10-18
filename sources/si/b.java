package si;

import android.os.Handler;
import j$.util.Objects;
import org.telegram.ui.web.a2;
public final class b implements Runnable {
    public final int f46549a;
    public final j f46550b;
    public final l0 f46551c;
    public final long d;

    public b(j jVar, l0 l0Var, long j10, int i10) {
        this.f46549a = i10;
        this.f46550b = jVar;
        this.f46551c = l0Var;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f46549a) {
            case 0:
                j jVar = this.f46550b;
                jVar.f46624c.post(new b(jVar, this.f46551c, this.d, 1));
                return;
            default:
                j jVar2 = this.f46550b;
                l0 l0Var = this.f46551c;
                long j10 = this.d;
                if (jVar2.V && jVar2.G == l0Var) {
                    n nVar = jVar2.f46642j;
                    nVar.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + j.z(j10));
                    s0 s0Var = (s0) jVar2.f46645k.f15842b;
                    Handler handler = s0Var.f46760i;
                    l2.f fVar = s0Var.d;
                    Objects.requireNonNull(fVar);
                    handler.post(new a2(fVar, 27));
                    return;
                }
                return;
        }
    }
}
