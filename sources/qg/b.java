package qg;

import org.telegram.ui.an;
import org.telegram.ui.w91;
public final class b implements Runnable {
    public final int f54120a;
    public final an f54121b;

    public b(an anVar, int i7) {
        this.f54120a = i7;
        this.f54121b = anVar;
    }

    @Override
    public final void run() {
        switch (this.f54120a) {
            case 0:
                an anVar = this.f54121b;
                if (anVar.getParentLayout() != null) {
                    w91.M0(anVar);
                    return;
                }
                return;
            default:
                this.f54121b.Bc();
                return;
        }
    }
}
