package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class re1 extends qg.a {
    public final TLRPC.TL_forumTopic f43135c;

    public re1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.f43135c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && re1.class == obj.getClass()) {
            re1 re1Var = (re1) obj;
            int i10 = this.f47040a;
            if (i10 == re1Var.f47040a && i10 == 0 && this.f43135c.f22079id == re1Var.f43135c.f22079id) {
                return true;
            }
        }
        return false;
    }
}
