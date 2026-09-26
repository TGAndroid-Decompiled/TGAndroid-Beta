package tg;

import org.telegram.messenger.AndroidUtilities;
public final class q implements Runnable {
    public final int f43473a;
    public final v f43474b;

    public q(v vVar, int i10) {
        this.f43473a = i10;
        this.f43474b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f43473a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q(this.f43474b, 1));
                return;
            default:
                this.f43474b.run(null);
                return;
        }
    }
}
