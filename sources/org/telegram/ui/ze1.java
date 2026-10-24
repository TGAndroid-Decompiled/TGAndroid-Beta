package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ze1 implements b11 {
    public final TLRPC.TL_forumTopic f44087a;
    public final af1 f44088b;

    public ze1(af1 af1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f44088b = af1Var;
        this.f44087a = tL_forumTopic;
    }

    @Override
    public final void O() {
        df1 df1Var = this.f44088b.f35752a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f44087a;
        df1.U(df1Var, tL_forumTopic.f20396id);
        AndroidUtilities.runOnUIThread(new n71(14, this, tL_forumTopic), 300L);
    }

    @Override
    public final void r(hk0 hk0Var) {
    }
}
