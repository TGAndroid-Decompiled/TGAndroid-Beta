package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class uf1 implements j11 {
    public final TLRPC.TL_forumTopic f41819a;
    public final vf1 f41820b;

    public uf1(vf1 vf1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f41820b = vf1Var;
        this.f41819a = tL_forumTopic;
    }

    @Override
    public final void d0() {
        yf1 yf1Var = this.f41820b.f42107a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f41819a;
        yf1.U(yf1Var, tL_forumTopic.f20897id);
        AndroidUtilities.runOnUIThread(new h21(24, this, tL_forumTopic), 300L);
    }

    @Override
    public final void u(lk0 lk0Var) {
    }
}
