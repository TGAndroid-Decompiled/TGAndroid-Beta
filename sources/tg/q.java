package tg;

import org.telegram.messenger.AndroidUtilities;
public final class q implements Runnable {
    public final int f48498a;
    public final u f48499b;

    public q(u uVar, int i10) {
        this.f48498a = i10;
        this.f48499b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f48498a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q(this.f48499b, 1));
                return;
            default:
                this.f48499b.run(null);
                return;
        }
    }
}
