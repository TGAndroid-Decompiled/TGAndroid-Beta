package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class yq implements g60 {
    public final l60 f43537a;
    public final hr f43538b;

    public yq(hr hrVar, l60 l60Var) {
        this.f43538b = hrVar;
        this.f43537a = l60Var;
    }

    @Override
    public final void h(TLRPC.User user) {
        this.f43538b.t0(user.f20423id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void i(int i10, ArrayList arrayList) {
        if (this.f43537a.getParentActivity() == null) {
            return;
        }
        hr hrVar = this.f43538b;
        hrVar.getMessagesController().addUsersToChat(hrVar.f37752r, hrVar, arrayList, i10, new j3(this, 2), new xq(0), null);
    }
}
