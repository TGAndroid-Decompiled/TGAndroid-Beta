package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class uf1 implements k11 {
    public final TLRPC.TL_forumTopic f38808a;
    public final vf1 f38809b;

    public uf1(vf1 vf1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f38809b = vf1Var;
        this.f38808a = tL_forumTopic;
    }

    @Override
    public final void b0() {
        yf1 yf1Var = this.f38809b.f39087a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f38808a;
        yf1.U(yf1Var, tL_forumTopic.f19211id);
        AndroidUtilities.runOnUIThread(new b11(25, this, tL_forumTopic), 300L);
    }

    @Override
    public final void v(lk0 lk0Var) {
    }
}
