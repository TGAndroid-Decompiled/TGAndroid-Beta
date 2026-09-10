package zh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class b8 implements Runnable {
    public final c8 f48312a;

    public b8(c8 c8Var) {
        this.f48312a = c8Var;
    }

    @Override
    public final void run() {
        c8 c8Var = this.f48312a;
        int i10 = c8Var.f48332a;
        ArrayList arrayList = c8Var.d;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            TL_stories.TL_stories_getPeerMaxIDs tL_stories_getPeerMaxIDs = new TL_stories.TL_stories_getPeerMaxIDs();
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                tL_stories_getPeerMaxIDs.f17441id.add(MessagesController.getInstance(i10).getInputPeer(((Long) arrayList2.get(i11)).longValue()));
            }
            ConnectionsManager.getInstance(i10).sendRequestTyped(tL_stories_getPeerMaxIDs, new Object(), new bi.k6(26, this, arrayList2));
        }
    }
}
