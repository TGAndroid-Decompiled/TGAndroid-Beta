package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class rf1 extends cg.b {
    public final TLRPC.TL_forumTopic f40955c;

    public rf1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f40955c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || rf1.class != obj.getClass()) {
            return false;
        }
        rf1 rf1Var = (rf1) obj;
        if (this.f2505a != rf1Var.f2505a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f40955c;
        if (tL_forumTopic2 == null || (tL_forumTopic = rf1Var.f40955c) == null || tL_forumTopic2.f20895id == tL_forumTopic.f20895id) {
            return true;
        }
        return false;
    }
}
