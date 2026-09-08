package yh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.nr0;
import zh.i5;
public final class s1 implements Runnable {
    public final int f50568a;
    public final nr0 f50569b;

    public s1(nr0 nr0Var, int i10) {
        this.f50568a = i10;
        this.f50569b = nr0Var;
    }

    @Override
    public final void run() {
        switch (this.f50568a) {
            case 0:
                this.f50569b.a();
                return;
            case 1:
                this.f50569b.setReorderingCollections(true);
                return;
            default:
                i5 i5Var = this.f50569b.f50547e;
                i5Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i10 = i5Var.f52064a;
                reorderstargiftcollections.peer = MessagesController.getInstance(i10).getInputPeer(i5Var.f52065b);
                ArrayList arrayList = i5Var.f52067e;
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
