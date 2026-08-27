package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class xf1 extends org.telegram.ui.ActionBar.j {

    public final zf1 f44441a;

    public xf1(zf1 zf1Var) {
        this.f44441a = zf1Var;
    }

    @Override
    public final void b(int i10) {
        zf1 zf1Var = this.f44441a;
        if (i10 == -1) {
            if (zf1Var.C < 0 || ((org.telegram.ui.ActionBar.n2) zf1Var).parentLayout.getFragmentStack().size() != 1) {
                zf1Var.finishFragment();
                return;
            } else {
                zf1Var.I0();
                return;
            }
        }
        if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zf1Var.getParentActivity());
            TL_account.Password password = zf1Var.Q;
            String string = (password == null || !password.has_password) ? LocaleController.getString(R.string.CancelPasswordQuestion) : LocaleController.getString(R.string.CancelEmailQuestion);
            String string2 = LocaleController.getString(R.string.CancelEmailQuestionTitle);
            String string3 = LocaleController.getString(R.string.Abort);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            b2Var.P = string;
            b2Var.N = string2;
            alertDialog$Builder.k(string3, new dl0(this, 24));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.f22702a;
            zf1Var.showDialog(b2Var2);
            TextView textView = (TextView) b2Var2.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
            }
        }
    }
}
