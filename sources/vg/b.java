package vg;

import org.telegram.messenger.AndroidUtilities;
public final class b implements Runnable {
    public final int f49259a;
    public final d f49260b;

    public b(d dVar, int i10) {
        this.f49259a = i10;
        this.f49260b = dVar;
    }

    @Override
    public final void run() {
        switch (this.f49259a) {
            case 0:
                this.f49260b.a();
                return;
            default:
                d dVar = this.f49260b;
                AndroidUtilities.runOnUIThread(dVar.f49282y, 400L);
                dVar.c();
                return;
        }
    }
}
