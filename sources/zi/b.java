package zi;

import android.os.Handler;
import j$.util.Objects;
import org.telegram.ui.Cells.aa;
import ug.u1;
public final class b implements Runnable {
    public final int f62164a;
    public final k f62165b;
    public final n0 f62166c;
    public final long d;

    public b(k kVar, n0 n0Var, long j3, int i7) {
        this.f62164a = i7;
        this.f62165b = kVar;
        this.f62166c = n0Var;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f62164a) {
            case 0:
                k kVar = this.f62165b;
                kVar.f62252c.post(new b(kVar, this.f62166c, this.d, 1));
                return;
            default:
                k kVar2 = this.f62165b;
                n0 n0Var = this.f62166c;
                long j3 = this.d;
                if (kVar2.U && kVar2.F == n0Var) {
                    o oVar = kVar2.f62271j;
                    oVar.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + k.z(j3));
                    u0 u0Var = (u0) kVar2.f62274k.f60952a;
                    Handler handler = u0Var.f62447i;
                    aa aaVar = u0Var.d;
                    Objects.requireNonNull(aaVar);
                    handler.post(new u1(aaVar, 17));
                    return;
                }
                return;
        }
    }
}
