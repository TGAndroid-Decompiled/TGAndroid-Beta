package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ye1 extends pg.a {
    public final TLRPC.TL_forumTopic f43399c;

    public ye1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f43399c = tL_forumTopic;
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
        if (this.f44314a != ye1Var.f44314a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f43399c;
        if (tL_forumTopic2 == null || (tL_forumTopic = ye1Var.f43399c) == null || tL_forumTopic2.f20324id == tL_forumTopic.f20324id) {
            return true;
        }
        return false;
    }
}
