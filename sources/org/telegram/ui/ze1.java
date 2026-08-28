package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ze1 implements r01 {
    public final TLRPC.TL_forumTopic f45127a;
    public final af1 f45128b;

    public ze1(af1 af1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f45128b = af1Var;
        this.f45127a = tL_forumTopic;
    }

    @Override
    public final void E() {
        df1 df1Var = this.f45128b.f36475a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f45127a;
        df1.T(df1Var, tL_forumTopic.f22432id);
        AndroidUtilities.runOnUIThread(new n21(20, this, tL_forumTopic), 300L);
    }

    @Override
    public final void g(ek0 ek0Var) {
    }
}
