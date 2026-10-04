package tg;

import org.telegram.messenger.AndroidUtilities;
public final class r implements Runnable {
    public final int f47094a;
    public final v f47095b;

    public r(v vVar, int i10) {
        this.f47094a = i10;
        this.f47095b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f47094a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r(this.f47095b, 1));
                return;
            default:
                this.f47095b.run(null);
                return;
        }
    }
}
