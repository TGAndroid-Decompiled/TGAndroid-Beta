package pg;

import org.telegram.ui.af1;
import org.telegram.ui.un;
public final class b implements Runnable {
    public final int f46850a;
    public final un f46851b;

    public b(un unVar, int i10) {
        this.f46850a = i10;
        this.f46851b = unVar;
    }

    @Override
    public final void run() {
        switch (this.f46850a) {
            case 0:
                un unVar = this.f46851b;
                if (unVar.getParentLayout() != null) {
                    af1.I0(unVar);
                    return;
                }
                return;
            default:
                this.f46851b.kc();
                return;
        }
    }
}
