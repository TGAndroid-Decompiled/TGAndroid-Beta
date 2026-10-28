package vi;

import android.os.Handler;
import j$.util.Objects;
import li.e3;
public final class b implements Runnable {
    public final int f50369a;
    public final j f50370b;
    public final n0 f50371c;
    public final long d;

    public b(j jVar, n0 n0Var, long j10, int i10) {
        this.f50369a = i10;
        this.f50370b = jVar;
        this.f50371c = n0Var;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f50369a) {
            case 0:
                j jVar = this.f50370b;
                jVar.f50445c.post(new b(jVar, this.f50371c, this.d, 1));
                return;
            default:
                j jVar2 = this.f50370b;
                n0 n0Var = this.f50371c;
                long j10 = this.d;
                if (jVar2.V && jVar2.G == n0Var) {
                    n nVar = jVar2.f50463j;
                    nVar.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + j.z(j10));
                    u0 u0Var = (u0) jVar2.f50466k.f17209b;
                    Handler handler = u0Var.f50639i;
                    e3 e3Var = u0Var.d;
                    Objects.requireNonNull(e3Var);
                    handler.post(new ti.g(e3Var, 13));
                    return;
                }
                return;
        }
    }
}
