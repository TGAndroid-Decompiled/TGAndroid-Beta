package tg;

import org.telegram.messenger.AndroidUtilities;
public final class s implements Runnable {
    public final int f43212a;
    public final w f43213b;

    public s(w wVar, int i10) {
        this.f43212a = i10;
        this.f43213b = wVar;
    }

    @Override
    public final void run() {
        switch (this.f43212a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s(this.f43213b, 1));
                return;
            default:
                this.f43213b.run(null);
                return;
        }
    }
}
