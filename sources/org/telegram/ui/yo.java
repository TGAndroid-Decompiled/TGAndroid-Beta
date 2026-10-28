package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class yo extends org.telegram.ui.Components.h90 {
    public final Context f46053w;
    public final cp f46054x;

    public yo(cp cpVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.f46054x = cpVar;
        this.f46053w = context2;
    }

    @Override
    public final boolean a(final boolean z10, org.telegram.ui.Components.f90 f90Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        String str;
        org.telegram.ui.ActionBar.u6 u6Var;
        cp cpVar = this.f46054x;
        if (cpVar.V && (chatFull = cpVar.Y) != null && (i10 = chatFull.invitesCount) != 0) {
            if (cpVar.f38402a0) {
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
            Context context = this.f46053w;
            u6Var = ((org.telegram.ui.ActionBar.r2) cpVar).resourceProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
            alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
            alertDialog$Builder.f22369a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
            alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.b2(this) {
                public final yo f45741b;

                {
                    this.f45741b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            yo yoVar = this.f45741b;
                            yoVar.setJoinRequest(z11);
                            yoVar.f46054x.W = true;
                            return;
                        default:
                            boolean z12 = z10;
                            yo yoVar2 = this.f45741b;
                            yoVar2.setJoinRequest(z12);
                            yoVar2.f46054x.W = false;
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.b2(this) {
                public final yo f45741b;

                {
                    this.f45741b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            yo yoVar = this.f45741b;
                            yoVar.setJoinRequest(z11);
                            yoVar.f46054x.W = true;
                            return;
                        default:
                            boolean z12 = z10;
                            yo yoVar2 = this.f45741b;
                            yoVar2.setJoinRequest(z12);
                            yoVar2.f46054x.W = false;
                            return;
                    }
                }
            });
            cpVar.showDialog(alertDialog$Builder.f22369a);
            return false;
        }
        return true;
    }
}
