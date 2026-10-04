package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zg1 extends org.telegram.ui.ActionBar.j {
    public final bh1 f43782a;

    public zg1(bh1 bh1Var) {
        this.f43782a = bh1Var;
    }

    @Override
    public final void b(int i10) {
        String string;
        org.telegram.ui.ActionBar.c5 c5Var;
        bh1 bh1Var = this.f43782a;
        if (i10 == -1) {
            if (bh1Var.G >= 0) {
                c5Var = ((org.telegram.ui.ActionBar.n2) bh1Var).parentLayout;
                if (c5Var.getFragmentStack().size() == 1) {
                    bh1Var.I0();
                    return;
                }
            }
            bh1Var.finishFragment();
        } else if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bh1Var.getParentActivity());
            TL_account.Password password = bh1Var.U;
            if (password != null && password.has_password) {
                string = LocaleController.getString(R.string.CancelEmailQuestion);
            } else {
                string = LocaleController.getString(R.string.CancelPasswordQuestion);
            }
            String string2 = LocaleController.getString(R.string.CancelEmailQuestionTitle);
            String string3 = LocaleController.getString(R.string.Abort);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20372a;
            b2Var.T = string;
            b2Var.R = string2;
            alertDialog$Builder.k(string3, new jl0(this, 24));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.f20372a;
            bh1Var.showDialog(b2Var2);
            TextView textView = (TextView) b2Var2.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21063q7, false));
            }
        }
    }
}
