package vf;

import org.telegram.messenger.AndroidUtilities;
public final class g implements Runnable {
    public final int f49050a;
    public final k f49051b;

    public g(k kVar, int i10) {
        this.f49050a = i10;
        this.f49051b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f49050a) {
            case 0:
                k.Y(this.f49051b);
                return;
            case 1:
                k.Z(this.f49051b);
                return;
            default:
                g gVar = this.f49051b.d;
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar, 5000L);
                return;
        }
    }
}
