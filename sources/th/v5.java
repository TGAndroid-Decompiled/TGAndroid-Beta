package th;

import android.view.View;
import org.telegram.messenger.d20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
public final class v5 {
    public int f49544a;
    public View f49545b;

    public v5() {
        ConnectionsManager.generateClassGuid();
    }

    public final void a(long j10, View view, t5 t5Var) {
        int i10 = d20.f15147s0;
        this.f49544a = i10;
        this.f49545b = view;
        vp r12 = vp.r1(i10);
        r12.O1().h0(j10, true);
        view.invalidate();
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        tL_stories_getPeerStories.peer = vp.r1(this.f49544a).i1(j10);
        ConnectionsManager.getInstance(this.f49544a).sendRequest(tL_stories_getPeerStories, new org.telegram.messenger.voip.c(this, j10, view, t5Var, r12));
    }
}
