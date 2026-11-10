package zh;

import bi.t9;
import java.util.ArrayList;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.up0;
public final class h1 implements Runnable {
    public final int f60374a;
    public final up0 f60375b;

    public h1(up0 up0Var, int i7) {
        this.f60374a = i7;
        this.f60375b = up0Var;
    }

    @Override
    public final void run() {
        switch (this.f60374a) {
            case 0:
                t9 t9Var = this.f60375b.f60297e;
                t9Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i7 = t9Var.f4755a;
                reorderstargiftcollections.peer = qp.s1(i7).j1(t9Var.f4756b);
                ArrayList arrayList = t9Var.f4758e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    reorderstargiftcollections.order.add(Integer.valueOf(((TL_stars.TL_starGiftCollection) obj).collection_id));
                }
                ConnectionsManager.getInstance(i7).sendRequest(reorderstargiftcollections, null);
                t9Var.j();
                return;
            case 1:
                this.f60375b.setReorderingCollections(true);
                return;
            default:
                this.f60375b.a();
                return;
        }
    }
}
