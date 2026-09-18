package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class wf1 extends og.a {
    public final TLRPC.TL_forumTopic f39031c;

    public wf1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.f39031c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wf1.class == obj.getClass()) {
            wf1 wf1Var = (wf1) obj;
            int i10 = this.f15543a;
            if (i10 == wf1Var.f15543a && i10 == 0 && this.f39031c.f18173id == wf1Var.f39031c.f18173id) {
                return true;
            }
        }
        return false;
    }
}
