package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class xn implements View.OnClickListener {
    public final int f53852a;
    public final jo f53853b;

    public xn(jo joVar, int i7) {
        this.f53852a = i7;
        this.f53853b = joVar;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f53852a;
        jo joVar = this.f53853b;
        switch (i7) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(joVar.getParentActivity());
                String M0 = org.telegram.messenger.gd.M0(2131689472, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                u1Var.S = M0;
                if (joVar.f48998b0) {
                    u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("RevokeLinkAlertChannel", null, 2131745826, joVar.getMessagesController().X2 + "/" + org.telegram.messenger.v3.K(currentChannel, false), currentChannel.title));
                } else {
                    u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("RevokeLinkAlert", null, 2131745827, joVar.getMessagesController().X2 + "/" + org.telegram.messenger.v3.K(currentChannel, false), currentChannel.title));
                }
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131745829, null), new oi.e0(20, joVar, currentChannel));
                joVar.showDialog(u1Var);
                return;
            case 1:
                if (!joVar.W) {
                    joVar.W = true;
                    joVar.h0();
                    return;
                }
                return;
            case 2:
                if (joVar.W) {
                    if (!joVar.f49001d0) {
                        joVar.f0();
                        return;
                    }
                    joVar.W = false;
                    joVar.h0();
                    return;
                }
                return;
            case 3:
                gf0 gf0Var = new gf0(joVar.f48996a0, 0, 0L);
                gf0Var.m0(joVar.Z, joVar.m0);
                joVar.presentFragment(gf0Var);
                return;
            default:
                boolean z10 = !joVar.f49000c0;
                joVar.f49000c0 = z10;
                ((org.telegram.ui.Cells.s8) view).setChecked(z10);
                return;
        }
    }
}
