package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class yc1 implements org.telegram.ui.Components.lq {
    public final vd1 f39847a;

    public yc1(vd1 vd1Var) {
        this.f39847a = vd1Var;
    }

    @Override
    public final int K0(int i10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        vd1 vd1Var = this.f39847a;
        if (vd1Var.f38550n == 3) {
            org.telegram.ui.ActionBar.h6 h6Var = vd1Var.f38527e0;
            if (h6Var.S && i10 == 0 && (g6Var = (org.telegram.ui.ActionBar.g6) h6Var.f18730a0.get(org.telegram.ui.ActionBar.i6.f19014n)) != null) {
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
        vd1 vd1Var = this.f39847a;
        org.telegram.ui.ActionBar.g6 g6Var = vd1Var.f38562s;
        if (z10) {
            if (g6Var.f18706r == null) {
                vd1Var.finishFragment();
                i11 = ((org.telegram.ui.ActionBar.n2) vd1Var).currentAccount;
                MessagesController.getInstance(i11).saveThemeToServer(g6Var.f18693b, g6Var);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, g6Var.f18693b, g6Var);
                return;
            }
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.n2) vd1Var).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/addtheme/");
            sb2.append(g6Var.f18706r.slug);
            String sb3 = sb2.toString();
            vd1Var.showDialog(new org.telegram.ui.Components.hq0(vd1Var.getParentActivity(), null, sb3, false, sb3, false, null));
            return;
        }
        org.telegram.ui.Components.c5.W(vd1Var, 1, null, null);
    }

    @Override
    public final void x0(int r15, int r16, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yc1.x0(int, int, boolean):void");
    }

    @Override
    public final void y() {
        vd1 vd1Var = this.f39847a;
        if (vd1Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vd1Var.getParentActivity());
            alertDialog$Builder.f18437a.R = LocaleController.getString(R.string.DeleteThemeTitle);
            alertDialog$Builder.f18437a.T = LocaleController.getString(R.string.DeleteThemeAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new tl0(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18437a;
            vd1Var.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(vd1Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19074q7));
            }
        }
    }
}
