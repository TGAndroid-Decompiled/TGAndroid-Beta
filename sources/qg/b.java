package qg;

import org.telegram.ui.cn;
import org.telegram.ui.z91;
public final class b implements Runnable {
    public final int f54132a;
    public final cn f54133b;

    public b(cn cnVar, int i7) {
        this.f54132a = i7;
        this.f54133b = cnVar;
    }

    @Override
    public final void run() {
        switch (this.f54132a) {
            case 0:
                cn cnVar = this.f54133b;
                if (cnVar.getParentLayout() != null) {
                    z91.M0(cnVar);
                    return;
                }
                return;
            default:
                this.f54133b.Ec();
                return;
        }
    }
}
