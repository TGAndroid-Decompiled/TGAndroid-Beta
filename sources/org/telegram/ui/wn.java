package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wn implements View.OnClickListener {
    public final int f51432a;
    public final io f51433b;

    public wn(io ioVar, int i7) {
        this.f51432a = i7;
        this.f51433b = ioVar;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f51432a;
        io ioVar = this.f51433b;
        switch (i7) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ioVar.getParentActivity());
                String M0 = org.telegram.messenger.id.M0(2131689472, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                u1Var.R = M0;
                if (ioVar.f46709a0) {
                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("RevokeLinkAlertChannel", null, 2131746021, ioVar.getMessagesController().U2 + "/" + org.telegram.messenger.t3.K(currentChannel, false), currentChannel.title));
                } else {
                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("RevokeLinkAlert", null, 2131746022, ioVar.getMessagesController().U2 + "/" + org.telegram.messenger.t3.K(currentChannel, false), currentChannel.title));
                }
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746024, null), new ni.c(18, ioVar, currentChannel));
                ioVar.showDialog(u1Var);
                return;
            case 1:
                if (!ioVar.V) {
                    ioVar.V = true;
                    ioVar.h0();
                    return;
                }
                return;
            case 2:
                if (ioVar.V) {
                    if (!ioVar.f46713c0) {
                        ioVar.f0();
                        return;
                    }
                    ioVar.V = false;
                    ioVar.h0();
                    return;
                }
                return;
            case 3:
                ef0 ef0Var = new ef0(ioVar.Z, 0, 0L);
                ef0Var.m0(ioVar.Y, ioVar.f46724l0);
                ioVar.presentFragment(ef0Var);
                return;
            default:
                boolean z9 = !ioVar.f46711b0;
                ioVar.f46711b0 = z9;
                ((org.telegram.ui.Cells.r8) view).setChecked(z9);
                return;
        }
    }
}
