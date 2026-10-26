package zh;

import bi.q9;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.vs0;
public final class r1 implements Runnable {
    public final int f53228a;
    public final vs0 f53229b;

    public r1(vs0 vs0Var, int i10) {
        this.f53228a = i10;
        this.f53229b = vs0Var;
    }

    @Override
    public final void run() {
        switch (this.f53228a) {
            case 0:
                this.f53229b.setReorderingCollections(true);
                return;
            case 1:
                q9 q9Var = this.f53229b.e;
                q9Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i10 = q9Var.f5291a;
                reorderstargiftcollections.peer = MessagesController.getInstance(i10).getInputPeer(q9Var.f5292b);
                ArrayList arrayList = q9Var.e;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    reorderstargiftcollections.order.add(Integer.valueOf(((TL_stars.TL_starGiftCollection) obj).collection_id));
                }
                ConnectionsManager.getInstance(i10).sendRequest(reorderstargiftcollections, null);
                q9Var.j();
                return;
            default:
                this.f53229b.a();
                return;
        }
    }
}
