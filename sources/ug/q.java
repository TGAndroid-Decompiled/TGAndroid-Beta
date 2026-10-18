package ug;

import org.telegram.messenger.AndroidUtilities;
public final class q implements Runnable {
    public final int f47790a;
    public final u f47791b;

    public q(u uVar, int i10) {
        this.f47790a = i10;
        this.f47791b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f47790a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q(this.f47791b, 1));
                return;
            default:
                this.f47791b.run(null);
                return;
        }
    }
}
