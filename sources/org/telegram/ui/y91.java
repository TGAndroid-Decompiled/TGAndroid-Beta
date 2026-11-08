package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class y91 implements fx0 {
    public final TLRPC.TL_forumTopic f52176a;
    public final z91 f52177b;

    public y91(z91 z91Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f52177b = z91Var;
        this.f52176a = tL_forumTopic;
    }

    @Override
    public final void c0() {
        ca1 ca1Var = this.f52177b.f52493a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f52176a;
        ca1.Z(ca1Var, tL_forumTopic.f27008id);
        org.telegram.messenger.g0.i3(new by0(21, this, tL_forumTopic), 300L);
    }

    @Override
    public final void t(oh0 oh0Var) {
    }
}
