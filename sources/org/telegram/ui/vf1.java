package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class vf1 extends pg.a {
    public final TLRPC.TL_forumTopic f41560c;

    public vf1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.f41560c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vf1.class == obj.getClass()) {
            vf1 vf1Var = (vf1) obj;
            int i10 = this.f44098a;
            if (i10 == vf1Var.f44098a && i10 == 0 && this.f41560c.f19948id == vf1Var.f41560c.f19948id) {
                return true;
            }
        }
        return false;
    }
}
