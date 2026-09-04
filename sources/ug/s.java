package ug;

import org.telegram.messenger.AndroidUtilities;
public final class s implements Runnable {
    public final int f47202a;
    public final w f47203b;

    public s(w wVar, int i10) {
        this.f47202a = i10;
        this.f47203b = wVar;
    }

    @Override
    public final void run() {
        switch (this.f47202a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s(this.f47203b, 1));
                return;
            default:
                this.f47203b.run(null);
                return;
        }
    }
}
