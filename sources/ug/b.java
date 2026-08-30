package ug;

import org.telegram.messenger.AndroidUtilities;
public final class b implements Runnable {
    public final int f45495a;
    public final d f45496b;

    public b(d dVar, int i10) {
        this.f45495a = i10;
        this.f45496b = dVar;
    }

    @Override
    public final void run() {
        switch (this.f45495a) {
            case 0:
                this.f45496b.a();
                return;
            default:
                d dVar = this.f45496b;
                AndroidUtilities.runOnUIThread(dVar.f45516y, 400L);
                dVar.c();
                return;
        }
    }
}
