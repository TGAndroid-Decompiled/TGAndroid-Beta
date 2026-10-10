package tg;

import org.telegram.messenger.AndroidUtilities;
public final class r implements Runnable {
    public final int f48444a;
    public final v f48445b;

    public r(v vVar, int i10) {
        this.f48444a = i10;
        this.f48445b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f48444a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r(this.f48445b, 1));
                return;
            default:
                this.f48445b.run(null);
                return;
        }
    }
}
