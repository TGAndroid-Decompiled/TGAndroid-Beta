package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class rb1 implements org.telegram.ui.Components.bq {
    public final oc1 f42358a;

    public rb1(oc1 oc1Var) {
        this.f42358a = oc1Var;
    }

    @Override
    public final int H0(int i9) {
        org.telegram.ui.ActionBar.d6 d6Var;
        oc1 oc1Var = this.f42358a;
        if (oc1Var.f41090n == 3) {
            org.telegram.ui.ActionBar.e6 e6Var = oc1Var.f41057a0;
            if (e6Var.O && i9 == 0 && (d6Var = (org.telegram.ui.ActionBar.d6) e6Var.W.get(org.telegram.ui.ActionBar.f6.f23172n)) != null) {
                return d6Var.f22869e;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void e(boolean z10) {
        int i9;
        int i10;
        oc1 oc1Var = this.f42358a;
        org.telegram.ui.ActionBar.d6 d6Var = oc1Var.f41102s;
        if (z10) {
            if (d6Var.f22881r == null) {
                oc1Var.finishFragment();
                i10 = ((org.telegram.ui.ActionBar.o2) oc1Var).currentAccount;
                MessagesController.getInstance(i10).saveThemeToServer(d6Var.f22867b, d6Var);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, d6Var.f22867b, d6Var);
                return;
            }
            StringBuilder sb2 = new StringBuilder("https://");
            i9 = ((org.telegram.ui.ActionBar.o2) oc1Var).currentAccount;
            sb2.append(MessagesController.getInstance(i9).linkPrefix);
            sb2.append("/addtheme/");
            sb2.append(d6Var.f22881r.slug);
            String sb3 = sb2.toString();
            oc1Var.showDialog(new org.telegram.ui.Components.rp0(oc1Var.getParentActivity(), null, sb3, false, sb3, false, null));
            return;
        }
        org.telegram.ui.Components.y4.W(oc1Var, 1, null, null);
    }

    @Override
    public final void k() {
        oc1 oc1Var = this.f42358a;
        if (oc1Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oc1Var.getParentActivity());
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DeleteThemeTitle);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.DeleteThemeAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new dl0(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
            oc1Var.showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(oc1Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23230q7));
            }
        }
    }

    @Override
    public final void n0(int r15, int r16, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rb1.n0(int, int, boolean):void");
    }
}
