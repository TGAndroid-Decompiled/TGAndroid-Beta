package ug;

import org.telegram.messenger.AndroidUtilities;
public final class q implements Runnable {
    public final int f47745a;
    public final u f47746b;

    public q(u uVar, int i10) {
        this.f47745a = i10;
        this.f47746b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f47745a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q(this.f47746b, 1));
                return;
            default:
                this.f47746b.run(null);
                return;
        }
    }
}
