package xh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.as0;
import yh.j5;
public final class u1 implements Runnable {
    public final int f46418a;
    public final as0 f46419b;

    public u1(as0 as0Var, int i10) {
        this.f46418a = i10;
        this.f46419b = as0Var;
    }

    @Override
    public final void run() {
        switch (this.f46418a) {
            case 0:
                this.f46419b.a();
                return;
            case 1:
                this.f46419b.setReorderingCollections(true);
                return;
            default:
                j5 j5Var = this.f46419b.e;
                j5Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i10 = j5Var.f47564a;
                reorderstargiftcollections.peer = MessagesController.getInstance(i10).getInputPeer(j5Var.f47565b);
                ArrayList arrayList = j5Var.e;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    reorderstargiftcollections.order.add(Integer.valueOf(((TL_stars.TL_starGiftCollection) obj).collection_id));
                }
                ConnectionsManager.getInstance(i10).sendRequest(reorderstargiftcollections, null);
                j5Var.j();
                return;
        }
    }
}
