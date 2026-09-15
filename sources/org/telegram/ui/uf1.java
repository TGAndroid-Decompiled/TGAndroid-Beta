package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class uf1 extends og.a {
    public final TLRPC.TL_forumTopic f37995c;

    public uf1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.f37995c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uf1.class == obj.getClass()) {
            uf1 uf1Var = (uf1) obj;
            int i10 = this.f15533a;
            if (i10 == uf1Var.f15533a && i10 == 0 && this.f37995c.f18164id == uf1Var.f37995c.f18164id) {
                return true;
            }
        }
        return false;
    }
}
