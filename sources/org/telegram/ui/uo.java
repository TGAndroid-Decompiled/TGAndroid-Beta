package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class uo extends org.telegram.ui.Components.e90 {
    public final Context f42035w;
    public final yo f42036x;

    public uo(yo yoVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.f42036x = yoVar;
        this.f42035w = context2;
    }

    @Override
    public final boolean a(final boolean z10, org.telegram.ui.Components.c90 c90Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        String str;
        org.telegram.ui.ActionBar.d6 d6Var;
        yo yoVar = this.f42036x;
        if (yoVar.V && (chatFull = yoVar.Y) != null && (i10 = chatFull.invitesCount) != 0) {
            if (yoVar.f43459a0) {
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
            Context context = this.f42035w;
            d6Var = ((org.telegram.ui.ActionBar.n2) yoVar).resourceProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
            alertDialog$Builder.f20608a.R = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
            alertDialog$Builder.f20608a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
            alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.a2(this) {
                public final uo f41816b;

                {
                    this.f41816b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            uo uoVar = this.f41816b;
                            uoVar.setJoinRequest(z11);
                            uoVar.f42036x.W = true;
                            return;
                        default:
                            boolean z12 = z10;
                            uo uoVar2 = this.f41816b;
                            uoVar2.setJoinRequest(z12);
                            uoVar2.f42036x.W = false;
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.a2(this) {
                public final uo f41816b;

                {
                    this.f41816b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            uo uoVar = this.f41816b;
                            uoVar.setJoinRequest(z11);
                            uoVar.f42036x.W = true;
                            return;
                        default:
                            boolean z12 = z10;
                            uo uoVar2 = this.f41816b;
                            uoVar2.setJoinRequest(z12);
                            uoVar2.f42036x.W = false;
                            return;
                    }
                }
            });
            yoVar.showDialog(alertDialog$Builder.f20608a);
            return false;
        }
        return true;
    }
}
