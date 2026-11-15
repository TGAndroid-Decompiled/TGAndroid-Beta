package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class w91 implements ex0 {
    public final TLRPC.TL_forumTopic f52517a;
    public final x91 f52518b;

    public w91(x91 x91Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f52518b = x91Var;
        this.f52517a = tL_forumTopic;
    }

    @Override
    public final void b0() {
        aa1 aa1Var = this.f52518b.f53132a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f52517a;
        aa1.Z(aa1Var, tL_forumTopic.f28103id);
        org.telegram.messenger.g0.i3(new fy0(18, this, tL_forumTopic), 300L);
    }

    @Override
    public final void d(qh0 qh0Var) {
    }
}
