package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class rb1 implements ty0 {
    public final TLRPC.TL_forumTopic f41194a;
    public final sb1 f41195b;

    public rb1(sb1 sb1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f41195b = sb1Var;
        this.f41194a = tL_forumTopic;
    }

    @Override
    public final void b0() {
        vb1 vb1Var = this.f41195b.f41465a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f41194a;
        vb1.Y(vb1Var, tL_forumTopic.f19845id);
        org.telegram.messenger.i0.h3(new t11(14, this, tL_forumTopic), 300L);
    }

    @Override
    public final void w(ui0 ui0Var) {
    }
}
