package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

public final class ye1 implements s01 {

    public final TLRPC.TL_forumTopic f44797a;

    public final ze1 f44798b;

    public ye1(ze1 ze1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f44798b = ze1Var;
        this.f44797a = tL_forumTopic;
    }

    @Override
    public final void G() {
        cf1 cf1Var = this.f44798b.f45155a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f44797a;
        cf1.U(cf1Var, tL_forumTopic.f22432id);
        AndroidUtilities.runOnUIThread(new m21(20, this, tL_forumTopic), 300L);
    }

    @Override
    public final void l(fk0 fk0Var) {
    }
}
