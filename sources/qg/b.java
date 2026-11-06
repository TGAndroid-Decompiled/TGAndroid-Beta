package qg;

import org.telegram.ui.an;
import org.telegram.ui.v91;
public final class b implements Runnable {
    public final int f54003a;
    public final an f54004b;

    public b(an anVar, int i7) {
        this.f54003a = i7;
        this.f54004b = anVar;
    }

    @Override
    public final void run() {
        switch (this.f54003a) {
            case 0:
                an anVar = this.f54004b;
                if (anVar.getParentLayout() != null) {
                    v91.M0(anVar);
                    return;
                }
                return;
            default:
                this.f54004b.Bc();
                return;
        }
    }
}
