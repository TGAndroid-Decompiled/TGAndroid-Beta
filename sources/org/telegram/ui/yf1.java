package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class yf1 implements o11 {
    public final TLRPC.TL_forumTopic f39813a;
    public final zf1 f39814b;

    public yf1(zf1 zf1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f39814b = zf1Var;
        this.f39813a = tL_forumTopic;
    }

    @Override
    public final void c0() {
        cg1 cg1Var = this.f39814b.f40121a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f39813a;
        cg1.U(cg1Var, tL_forumTopic.f18135id);
        AndroidUtilities.runOnUIThread(new hb1(8, this, tL_forumTopic), 300L);
    }

    @Override
    public final void v(nk0 nk0Var) {
    }
}
