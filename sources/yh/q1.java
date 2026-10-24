package yh;

import ai.v9;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ms0;
public final class q1 implements Runnable {
    public final int f50941a;
    public final ms0 f50942b;

    public q1(ms0 ms0Var, int i10) {
        this.f50941a = i10;
        this.f50942b = ms0Var;
    }

    @Override
    public final void run() {
        switch (this.f50941a) {
            case 0:
                this.f50942b.a();
                return;
            case 1:
                this.f50942b.setReorderingCollections(true);
                return;
            default:
                v9 v9Var = this.f50942b.e;
                v9Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i10 = v9Var.f2319a;
                reorderstargiftcollections.peer = MessagesController.getInstance(i10).getInputPeer(v9Var.f2320b);
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
