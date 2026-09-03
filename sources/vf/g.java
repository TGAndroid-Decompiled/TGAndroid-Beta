package vf;

import org.telegram.messenger.AndroidUtilities;
public final class g implements Runnable {
    public final int f49086a;
    public final k f49087b;

    public g(k kVar, int i10) {
        this.f49086a = i10;
        this.f49087b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f49086a) {
            case 0:
                k.Y(this.f49087b);
                return;
            case 1:
                k.Z(this.f49087b);
                return;
            default:
                g gVar = this.f49087b.d;
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar, 5000L);
                return;
        }
    }
}
