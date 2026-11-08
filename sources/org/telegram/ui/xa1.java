package org.telegram.ui;

import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class xa1 extends org.telegram.ui.ActionBar.j {
    public final za1 f51809a;

    public xa1(za1 za1Var) {
        this.f51809a = za1Var;
    }

    @Override
    public final void b(int i7) {
        String M0;
        org.telegram.ui.ActionBar.q4 q4Var;
        za1 za1Var = this.f51809a;
        if (i7 == -1) {
            if (za1Var.G >= 0) {
                q4Var = ((org.telegram.ui.ActionBar.f2) za1Var).parentLayout;
                if (q4Var.getFragmentStack().size() == 1) {
                    za1Var.N0();
                    return;
                }
            }
            za1Var.finishFragment();
        } else if (i7 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(za1Var.getParentActivity());
            TL_account.Password password = za1Var.U;
            if (password != null && password.has_password) {
                M0 = org.telegram.messenger.id.M0(2131752586, null);
            } else {
                M0 = org.telegram.messenger.id.M0(2131752578, null);
            }
            String M02 = org.telegram.messenger.id.M0(2131752585, null);
            String M03 = org.telegram.messenger.id.M0(2131754950, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            u1Var.T = M0;
            u1Var.R = M02;
            alertDialog$Builder.k(M03, new li0(this, 22));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            za1Var.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28093q7, null);
            }
        }
    }
}
