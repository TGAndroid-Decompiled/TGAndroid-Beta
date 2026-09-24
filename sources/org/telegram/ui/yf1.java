package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class yf1 implements m11 {
    public final TLRPC.TL_forumTopic f40127a;
    public final zf1 f40128b;

    public yf1(zf1 zf1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f40128b = zf1Var;
        this.f40127a = tL_forumTopic;
    }

    @Override
    public final void c0() {
        cg1 cg1Var = this.f40128b.f40451a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f40127a;
        cg1.U(cg1Var, tL_forumTopic.f18373id);
        AndroidUtilities.runOnUIThread(new n81(14, this, tL_forumTopic), 300L);
    }

    @Override
    public final void v(nk0 nk0Var) {
    }
}
