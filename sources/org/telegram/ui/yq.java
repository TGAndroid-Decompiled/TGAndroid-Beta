package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class yq implements g60 {
    public final l60 f43536a;
    public final hr f43537b;

    public yq(hr hrVar, l60 l60Var) {
        this.f43537b = hrVar;
        this.f43536a = l60Var;
    }

    @Override
    public final void h(TLRPC.User user) {
        this.f43537b.t0(user.f20422id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void i(int i10, ArrayList arrayList) {
        if (this.f43536a.getParentActivity() == null) {
            return;
        }
        hr hrVar = this.f43537b;
        hrVar.getMessagesController().addUsersToChat(hrVar.f37775r, hrVar, arrayList, i10, new j3(this, 2), new xq(0), null);
    }
}
