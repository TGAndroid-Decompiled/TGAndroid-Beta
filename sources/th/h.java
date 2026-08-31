package th;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.xn;
public final class h implements Runnable {
    public final int f48127a;
    public final n f48128b;
    public final long f48129c;

    public h(n nVar, long j10, int i10) {
        this.f48127a = i10;
        this.f48128b = nVar;
        this.f48129c = j10;
    }

    @Override
    public final void run() {
        switch (this.f48127a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f48129c, r0.f48153b, new j(this.f48128b, 0));
                return;
            default:
                n nVar = this.f48128b;
                nVar.getClass();
                nVar.presentFragment(xn.R9(this.f48129c));
                return;
        }
    }
}
