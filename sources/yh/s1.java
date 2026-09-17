package yh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.nr0;
import zh.i5;
public final class s1 implements Runnable {
    public final int f50540a;
    public final nr0 f50541b;

    public s1(nr0 nr0Var, int i10) {
        this.f50540a = i10;
        this.f50541b = nr0Var;
    }

    @Override
    public final void run() {
        switch (this.f50540a) {
            case 0:
                this.f50541b.a();
                return;
            case 1:
                this.f50541b.setReorderingCollections(true);
                return;
            default:
                i5 i5Var = this.f50541b.f50519e;
                i5Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i10 = i5Var.f52034a;
                reorderstargiftcollections.peer = MessagesController.getInstance(i10).getInputPeer(i5Var.f52035b);
                ArrayList arrayList = i5Var.f52037e;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    reorderstargiftcollections.order.add(Integer.valueOf(((TL_stars.TL_starGiftCollection) obj).collection_id));
                }
                ConnectionsManager.getInstance(i10).sendRequest(reorderstargiftcollections, null);
                i5Var.j();
                return;
        }
    }
}
