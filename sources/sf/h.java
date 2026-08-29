package sf;

import org.telegram.messenger.AndroidUtilities;
public final class h implements Runnable {
    public final int f47815a;
    public final l f47816b;

    public h(l lVar, int i10) {
        this.f47815a = i10;
        this.f47816b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f47815a) {
            case 0:
                l.Y(this.f47816b);
                return;
            case 1:
                l.Z(this.f47816b);
                return;
            default:
                h hVar = this.f47816b.d;
                AndroidUtilities.cancelRunOnUIThread(hVar);
                AndroidUtilities.runOnUIThread(hVar, 5000L);
                return;
        }
    }
}
