package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class xf1 extends bg.b {
    public final TLRPC.TL_forumTopic f39976c;

    public xf1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f39976c = tL_forumTopic;
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
        if (this.f1830a != xf1Var.f1830a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f39976c;
        if (tL_forumTopic2 == null || (tL_forumTopic = xf1Var.f39976c) == null || tL_forumTopic2.f19211id == tL_forumTopic.f19211id) {
            return true;
        }
        return false;
    }
}
