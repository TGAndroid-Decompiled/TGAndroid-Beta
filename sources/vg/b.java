package vg;

import org.telegram.messenger.AndroidUtilities;
public final class b implements Runnable {
    public final int f49258a;
    public final d f49259b;

    public b(d dVar, int i10) {
        this.f49258a = i10;
        this.f49259b = dVar;
    }

    @Override
    public final void run() {
        switch (this.f49258a) {
            case 0:
                this.f49259b.a();
                return;
            default:
                d dVar = this.f49259b;
                AndroidUtilities.runOnUIThread(dVar.f49281y, 400L);
                dVar.c();
                return;
        }
    }
}
