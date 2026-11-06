package qg;

import org.telegram.ui.an;
import org.telegram.ui.v91;
public final class b implements Runnable {
    public final int f54028a;
    public final an f54029b;

    public b(an anVar, int i7) {
        this.f54028a = i7;
        this.f54029b = anVar;
    }

    @Override
    public final void run() {
        switch (this.f54028a) {
            case 0:
                an anVar = this.f54029b;
                if (anVar.getParentLayout() != null) {
                    v91.M0(anVar);
                    return;
                }
                return;
            default:
                this.f54029b.Bc();
                return;
        }
    }
}
