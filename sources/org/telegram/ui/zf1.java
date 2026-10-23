package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zf1 extends org.telegram.ui.ActionBar.j {
    public final bg1 f44136a;

    public zf1(bg1 bg1Var) {
        this.f44136a = bg1Var;
    }

    @Override
    public final void b(int i10) {
        String string;
        org.telegram.ui.ActionBar.h5 h5Var;
        bg1 bg1Var = this.f44136a;
        if (i10 == -1) {
            if (bg1Var.G >= 0) {
                h5Var = ((org.telegram.ui.ActionBar.o2) bg1Var).parentLayout;
                if (h5Var.getFragmentStack().size() == 1) {
                    bg1Var.I0();
                    return;
                }
            }
            bg1Var.finishFragment();
        } else if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bg1Var.getParentActivity());
            TL_account.Password password = bg1Var.U;
            if (password != null && password.has_password) {
                string = LocaleController.getString(R.string.CancelEmailQuestion);
            } else {
                string = LocaleController.getString(R.string.CancelPasswordQuestion);
            }
            String string2 = LocaleController.getString(R.string.CancelEmailQuestionTitle);
            String string3 = LocaleController.getString(R.string.Abort);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
            c2Var.T = string;
            c2Var.R = string2;
            alertDialog$Builder.k(string3, new sp0(this, 23));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.f20678a;
            bg1Var.showDialog(c2Var2);
            TextView textView = (TextView) c2Var2.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, null);
            }
        }
    }
}
