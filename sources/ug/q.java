package ug;

import org.telegram.messenger.AndroidUtilities;
public final class q implements Runnable {
    public final int f47754a;
    public final u f47755b;

    public q(u uVar, int i10) {
        this.f47754a = i10;
        this.f47755b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f47754a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q(this.f47755b, 1));
                return;
            default:
                this.f47755b.run(null);
                return;
        }
    }
}
