package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class ye0 extends org.telegram.ui.Components.po0 {
    public final ze0 V2;

    public ye0(ze0 ze0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, str, false, str2, false, e6Var);
        this.V2 = ze0Var;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String a02;
        cf0 cf0Var = this.V2.L;
        if (!z10) {
            return;
        }
        if (hVar != null && hVar.m() == 1) {
            long j3 = ((TLRPC.Dialog) hVar.n(0)).f28055id;
            if (j3 != 0 && j3 != cf0Var.getUserConfig().e()) {
                a02 = org.telegram.messenger.hd.a0(null, null, 2131749184, cf0Var.getMessagesController().B1(j3, true));
            } else {
                a02 = org.telegram.messenger.hd.M0(2131749185, null);
            }
        } else {
            a02 = org.telegram.messenger.hd.a0(null, null, 2131749187, org.telegram.messenger.hd.G(i7, "Chats", new Object[0]));
        }
        org.telegram.ui.Components.xb Q = org.telegram.ui.Components.cc.a0(cf0Var).Q(2131624029, 36, org.telegram.messenger.g0.X2(a02));
        Q.f41643r = false;
        Q.k(true);
    }
}
