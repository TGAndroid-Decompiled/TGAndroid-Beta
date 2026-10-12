package yh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ns0;
import zh.e5;
public final class s1 implements Runnable {
    public final int f49113a;
    public final ns0 f49114b;

    public s1(ns0 ns0Var, int i10) {
        this.f49113a = i10;
        this.f49114b = ns0Var;
    }

    @Override
    public final void run() {
        switch (this.f49113a) {
            case 0:
                this.f49114b.a();
                return;
            case 1:
                this.f49114b.setReorderingCollections(true);
                return;
            default:
                e5 e5Var = this.f49114b.e;
                e5Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i10 = e5Var.f50440a;
                reorderstargiftcollections.peer = MessagesController.getInstance(i10).getInputPeer(e5Var.f50441b);
                ArrayList arrayList = e5Var.e;
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
