package tg;

import org.telegram.messenger.AndroidUtilities;
public final class q implements Runnable {
    public final int f48605a;
    public final u f48606b;

    public q(u uVar, int i10) {
        this.f48605a = i10;
        this.f48606b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f48605a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q(this.f48606b, 1));
                return;
            default:
                this.f48606b.run(null);
                return;
        }
    }
}
