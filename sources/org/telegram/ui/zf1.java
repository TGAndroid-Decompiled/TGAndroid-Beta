package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class zf1 extends ng.a {
    public final TLRPC.TL_forumTopic f39309c;

    public zf1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.f39309c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zf1.class == obj.getClass()) {
            zf1 zf1Var = (zf1) obj;
            int i10 = this.f14046a;
            if (i10 == zf1Var.f14046a && i10 == 0 && this.f39309c.f17247id == zf1Var.f39309c.f17247id) {
                return true;
            }
        }
        return false;
    }
}
