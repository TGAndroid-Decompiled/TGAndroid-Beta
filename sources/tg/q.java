package tg;

import org.telegram.messenger.AndroidUtilities;
public final class q implements Runnable {
    public final int f43475a;
    public final v f43476b;

    public q(v vVar, int i10) {
        this.f43475a = i10;
        this.f43476b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f43475a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q(this.f43476b, 1));
                return;
            default:
                this.f43476b.run(null);
                return;
        }
    }
}
