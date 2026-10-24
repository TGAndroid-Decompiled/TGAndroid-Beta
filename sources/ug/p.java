package ug;

import org.telegram.messenger.AndroidUtilities;
public final class p implements Runnable {
    public final int f48186a;
    public final t f48187b;

    public p(t tVar, int i10) {
        this.f48186a = i10;
        this.f48187b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f48186a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p(this.f48187b, 1));
                return;
            default:
                this.f48187b.run(null);
                return;
        }
    }
}
