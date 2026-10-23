package ug;

import org.telegram.messenger.AndroidUtilities;
public final class p implements Runnable {
    public final int f48187a;
    public final t f48188b;

    public p(t tVar, int i10) {
        this.f48187a = i10;
        this.f48188b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f48187a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p(this.f48188b, 1));
                return;
            default:
                this.f48188b.run(null);
                return;
        }
    }
}
