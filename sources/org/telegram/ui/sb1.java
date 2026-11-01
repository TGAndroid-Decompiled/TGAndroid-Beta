package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sb1 extends hg.b {
    public final TLRPC.TL_forumTopic f41336c;

    public sb1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f41336c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || sb1.class != obj.getClass()) {
            return false;
        }
        sb1 sb1Var = (sb1) obj;
        if (this.f7681a != sb1Var.f7681a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f41336c;
        if (tL_forumTopic2 == null || (tL_forumTopic = sb1Var.f41336c) == null || tL_forumTopic2.f19846id == tL_forumTopic.f19846id) {
            return true;
        }
        return false;
    }
}
