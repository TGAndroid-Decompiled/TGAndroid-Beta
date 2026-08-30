package ph;

import org.telegram.messenger.AndroidUtilities;
public final class n8 implements Runnable {
    public final int f42014a;
    public final da f42015b;
    public final Runnable f42016c;

    public n8(da daVar, Runnable runnable, int i10) {
        this.f42014a = i10;
        this.f42015b = daVar;
        this.f42016c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f42014a) {
            case 0:
                this.f42016c.run();
                this.f42015b.p0();
                return;
            default:
                da daVar = this.f42015b;
                daVar.f(false);
                AndroidUtilities.cancelRunOnUIThread(daVar.f41485d2);
                daVar.f41485d2 = null;
                daVar.P1 = false;
                this.f42016c.run();
                return;
        }
    }
}
