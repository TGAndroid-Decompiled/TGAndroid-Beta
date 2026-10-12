package tg;

import org.telegram.messenger.AndroidUtilities;
public final class q implements Runnable {
    public final int f48634a;
    public final u f48635b;

    public q(u uVar, int i10) {
        this.f48634a = i10;
        this.f48635b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f48634a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q(this.f48635b, 1));
                return;
            default:
                this.f48635b.run(null);
                return;
        }
    }
}
