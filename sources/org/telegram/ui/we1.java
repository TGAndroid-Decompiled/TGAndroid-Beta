package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class we1 extends pg.a {
    public final TLRPC.TL_forumTopic f42549c;

    public we1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f42549c = tL_forumTopic;
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
        if (this.f44296a != we1Var.f44296a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f42549c;
        if (tL_forumTopic2 == null || (tL_forumTopic = we1Var.f42549c) == null || tL_forumTopic2.f20328id == tL_forumTopic.f20328id) {
            return true;
        }
        return false;
    }
}
