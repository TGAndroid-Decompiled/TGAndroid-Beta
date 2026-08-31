package qh;

import org.telegram.messenger.AndroidUtilities;
public final class l8 implements Runnable {
    public final int f45632a;
    public final ca f45633b;
    public final Runnable f45634c;

    public l8(ca caVar, Runnable runnable, int i10) {
        this.f45632a = i10;
        this.f45633b = caVar;
        this.f45634c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f45632a) {
            case 0:
                this.f45634c.run();
                this.f45633b.p0();
                return;
            default:
                ca caVar = this.f45633b;
                caVar.f(false);
                AndroidUtilities.cancelRunOnUIThread(caVar.f45087d2);
                caVar.f45087d2 = null;
                caVar.P1 = false;
                this.f45634c.run();
                return;
        }
    }
}
