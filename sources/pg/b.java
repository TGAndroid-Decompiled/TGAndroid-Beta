package pg;

import org.telegram.ui.af1;
import org.telegram.ui.un;
public final class b implements Runnable {
    public final int f46847a;
    public final un f46848b;

    public b(un unVar, int i10) {
        this.f46847a = i10;
        this.f46848b = unVar;
    }

    @Override
    public final void run() {
        switch (this.f46847a) {
            case 0:
                un unVar = this.f46848b;
                if (unVar.getParentLayout() != null) {
                    af1.I0(unVar);
                    return;
                }
                return;
            default:
                this.f46848b.kc();
                return;
        }
    }
}
