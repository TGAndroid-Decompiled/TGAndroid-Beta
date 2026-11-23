package zi;

import android.os.Handler;
import j$.util.Objects;
import org.telegram.ui.Components.pf;
public final class b implements Runnable {
    public final int f62046a;
    public final k f62047b;
    public final n0 f62048c;
    public final long d;

    public b(k kVar, n0 n0Var, long j3, int i7) {
        this.f62046a = i7;
        this.f62047b = kVar;
        this.f62048c = n0Var;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f62046a) {
            case 0:
                k kVar = this.f62047b;
                kVar.f62134c.post(new b(kVar, this.f62048c, this.d, 1));
                return;
            default:
                k kVar2 = this.f62047b;
                n0 n0Var = this.f62048c;
                long j3 = this.d;
                if (kVar2.U && kVar2.F == n0Var) {
                    o oVar = kVar2.f62153j;
                    oVar.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + k.z(j3));
                    u0 u0Var = (u0) kVar2.f62156k.f62193a;
                    Handler handler = u0Var.f62327i;
                    pf pfVar = u0Var.d;
                    Objects.requireNonNull(pfVar);
                    handler.post(new vg.d(pfVar, 15));
                    return;
                }
                return;
        }
    }
}
