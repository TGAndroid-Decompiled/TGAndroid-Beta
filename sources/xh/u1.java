package xh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ss0;
import yh.d5;
public final class u1 implements Runnable {
    public final int f51579a;
    public final ss0 f51580b;

    public u1(ss0 ss0Var, int i10) {
        this.f51579a = i10;
        this.f51580b = ss0Var;
    }

    @Override
    public final void run() {
        switch (this.f51579a) {
            case 0:
                this.f51580b.a();
                return;
            case 1:
                this.f51580b.setReorderingCollections(true);
                return;
            default:
                d5 d5Var = this.f51580b.f51558e;
                d5Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i10 = d5Var.f52429a;
                reorderstargiftcollections.peer = MessagesController.getInstance(i10).getInputPeer(d5Var.f52430b);
                ArrayList arrayList = d5Var.f52432e;
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
