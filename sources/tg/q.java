package tg;

import org.telegram.messenger.AndroidUtilities;
public final class q implements Runnable {
    public final int f43520a;
    public final v f43521b;

    public q(v vVar, int i10) {
        this.f43520a = i10;
        this.f43521b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f43520a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q(this.f43521b, 1));
                return;
            default:
                this.f43521b.run(null);
                return;
        }
    }
}
