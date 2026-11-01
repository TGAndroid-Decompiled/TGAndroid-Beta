package ph;

import java.util.ArrayList;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.wq0;
import rh.u5;
public final class m1 implements Runnable {
    public final int f45243a;
    public final wq0 f45244b;

    public m1(wq0 wq0Var, int i10) {
        this.f45243a = i10;
        this.f45244b = wq0Var;
    }

    @Override
    public final void run() {
        switch (this.f45243a) {
            case 0:
                u5 u5Var = this.f45244b.e;
                u5Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i10 = u5Var.f47552a;
                reorderstargiftcollections.peer = wp.r1(i10).i1(u5Var.f47553b);
                ArrayList arrayList = u5Var.e;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    reorderstargiftcollections.order.add(Integer.valueOf(((TL_stars.TL_starGiftCollection) obj).collection_id));
                }
                ConnectionsManager.getInstance(i10).sendRequest(reorderstargiftcollections, null);
                u5Var.j();
                return;
            case 1:
                this.f45244b.setReorderingCollections(true);
                return;
            default:
                this.f45244b.a();
                return;
        }
    }
}
