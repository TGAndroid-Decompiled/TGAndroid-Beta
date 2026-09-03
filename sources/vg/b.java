package vg;

import org.telegram.messenger.AndroidUtilities;
public final class b implements Runnable {
    public final int f49295a;
    public final d f49296b;

    public b(d dVar, int i10) {
        this.f49295a = i10;
        this.f49296b = dVar;
    }

    @Override
    public final void run() {
        switch (this.f49295a) {
            case 0:
                this.f49296b.a();
                return;
            default:
                d dVar = this.f49296b;
                AndroidUtilities.runOnUIThread(dVar.f49318y, 400L);
                dVar.c();
                return;
        }
    }
}
