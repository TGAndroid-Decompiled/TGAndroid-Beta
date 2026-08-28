package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ro extends org.telegram.ui.Components.t70 {
    public final Context f42468w;
    public final vo f42469x;

    public ro(vo voVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.f42469x = voVar;
        this.f42468w = context2;
    }

    @Override
    public final boolean a(final boolean z10, org.telegram.ui.Components.r70 r70Var) {
        TLRPC.ChatFull chatFull;
        int i9;
        String str;
        org.telegram.ui.ActionBar.b6 b6Var;
        vo voVar = this.f42469x;
        if (voVar.R && (chatFull = voVar.U) != null && (i9 = chatFull.invitesCount) != 0) {
            if (voVar.W) {
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
            Context context = this.f42468w;
            b6Var = ((org.telegram.ui.ActionBar.o2) voVar).resourceProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
            alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i9, new Object[0]));
            alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.b2(this) {
                public final ro f42168b;

                {
                    this.f42168b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            ro roVar = this.f42168b;
                            roVar.setJoinRequest(z11);
                            roVar.f42469x.S = true;
                            return;
                        default:
                            boolean z12 = z10;
                            ro roVar2 = this.f42168b;
                            roVar2.setJoinRequest(z12);
                            roVar2.f42469x.S = false;
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.b2(this) {
                public final ro f42168b;

                {
                    this.f42168b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            ro roVar = this.f42168b;
                            roVar.setJoinRequest(z11);
                            roVar.f42469x.S = true;
                            return;
                        default:
                            boolean z12 = z10;
                            ro roVar2 = this.f42168b;
                            roVar2.setJoinRequest(z12);
                            roVar2.f42469x.S = false;
                            return;
                    }
                }
            });
            voVar.showDialog(alertDialog$Builder.f22702a);
            return false;
        }
        return true;
    }
}
