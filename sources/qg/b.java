package qg;

import org.telegram.ui.an;
import org.telegram.ui.v91;
public final class b implements Runnable {
    public final int f54027a;
    public final an f54028b;

    public b(an anVar, int i7) {
        this.f54027a = i7;
        this.f54028b = anVar;
    }

    @Override
    public final void run() {
        switch (this.f54027a) {
            case 0:
                an anVar = this.f54028b;
                if (anVar.getParentLayout() != null) {
                    v91.M0(anVar);
                    return;
                }
                return;
            default:
                this.f54028b.Bc();
                return;
        }
    }
}
