package sh;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.xn;
public final class h implements Runnable {
    public final int f44346a;
    public final n f44347b;
    public final long f44348c;

    public h(n nVar, long j10, int i10) {
        this.f44346a = i10;
        this.f44347b = nVar;
        this.f44348c = j10;
    }

    @Override
    public final void run() {
        switch (this.f44346a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f44348c, r0.f44374b, new j(this.f44347b, 0));
                return;
            default:
                n nVar = this.f44347b;
                nVar.getClass();
                nVar.presentFragment(xn.R9(this.f44348c));
                return;
        }
    }
}
