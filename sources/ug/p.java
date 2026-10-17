package ug;

import org.telegram.messenger.AndroidUtilities;
public final class p implements Runnable {
    public final int f47762a;
    public final t f47763b;

    public p(t tVar, int i10) {
        this.f47762a = i10;
        this.f47763b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f47762a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p(this.f47763b, 1));
                return;
            default:
                this.f47763b.run(null);
                return;
        }
    }
}
