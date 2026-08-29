package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class sb1 implements org.telegram.ui.Components.fq {
    public final qc1 f42352a;

    public sb1(qc1 qc1Var) {
        this.f42352a = qc1Var;
    }

    @Override
    public final int G0(int i10) {
        org.telegram.ui.ActionBar.e6 e6Var;
        qc1 qc1Var = this.f42352a;
        if (qc1Var.f41657n == 3) {
            org.telegram.ui.ActionBar.f6 f6Var = qc1Var.f41624a0;
            if (f6Var.O && i10 == 0 && (e6Var = (org.telegram.ui.ActionBar.e6) f6Var.W.get(org.telegram.ui.ActionBar.g6.f23234n)) != null) {
                return e6Var.f22905e;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void i(boolean z10) {
        int i10;
        int i11;
        qc1 qc1Var = this.f42352a;
        org.telegram.ui.ActionBar.e6 e6Var = qc1Var.f41669s;
        if (z10) {
            if (e6Var.f22917r == null) {
                qc1Var.finishFragment();
                i11 = ((org.telegram.ui.ActionBar.o2) qc1Var).currentAccount;
                MessagesController.getInstance(i11).saveThemeToServer(e6Var.f22903b, e6Var);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, e6Var.f22903b, e6Var);
                return;
            }
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.o2) qc1Var).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/addtheme/");
            sb2.append(e6Var.f22917r.slug);
            String sb3 = sb2.toString();
            qc1Var.showDialog(new org.telegram.ui.Components.dq0(qc1Var.getParentActivity(), null, sb3, false, sb3, false, null));
            return;
        }
        org.telegram.ui.Components.c5.W(qc1Var, 1, null, null);
    }

    @Override
    public final void q() {
        qc1 qc1Var = this.f42352a;
        if (qc1Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qc1Var.getParentActivity());
            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.DeleteThemeTitle);
            alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.DeleteThemeAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new zk0(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
            qc1Var.showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(qc1Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23295q7));
            }
        }
    }

    @Override
    public final void s0(int r15, int r16, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sb1.s0(int, int, boolean):void");
    }
}
