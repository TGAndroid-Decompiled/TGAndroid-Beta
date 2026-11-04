package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class te0 extends org.telegram.ui.Components.oo0 {
    public final ue0 S2;

    public te0(ue0 ue0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, str, false, str2, false, e6Var);
        this.S2 = ue0Var;
    }

    @Override
    public final void R0(a0.h hVar, int i3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String a02;
        xe0 xe0Var = this.S2.L;
        if (!z10) {
            return;
        }
        if (hVar != null && hVar.m() == 1) {
            long j10 = ((TLRPC.Dialog) hVar.n(0)).f27005id;
            if (j10 != 0 && j10 != xe0Var.getUserConfig().e()) {
                a02 = org.telegram.messenger.bd.a0(null, null, 2131749192, xe0Var.getMessagesController().B1(j10, true));
            } else {
                a02 = org.telegram.messenger.bd.M0(2131749193, null);
            }
        } else {
            a02 = org.telegram.messenger.bd.a0(null, null, 2131749195, org.telegram.messenger.bd.G(i3, "Chats", new Object[0]));
        }
        org.telegram.ui.Components.ac Q = org.telegram.ui.Components.fc.a0(xe0Var).Q(2131624028, 36, org.telegram.messenger.g0.X2(a02));
        Q.f31800r = false;
        Q.k(true);
    }
}
