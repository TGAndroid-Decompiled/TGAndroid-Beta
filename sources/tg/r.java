package tg;

import org.telegram.messenger.AndroidUtilities;
public final class r implements Runnable {
    public final int f48398a;
    public final v f48399b;

    public r(v vVar, int i10) {
        this.f48398a = i10;
        this.f48399b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f48398a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r(this.f48399b, 1));
                return;
            default:
                this.f48399b.run(null);
                return;
        }
    }
}
