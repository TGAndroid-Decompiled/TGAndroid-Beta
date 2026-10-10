package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class wf1 extends og.a {
    public final TLRPC.TL_forumTopic f43614c;

    public wf1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.f43614c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wf1.class == obj.getClass()) {
            wf1 wf1Var = (wf1) obj;
            int i10 = this.f17129a;
            if (i10 == wf1Var.f17129a && i10 == 0 && this.f43614c.f20094id == wf1Var.f43614c.f20094id) {
                return true;
            }
        }
        return false;
    }
}
