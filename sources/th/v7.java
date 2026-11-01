package th;

import java.util.ArrayList;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class v7 implements Runnable {
    public final w7 f49560a;

    public v7(w7 w7Var) {
        this.f49560a = w7Var;
    }

    @Override
    public final void run() {
        w7 w7Var = this.f49560a;
        int i10 = w7Var.f49607a;
        ArrayList arrayList = w7Var.d;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            TL_stories.TL_stories_getPeerMaxIDs tL_stories_getPeerMaxIDs = new TL_stories.TL_stories_getPeerMaxIDs();
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                tL_stories_getPeerMaxIDs.f20038id.add(wp.r1(i10).i1(((Long) arrayList2.get(i11)).longValue()));
            }
            ConnectionsManager.getInstance(i10).sendRequestTyped(tL_stories_getPeerMaxIDs, new a3.b(1), new rh.s6(4, this, arrayList2));
        }
    }
}
