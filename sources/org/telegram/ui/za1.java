package org.telegram.ui;

import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class za1 extends org.telegram.ui.ActionBar.j {
    public final bb1 f54467a;

    public za1(bb1 bb1Var) {
        this.f54467a = bb1Var;
    }

    @Override
    public final void b(int i7) {
        String M0;
        org.telegram.ui.ActionBar.s4 s4Var;
        bb1 bb1Var = this.f54467a;
        if (i7 == -1) {
            if (bb1Var.H >= 0) {
                s4Var = ((org.telegram.ui.ActionBar.h2) bb1Var).parentLayout;
                if (s4Var.getFragmentStack().size() == 1) {
                    bb1Var.N0();
                    return;
                }
            }
            bb1Var.finishFragment();
        } else if (i7 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bb1Var.getParentActivity());
            TL_account.Password password = bb1Var.V;
            if (password != null && password.has_password) {
                M0 = org.telegram.messenger.gd.M0(2131752575, null);
            } else {
                M0 = org.telegram.messenger.gd.M0(2131752567, null);
            }
            String M02 = org.telegram.messenger.gd.M0(2131752574, null);
            String M03 = org.telegram.messenger.gd.M0(2131754950, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
            u1Var.U = M0;
            u1Var.S = M02;
            alertDialog$Builder.k(M03, new qi0(this, 22));
            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
            bb1Var.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29635q7, null);
            }
        }
    }
}
