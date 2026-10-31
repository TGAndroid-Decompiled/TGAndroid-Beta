package zg;

import org.telegram.messenger.i0;
public final class b implements Runnable {
    public final int f55719a;
    public final d f55720b;

    public b(d dVar, int i10) {
        this.f55719a = i10;
        this.f55720b = dVar;
    }

    @Override
    public final void run() {
        switch (this.f55719a) {
            case 0:
                this.f55720b.a();
                return;
            default:
                d dVar = this.f55720b;
                i0.h3(dVar.D, 400L);
                dVar.c();
                return;
        }
    }
}
