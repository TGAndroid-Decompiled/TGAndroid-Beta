package org.telegram.ui;

import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class va1 extends org.telegram.ui.ActionBar.j {
    public final xa1 f52182a;

    public va1(xa1 xa1Var) {
        this.f52182a = xa1Var;
    }

    @Override
    public final void b(int i7) {
        String M0;
        org.telegram.ui.ActionBar.o4 o4Var;
        xa1 xa1Var = this.f52182a;
        if (i7 == -1) {
            if (xa1Var.H >= 0) {
                o4Var = ((org.telegram.ui.ActionBar.e2) xa1Var).parentLayout;
                if (o4Var.getFragmentStack().size() == 1) {
                    xa1Var.N0();
                    return;
                }
            }
            xa1Var.finishFragment();
        } else if (i7 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xa1Var.getParentActivity());
            TL_account.Password password = xa1Var.V;
            if (password != null && password.has_password) {
                M0 = org.telegram.messenger.hd.M0(2131752586, null);
            } else {
                M0 = org.telegram.messenger.hd.M0(2131752578, null);
            }
            String M02 = org.telegram.messenger.hd.M0(2131752585, null);
            String M03 = org.telegram.messenger.hd.M0(2131754950, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.U = M0;
            t1Var.S = M02;
            alertDialog$Builder.k(M03, new ni0(this, 22));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            xa1Var.showDialog(t1Var);
            TextView textView = (TextView) t1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
            }
        }
    }
}
