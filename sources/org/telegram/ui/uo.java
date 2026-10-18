package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class uo extends org.telegram.ui.Components.e90 {
    public final Context f41993w;
    public final yo f41994x;

    public uo(yo yoVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.f41994x = yoVar;
        this.f41993w = context2;
    }

    @Override
    public final boolean a(final boolean z10, org.telegram.ui.Components.c90 c90Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        String str;
        org.telegram.ui.ActionBar.d6 d6Var;
        yo yoVar = this.f41994x;
        if (yoVar.V && (chatFull = yoVar.Y) != null && (i10 = chatFull.invitesCount) != 0) {
            if (yoVar.f43423a0) {
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
            Context context = this.f41993w;
            d6Var = ((org.telegram.ui.ActionBar.n2) yoVar).resourceProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
            alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
            alertDialog$Builder.f20601a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
            alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.a2(this) {
                public final uo f41775b;

                {
                    this.f41775b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            uo uoVar = this.f41775b;
                            uoVar.setJoinRequest(z11);
                            uoVar.f41994x.W = true;
                            return;
                        default:
                            boolean z12 = z10;
                            uo uoVar2 = this.f41775b;
                            uoVar2.setJoinRequest(z12);
                            uoVar2.f41994x.W = false;
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.a2(this) {
                public final uo f41775b;

                {
                    this.f41775b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            uo uoVar = this.f41775b;
                            uoVar.setJoinRequest(z11);
                            uoVar.f41994x.W = true;
                            return;
                        default:
                            boolean z12 = z10;
                            uo uoVar2 = this.f41775b;
                            uoVar2.setJoinRequest(z12);
                            uoVar2.f41994x.W = false;
                            return;
                    }
                }
            });
            yoVar.showDialog(alertDialog$Builder.f20601a);
            return false;
        }
        return true;
    }
}
