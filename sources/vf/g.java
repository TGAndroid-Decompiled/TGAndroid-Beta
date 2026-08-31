package vf;

import org.telegram.messenger.AndroidUtilities;
public final class g implements Runnable {
    public final int f49049a;
    public final k f49050b;

    public g(k kVar, int i10) {
        this.f49049a = i10;
        this.f49050b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f49049a) {
            case 0:
                k.Y(this.f49050b);
                return;
            case 1:
                k.Z(this.f49050b);
                return;
            default:
                g gVar = this.f49050b.d;
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar, 5000L);
                return;
        }
    }
}
