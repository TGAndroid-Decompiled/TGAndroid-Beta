package org.telegram.ui;

import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class za1 extends org.telegram.ui.ActionBar.j {
    public final bb1 f52483a;

    public za1(bb1 bb1Var) {
        this.f52483a = bb1Var;
    }

    @Override
    public final void b(int i7) {
        String M0;
        org.telegram.ui.ActionBar.q4 q4Var;
        bb1 bb1Var = this.f52483a;
        if (i7 == -1) {
            if (bb1Var.G >= 0) {
                q4Var = ((org.telegram.ui.ActionBar.f2) bb1Var).parentLayout;
                if (q4Var.getFragmentStack().size() == 1) {
                    bb1Var.N0();
                    return;
                }
            }
            bb1Var.finishFragment();
        } else if (i7 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bb1Var.getParentActivity());
            TL_account.Password password = bb1Var.U;
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
            alertDialog$Builder.k(M03, new ni0(this, 22));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            bb1Var.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28106q7, null);
            }
        }
    }
}
