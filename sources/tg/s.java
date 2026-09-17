package tg;

import org.telegram.messenger.AndroidUtilities;
public final class s implements Runnable {
    public final int f43239a;
    public final w f43240b;

    public s(w wVar, int i10) {
        this.f43239a = i10;
        this.f43240b = wVar;
    }

    @Override
    public final void run() {
        switch (this.f43239a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s(this.f43240b, 1));
                return;
            default:
                this.f43240b.run(null);
                return;
        }
    }
}
