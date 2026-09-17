package ug;

import org.telegram.messenger.AndroidUtilities;
public final class s implements Runnable {
    public final int f47231a;
    public final w f47232b;

    public s(w wVar, int i10) {
        this.f47231a = i10;
        this.f47232b = wVar;
    }

    @Override
    public final void run() {
        switch (this.f47231a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s(this.f47232b, 1));
                return;
            default:
                this.f47232b.run(null);
                return;
        }
    }
}
