package wi;

import android.os.Handler;
import j$.util.Objects;
import org.telegram.ui.Components.qt;
public final class b implements Runnable {
    public final int f57824a;
    public final j f57825b;
    public final m0 f57826c;
    public final long d;

    public b(j jVar, m0 m0Var, long j3, int i7) {
        this.f57824a = i7;
        this.f57825b = jVar;
        this.f57826c = m0Var;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f57824a) {
            case 0:
                j jVar = this.f57825b;
                jVar.f57906c.post(new b(jVar, this.f57826c, this.d, 1));
                return;
            default:
                j jVar2 = this.f57825b;
                m0 m0Var = this.f57826c;
                long j3 = this.d;
                if (jVar2.V && jVar2.G == m0Var) {
                    n nVar = jVar2.f57925j;
                    nVar.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + j.z(j3));
                    t0 t0Var = (t0) jVar2.f57928k.f37389b;
                    Handler handler = t0Var.f58104i;
                    qt qtVar = t0Var.d;
                    Objects.requireNonNull(qtVar);
                    handler.post(new wg.p(qtVar, 3));
                    return;
                }
                return;
        }
    }
}
