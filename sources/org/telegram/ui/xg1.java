package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class xg1 extends org.telegram.ui.ActionBar.j {
    public final zg1 f39273a;

    public xg1(zg1 zg1Var) {
        this.f39273a = zg1Var;
    }

    @Override
    public final void b(int i10) {
        String string;
        org.telegram.ui.ActionBar.c5 c5Var;
        zg1 zg1Var = this.f39273a;
        if (i10 == -1) {
            if (zg1Var.G >= 0) {
                c5Var = ((org.telegram.ui.ActionBar.n2) zg1Var).parentLayout;
                if (c5Var.getFragmentStack().size() == 1) {
                    zg1Var.I0();
                    return;
                }
            }
            zg1Var.finishFragment();
        } else if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zg1Var.getParentActivity());
            TL_account.Password password = zg1Var.U;
            if (password != null && password.has_password) {
                string = LocaleController.getString(R.string.CancelEmailQuestion);
            } else {
                string = LocaleController.getString(R.string.CancelPasswordQuestion);
            }
            String string2 = LocaleController.getString(R.string.CancelEmailQuestionTitle);
            String string3 = LocaleController.getString(R.string.Abort);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
            b2Var.T = string;
            b2Var.R = string2;
            alertDialog$Builder.k(string3, new nl0(this, 24));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.f18409a;
            zg1Var.showDialog(b2Var2);
            TextView textView = (TextView) b2Var2.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19026q7, false));
            }
        }
    }
}
