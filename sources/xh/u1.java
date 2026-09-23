package xh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.nr0;
import yh.k5;
public final class u1 implements Runnable {
    public final int f46091a;
    public final nr0 f46092b;

    public u1(nr0 nr0Var, int i10) {
        this.f46091a = i10;
        this.f46092b = nr0Var;
    }

    @Override
    public final void run() {
        switch (this.f46091a) {
            case 0:
                this.f46092b.a();
                return;
            case 1:
                this.f46092b.setReorderingCollections(true);
                return;
            default:
                k5 k5Var = this.f46092b.e;
                k5Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i10 = k5Var.f47293a;
                reorderstargiftcollections.peer = MessagesController.getInstance(i10).getInputPeer(k5Var.f47294b);
                ArrayList arrayList = k5Var.e;
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
