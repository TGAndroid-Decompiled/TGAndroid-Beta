package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zq implements f60 {
    public final k60 f45236a;
    public final jr f45237b;

    public zq(jr jrVar, k60 k60Var) {
        this.f45237b = jrVar;
        this.f45236a = k60Var;
    }

    @Override
    public final void i(TLRPC.User user) {
        this.f45237b.s0(user.f22527id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void j(int i9, ArrayList arrayList) {
        if (this.f45236a.getParentActivity() == null) {
            return;
        }
        jr jrVar = this.f45237b;
        jrVar.getMessagesController().addUsersToChat(jrVar.f39595r, jrVar, arrayList, i9, new k3(this, 2), new yq(0), null);
    }
}
