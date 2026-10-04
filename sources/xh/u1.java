package xh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.fs0;
import yh.j5;
public final class u1 implements Runnable {
    public final int f50249a;
    public final fs0 f50250b;

    public u1(fs0 fs0Var, int i10) {
        this.f50249a = i10;
        this.f50250b = fs0Var;
    }

    @Override
    public final void run() {
        switch (this.f50249a) {
            case 0:
                this.f50250b.a();
                return;
            case 1:
                this.f50250b.setReorderingCollections(true);
                return;
            default:
                j5 j5Var = this.f50250b.f50228e;
                j5Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i10 = j5Var.f51480a;
                reorderstargiftcollections.peer = MessagesController.getInstance(i10).getInputPeer(j5Var.f51481b);
                ArrayList arrayList = j5Var.f51483e;
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
