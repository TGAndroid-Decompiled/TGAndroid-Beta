package vg;

import org.telegram.messenger.AndroidUtilities;
public final class r implements Runnable {
    public final int f50284a;
    public final v f50285b;

    public r(v vVar, int i10) {
        this.f50284a = i10;
        this.f50285b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f50284a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r(this.f50285b, 1));
                return;
            default:
                this.f50285b.run(null);
                return;
        }
    }
}
