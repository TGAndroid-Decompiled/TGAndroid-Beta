package vi;

import android.os.Handler;
import j$.util.Objects;
import li.e3;
public final class b implements Runnable {
    public final int f50332a;
    public final j f50333b;
    public final l0 f50334c;
    public final long d;

    public b(j jVar, l0 l0Var, long j10, int i10) {
        this.f50332a = i10;
        this.f50333b = jVar;
        this.f50334c = l0Var;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f50332a) {
            case 0:
                j jVar = this.f50333b;
                jVar.f50407c.post(new b(jVar, this.f50334c, this.d, 1));
                return;
            default:
                j jVar2 = this.f50333b;
                l0 l0Var = this.f50334c;
                long j10 = this.d;
                if (jVar2.V && jVar2.G == l0Var) {
                    n nVar = jVar2.f50425j;
                    nVar.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + j.z(j10));
                    s0 s0Var = (s0) jVar2.f50428k.f17210b;
                    Handler handler = s0Var.f50585i;
                    e3 e3Var = s0Var.d;
                    Objects.requireNonNull(e3Var);
                    handler.post(new ti.g(e3Var, 13));
                    return;
                }
                return;
        }
    }
}
