package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class x91 implements fx0 {
    public final TLRPC.TL_forumTopic f51788a;
    public final y91 f51789b;

    public x91(y91 y91Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f51789b = y91Var;
        this.f51788a = tL_forumTopic;
    }

    @Override
    public final void c0() {
        ba1 ba1Var = this.f51789b.f52157a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f51788a;
        ba1.Z(ba1Var, tL_forumTopic.f27004id);
        org.telegram.messenger.g0.i3(new by0(21, this, tL_forumTopic), 300L);
    }

    @Override
    public final void t(oh0 oh0Var) {
    }
}
