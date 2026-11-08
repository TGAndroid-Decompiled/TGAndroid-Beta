package qg;

import org.telegram.ui.an;
import org.telegram.ui.w91;
public final class b implements Runnable {
    public final int f54121a;
    public final an f54122b;

    public b(an anVar, int i7) {
        this.f54121a = i7;
        this.f54122b = anVar;
    }

    @Override
    public final void run() {
        switch (this.f54121a) {
            case 0:
                an anVar = this.f54122b;
                if (anVar.getParentLayout() != null) {
                    w91.M0(anVar);
                    return;
                }
                return;
            default:
                this.f54122b.Bc();
                return;
        }
    }
}
