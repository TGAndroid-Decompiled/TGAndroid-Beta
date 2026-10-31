package org.telegram.ui;

import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class rc1 extends org.telegram.ui.ActionBar.k {
    public final tc1 f41200a;

    public rc1(tc1 tc1Var) {
        this.f41200a = tc1Var;
    }

    @Override
    public final void b(int i10) {
        String L0;
        org.telegram.ui.ActionBar.z4 z4Var;
        tc1 tc1Var = this.f41200a;
        if (i10 == -1) {
            if (tc1Var.G >= 0) {
                z4Var = ((org.telegram.ui.ActionBar.k2) tc1Var).parentLayout;
                if (z4Var.getFragmentStack().size() == 1) {
                    tc1Var.M0();
                    return;
                }
            }
            tc1Var.finishFragment();
        } else if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tc1Var.getParentActivity());
            TL_account.Password password = tc1Var.U;
            if (password != null && password.has_password) {
                L0 = org.telegram.messenger.cd.L0(2131752586, null);
            } else {
                L0 = org.telegram.messenger.cd.L0(2131752578, null);
            }
            String L02 = org.telegram.messenger.cd.L0(2131752585, null);
            String L03 = org.telegram.messenger.cd.L0(2131754950, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.T = L0;
            x1Var.R = L02;
            alertDialog$Builder.k(L03, new tj0(this, 23));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            tc1Var.showDialog(x1Var);
            TextView textView = (TextView) x1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
            }
        }
    }
}
