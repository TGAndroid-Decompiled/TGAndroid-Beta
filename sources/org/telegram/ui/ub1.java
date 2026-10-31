package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ub1 extends hg.b {
    public final TLRPC.TL_forumTopic f42112c;

    public ub1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f42112c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || ub1.class != obj.getClass()) {
            return false;
        }
        ub1 ub1Var = (ub1) obj;
        if (this.f7680a != ub1Var.f7680a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f42112c;
        if (tL_forumTopic2 == null || (tL_forumTopic = ub1Var.f42112c) == null || tL_forumTopic2.f19845id == tL_forumTopic.f19845id) {
            return true;
        }
        return false;
    }
}
