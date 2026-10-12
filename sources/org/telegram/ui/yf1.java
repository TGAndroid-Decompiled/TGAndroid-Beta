package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class yf1 extends og.a {
    public final TLRPC.TL_forumTopic f44474c;

    public yf1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.f44474c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yf1.class == obj.getClass()) {
            yf1 yf1Var = (yf1) obj;
            int i10 = this.f16877a;
            if (i10 == yf1Var.f16877a && i10 == 0 && this.f44474c.f19855id == yf1Var.f44474c.f19855id) {
                return true;
            }
        }
        return false;
    }
}
