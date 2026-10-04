package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class uc1 implements org.telegram.ui.Components.oq {
    public final rd1 f41144a;

    public uc1(rd1 rd1Var) {
        this.f41144a = rd1Var;
    }

    @Override
    public final void C0(int r15, int r16, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uc1.C0(int, int, boolean):void");
    }

    @Override
    public final int K0(int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        rd1 rd1Var = this.f41144a;
        if (rd1Var.f40070n == 3) {
            org.telegram.ui.ActionBar.h6 h6Var = rd1Var.f40047e0;
            if (h6Var.S && i10 == 0 && (f6Var = (org.telegram.ui.ActionBar.f6) h6Var.f20689a0.get(org.telegram.ui.ActionBar.i6.f20997n)) != null) {
                return f6Var.f20614e;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void d(boolean z10) {
        int i10;
        int i11;
        rd1 rd1Var = this.f41144a;
        org.telegram.ui.ActionBar.f6 f6Var = rd1Var.f40082s;
        if (z10) {
            if (f6Var.f20626r == null) {
                rd1Var.finishFragment();
                i11 = ((org.telegram.ui.ActionBar.n2) rd1Var).currentAccount;
                MessagesController.getInstance(i11).saveThemeToServer(f6Var.f20612b, f6Var);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, f6Var.f20612b, f6Var);
                return;
            }
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.n2) rd1Var).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/addtheme/");
            sb2.append(f6Var.f20626r.slug);
            String sb3 = sb2.toString();
            rd1Var.showDialog(new org.telegram.ui.Components.zq0(rd1Var.getParentActivity(), null, sb3, false, sb3, false, null));
            return;
        }
        org.telegram.ui.Components.e5.W(rd1Var, 1, null, null);
    }

    @Override
    public final void y() {
        rd1 rd1Var = this.f41144a;
        if (rd1Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rd1Var.getParentActivity());
            alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.DeleteThemeTitle);
            alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.DeleteThemeAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new jl0(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20368a;
            rd1Var.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(rd1Var.getThemedColor(org.telegram.ui.ActionBar.i6.f21059q7));
            }
        }
    }
}
