package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class z91 extends rg.a {
    public final TLRPC.TL_forumTopic f53916c;

    public z91(int i7, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i7, false);
        this.f53916c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || z91.class != obj.getClass()) {
            return false;
        }
        z91 z91Var = (z91) obj;
        if (this.f56015a != z91Var.f56015a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f53916c;
        if (tL_forumTopic2 == null || (tL_forumTopic = z91Var.f53916c) == null || tL_forumTopic2.f28103id == tL_forumTopic.f28103id) {
            return true;
        }
        return false;
    }
}
