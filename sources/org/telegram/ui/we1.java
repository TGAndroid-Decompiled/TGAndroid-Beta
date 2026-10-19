package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class we1 extends pg.a {
    public final TLRPC.TL_forumTopic f42542c;

    public we1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f42542c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || we1.class != obj.getClass()) {
            return false;
        }
        we1 we1Var = (we1) obj;
        if (this.f44286a != we1Var.f44286a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f42542c;
        if (tL_forumTopic2 == null || (tL_forumTopic = we1Var.f42542c) == null || tL_forumTopic2.f20327id == tL_forumTopic.f20327id) {
            return true;
        }
        return false;
    }
}
