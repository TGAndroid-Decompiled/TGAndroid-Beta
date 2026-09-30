package xh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bs0;
import yh.j5;
public final class u1 implements Runnable {
    public final int f46421a;
    public final bs0 f46422b;

    public u1(bs0 bs0Var, int i10) {
        this.f46421a = i10;
        this.f46422b = bs0Var;
    }

    @Override
    public final void run() {
        switch (this.f46421a) {
            case 0:
                this.f46422b.a();
                return;
            case 1:
                this.f46422b.setReorderingCollections(true);
                return;
            default:
                j5 j5Var = this.f46422b.e;
                j5Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i10 = j5Var.f47567a;
                reorderstargiftcollections.peer = MessagesController.getInstance(i10).getInputPeer(j5Var.f47568b);
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
