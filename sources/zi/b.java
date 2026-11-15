package zi;

import android.os.Handler;
import j$.util.Objects;
import org.telegram.ui.Components.ff;
public final class b implements Runnable {
    public final int f61467a;
    public final l f61468b;
    public final n0 f61469c;
    public final long d;

    public b(l lVar, n0 n0Var, long j3, int i7) {
        this.f61467a = i7;
        this.f61468b = lVar;
        this.f61469c = n0Var;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f61467a) {
            case 0:
                l lVar = this.f61468b;
                lVar.f61560c.post(new b(lVar, this.f61469c, this.d, 1));
                return;
            default:
                l lVar2 = this.f61468b;
                n0 n0Var = this.f61469c;
                long j3 = this.d;
                if (lVar2.U && lVar2.F == n0Var) {
                    p pVar = lVar2.f61579j;
                    pVar.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + l.z(j3));
                    v0 v0Var = (v0) lVar2.f61582k.f57880a;
                    Handler handler = v0Var.f61752i;
                    ff ffVar = v0Var.d;
                    Objects.requireNonNull(ffVar);
                    handler.post(new vg.o(ffVar, 14));
                    return;
                }
                return;
        }
    }
}
