package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class yo extends org.telegram.ui.Components.y70 {
    public final Context f43874x;
    public final cp f43875y;

    public yo(cp cpVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.f43875y = cpVar;
        this.f43874x = context2;
    }

    @Override
    public final boolean a(final boolean z10, org.telegram.ui.Components.w70 w70Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        String str;
        org.telegram.ui.ActionBar.p6 p6Var;
        cp cpVar = this.f43875y;
        if (!cpVar.V || (chatFull = cpVar.Y) == null || (i10 = chatFull.invitesCount) == 0) {
            return true;
        }
        if (cpVar.f36497a0) {
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
        Context context = this.f43874x;
        p6Var = ((org.telegram.ui.ActionBar.k2) cpVar).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        String L0 = org.telegram.messenger.cd.L0(2131754204, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G(i10, str, new Object[0]));
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131754206, null), new org.telegram.ui.ActionBar.u1(this) {
            public final yo f43610b;

            {
                this.f43610b = this;
            }

            @Override
            public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i11) {
                switch (r3) {
                    case 0:
                        boolean z11 = z10;
                        yo yoVar = this.f43610b;
                        yoVar.setJoinRequest(z11);
                        yoVar.f43875y.W = true;
                        return;
                    default:
                        boolean z12 = z10;
                        yo yoVar2 = this.f43610b;
                        yoVar2.setJoinRequest(z12);
                        yoVar2.f43875y.W = false;
                        return;
                }
            }
        });
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131754205, null), new org.telegram.ui.ActionBar.u1(this) {
            public final yo f43610b;

            {
                this.f43610b = this;
            }

            @Override
            public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i11) {
                switch (r3) {
                    case 0:
                        boolean z11 = z10;
                        yo yoVar = this.f43610b;
                        yoVar.setJoinRequest(z11);
                        yoVar.f43875y.W = true;
                        return;
                    default:
                        boolean z12 = z10;
                        yo yoVar2 = this.f43610b;
                        yoVar2.setJoinRequest(z12);
                        yoVar2.f43875y.W = false;
                        return;
                }
            }
        });
        cpVar.showDialog(x1Var);
        return false;
    }
}
