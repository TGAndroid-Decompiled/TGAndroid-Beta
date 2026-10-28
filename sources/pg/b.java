package pg;

import org.telegram.ui.cf1;
import org.telegram.ui.wn;
public final class b implements Runnable {
    public final int f46885a;
    public final wn f46886b;

    public b(wn wnVar, int i10) {
        this.f46885a = i10;
        this.f46886b = wnVar;
    }

    @Override
    public final void run() {
        switch (this.f46885a) {
            case 0:
                wn wnVar = this.f46886b;
                if (wnVar.getParentLayout() != null) {
                    cf1.I0(wnVar);
                    return;
                }
                return;
            default:
                this.f46886b.oc();
                return;
        }
    }
}
