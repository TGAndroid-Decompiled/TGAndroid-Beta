package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ye1 extends pg.a {
    public final TLRPC.TL_forumTopic f43423c;

    public ye1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f43423c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || ye1.class != obj.getClass()) {
            return false;
        }
        ye1 ye1Var = (ye1) obj;
        if (this.f44334a != ye1Var.f44334a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f43423c;
        if (tL_forumTopic2 == null || (tL_forumTopic = ye1Var.f43423c) == null || tL_forumTopic2.f20331id == tL_forumTopic.f20331id) {
            return true;
        }
        return false;
    }
}
