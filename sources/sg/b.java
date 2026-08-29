package sg;

import org.telegram.messenger.AndroidUtilities;
public final class b implements Runnable {
    public final int f48023a;
    public final d f48024b;

    public b(d dVar, int i10) {
        this.f48023a = i10;
        this.f48024b = dVar;
    }

    @Override
    public final void run() {
        switch (this.f48023a) {
            case 0:
                this.f48024b.a();
                return;
            default:
                d dVar = this.f48024b;
                AndroidUtilities.runOnUIThread(dVar.f48046y, 400L);
                dVar.c();
                return;
        }
    }
}
