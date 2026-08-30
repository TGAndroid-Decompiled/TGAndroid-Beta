package uf;

import org.telegram.messenger.AndroidUtilities;
public final class g implements Runnable {
    public final int f45307a;
    public final k f45308b;

    public g(k kVar, int i10) {
        this.f45307a = i10;
        this.f45308b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f45307a) {
            case 0:
                k.Y(this.f45308b);
                return;
            case 1:
                k.Z(this.f45308b);
                return;
            default:
                g gVar = this.f45308b.d;
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar, 5000L);
                return;
        }
    }
}
