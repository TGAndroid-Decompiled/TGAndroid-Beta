package wh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.wr0;
import xh.l5;
public final class s1 implements Runnable {
    public final int f44343a;
    public final wr0 f44344b;

    public s1(wr0 wr0Var, int i10) {
        this.f44343a = i10;
        this.f44344b = wr0Var;
    }

    @Override
    public final void run() {
        switch (this.f44343a) {
            case 0:
                this.f44344b.a();
                return;
            case 1:
                this.f44344b.setReorderingCollections(true);
                return;
            default:
                l5 l5Var = this.f44344b.e;
                l5Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i10 = l5Var.f45662a;
                reorderstargiftcollections.peer = MessagesController.getInstance(i10).getInputPeer(l5Var.f45663b);
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
