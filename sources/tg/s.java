package tg;

import org.telegram.messenger.AndroidUtilities;
public final class s implements Runnable {
    public final int f43216a;
    public final w f43217b;

    public s(w wVar, int i10) {
        this.f43216a = i10;
        this.f43217b = wVar;
    }

    @Override
    public final void run() {
        switch (this.f43216a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s(this.f43217b, 1));
                return;
            default:
                this.f43217b.run(null);
                return;
        }
    }
}
