package ph;

import org.telegram.messenger.AndroidUtilities;
public final class m8 implements Runnable {
    public final int f42011a;
    public final da f42012b;
    public final Runnable f42013c;

    public m8(da daVar, Runnable runnable, int i10) {
        this.f42011a = i10;
        this.f42012b = daVar;
        this.f42013c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f42011a) {
            case 0:
                this.f42013c.run();
                this.f42012b.p0();
                return;
            default:
                da daVar = this.f42012b;
                daVar.f(false);
                AndroidUtilities.cancelRunOnUIThread(daVar.f41523d2);
                daVar.f41523d2 = null;
                daVar.P1 = false;
                this.f42013c.run();
                return;
        }
    }
}
