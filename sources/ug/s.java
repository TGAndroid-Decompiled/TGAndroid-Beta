package ug;

import org.telegram.messenger.AndroidUtilities;
public final class s implements Runnable {
    public final int f47203a;
    public final w f47204b;

    public s(w wVar, int i10) {
        this.f47203a = i10;
        this.f47204b = wVar;
    }

    @Override
    public final void run() {
        switch (this.f47203a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s(this.f47204b, 1));
                return;
            default:
                this.f47204b.run(null);
                return;
        }
    }
}
