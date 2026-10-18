package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ve1 implements a11 {
    public final TLRPC.TL_forumTopic f42208a;
    public final we1 f42209b;

    public ve1(we1 we1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f42209b = we1Var;
        this.f42208a = tL_forumTopic;
    }

    @Override
    public final void O() {
        ze1 ze1Var = this.f42209b.f42526a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f42208a;
        ze1.U(ze1Var, tL_forumTopic.f20331id);
        AndroidUtilities.runOnUIThread(new m71(14, this, tL_forumTopic), 300L);
    }

    @Override
    public final void r(gk0 gk0Var) {
    }
}
