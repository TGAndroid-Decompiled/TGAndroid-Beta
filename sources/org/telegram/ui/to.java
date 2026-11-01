package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class to implements View.OnClickListener {
    public final int f41680a;
    public final cp f41681b;

    public to(cp cpVar, int i10) {
        this.f41680a = i10;
        this.f41681b = cpVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f41680a;
        cp cpVar = this.f41681b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.m) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cpVar.getParentActivity());
                String L0 = org.telegram.messenger.dd.L0(2131689472, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                x1Var.R = L0;
                if (cpVar.f36358a0) {
                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0("RevokeLinkAlertChannel", null, 2131746038, cpVar.getMessagesController().U2 + "/" + org.telegram.messenger.w3.K(currentChannel, false), currentChannel.title));
                } else {
                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0("RevokeLinkAlert", null, 2131746039, cpVar.getMessagesController().U2 + "/" + org.telegram.messenger.w3.K(currentChannel, false), currentChannel.title));
                }
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131746041, null), new ng.d(18, cpVar, currentChannel));
                cpVar.showDialog(x1Var);
                return;
            case 1:
                if (!cpVar.V) {
                    cpVar.V = true;
                    cpVar.h0();
                    return;
                }
                return;
            case 2:
                if (cpVar.V) {
                    if (!cpVar.f36362c0) {
                        cpVar.f0();
                        return;
                    }
                    cpVar.V = false;
                    cpVar.h0();
                    return;
                }
                return;
            case 3:
                ig0 ig0Var = new ig0(cpVar.Z, 0, 0L);
                ig0Var.m0(cpVar.Y, cpVar.f36372l0);
                cpVar.presentFragment(ig0Var);
                return;
            default:
                boolean z10 = !cpVar.f36360b0;
                cpVar.f36360b0 = z10;
                ((org.telegram.ui.Cells.t8) view).setChecked(z10);
                return;
        }
    }
}
