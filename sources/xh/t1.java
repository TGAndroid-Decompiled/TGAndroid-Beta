package xh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.xs0;
import yh.e5;
public final class t1 implements Runnable {
    public final int f51755a;
    public final xs0 f51756b;

    public t1(xs0 xs0Var, int i10) {
        this.f51755a = i10;
        this.f51756b = xs0Var;
    }

    @Override
    public final void run() {
        switch (this.f51755a) {
            case 0:
                this.f51756b.a();
                return;
            case 1:
                this.f51756b.setReorderingCollections(true);
                return;
            default:
                e5 e5Var = this.f51756b.f51732e;
                e5Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i10 = e5Var.f52663a;
                reorderstargiftcollections.peer = MessagesController.getInstance(i10).getInputPeer(e5Var.f52664b);
                ArrayList arrayList = e5Var.f52666e;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    reorderstargiftcollections.order.add(Integer.valueOf(((TL_stars.TL_starGiftCollection) obj).collection_id));
                }
                ConnectionsManager.getInstance(i10).sendRequest(reorderstargiftcollections, null);
                e5Var.j();
                return;
        }
    }
}
