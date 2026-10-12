package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class yf1 extends og.a {
    public final TLRPC.TL_forumTopic f44469c;

    public yf1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.f44469c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yf1.class == obj.getClass()) {
            yf1 yf1Var = (yf1) obj;
            int i10 = this.f16876a;
            if (i10 == yf1Var.f16876a && i10 == 0 && this.f44469c.f19854id == yf1Var.f44469c.f19854id) {
                return true;
            }
        }
        return false;
    }
}
