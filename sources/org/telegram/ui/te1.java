package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class te1 implements y01 {
    public final TLRPC.TL_forumTopic f41653a;
    public final ue1 f41654b;

    public te1(ue1 ue1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f41654b = ue1Var;
        this.f41653a = tL_forumTopic;
    }

    @Override
    public final void O() {
        xe1 xe1Var = this.f41654b.f41956a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f41653a;
        xe1.U(xe1Var, tL_forumTopic.f20327id);
        AndroidUtilities.runOnUIThread(new k71(14, this, tL_forumTopic), 300L);
    }

    @Override
    public final void r(ek0 ek0Var) {
    }
}
