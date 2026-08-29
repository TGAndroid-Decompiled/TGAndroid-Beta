package rf;

import org.telegram.ui.ey;
public final class f implements Runnable {
    public final int f47218a;
    public final l f47219b;

    public f(l lVar, int i10) {
        this.f47218a = i10;
        this.f47219b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f47218a) {
            case 0:
                for (ey eyVar : this.f47219b.N.f38256a0) {
                    ((f2.j0) eyVar.f37921a.getLayoutManager()).f6368u = false;
                }
                return;
            default:
                this.f47219b.J();
                return;
        }
    }
}
