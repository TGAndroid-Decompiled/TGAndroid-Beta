package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class rc1 implements org.telegram.ui.Components.mq {
    public final od1 f37298a;

    public rc1(od1 od1Var) {
        this.f37298a = od1Var;
    }

    @Override
    public final int K0(int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        od1 od1Var = this.f37298a;
        if (od1Var.f36189n == 3) {
            org.telegram.ui.ActionBar.g6 g6Var = od1Var.f36166e0;
            if (g6Var.S && i10 == 0 && (f6Var = (org.telegram.ui.ActionBar.f6) g6Var.f18933a0.get(org.telegram.ui.ActionBar.h6.f19236n)) != null) {
                return f6Var.e;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void l(boolean z10) {
        int i10;
        int i11;
        od1 od1Var = this.f37298a;
        org.telegram.ui.ActionBar.f6 f6Var = od1Var.f36201s;
        if (z10) {
            if (f6Var.f18899r == null) {
                od1Var.finishFragment();
                i11 = ((org.telegram.ui.ActionBar.m2) od1Var).currentAccount;
                MessagesController.getInstance(i11).saveThemeToServer(f6Var.f18886b, f6Var);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, f6Var.f18886b, f6Var);
                return;
            }
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.m2) od1Var).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/addtheme/");
            sb2.append(f6Var.f18899r.slug);
            String sb3 = sb2.toString();
            od1Var.showDialog(new org.telegram.ui.Components.uq0(od1Var.getParentActivity(), null, sb3, false, sb3, false, null));
            return;
        }
        org.telegram.ui.Components.e5.W(od1Var, 1, null, null);
    }

    @Override
    public final void x0(int r15, int r16, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rc1.x0(int, int, boolean):void");
    }

    @Override
    public final void y() {
        od1 od1Var = this.f37298a;
        if (od1Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(od1Var.getParentActivity());
            alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.DeleteThemeTitle);
            alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.DeleteThemeAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ml0(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18661a;
            od1Var.showDialog(a2Var);
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(od1Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19298q7));
            }
        }
    }
}
