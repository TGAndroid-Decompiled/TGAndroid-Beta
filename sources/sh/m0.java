package sh;

import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.z4;
import vh.y1;
public final class m0 implements Runnable {
    public final int f44370a;
    public final long f44371b;
    public final Object f44372c;

    public m0(Object obj, long j10, int i10) {
        this.f44370a = i10;
        this.f44372c = obj;
        this.f44371b = j10;
    }

    @Override
    public final void run() {
        switch (this.f44370a) {
            case 0:
                o0 o0Var = (o0) this.f44372c;
                o0Var.f44389i = null;
                o0Var.f44388g.l(this.f44371b);
                o0Var.f44392l++;
                o0Var.a();
                n0 n0Var = o0Var.h;
                if (n0Var != null) {
                    n0Var.d();
                    return;
                }
                return;
            case 1:
                vh.p pVar = (vh.p) this.f44372c;
                z4.M(pVar.f24278b.f26689c0.getParentActivity(), this.f44371b, new o2.o(pVar, 29), pVar.f24277a);
                return;
            default:
                y1 y1Var = (y1) this.f44372c;
                z4.M(y1Var.getParentActivity(), this.f44371b, new qk0(y1Var, 18), y1Var.getResourceProvider());
                return;
        }
    }
}
