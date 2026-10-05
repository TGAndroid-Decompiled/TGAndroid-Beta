package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class sc1 implements org.telegram.ui.Components.oq {
    public final pd1 f40445a;

    public sc1(pd1 pd1Var) {
        this.f40445a = pd1Var;
    }

    @Override
    public final void C0(int r15, int r16, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sc1.C0(int, int, boolean):void");
    }

    @Override
    public final int K0(int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        pd1 pd1Var = this.f40445a;
        if (pd1Var.f39525n == 3) {
            org.telegram.ui.ActionBar.h6 h6Var = pd1Var.f39502e0;
            if (h6Var.S && i10 == 0 && (f6Var = (org.telegram.ui.ActionBar.f6) h6Var.f20698a0.get(org.telegram.ui.ActionBar.i6.f21006n)) != null) {
                return f6Var.f20623e;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void d(boolean z10) {
        int i10;
        int i11;
        pd1 pd1Var = this.f40445a;
        org.telegram.ui.ActionBar.f6 f6Var = pd1Var.f39537s;
        if (z10) {
            if (f6Var.f20635r == null) {
                pd1Var.finishFragment();
                i11 = ((org.telegram.ui.ActionBar.n2) pd1Var).currentAccount;
                MessagesController.getInstance(i11).saveThemeToServer(f6Var.f20621b, f6Var);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, f6Var.f20621b, f6Var);
                return;
            }
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.n2) pd1Var).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/addtheme/");
            sb2.append(f6Var.f20635r.slug);
            String sb3 = sb2.toString();
            pd1Var.showDialog(new org.telegram.ui.Components.br0(pd1Var.getParentActivity(), null, sb3, false, sb3, false, null));
            return;
        }
        org.telegram.ui.Components.e5.W(pd1Var, 1, null, null);
    }

    @Override
    public final void y() {
        pd1 pd1Var = this.f40445a;
        if (pd1Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pd1Var.getParentActivity());
            alertDialog$Builder.f20377a.R = LocaleController.getString(R.string.DeleteThemeTitle);
            alertDialog$Builder.f20377a.T = LocaleController.getString(R.string.DeleteThemeAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new jl0(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20377a;
            pd1Var.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(pd1Var.getThemedColor(org.telegram.ui.ActionBar.i6.f21068q7));
            }
        }
    }
}
