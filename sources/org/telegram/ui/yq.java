package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class yq implements g60 {
    public final l60 f43531a;
    public final hr f43532b;

    public yq(hr hrVar, l60 l60Var) {
        this.f43532b = hrVar;
        this.f43531a = l60Var;
    }

    @Override
    public final void h(TLRPC.User user) {
        this.f43532b.t0(user.f20420id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void i(int i10, ArrayList arrayList) {
        if (this.f43531a.getParentActivity() == null) {
            return;
        }
        hr hrVar = this.f43532b;
        hrVar.getMessagesController().addUsersToChat(hrVar.f37746r, hrVar, arrayList, i10, new j3(this, 2), new xq(0), null);
    }
}
