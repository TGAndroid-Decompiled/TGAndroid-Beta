package ug;

import org.telegram.messenger.AndroidUtilities;
public final class q implements Runnable {
    public final int f47753a;
    public final u f47754b;

    public q(u uVar, int i10) {
        this.f47753a = i10;
        this.f47754b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f47753a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q(this.f47754b, 1));
                return;
            default:
                this.f47754b.run(null);
                return;
        }
    }
}
