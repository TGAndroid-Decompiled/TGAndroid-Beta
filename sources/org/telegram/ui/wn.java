package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wn implements View.OnClickListener {
    public final int f53708a;
    public final io f53709b;

    public wn(io ioVar, int i7) {
        this.f53708a = i7;
        this.f53709b = ioVar;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f53708a;
        io ioVar = this.f53709b;
        switch (i7) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ioVar.getParentActivity());
                String N0 = org.telegram.messenger.gd.N0(2131689472, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                t1Var.S = N0;
                if (ioVar.f48864b0) {
                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("RevokeLinkAlertChannel", null, 2131745825, ioVar.getMessagesController().X2 + "/" + org.telegram.messenger.v3.K(currentChannel, false), currentChannel.title));
                } else {
                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("RevokeLinkAlert", null, 2131745826, ioVar.getMessagesController().X2 + "/" + org.telegram.messenger.v3.K(currentChannel, false), currentChannel.title));
                }
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131745828, null), new oi.f0(20, ioVar, currentChannel));
                ioVar.showDialog(t1Var);
                return;
            case 1:
                if (!ioVar.W) {
                    ioVar.W = true;
                    ioVar.h0();
                    return;
                }
                return;
            case 2:
                if (ioVar.W) {
                    if (!ioVar.f48867d0) {
                        ioVar.f0();
                        return;
                    }
                    ioVar.W = false;
                    ioVar.h0();
                    return;
                }
                return;
            case 3:
                ef0 ef0Var = new ef0(ioVar.f48862a0, 0, 0L);
                ef0Var.m0(ioVar.Z, ioVar.m0);
                ioVar.presentFragment(ef0Var);
                return;
            default:
                boolean z10 = !ioVar.f48866c0;
                ioVar.f48866c0 = z10;
                ((org.telegram.ui.Cells.r8) view).setChecked(z10);
                return;
        }
    }
}
