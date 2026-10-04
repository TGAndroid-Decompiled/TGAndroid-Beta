package tg;

import org.telegram.messenger.AndroidUtilities;
public final class r implements Runnable {
    public final int f47086a;
    public final v f47087b;

    public r(v vVar, int i10) {
        this.f47086a = i10;
        this.f47087b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f47086a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r(this.f47087b, 1));
                return;
            default:
                this.f47087b.run(null);
                return;
        }
    }
}
