package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ve1 implements a11 {
    public final TLRPC.TL_forumTopic f42191a;
    public final we1 f42192b;

    public ve1(we1 we1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f42192b = we1Var;
        this.f42191a = tL_forumTopic;
    }

    @Override
    public final void O() {
        ze1 ze1Var = this.f42192b.f42502a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f42191a;
        ze1.U(ze1Var, tL_forumTopic.f20324id);
        AndroidUtilities.runOnUIThread(new m71(14, this, tL_forumTopic), 300L);
    }

    @Override
    public final void r(gk0 gk0Var) {
    }
}
