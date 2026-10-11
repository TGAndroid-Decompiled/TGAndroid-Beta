package tg;

import org.telegram.messenger.AndroidUtilities;
public final class q implements Runnable {
    public final int f48464a;
    public final u f48465b;

    public q(u uVar, int i10) {
        this.f48464a = i10;
        this.f48465b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f48464a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q(this.f48465b, 1));
                return;
            default:
                this.f48465b.run(null);
                return;
        }
    }
}
