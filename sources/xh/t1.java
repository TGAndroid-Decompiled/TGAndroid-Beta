package xh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.nr0;
import yh.l5;
public final class t1 implements Runnable {
    public final int f46121a;
    public final nr0 f46122b;

    public t1(nr0 nr0Var, int i10) {
        this.f46121a = i10;
        this.f46122b = nr0Var;
    }

    @Override
    public final void run() {
        switch (this.f46121a) {
            case 0:
                this.f46122b.a();
                return;
            case 1:
                this.f46122b.setReorderingCollections(true);
                return;
            default:
                l5 l5Var = this.f46122b.e;
                l5Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i10 = l5Var.f47361a;
                reorderstargiftcollections.peer = MessagesController.getInstance(i10).getInputPeer(l5Var.f47362b);
                ArrayList arrayList = l5Var.e;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    reorderstargiftcollections.order.add(Integer.valueOf(((TL_stars.TL_starGiftCollection) obj).collection_id));
                }
                ConnectionsManager.getInstance(i10).sendRequest(reorderstargiftcollections, null);
                l5Var.j();
                return;
        }
    }
}
