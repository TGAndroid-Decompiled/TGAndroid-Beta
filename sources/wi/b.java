package wi;

import android.os.Handler;
import j$.util.Objects;
import org.telegram.ui.Components.qt;
public final class b implements Runnable {
    public final int f57825a;
    public final j f57826b;
    public final m0 f57827c;
    public final long d;

    public b(j jVar, m0 m0Var, long j3, int i7) {
        this.f57825a = i7;
        this.f57826b = jVar;
        this.f57827c = m0Var;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f57825a) {
            case 0:
                j jVar = this.f57826b;
                jVar.f57907c.post(new b(jVar, this.f57827c, this.d, 1));
                return;
            default:
                j jVar2 = this.f57826b;
                m0 m0Var = this.f57827c;
                long j3 = this.d;
                if (jVar2.V && jVar2.G == m0Var) {
                    n nVar = jVar2.f57926j;
                    nVar.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + j.z(j3));
                    t0 t0Var = (t0) jVar2.f57929k.f37394b;
                    Handler handler = t0Var.f58105i;
                    qt qtVar = t0Var.d;
                    Objects.requireNonNull(qtVar);
                    handler.post(new wg.p(qtVar, 3));
                    return;
                }
                return;
        }
    }
}
