package vg;

import org.telegram.messenger.AndroidUtilities;
public final class r implements Runnable {
    public final int f50249a;
    public final v f50250b;

    public r(v vVar, int i10) {
        this.f50249a = i10;
        this.f50250b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f50249a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r(this.f50250b, 1));
                return;
            default:
                this.f50250b.run(null);
                return;
        }
    }
}
