package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class zi implements MessagesStorage.IntCallback {
    public final int f45162a;
    public final boolean f45163b;
    public final Object f45164c;

    public zi(int i9, Object obj, boolean z10) {
        this.f45162a = i9;
        this.f45164c = obj;
        this.f45163b = z10;
    }

    @Override
    public final void run(int i9) {
        org.telegram.ui.Components.nc ncVar;
        switch (this.f45162a) {
            case 0:
                qn qnVar = ((bj) this.f45164c).f36877b;
                if (i9 > 0 && qnVar.getParentActivity() != null) {
                    org.telegram.ui.Components.oc a02 = org.telegram.ui.Components.oc.a0(qnVar);
                    if (this.f45163b) {
                        ncVar = org.telegram.ui.Components.nc.C;
                    } else {
                        ncVar = org.telegram.ui.Components.nc.E;
                    }
                    a02.m(ncVar, i9, 0, 0, qnVar.f41848aa).j();
                    return;
                }
                return;
            default:
                aj ajVar = (aj) this.f45164c;
                qn qnVar2 = ajVar.f36509b.f36877b;
                if (i9 >= 50) {
                    TLRPC.Chat chat = qnVar2.f41890e;
                    TLRPC.User user = qnVar2.f41903f;
                    boolean z10 = this.f45163b;
                    org.telegram.ui.Components.y4.s(qnVar2, true, chat, user, false, false, false, z10, new b1(ajVar, z10));
                    return;
                }
                qnVar2.qa(qnVar2.Z3, true);
                return;
        }
    }
}
