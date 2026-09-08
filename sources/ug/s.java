package ug;

import org.telegram.messenger.AndroidUtilities;
public final class s implements Runnable {
    public final int f47230a;
    public final w f47231b;

    public s(w wVar, int i10) {
        this.f47230a = i10;
        this.f47231b = wVar;
    }

    @Override
    public final void run() {
        switch (this.f47230a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s(this.f47231b, 1));
                return;
            default:
                this.f47231b.run(null);
                return;
        }
    }
}
