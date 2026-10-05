package tg;

import org.telegram.messenger.AndroidUtilities;
public final class r implements Runnable {
    public final int f47101a;
    public final v f47102b;

    public r(v vVar, int i10) {
        this.f47101a = i10;
        this.f47102b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f47101a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r(this.f47102b, 1));
                return;
            default:
                this.f47102b.run(null);
                return;
        }
    }
}
