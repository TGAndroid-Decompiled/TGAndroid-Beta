package pg;

import org.telegram.messenger.AndroidUtilities;
public final class b implements Runnable {
    public final int f45843a;
    public final d f45844b;

    public b(d dVar, int i9) {
        this.f45843a = i9;
        this.f45844b = dVar;
    }

    @Override
    public final void run() {
        switch (this.f45843a) {
            case 0:
                this.f45844b.a();
                return;
            default:
                d dVar = this.f45844b;
                AndroidUtilities.runOnUIThread(dVar.f45866y, 400L);
                dVar.c();
                return;
        }
    }
}
