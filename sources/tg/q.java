package tg;

import org.telegram.messenger.AndroidUtilities;
public final class q implements Runnable {
    public final int f43582a;
    public final v f43583b;

    public q(v vVar, int i10) {
        this.f43582a = i10;
        this.f43583b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f43582a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q(this.f43583b, 1));
                return;
            default:
                this.f43583b.run(null);
                return;
        }
    }
}
