package xh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ts0;
import yh.d5;
public final class u1 implements Runnable {
    public final int f51622a;
    public final ts0 f51623b;

    public u1(ts0 ts0Var, int i10) {
        this.f51622a = i10;
        this.f51623b = ts0Var;
    }

    @Override
    public final void run() {
        switch (this.f51622a) {
            case 0:
                this.f51623b.a();
                return;
            case 1:
                this.f51623b.setReorderingCollections(true);
                return;
            default:
                d5 d5Var = this.f51623b.f51601e;
                d5Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i10 = d5Var.f52472a;
                reorderstargiftcollections.peer = MessagesController.getInstance(i10).getInputPeer(d5Var.f52473b);
                ArrayList arrayList = d5Var.f52475e;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    reorderstargiftcollections.order.add(Integer.valueOf(((TL_stars.TL_starGiftCollection) obj).collection_id));
                }
                ConnectionsManager.getInstance(i10).sendRequest(reorderstargiftcollections, null);
                d5Var.j();
                return;
        }
    }
}
