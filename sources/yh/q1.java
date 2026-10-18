package yh;

import ai.v9;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.is0;
public final class q1 implements Runnable {
    public final int f50475a;
    public final is0 f50476b;

    public q1(is0 is0Var, int i10) {
        this.f50475a = i10;
        this.f50476b = is0Var;
    }

    @Override
    public final void run() {
        switch (this.f50475a) {
            case 0:
                this.f50476b.a();
                return;
            case 1:
                this.f50476b.setReorderingCollections(true);
                return;
            default:
                v9 v9Var = this.f50476b.e;
                v9Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i10 = v9Var.f2329a;
                reorderstargiftcollections.peer = MessagesController.getInstance(i10).getInputPeer(v9Var.f2330b);
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
