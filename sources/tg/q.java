package tg;

import org.telegram.messenger.AndroidUtilities;
public final class q implements Runnable {
    public final int f43445a;
    public final v f43446b;

    public q(v vVar, int i10) {
        this.f43445a = i10;
        this.f43446b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f43445a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q(this.f43446b, 1));
                return;
            default:
                this.f43446b.run(null);
                return;
        }
    }
}
