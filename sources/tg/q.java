package tg;

import org.telegram.messenger.AndroidUtilities;
public final class q implements Runnable {
    public final int f43489a;
    public final v f43490b;

    public q(v vVar, int i10) {
        this.f43489a = i10;
        this.f43490b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f43489a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q(this.f43490b, 1));
                return;
            default:
                this.f43490b.run(null);
                return;
        }
    }
}
