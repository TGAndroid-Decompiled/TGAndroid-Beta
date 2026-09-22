package tg;

import org.telegram.messenger.AndroidUtilities;
public final class q implements Runnable {
    public final int f43510a;
    public final v f43511b;

    public q(v vVar, int i10) {
        this.f43510a = i10;
        this.f43511b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f43510a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q(this.f43511b, 1));
                return;
            default:
                this.f43511b.run(null);
                return;
        }
    }
}
