package tg;

import org.telegram.messenger.AndroidUtilities;
public final class q implements Runnable {
    public final int f43460a;
    public final v f43461b;

    public q(v vVar, int i10) {
        this.f43460a = i10;
        this.f43461b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f43460a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q(this.f43461b, 1));
                return;
            default:
                this.f43461b.run(null);
                return;
        }
    }
}
