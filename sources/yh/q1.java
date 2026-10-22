package yh;

import ai.v9;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ks0;
public final class q1 implements Runnable {
    public final int f50484a;
    public final ks0 f50485b;

    public q1(ks0 ks0Var, int i10) {
        this.f50484a = i10;
        this.f50485b = ks0Var;
    }

    @Override
    public final void run() {
        switch (this.f50484a) {
            case 0:
                this.f50485b.a();
                return;
            case 1:
                this.f50485b.setReorderingCollections(true);
                return;
            default:
                v9 v9Var = this.f50485b.e;
                v9Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i10 = v9Var.f2317a;
                reorderstargiftcollections.peer = MessagesController.getInstance(i10).getInputPeer(v9Var.f2318b);
                ArrayList arrayList = v9Var.e;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    reorderstargiftcollections.order.add(Integer.valueOf(((TL_stars.TL_starGiftCollection) obj).collection_id));
                }
                ConnectionsManager.getInstance(i10).sendRequest(reorderstargiftcollections, null);
                v9Var.j();
                return;
        }
    }
}
