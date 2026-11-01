package th;

import android.view.View;
import org.telegram.messenger.e20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class v5 {
    public int f49558a;
    public View f49559b;

    public v5() {
        ConnectionsManager.generateClassGuid();
    }

    public final void a(long j10, View view, t5 t5Var) {
        int i10 = e20.f15506s0;
        this.f49558a = i10;
        this.f49559b = view;
        wp r12 = wp.r1(i10);
        r12.O1().h0(j10, true);
        view.invalidate();
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        tL_stories_getPeerStories.peer = wp.r1(this.f49558a).i1(j10);
        ConnectionsManager.getInstance(this.f49558a).sendRequest(tL_stories_getPeerStories, new org.telegram.messenger.voip.c(this, j10, view, t5Var, r12));
    }
}
