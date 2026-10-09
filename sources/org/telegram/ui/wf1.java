package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class wf1 extends og.a {
    public final TLRPC.TL_forumTopic f43570c;

    public wf1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.f43570c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wf1.class == obj.getClass()) {
            wf1 wf1Var = (wf1) obj;
            int i10 = this.f17125a;
            if (i10 == wf1Var.f17125a && i10 == 0 && this.f43570c.f20090id == wf1Var.f43570c.f20090id) {
                return true;
            }
        }
        return false;
    }
}
