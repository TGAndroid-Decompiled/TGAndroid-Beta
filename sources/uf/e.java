package uf;

import org.telegram.ui.oy;
public final class e implements Runnable {
    public final int f48544a;
    public final k f48545b;

    public e(k kVar, int i10) {
        this.f48544a = i10;
        this.f48545b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f48544a) {
            case 0:
                for (oy oyVar : this.f48545b.O.f40185b0) {
                    ((f2.j0) oyVar.f39866a.getLayoutManager()).f5822u = false;
                }
                return;
            default:
                this.f48545b.J();
                return;
        }
    }
}
