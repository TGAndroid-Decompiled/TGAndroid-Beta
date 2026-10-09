package xh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.rs0;
import yh.d5;
public final class u1 implements Runnable {
    public final int f51535a;
    public final rs0 f51536b;

    public u1(rs0 rs0Var, int i10) {
        this.f51535a = i10;
        this.f51536b = rs0Var;
    }

    @Override
    public final void run() {
        switch (this.f51535a) {
            case 0:
                this.f51536b.a();
                return;
            case 1:
                this.f51536b.setReorderingCollections(true);
                return;
            default:
                d5 d5Var = this.f51536b.f51514e;
                d5Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i10 = d5Var.f52385a;
                reorderstargiftcollections.peer = MessagesController.getInstance(i10).getInputPeer(d5Var.f52386b);
                ArrayList arrayList = d5Var.f52388e;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    reorderstargiftcollections.order.add(Integer.valueOf(((TL_stars.TL_starGiftCollection) obj).collection_id));
                }
                ConnectionsManager.getInstance(i10).sendRequest(reorderstargiftcollections, null);
                d5Var.j();
                return;
        }
    }
}
