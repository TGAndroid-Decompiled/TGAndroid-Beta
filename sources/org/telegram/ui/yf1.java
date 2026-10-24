package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class yf1 extends org.telegram.ui.ActionBar.j {
    public final ag1 f43843a;

    public yf1(ag1 ag1Var) {
        this.f43843a = ag1Var;
    }

    @Override
    public final void b(int i10) {
        String string;
        org.telegram.ui.ActionBar.h5 h5Var;
        ag1 ag1Var = this.f43843a;
        if (i10 == -1) {
            if (ag1Var.G >= 0) {
                h5Var = ((org.telegram.ui.ActionBar.o2) ag1Var).parentLayout;
                if (h5Var.getFragmentStack().size() == 1) {
                    ag1Var.I0();
                    return;
                }
            }
            ag1Var.finishFragment();
        } else if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ag1Var.getParentActivity());
            TL_account.Password password = ag1Var.U;
            if (password != null && password.has_password) {
                string = LocaleController.getString(R.string.CancelEmailQuestion);
            } else {
                string = LocaleController.getString(R.string.CancelPasswordQuestion);
            }
            String string2 = LocaleController.getString(R.string.CancelEmailQuestionTitle);
            String string3 = LocaleController.getString(R.string.Abort);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
            c2Var.T = string;
            c2Var.R = string2;
            alertDialog$Builder.k(string3, new rp0(this, 23));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.f20679a;
            ag1Var.showDialog(c2Var2);
            TextView textView = (TextView) c2Var2.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21422q7, null);
            }
        }
    }
}
