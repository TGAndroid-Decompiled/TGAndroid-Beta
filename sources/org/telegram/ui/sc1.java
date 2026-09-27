package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class sc1 implements org.telegram.ui.Components.nq {
    public final pd1 f37400a;

    public sc1(pd1 pd1Var) {
        this.f37400a = pd1Var;
    }

    @Override
    public final int K0(int i10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        pd1 pd1Var = this.f37400a;
        if (pd1Var.f36427n == 3) {
            org.telegram.ui.ActionBar.h6 h6Var = pd1Var.f36404e0;
            if (h6Var.S && i10 == 0 && (g6Var = (org.telegram.ui.ActionBar.g6) h6Var.f18952a0.get(org.telegram.ui.ActionBar.i6.f19235n)) != null) {
                return g6Var.e;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void l(boolean z10) {
        int i10;
        int i11;
        pd1 pd1Var = this.f37400a;
        org.telegram.ui.ActionBar.g6 g6Var = pd1Var.f36439s;
        if (z10) {
            if (g6Var.f18920r == null) {
                pd1Var.finishFragment();
                i11 = ((org.telegram.ui.ActionBar.o2) pd1Var).currentAccount;
                MessagesController.getInstance(i11).saveThemeToServer(g6Var.f18907b, g6Var);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, g6Var.f18907b, g6Var);
                return;
            }
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.o2) pd1Var).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/addtheme/");
            sb2.append(g6Var.f18920r.slug);
            String sb3 = sb2.toString();
            pd1Var.showDialog(new org.telegram.ui.Components.vq0(pd1Var.getParentActivity(), null, sb3, false, sb3, false, null));
            return;
        }
        org.telegram.ui.Components.e5.W(pd1Var, 1, null, null);
    }

    @Override
    public final void x0(int r15, int r16, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sc1.x0(int, int, boolean):void");
    }

    @Override
    public final void y() {
        pd1 pd1Var = this.f37400a;
        if (pd1Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pd1Var.getParentActivity());
            alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.DeleteThemeTitle);
            alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.DeleteThemeAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new qk0(this, 24));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
            pd1Var.showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(pd1Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19297q7));
            }
        }
    }
}
