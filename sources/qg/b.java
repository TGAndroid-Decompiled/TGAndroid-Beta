package qg;

import org.telegram.messenger.AndroidUtilities;

public final class b implements Runnable {

    public final int f46511a;

    public final d f46512b;

    public b(d dVar, int i10) {
        this.f46511a = i10;
        this.f46512b = dVar;
    }

    @Override
    public final void run() {
        switch (this.f46511a) {
            case 0:
                this.f46512b.a();
                break;
            default:
                d dVar = this.f46512b;
                AndroidUtilities.runOnUIThread(dVar.f46534y, 400L);
                dVar.c();
                break;
        }
    }
}
