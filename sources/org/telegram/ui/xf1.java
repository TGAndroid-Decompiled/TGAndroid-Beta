package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class xf1 extends cg.b {
    public final TLRPC.TL_forumTopic f43033c;

    public xf1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f43033c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || xf1.class != obj.getClass()) {
            return false;
        }
        xf1 xf1Var = (xf1) obj;
        if (this.f2505a != xf1Var.f2505a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f43033c;
        if (tL_forumTopic2 == null || (tL_forumTopic = xf1Var.f43033c) == null || tL_forumTopic2.f20897id == tL_forumTopic.f20897id) {
            return true;
        }
        return false;
    }
}
