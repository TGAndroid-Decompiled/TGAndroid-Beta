package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class r91 extends rg.a {
    public final TLRPC.TL_forumTopic f49322c;

    public r91(int i7, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i7, true);
        this.f49322c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r91.class == obj.getClass()) {
            r91 r91Var = (r91) obj;
            int i7 = this.f54543a;
            if (i7 == r91Var.f54543a && i7 == 0 && this.f49322c.f27012id == r91Var.f49322c.f27012id) {
                return true;
            }
        }
        return false;
    }
}
