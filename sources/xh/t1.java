package xh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.or0;
import yh.m5;
public final class t1 implements Runnable {
    public final int f46148a;
    public final or0 f46149b;

    public t1(or0 or0Var, int i10) {
        this.f46148a = i10;
        this.f46149b = or0Var;
    }

    @Override
    public final void run() {
        switch (this.f46148a) {
            case 0:
                this.f46149b.a();
                return;
            case 1:
                this.f46149b.setReorderingCollections(true);
                return;
            default:
                m5 m5Var = this.f46149b.e;
                m5Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i10 = m5Var.f47480a;
                reorderstargiftcollections.peer = MessagesController.getInstance(i10).getInputPeer(m5Var.f47481b);
                ArrayList arrayList = m5Var.e;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    reorderstargiftcollections.order.add(Integer.valueOf(((TL_stars.TL_starGiftCollection) obj).collection_id));
                }
                ConnectionsManager.getInstance(i10).sendRequest(reorderstargiftcollections, null);
                m5Var.j();
                return;
        }
    }
}
