package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class so extends org.telegram.ui.Components.e90 {
    public final Context f41504w;
    public final wo f41505x;

    public so(wo woVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.f41505x = woVar;
        this.f41504w = context2;
    }

    @Override
    public final boolean a(final boolean z10, org.telegram.ui.Components.c90 c90Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        String str;
        org.telegram.ui.ActionBar.d6 d6Var;
        wo woVar = this.f41505x;
        if (woVar.V && (chatFull = woVar.Y) != null && (i10 = chatFull.invitesCount) != 0) {
            if (woVar.f42911a0) {
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
            Context context = this.f41504w;
            d6Var = ((org.telegram.ui.ActionBar.n2) woVar).resourceProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
            alertDialog$Builder.f20609a.R = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
            alertDialog$Builder.f20609a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
            alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.a2(this) {
                public final so f41263b;

                {
                    this.f41263b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            so soVar = this.f41263b;
                            soVar.setJoinRequest(z11);
                            soVar.f41505x.W = true;
                            return;
                        default:
                            boolean z12 = z10;
                            so soVar2 = this.f41263b;
                            soVar2.setJoinRequest(z12);
                            soVar2.f41505x.W = false;
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.a2(this) {
                public final so f41263b;

                {
                    this.f41263b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            so soVar = this.f41263b;
                            soVar.setJoinRequest(z11);
                            soVar.f41505x.W = true;
                            return;
                        default:
                            boolean z12 = z10;
                            so soVar2 = this.f41263b;
                            soVar2.setJoinRequest(z12);
                            soVar2.f41505x.W = false;
                            return;
                    }
                }
            });
            woVar.showDialog(alertDialog$Builder.f20609a);
            return false;
        }
        return true;
    }
}
