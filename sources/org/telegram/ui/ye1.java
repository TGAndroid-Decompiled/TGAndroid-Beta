package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ye1 extends pg.a {
    public final TLRPC.TL_forumTopic f43385c;

    public ye1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f43385c = tL_forumTopic;
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
        if (this.f44291a != ye1Var.f44291a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f43385c;
        if (tL_forumTopic2 == null || (tL_forumTopic = ye1Var.f43385c) == null || tL_forumTopic2.f20324id == tL_forumTopic.f20324id) {
            return true;
        }
        return false;
    }
}
