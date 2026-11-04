package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class xn extends org.telegram.ui.Components.b70 {
    public final Context f52053x;
    public final bo f52054y;

    public xn(bo boVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.f52054y = boVar;
        this.f52053x = context2;
    }

    @Override
    public final boolean a(final boolean z10, org.telegram.ui.Components.z60 z60Var) {
        TLRPC.ChatFull chatFull;
        int i3;
        String str;
        org.telegram.ui.ActionBar.e6 e6Var;
        bo boVar = this.f52054y;
        if (!boVar.W || (chatFull = boVar.Z) == null || (i3 = chatFull.invitesCount) == 0) {
            return true;
        }
        if (boVar.f44091b0) {
            if (z10) {
                str = "ApproveNewMembersEnableForLinksChannel";
            } else {
                str = "ApproveNewMembersDisableForLinksChannel";
            }
        } else if (z10) {
            str = "ApproveNewMembersEnableForLinks";
        } else {
            str = "ApproveNewMembersDisableForLinks";
        }
        Context context = this.f52053x;
        e6Var = ((org.telegram.ui.ActionBar.d2) boVar).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        String M0 = org.telegram.messenger.bd.M0(2131754204, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(i3, str, new Object[0]));
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131754206, null), new org.telegram.ui.ActionBar.p1(this) {
            public final xn f51575b;

            {
                this.f51575b = this;
            }

            @Override
            public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i10) {
                switch (r3) {
                    case 0:
                        boolean z11 = z10;
                        xn xnVar = this.f51575b;
                        xnVar.setJoinRequest(z11);
                        xnVar.f52054y.X = true;
                        return;
                    default:
                        boolean z12 = z10;
                        xn xnVar2 = this.f51575b;
                        xnVar2.setJoinRequest(z12);
                        xnVar2.f52054y.X = false;
                        return;
                }
            }
        });
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131754205, null), new org.telegram.ui.ActionBar.p1(this) {
            public final xn f51575b;

            {
                this.f51575b = this;
            }

            @Override
            public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i10) {
                switch (r3) {
                    case 0:
                        boolean z11 = z10;
                        xn xnVar = this.f51575b;
                        xnVar.setJoinRequest(z11);
                        xnVar.f52054y.X = true;
                        return;
                    default:
                        boolean z12 = z10;
                        xn xnVar2 = this.f51575b;
                        xnVar2.setJoinRequest(z12);
                        xnVar2.f52054y.X = false;
                        return;
                }
            }
        });
        boVar.showDialog(s1Var);
        return false;
    }
}
