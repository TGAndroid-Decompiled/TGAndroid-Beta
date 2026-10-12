package xh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.xs0;
import yh.d5;
public final class t1 implements Runnable {
    public final int f51747a;
    public final xs0 f51748b;

    public t1(xs0 xs0Var, int i10) {
        this.f51747a = i10;
        this.f51748b = xs0Var;
    }

    @Override
    public final void run() {
        switch (this.f51747a) {
            case 0:
                this.f51748b.a();
                return;
            case 1:
                this.f51748b.setReorderingCollections(true);
                return;
            default:
                d5 d5Var = this.f51748b.f51724e;
                d5Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i10 = d5Var.f52609a;
                reorderstargiftcollections.peer = MessagesController.getInstance(i10).getInputPeer(d5Var.f52610b);
                ArrayList arrayList = d5Var.f52612e;
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
