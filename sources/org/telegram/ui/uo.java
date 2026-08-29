package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class uo extends org.telegram.ui.Components.g80 {
    public final Context f43294w;
    public final yo f43295x;

    public uo(yo yoVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.f43295x = yoVar;
        this.f43294w = context2;
    }

    @Override
    public final boolean a(final boolean z10, org.telegram.ui.Components.e80 e80Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        String str;
        org.telegram.ui.ActionBar.c6 c6Var;
        yo yoVar = this.f43295x;
        if (yoVar.R && (chatFull = yoVar.U) != null && (i10 = chatFull.invitesCount) != 0) {
            if (yoVar.W) {
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
            Context context = this.f43294w;
            c6Var = ((org.telegram.ui.ActionBar.o2) yoVar).resourceProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
            alertDialog$Builder.f22714a.P = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
            alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.b2(this) {
                public final uo f43065b;

                {
                    this.f43065b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            uo uoVar = this.f43065b;
                            uoVar.setJoinRequest(z11);
                            uoVar.f43295x.S = true;
                            return;
                        default:
                            boolean z12 = z10;
                            uo uoVar2 = this.f43065b;
                            uoVar2.setJoinRequest(z12);
                            uoVar2.f43295x.S = false;
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.b2(this) {
                public final uo f43065b;

                {
                    this.f43065b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            uo uoVar = this.f43065b;
                            uoVar.setJoinRequest(z11);
                            uoVar.f43295x.S = true;
                            return;
                        default:
                            boolean z12 = z10;
                            uo uoVar2 = this.f43065b;
                            uoVar2.setJoinRequest(z12);
                            uoVar2.f43295x.S = false;
                            return;
                    }
                }
            });
            yoVar.showDialog(alertDialog$Builder.f22714a);
            return false;
        }
        return true;
    }
}
