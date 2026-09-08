package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zc1 implements org.telegram.ui.Components.kq {
    public final wd1 f43406a;

    public zc1(wd1 wd1Var) {
        this.f43406a = wd1Var;
    }

    @Override
    public final void B0(int r15, int r16, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zc1.B0(int, int, boolean):void");
    }

    @Override
    public final int M0(int i10) {
        org.telegram.ui.ActionBar.h6 h6Var;
        wd1 wd1Var = this.f43406a;
        if (wd1Var.f41979n == 3) {
            org.telegram.ui.ActionBar.i6 i6Var = wd1Var.f41956e0;
            if (i6Var.S && i10 == 0 && (h6Var = (org.telegram.ui.ActionBar.h6) i6Var.f20568a0.get(org.telegram.ui.ActionBar.j6.f20866n)) != null) {
                return h6Var.f20520e;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void k(boolean z10) {
        int i10;
        int i11;
        wd1 wd1Var = this.f43406a;
        org.telegram.ui.ActionBar.h6 h6Var = wd1Var.f41991s;
        if (z10) {
            if (h6Var.f20532r == null) {
                wd1Var.finishFragment();
                i11 = ((org.telegram.ui.ActionBar.n2) wd1Var).currentAccount;
                MessagesController.getInstance(i11).saveThemeToServer(h6Var.f20518b, h6Var);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, h6Var.f20518b, h6Var);
                return;
            }
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.n2) wd1Var).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/addtheme/");
            sb2.append(h6Var.f20532r.slug);
            String sb3 = sb2.toString();
            wd1Var.showDialog(new org.telegram.ui.Components.hq0(wd1Var.getParentActivity(), null, sb3, false, sb3, false, null));
            return;
        }
        org.telegram.ui.Components.e5.W(wd1Var, 1, null, null);
    }

    @Override
    public final void z() {
        wd1 wd1Var = this.f43406a;
        if (wd1Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wd1Var.getParentActivity());
            alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.DeleteThemeTitle);
            alertDialog$Builder.f20225a.T = LocaleController.getString(R.string.DeleteThemeAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new vl0(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
            wd1Var.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(wd1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20925q7));
            }
        }
    }
}
