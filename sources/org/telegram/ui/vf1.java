package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class vf1 extends og.a {
    public final TLRPC.TL_forumTopic f38528c;

    public vf1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.f38528c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vf1.class == obj.getClass()) {
            vf1 vf1Var = (vf1) obj;
            int i10 = this.f15531a;
            if (i10 == vf1Var.f15531a && i10 == 0 && this.f38528c.f18161id == vf1Var.f38528c.f18161id) {
                return true;
            }
        }
        return false;
    }
}
