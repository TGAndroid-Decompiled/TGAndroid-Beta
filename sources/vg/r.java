package vg;

import org.telegram.messenger.AndroidUtilities;
public final class r implements Runnable {
    public final int f50246a;
    public final v f50247b;

    public r(v vVar, int i10) {
        this.f50246a = i10;
        this.f50247b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f50246a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r(this.f50247b, 1));
                return;
            default:
                this.f50247b.run(null);
                return;
        }
    }
}
