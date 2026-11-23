package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wn implements View.OnClickListener {
    public final int f53421a;
    public final io f53422b;

    public wn(io ioVar, int i7) {
        this.f53421a = i7;
        this.f53422b = ioVar;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f53421a;
        io ioVar = this.f53422b;
        switch (i7) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ioVar.getParentActivity());
                String N0 = org.telegram.messenger.hd.N0(2131689472, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                t1Var.S = N0;
                if (ioVar.f48780b0) {
                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("RevokeLinkAlertChannel", null, 2131745825, ioVar.getMessagesController().X2 + "/" + org.telegram.messenger.v3.K(currentChannel, false), currentChannel.title));
                } else {
                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("RevokeLinkAlert", null, 2131745826, ioVar.getMessagesController().X2 + "/" + org.telegram.messenger.v3.K(currentChannel, false), currentChannel.title));
                }
                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131745828, null), new oi.e0(20, ioVar, currentChannel));
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
                    if (!ioVar.f48783d0) {
                        ioVar.f0();
                        return;
                    }
                    ioVar.W = false;
                    ioVar.h0();
                    return;
                }
                return;
            case 3:
                ff0 ff0Var = new ff0(ioVar.f48778a0, 0, 0L);
                ff0Var.m0(ioVar.Z, ioVar.m0);
                ioVar.presentFragment(ff0Var);
                return;
            default:
                boolean z10 = !ioVar.f48782c0;
                ioVar.f48782c0 = z10;
                ((org.telegram.ui.Cells.s8) view).setChecked(z10);
                return;
        }
    }
}
