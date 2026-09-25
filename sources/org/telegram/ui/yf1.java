package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class yf1 implements m11 {
    public final TLRPC.TL_forumTopic f40143a;
    public final zf1 f40144b;

    public yf1(zf1 zf1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f40144b = zf1Var;
        this.f40143a = tL_forumTopic;
    }

    @Override
    public final void c0() {
        cg1 cg1Var = this.f40144b.f40468a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f40143a;
        cg1.U(cg1Var, tL_forumTopic.f18388id);
        AndroidUtilities.runOnUIThread(new p81(13, this, tL_forumTopic), 300L);
    }

    @Override
    public final void v(nk0 nk0Var) {
    }
}
