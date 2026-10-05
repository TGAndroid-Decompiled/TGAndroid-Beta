package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class yf1 implements o11 {
    public final TLRPC.TL_forumTopic f43219a;
    public final zf1 f43220b;

    public yf1(zf1 zf1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f43220b = zf1Var;
        this.f43219a = tL_forumTopic;
    }

    @Override
    public final void d0() {
        cg1 cg1Var = this.f43220b.f43771a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f43219a;
        cg1.S(cg1Var, tL_forumTopic.f20099id);
        AndroidUtilities.runOnUIThread(new e91(11, this, tL_forumTopic), 300L);
    }

    @Override
    public final void v(rk0 rk0Var) {
    }
}
