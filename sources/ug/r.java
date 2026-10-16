package ug;

import org.telegram.messenger.AndroidUtilities;
public final class r implements Runnable {
    public final int f46381a;
    public final v f46382b;

    public r(v vVar, int i10) {
        this.f46381a = i10;
        this.f46382b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f46381a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r(this.f46382b, 1));
                return;
            default:
                this.f46382b.run(null);
                return;
        }
    }
}
