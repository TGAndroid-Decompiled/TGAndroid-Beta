package yh;

import ai.v9;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.is0;
public final class r1 implements Runnable {
    public final int f50510a;
    public final is0 f50511b;

    public r1(is0 is0Var, int i10) {
        this.f50510a = i10;
        this.f50511b = is0Var;
    }

    @Override
    public final void run() {
        switch (this.f50510a) {
            case 0:
                this.f50511b.a();
                return;
            case 1:
                this.f50511b.setReorderingCollections(true);
                return;
            default:
                v9 v9Var = this.f50511b.e;
                v9Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i10 = v9Var.f2327a;
                reorderstargiftcollections.peer = MessagesController.getInstance(i10).getInputPeer(v9Var.f2328b);
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
