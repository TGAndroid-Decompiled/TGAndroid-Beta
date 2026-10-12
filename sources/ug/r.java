package ug;

import org.telegram.messenger.AndroidUtilities;
public final class r implements Runnable {
    public final int f46382a;
    public final v f46383b;

    public r(v vVar, int i10) {
        this.f46382a = i10;
        this.f46383b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f46382a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r(this.f46383b, 1));
                return;
            default:
                this.f46383b.run(null);
                return;
        }
    }
}
