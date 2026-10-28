package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class te1 extends qg.a {
    public final TLRPC.TL_forumTopic f43620c;

    public te1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.f43620c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && te1.class == obj.getClass()) {
            te1 te1Var = (te1) obj;
            int i10 = this.f47075a;
            if (i10 == te1Var.f47075a && i10 == 0 && this.f43620c.f22080id == te1Var.f43620c.f22080id) {
                return true;
            }
        }
        return false;
    }
}
