package xh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gs0;
import yh.k5;
public final class u1 implements Runnable {
    public final int f50256a;
    public final gs0 f50257b;

    public u1(gs0 gs0Var, int i10) {
        this.f50256a = i10;
        this.f50257b = gs0Var;
    }

    @Override
    public final void run() {
        switch (this.f50256a) {
            case 0:
                this.f50257b.a();
                return;
            case 1:
                this.f50257b.setReorderingCollections(true);
                return;
            default:
                k5 k5Var = this.f50257b.f50235e;
                k5Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i10 = k5Var.f51542a;
                reorderstargiftcollections.peer = MessagesController.getInstance(i10).getInputPeer(k5Var.f51543b);
                ArrayList arrayList = k5Var.f51545e;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    reorderstargiftcollections.order.add(Integer.valueOf(((TL_stars.TL_starGiftCollection) obj).collection_id));
                }
                ConnectionsManager.getInstance(i10).sendRequest(reorderstargiftcollections, null);
                k5Var.j();
                return;
        }
    }
}
