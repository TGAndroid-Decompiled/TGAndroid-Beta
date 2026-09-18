package tg;

import org.telegram.messenger.AndroidUtilities;
public final class s implements Runnable {
    public final int f43244a;
    public final w f43245b;

    public s(w wVar, int i10) {
        this.f43244a = i10;
        this.f43245b = wVar;
    }

    @Override
    public final void run() {
        switch (this.f43244a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s(this.f43245b, 1));
                return;
            default:
                this.f43245b.run(null);
                return;
        }
    }
}
