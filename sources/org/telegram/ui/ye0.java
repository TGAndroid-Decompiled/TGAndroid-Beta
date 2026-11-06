package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class ye0 extends org.telegram.ui.Components.mo0 {
    public final ze0 R2;

    public ye0(ze0 ze0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, str, false, str2, false, f6Var);
        this.R2 = ze0Var;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        String a02;
        cf0 cf0Var = this.R2.K;
        if (!z9) {
            return;
        }
        if (hVar != null && hVar.m() == 1) {
            long j3 = ((TLRPC.Dialog) hVar.n(0)).f26957id;
            if (j3 != 0 && j3 != cf0Var.getUserConfig().e()) {
                a02 = org.telegram.messenger.hd.a0(null, null, 2131749183, cf0Var.getMessagesController().B1(j3, true));
            } else {
                a02 = org.telegram.messenger.hd.M0(2131749184, null);
            }
        } else {
            a02 = org.telegram.messenger.hd.a0(null, null, 2131749186, org.telegram.messenger.hd.G(i7, "Chats", new Object[0]));
        }
        org.telegram.ui.Components.cc Q = org.telegram.ui.Components.hc.a0(cf0Var).Q(2131624028, 36, org.telegram.messenger.g0.X2(a02));
        Q.f32522r = false;
        Q.k(true);
    }
}
