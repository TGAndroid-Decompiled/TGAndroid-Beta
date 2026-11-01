package zg;

import org.telegram.messenger.i0;
public final class b implements Runnable {
    public final int f55737a;
    public final d f55738b;

    public b(d dVar, int i10) {
        this.f55737a = i10;
        this.f55738b = dVar;
    }

    @Override
    public final void run() {
        switch (this.f55737a) {
            case 0:
                this.f55738b.a();
                return;
            default:
                d dVar = this.f55738b;
                i0.h3(dVar.D, 400L);
                dVar.c();
                return;
        }
    }
}
