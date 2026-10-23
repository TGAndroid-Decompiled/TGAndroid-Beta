package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class uo extends org.telegram.ui.Components.f90 {
    public final Context f42482w;
    public final yo f42483x;

    public uo(yo yoVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.f42483x = yoVar;
        this.f42482w = context2;
    }

    @Override
    public final boolean a(final boolean z10, org.telegram.ui.Components.d90 d90Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        String str;
        org.telegram.ui.ActionBar.g6 g6Var;
        yo yoVar = this.f42483x;
        if (yoVar.W && (chatFull = yoVar.Z) != null && (i10 = chatFull.invitesCount) != 0) {
            if (yoVar.f43915b0) {
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
            Context context = this.f42482w;
            g6Var = ((org.telegram.ui.ActionBar.o2) yoVar).resourceProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
            alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
            alertDialog$Builder.f20678a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
            alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.z1(this) {
                public final uo f42049b;

                {
                    this.f42049b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            uo uoVar = this.f42049b;
                            uoVar.setJoinRequest(z11);
                            uoVar.f42483x.X = true;
                            return;
                        default:
                            boolean z12 = z10;
                            uo uoVar2 = this.f42049b;
                            uoVar2.setJoinRequest(z12);
                            uoVar2.f42483x.X = false;
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.z1(this) {
                public final uo f42049b;

                {
                    this.f42049b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            uo uoVar = this.f42049b;
                            uoVar.setJoinRequest(z11);
                            uoVar.f42483x.X = true;
                            return;
                        default:
                            boolean z12 = z10;
                            uo uoVar2 = this.f42049b;
                            uoVar2.setJoinRequest(z12);
                            uoVar2.f42483x.X = false;
                            return;
                    }
                }
            });
            yoVar.showDialog(alertDialog$Builder.f20678a);
            return false;
        }
        return true;
    }
}
