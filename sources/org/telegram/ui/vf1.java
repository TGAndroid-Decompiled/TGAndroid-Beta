package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class vf1 extends og.a {
    public final TLRPC.TL_forumTopic f43040c;

    public vf1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.f43040c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vf1.class == obj.getClass()) {
            vf1 vf1Var = (vf1) obj;
            int i10 = this.f17211a;
            if (i10 == vf1Var.f17211a && i10 == 0 && this.f43040c.f20120id == vf1Var.f43040c.f20120id) {
                return true;
            }
        }
        return false;
    }
}
