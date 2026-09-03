package ug;

import org.telegram.messenger.AndroidUtilities;
public final class b implements Runnable {
    public final int f45559a;
    public final d f45560b;

    public b(d dVar, int i10) {
        this.f45559a = i10;
        this.f45560b = dVar;
    }

    @Override
    public final void run() {
        switch (this.f45559a) {
            case 0:
                this.f45560b.a();
                return;
            default:
                d dVar = this.f45560b;
                AndroidUtilities.runOnUIThread(dVar.f45580y, 400L);
                dVar.c();
                return;
        }
    }
}
