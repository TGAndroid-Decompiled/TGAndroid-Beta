package uf;

import org.telegram.ui.oy;
public final class e implements Runnable {
    public final int f48580a;
    public final k f48581b;

    public e(k kVar, int i10) {
        this.f48580a = i10;
        this.f48581b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f48580a) {
            case 0:
                for (oy oyVar : this.f48581b.O.f40155b0) {
                    ((f2.j0) oyVar.f39822a.getLayoutManager()).f5822u = false;
                }
                return;
            default:
                this.f48581b.J();
                return;
        }
    }
}
