package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class to extends org.telegram.ui.Components.x70 {

    public final Context f42983w;

    public final xo f42984x;

    public to(xo xoVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.f42984x = xoVar;
        this.f42983w = context2;
    }

    @Override
    public final boolean a(final boolean z10, org.telegram.ui.Components.v70 v70Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        String str;
        xo xoVar = this.f42984x;
        if (!xoVar.R || (chatFull = xoVar.U) == null || (i10 = chatFull.invitesCount) == 0) {
            return true;
        }
        if (xoVar.W) {
            str = z10 ? "ApproveNewMembersEnableForLinksChannel" : "ApproveNewMembersDisableForLinksChannel";
        } else {
            str = z10 ? "ApproveNewMembersEnableForLinks" : "ApproveNewMembersDisableForLinks";
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f42983w, 0, ((org.telegram.ui.ActionBar.n2) xoVar).resourceProvider);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
        alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
        final int i11 = 0;
        alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.a2(this) {

            public final to f42673b;

            {
                this.f42673b = this;
            }

            @Override
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i12) {
                switch (i11) {
                    case 0:
                        boolean z11 = z10;
                        to toVar = this.f42673b;
                        toVar.setJoinRequest(z11);
                        toVar.f42984x.S = true;
                        break;
                    default:
                        boolean z12 = z10;
                        to toVar2 = this.f42673b;
                        toVar2.setJoinRequest(z12);
                        toVar2.f42984x.S = false;
                        break;
                }
            }
        });
        final int i12 = 1;
        alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.a2(this) {

            public final to f42673b;

            {
                this.f42673b = this;
            }

            @Override
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i13) {
                switch (i12) {
                    case 0:
                        boolean z11 = z10;
                        to toVar = this.f42673b;
                        toVar.setJoinRequest(z11);
                        toVar.f42984x.S = true;
                        break;
                    default:
                        boolean z12 = z10;
                        to toVar2 = this.f42673b;
                        toVar2.setJoinRequest(z12);
                        toVar2.f42984x.S = false;
                        break;
                }
            }
        });
        xoVar.showDialog(alertDialog$Builder.f22702a);
        return false;
    }
}
