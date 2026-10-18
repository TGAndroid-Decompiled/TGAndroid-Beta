package ug;

import org.telegram.messenger.AndroidUtilities;
public final class q implements Runnable {
    public final int f47743a;
    public final u f47744b;

    public q(u uVar, int i10) {
        this.f47743a = i10;
        this.f47744b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f47743a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q(this.f47744b, 1));
                return;
            default:
                this.f47744b.run(null);
                return;
        }
    }
}
