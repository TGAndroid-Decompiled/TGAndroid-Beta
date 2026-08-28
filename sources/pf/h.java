package pf;

import org.telegram.messenger.AndroidUtilities;
public final class h implements Runnable {
    public final int f45641a;
    public final l f45642b;

    public h(l lVar, int i9) {
        this.f45641a = i9;
        this.f45642b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f45641a) {
            case 0:
                l.X(this.f45642b);
                return;
            case 1:
                l.Y(this.f45642b);
                return;
            default:
                h hVar = this.f45642b.d;
                AndroidUtilities.cancelRunOnUIThread(hVar);
                AndroidUtilities.runOnUIThread(hVar, 5000L);
                return;
        }
    }
}
