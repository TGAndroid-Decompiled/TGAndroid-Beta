package tg;

import org.telegram.messenger.AndroidUtilities;
public final class r implements Runnable {
    public final int f47085a;
    public final v f47086b;

    public r(v vVar, int i10) {
        this.f47085a = i10;
        this.f47086b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f47085a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r(this.f47086b, 1));
                return;
            default:
                this.f47086b.run(null);
                return;
        }
    }
}
