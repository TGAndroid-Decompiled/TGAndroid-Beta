package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class te1 implements y01 {
    public final TLRPC.TL_forumTopic f41662a;
    public final ue1 f41663b;

    public te1(ue1 ue1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f41663b = ue1Var;
        this.f41662a = tL_forumTopic;
    }

    @Override
    public final void O() {
        xe1 xe1Var = this.f41663b.f41950a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f41662a;
        xe1.U(xe1Var, tL_forumTopic.f20332id);
        AndroidUtilities.runOnUIThread(new k71(14, this, tL_forumTopic), 300L);
    }

    @Override
    public final void r(ek0 ek0Var) {
    }
}
