package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wo extends org.telegram.ui.Components.g90 {
    public final Context f45522w;
    public final ap f45523x;

    public wo(ap apVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.f45523x = apVar;
        this.f45522w = context2;
    }

    @Override
    public final boolean a(final boolean z10, org.telegram.ui.Components.e90 e90Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        String str;
        org.telegram.ui.ActionBar.u6 u6Var;
        ap apVar = this.f45523x;
        if (apVar.V && (chatFull = apVar.Y) != null && (i10 = chatFull.invitesCount) != 0) {
            if (apVar.f37842a0) {
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
            Context context = this.f45522w;
            u6Var = ((org.telegram.ui.ActionBar.r2) apVar).resourceProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
            alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
            alertDialog$Builder.f22366a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
            alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.b2(this) {
                public final wo f44863b;

                {
                    this.f44863b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            wo woVar = this.f44863b;
                            woVar.setJoinRequest(z11);
                            woVar.f45523x.W = true;
                            return;
                        default:
                            boolean z12 = z10;
                            wo woVar2 = this.f44863b;
                            woVar2.setJoinRequest(z12);
                            woVar2.f45523x.W = false;
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.b2(this) {
                public final wo f44863b;

                {
                    this.f44863b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            wo woVar = this.f44863b;
                            woVar.setJoinRequest(z11);
                            woVar.f45523x.W = true;
                            return;
                        default:
                            boolean z12 = z10;
                            wo woVar2 = this.f44863b;
                            woVar2.setJoinRequest(z12);
                            woVar2.f45523x.W = false;
                            return;
                    }
                }
            });
            apVar.showDialog(alertDialog$Builder.f22366a);
            return false;
        }
        return true;
    }
}
