package qg;

import org.telegram.ui.cn;
import org.telegram.ui.y91;
public final class b implements Runnable {
    public final int f54133a;
    public final cn f54134b;

    public b(cn cnVar, int i7) {
        this.f54133a = i7;
        this.f54134b = cnVar;
    }

    @Override
    public final void run() {
        switch (this.f54133a) {
            case 0:
                cn cnVar = this.f54134b;
                if (cnVar.getParentLayout() != null) {
                    y91.M0(cnVar);
                    return;
                }
                return;
            default:
                this.f54134b.Ec();
                return;
        }
    }
}
