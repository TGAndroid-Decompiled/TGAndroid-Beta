package qh;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.tn;
public final class h implements Runnable {
    public final int f46708a;
    public final n f46709b;
    public final long f46710c;

    public h(n nVar, long j10, int i10) {
        this.f46708a = i10;
        this.f46709b = nVar;
        this.f46710c = j10;
    }

    @Override
    public final void run() {
        switch (this.f46708a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f46710c, r0.f46737b, new j(this.f46709b, 0));
                return;
            default:
                n nVar = this.f46709b;
                nVar.getClass();
                nVar.presentFragment(tn.R9(this.f46710c));
                return;
        }
    }
}
