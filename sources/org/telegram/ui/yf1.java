package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class yf1 extends org.telegram.ui.ActionBar.j {
    public final ag1 f44856a;

    public yf1(ag1 ag1Var) {
        this.f44856a = ag1Var;
    }

    @Override
    public final void b(int i9) {
        String string;
        org.telegram.ui.ActionBar.b5 b5Var;
        ag1 ag1Var = this.f44856a;
        if (i9 == -1) {
            if (ag1Var.C >= 0) {
                b5Var = ((org.telegram.ui.ActionBar.o2) ag1Var).parentLayout;
                if (b5Var.getFragmentStack().size() == 1) {
                    ag1Var.H0();
                    return;
                }
            }
            ag1Var.finishFragment();
        } else if (i9 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ag1Var.getParentActivity());
            TL_account.Password password = ag1Var.Q;
            if (password != null && password.has_password) {
                string = LocaleController.getString(R.string.CancelEmailQuestion);
            } else {
                string = LocaleController.getString(R.string.CancelPasswordQuestion);
            }
            String string2 = LocaleController.getString(R.string.CancelEmailQuestionTitle);
            String string3 = LocaleController.getString(R.string.Abort);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
            c2Var.P = string;
            c2Var.N = string2;
            alertDialog$Builder.k(string3, new dl0(this, 24));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.f22702a;
            ag1Var.showDialog(c2Var2);
            TextView textView = (TextView) c2Var2.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
            }
        }
    }
}
