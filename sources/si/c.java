package si;

import android.os.Handler;
import j$.util.Objects;
import org.telegram.ui.web.z1;
public final class c implements Runnable {
    public final int f46580a;
    public final k f46581b;
    public final m0 f46582c;
    public final long d;

    public c(k kVar, m0 m0Var, long j10, int i10) {
        this.f46580a = i10;
        this.f46581b = kVar;
        this.f46582c = m0Var;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f46580a) {
            case 0:
                k kVar = this.f46581b;
                kVar.f46655c.post(new c(kVar, this.f46582c, this.d, 1));
                return;
            default:
                k kVar2 = this.f46581b;
                m0 m0Var = this.f46582c;
                long j10 = this.d;
                if (kVar2.V && kVar2.G == m0Var) {
                    o oVar = kVar2.f46673j;
                    oVar.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + k.z(j10));
                    t0 t0Var = (t0) kVar2.f46676k.f15837b;
                    Handler handler = t0Var.f46791i;
                    l2.f fVar = t0Var.d;
                    Objects.requireNonNull(fVar);
                    handler.post(new z1(fVar, 27));
                    return;
                }
                return;
        }
    }
}
