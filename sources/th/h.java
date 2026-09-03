package th;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.xn;
public final class h implements Runnable {
    public final int f48163a;
    public final n f48164b;
    public final long f48165c;

    public h(n nVar, long j10, int i10) {
        this.f48163a = i10;
        this.f48164b = nVar;
        this.f48165c = j10;
    }

    @Override
    public final void run() {
        switch (this.f48163a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f48165c, r0.f48189b, new j(this.f48164b, 0));
                return;
            default:
                n nVar = this.f48164b;
                nVar.getClass();
                nVar.presentFragment(xn.R9(this.f48165c));
                return;
        }
    }
}
