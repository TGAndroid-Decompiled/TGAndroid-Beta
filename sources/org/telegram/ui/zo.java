package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zo extends org.telegram.ui.Components.n80 {
    public final Context f43963w;
    public final ep f43964x;

    public zo(ep epVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.f43964x = epVar;
        this.f43963w = context2;
    }

    @Override
    public final boolean a(final boolean z4, org.telegram.ui.Components.l80 l80Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        String str;
        org.telegram.ui.ActionBar.g6 g6Var;
        ep epVar = this.f43964x;
        if (epVar.S && (chatFull = epVar.V) != null && (i10 = chatFull.invitesCount) != 0) {
            if (epVar.X) {
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
            Context context = this.f43963w;
            g6Var = ((org.telegram.ui.ActionBar.p2) epVar).resourceProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
            alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
            alertDialog$Builder.f21166a.Q = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
            alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.c2(this) {
                public final zo f43670b;

                {
                    this.f43670b = this;
                }

                @Override
                public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z10 = z4;
                            zo zoVar = this.f43670b;
                            zoVar.setJoinRequest(z10);
                            zoVar.f43964x.T = true;
                            return;
                        default:
                            boolean z11 = z4;
                            zo zoVar2 = this.f43670b;
                            zoVar2.setJoinRequest(z11);
                            zoVar2.f43964x.T = false;
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.c2(this) {
                public final zo f43670b;

                {
                    this.f43670b = this;
                }

                @Override
                public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z10 = z4;
                            zo zoVar = this.f43670b;
                            zoVar.setJoinRequest(z10);
                            zoVar.f43964x.T = true;
                            return;
                        default:
                            boolean z11 = z4;
                            zo zoVar2 = this.f43670b;
                            zoVar2.setJoinRequest(z11);
                            zoVar2.f43964x.T = false;
                            return;
                    }
                }
            });
            epVar.showDialog(alertDialog$Builder.f21166a);
            return false;
        }
        return true;
    }
}
