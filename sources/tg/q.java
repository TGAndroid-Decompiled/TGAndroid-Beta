package tg;

import org.telegram.messenger.AndroidUtilities;
public final class q implements Runnable {
    public final int f43474a;
    public final v f43475b;

    public q(v vVar, int i10) {
        this.f43474a = i10;
        this.f43475b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f43474a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q(this.f43475b, 1));
                return;
            default:
                this.f43475b.run(null);
                return;
        }
    }
}
