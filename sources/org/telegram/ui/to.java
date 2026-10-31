package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class to implements View.OnClickListener {
    public final int f41882a;
    public final cp f41883b;

    public to(cp cpVar, int i10) {
        this.f41882a = i10;
        this.f41883b = cpVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f41882a;
        cp cpVar = this.f41883b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.m) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cpVar.getParentActivity());
                String L0 = org.telegram.messenger.cd.L0(2131689472, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R = L0;
                if (cpVar.f36497a0) {
                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("RevokeLinkAlertChannel", null, 2131746038, cpVar.getMessagesController().U2 + "/" + org.telegram.messenger.w3.K(currentChannel, false), currentChannel.title));
                } else {
                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("RevokeLinkAlert", null, 2131746039, cpVar.getMessagesController().U2 + "/" + org.telegram.messenger.w3.K(currentChannel, false), currentChannel.title));
                }
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746041, null), new ng.d(18, cpVar, currentChannel));
                cpVar.showDialog(x1Var);
                return;
            case 1:
                if (!cpVar.V) {
                    cpVar.V = true;
                    cpVar.g0();
                    return;
                }
                return;
            case 2:
                if (cpVar.V) {
                    if (!cpVar.f36501c0) {
                        cpVar.e0();
                        return;
                    }
                    cpVar.V = false;
                    cpVar.g0();
                    return;
                }
                return;
            case 3:
                kg0 kg0Var = new kg0(cpVar.Z, 0, 0L);
                kg0Var.l0(cpVar.Y, cpVar.f36511l0);
                cpVar.presentFragment(kg0Var);
                return;
            default:
                boolean z10 = !cpVar.f36499b0;
                cpVar.f36499b0 = z10;
                ((org.telegram.ui.Cells.t8) view).setChecked(z10);
                return;
        }
    }
}
