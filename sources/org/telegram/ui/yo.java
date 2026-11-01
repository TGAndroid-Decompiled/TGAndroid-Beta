package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class yo extends org.telegram.ui.Components.y70 {
    public final Context f43697x;
    public final cp f43698y;

    public yo(cp cpVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.f43698y = cpVar;
        this.f43697x = context2;
    }

    @Override
    public final boolean a(final boolean z10, org.telegram.ui.Components.w70 w70Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        String str;
        org.telegram.ui.ActionBar.p6 p6Var;
        cp cpVar = this.f43698y;
        if (!cpVar.V || (chatFull = cpVar.Y) == null || (i10 = chatFull.invitesCount) == 0) {
            return true;
        }
        if (cpVar.f36358a0) {
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
        Context context = this.f43697x;
        p6Var = ((org.telegram.ui.ActionBar.k2) cpVar).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        String L0 = org.telegram.messenger.dd.L0(2131754204, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.G(i10, str, new Object[0]));
        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131754206, null), new org.telegram.ui.ActionBar.u1(this) {
            public final yo f43428b;

            {
                this.f43428b = this;
            }

            @Override
            public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i11) {
                switch (r3) {
                    case 0:
                        boolean z11 = z10;
                        yo yoVar = this.f43428b;
                        yoVar.setJoinRequest(z11);
                        yoVar.f43698y.W = true;
                        return;
                    default:
                        boolean z12 = z10;
                        yo yoVar2 = this.f43428b;
                        yoVar2.setJoinRequest(z12);
                        yoVar2.f43698y.W = false;
                        return;
                }
            }
        });
        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131754205, null), new org.telegram.ui.ActionBar.u1(this) {
            public final yo f43428b;

            {
                this.f43428b = this;
            }

            @Override
            public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i11) {
                switch (r3) {
                    case 0:
                        boolean z11 = z10;
                        yo yoVar = this.f43428b;
                        yoVar.setJoinRequest(z11);
                        yoVar.f43698y.W = true;
                        return;
                    default:
                        boolean z12 = z10;
                        yo yoVar2 = this.f43428b;
                        yoVar2.setJoinRequest(z12);
                        yoVar2.f43698y.W = false;
                        return;
                }
            }
        });
        cpVar.showDialog(x1Var);
        return false;
    }
}
