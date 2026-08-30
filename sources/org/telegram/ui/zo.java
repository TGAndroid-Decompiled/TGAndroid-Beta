package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zo extends org.telegram.ui.Components.m80 {
    public final Context f40842w;
    public final dp f40843x;

    public zo(dp dpVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.f40843x = dpVar;
        this.f40842w = context2;
    }

    @Override
    public final boolean a(final boolean z4, org.telegram.ui.Components.k80 k80Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        String str;
        org.telegram.ui.ActionBar.f6 f6Var;
        dp dpVar = this.f40843x;
        if (dpVar.S && (chatFull = dpVar.V) != null && (i10 = chatFull.invitesCount) != 0) {
            if (dpVar.X) {
                if (z4) {
                    str = "ApproveNewMembersEnableForLinksChannel";
                } else {
                    str = "ApproveNewMembersDisableForLinksChannel";
                }
            } else if (z4) {
                str = "ApproveNewMembersEnableForLinks";
            } else {
                str = "ApproveNewMembersDisableForLinks";
            }
            Context context = this.f40842w;
            f6Var = ((org.telegram.ui.ActionBar.p2) dpVar).resourceProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
            alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
            alertDialog$Builder.f19503a.Q = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
            alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.c2(this) {
                public final zo f40548b;

                {
                    this.f40548b = this;
                }

                @Override
                public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z10 = z4;
                            zo zoVar = this.f40548b;
                            zoVar.setJoinRequest(z10);
                            zoVar.f40843x.T = true;
                            return;
                        default:
                            boolean z11 = z4;
                            zo zoVar2 = this.f40548b;
                            zoVar2.setJoinRequest(z11);
                            zoVar2.f40843x.T = false;
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.c2(this) {
                public final zo f40548b;

                {
                    this.f40548b = this;
                }

                @Override
                public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z10 = z4;
                            zo zoVar = this.f40548b;
                            zoVar.setJoinRequest(z10);
                            zoVar.f40843x.T = true;
                            return;
                        default:
                            boolean z11 = z4;
                            zo zoVar2 = this.f40548b;
                            zoVar2.setJoinRequest(z11);
                            zoVar2.f40843x.T = false;
                            return;
                    }
                }
            });
            dpVar.showDialog(alertDialog$Builder.f19503a);
            return false;
        }
        return true;
    }
}
