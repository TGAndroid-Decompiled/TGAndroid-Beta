package ug;

import org.telegram.messenger.AndroidUtilities;
public final class q implements Runnable {
    public final int f47750a;
    public final u f47751b;

    public q(u uVar, int i10) {
        this.f47750a = i10;
        this.f47751b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f47750a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q(this.f47751b, 1));
                return;
            default:
                this.f47751b.run(null);
                return;
        }
    }
}
