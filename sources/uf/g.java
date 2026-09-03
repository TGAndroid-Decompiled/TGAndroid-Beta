package uf;

import org.telegram.messenger.AndroidUtilities;
public final class g implements Runnable {
    public final int f45371a;
    public final k f45372b;

    public g(k kVar, int i10) {
        this.f45371a = i10;
        this.f45372b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f45371a) {
            case 0:
                k.Y(this.f45372b);
                return;
            case 1:
                k.Z(this.f45372b);
                return;
            default:
                g gVar = this.f45372b.d;
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar, 5000L);
                return;
        }
    }
}
