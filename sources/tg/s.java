package tg;

import org.telegram.messenger.AndroidUtilities;
public final class s implements Runnable {
    public final int f43167a;
    public final w f43168b;

    public s(w wVar, int i10) {
        this.f43167a = i10;
        this.f43168b = wVar;
    }

    @Override
    public final void run() {
        switch (this.f43167a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s(this.f43168b, 1));
                return;
            default:
                this.f43168b.run(null);
                return;
        }
    }
}
