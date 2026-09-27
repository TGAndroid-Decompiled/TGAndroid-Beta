package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class yf1 implements o11 {
    public final TLRPC.TL_forumTopic f40207a;
    public final zf1 f40208b;

    public yf1(zf1 zf1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f40208b = zf1Var;
        this.f40207a = tL_forumTopic;
    }

    @Override
    public final void c0() {
        cg1 cg1Var = this.f40208b.f40497a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f40207a;
        cg1.U(cg1Var, tL_forumTopic.f18381id);
        AndroidUtilities.runOnUIThread(new fb1(9, this, tL_forumTopic), 300L);
    }

    @Override
    public final void v(pk0 pk0Var) {
    }
}
