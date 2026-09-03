package sh;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.zn;
public final class h implements Runnable {
    public final int f44411a;
    public final n f44412b;
    public final long f44413c;

    public h(n nVar, long j10, int i10) {
        this.f44411a = i10;
        this.f44412b = nVar;
        this.f44413c = j10;
    }

    @Override
    public final void run() {
        switch (this.f44411a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f44413c, r0.f44436b, new j(this.f44412b, 0));
                return;
            default:
                n nVar = this.f44412b;
                nVar.getClass();
                nVar.presentFragment(zn.R9(this.f44413c));
                return;
        }
    }
}
