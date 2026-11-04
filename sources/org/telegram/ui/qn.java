package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class qn implements View.OnClickListener {
    public final int f48916a;
    public final bo f48917b;

    public qn(bo boVar, int i3) {
        this.f48916a = i3;
        this.f48917b = boVar;
    }

    @Override
    public final void onClick(View view) {
        int i3 = this.f48916a;
        bo boVar = this.f48917b;
        switch (i3) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(boVar.getParentActivity());
                String M0 = org.telegram.messenger.bd.M0(2131689472, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                if (boVar.f44091b0) {
                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("RevokeLinkAlertChannel", null, 2131746031, boVar.getMessagesController().V2 + "/" + org.telegram.messenger.t3.K(currentChannel, false), currentChannel.title));
                } else {
                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("RevokeLinkAlert", null, 2131746032, boVar.getMessagesController().V2 + "/" + org.telegram.messenger.t3.K(currentChannel, false), currentChannel.title));
                }
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746034, null), new mi.d4(28, boVar, currentChannel));
                boVar.showDialog(s1Var);
                return;
            case 1:
                if (!boVar.W) {
                    boVar.W = true;
                    boVar.h0();
                    return;
                }
                return;
            case 2:
                if (boVar.W) {
                    if (!boVar.f44094d0) {
                        boVar.f0();
                        return;
                    }
                    boVar.W = false;
                    boVar.h0();
                    return;
                }
                return;
            case 3:
                xe0 xe0Var = new xe0(boVar.f44089a0, 0, 0L);
                xe0Var.m0(boVar.Z, boVar.m0);
                boVar.presentFragment(xe0Var);
                return;
            default:
                boolean z10 = !boVar.f44093c0;
                boVar.f44093c0 = z10;
                ((org.telegram.ui.Cells.q8) view).setChecked(z10);
                return;
        }
    }
}
