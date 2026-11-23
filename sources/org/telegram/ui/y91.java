package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class y91 implements gx0 {
    public final TLRPC.TL_forumTopic f54326a;
    public final z91 f54327b;

    public y91(z91 z91Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f54327b = z91Var;
        this.f54326a = tL_forumTopic;
    }

    @Override
    public final void Q() {
        ca1 ca1Var = this.f54327b.f54556a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f54326a;
        ca1.Z(ca1Var, tL_forumTopic.f28544id);
        org.telegram.messenger.g0.h3(new iy0(19, this, tL_forumTopic), 300L);
    }

    @Override
    public final void n(sh0 sh0Var) {
    }
}
