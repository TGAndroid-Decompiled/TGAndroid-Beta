package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class wf1 extends og.a {
    public final TLRPC.TL_forumTopic f39163c;

    public wf1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.f39163c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wf1.class == obj.getClass()) {
            wf1 wf1Var = (wf1) obj;
            int i10 = this.f15719a;
            if (i10 == wf1Var.f15719a && i10 == 0 && this.f39163c.f18395id == wf1Var.f39163c.f18395id) {
                return true;
            }
        }
        return false;
    }
}
