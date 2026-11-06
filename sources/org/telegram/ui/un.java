package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class un implements View.OnClickListener {
    public final int f50432a;
    public final go f50433b;

    public un(go goVar, int i7) {
        this.f50432a = i7;
        this.f50433b = goVar;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f50432a;
        go goVar = this.f50433b;
        switch (i7) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(goVar.getParentActivity());
                String M0 = org.telegram.messenger.hd.M0(2131689472, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                u1Var.R = M0;
                if (goVar.f46020a0) {
                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("RevokeLinkAlertChannel", null, 2131746022, goVar.getMessagesController().U2 + "/" + org.telegram.messenger.t3.K(currentChannel, false), currentChannel.title));
                } else {
                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("RevokeLinkAlert", null, 2131746023, goVar.getMessagesController().U2 + "/" + org.telegram.messenger.t3.K(currentChannel, false), currentChannel.title));
                }
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746025, null), new ni.c(18, goVar, currentChannel));
                goVar.showDialog(u1Var);
                return;
            case 1:
                if (!goVar.V) {
                    goVar.V = true;
                    goVar.h0();
                    return;
                }
                return;
            case 2:
                if (goVar.V) {
                    if (!goVar.f46024c0) {
                        goVar.f0();
                        return;
                    }
                    goVar.V = false;
                    goVar.h0();
                    return;
                }
                return;
            case 3:
                cf0 cf0Var = new cf0(goVar.Z, 0, 0L);
                cf0Var.m0(goVar.Y, goVar.f46035l0);
                goVar.presentFragment(cf0Var);
                return;
            default:
                boolean z9 = !goVar.f46022b0;
                goVar.f46022b0 = z9;
                ((org.telegram.ui.Cells.r8) view).setChecked(z9);
                return;
        }
    }
}
