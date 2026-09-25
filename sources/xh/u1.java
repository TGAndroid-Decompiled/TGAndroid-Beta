package xh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.zr0;
import yh.j5;
public final class u1 implements Runnable {
    public final int f46420a;
    public final zr0 f46421b;

    public u1(zr0 zr0Var, int i10) {
        this.f46420a = i10;
        this.f46421b = zr0Var;
    }

    @Override
    public final void run() {
        switch (this.f46420a) {
            case 0:
                this.f46421b.a();
                return;
            case 1:
                this.f46421b.setReorderingCollections(true);
                return;
            default:
                j5 j5Var = this.f46421b.e;
                j5Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i10 = j5Var.f47566a;
                reorderstargiftcollections.peer = MessagesController.getInstance(i10).getInputPeer(j5Var.f47567b);
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
