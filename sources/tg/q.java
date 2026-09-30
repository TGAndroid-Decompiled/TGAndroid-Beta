package tg;

import org.telegram.messenger.AndroidUtilities;
public final class q implements Runnable {
    public final int f43476a;
    public final v f43477b;

    public q(v vVar, int i10) {
        this.f43476a = i10;
        this.f43477b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f43476a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q(this.f43477b, 1));
                return;
            default:
                this.f43477b.run(null);
                return;
        }
    }
}
