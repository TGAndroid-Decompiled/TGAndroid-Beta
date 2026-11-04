package wi;

import android.os.Handler;
import j$.util.Objects;
import org.telegram.ui.Components.y00;
public final class b implements Runnable {
    public final int f57785a;
    public final j f57786b;
    public final m0 f57787c;
    public final long d;

    public b(j jVar, m0 m0Var, long j10, int i3) {
        this.f57785a = i3;
        this.f57786b = jVar;
        this.f57787c = m0Var;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f57785a) {
            case 0:
                j jVar = this.f57786b;
                jVar.f57865c.post(new b(jVar, this.f57787c, this.d, 1));
                return;
            default:
                j jVar2 = this.f57786b;
                m0 m0Var = this.f57787c;
                long j10 = this.d;
                if (jVar2.V && jVar2.G == m0Var) {
                    n nVar = jVar2.f57884j;
                    nVar.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + j.z(j10));
                    t0 t0Var = (t0) jVar2.f57887k.f36540b;
                    Handler handler = t0Var.f58060i;
                    y00 y00Var = t0Var.d;
                    Objects.requireNonNull(y00Var);
                    handler.post(new r4.u(y00Var, 29));
                    return;
                }
                return;
        }
    }
}
