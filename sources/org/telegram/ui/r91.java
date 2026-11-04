package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class r91 extends sg.a {
    public final TLRPC.TL_forumTopic f49148c;

    public r91(int i3, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i3, false);
        this.f49148c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || r91.class != obj.getClass()) {
            return false;
        }
        r91 r91Var = (r91) obj;
        if (this.f54715a != r91Var.f54715a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f49148c;
        if (tL_forumTopic2 == null || (tL_forumTopic = r91Var.f49148c) == null || tL_forumTopic2.f27053id == tL_forumTopic.f27053id) {
            return true;
        }
        return false;
    }
}
