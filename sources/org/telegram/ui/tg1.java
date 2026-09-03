package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class tg1 extends org.telegram.ui.ActionBar.j {
    public final vg1 f41538a;

    public tg1(vg1 vg1Var) {
        this.f41538a = vg1Var;
    }

    @Override
    public final void b(int i10) {
        String string;
        org.telegram.ui.ActionBar.f5 f5Var;
        vg1 vg1Var = this.f41538a;
        if (i10 == -1) {
            if (vg1Var.D >= 0) {
                f5Var = ((org.telegram.ui.ActionBar.p2) vg1Var).parentLayout;
                if (f5Var.getFragmentStack().size() == 1) {
                    vg1Var.I0();
                    return;
                }
            }
            vg1Var.finishFragment();
        } else if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vg1Var.getParentActivity());
            TL_account.Password password = vg1Var.R;
            if (password != null && password.has_password) {
                string = LocaleController.getString(R.string.CancelEmailQuestion);
            } else {
                string = LocaleController.getString(R.string.CancelPasswordQuestion);
            }
            String string2 = LocaleController.getString(R.string.CancelEmailQuestionTitle);
            String string3 = LocaleController.getString(R.string.Abort);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
            d2Var.Q = string;
            d2Var.O = string2;
            alertDialog$Builder.k(string3, new kl0(this, 24));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.f21168a;
            vg1Var.showDialog(d2Var2);
            TextView textView = (TextView) d2Var2.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, false));
            }
        }
    }
}
