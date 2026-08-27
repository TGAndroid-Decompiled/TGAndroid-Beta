package pf;

import org.telegram.ui.fy;

public final class e implements Runnable {

    public final int f45777a;

    public final k f45778b;

    public e(k kVar, int i10) {
        this.f45777a = i10;
        this.f45778b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f45777a) {
            case 0:
                for (fy fyVar : this.f45778b.N.f38498a0) {
                    ((f2.k0) fyVar.f38225a.getLayoutManager()).f5726u = false;
                }
                break;
            default:
                this.f45778b.J();
                break;
        }
    }
}
