package org.telegram.ui;

import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class xa1 extends org.telegram.ui.ActionBar.j {
    public final za1 f53903a;

    public xa1(za1 za1Var) {
        this.f53903a = za1Var;
    }

    @Override
    public final void b(int i7) {
        String N0;
        org.telegram.ui.ActionBar.r4 r4Var;
        za1 za1Var = this.f53903a;
        if (i7 == -1) {
            if (za1Var.H >= 0) {
                r4Var = ((org.telegram.ui.ActionBar.g2) za1Var).parentLayout;
                if (r4Var.getFragmentStack().size() == 1) {
                    za1Var.N0();
                    return;
                }
            }
            za1Var.finishFragment();
        } else if (i7 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(za1Var.getParentActivity());
            TL_account.Password password = za1Var.V;
            if (password != null && password.has_password) {
                N0 = org.telegram.messenger.gd.N0(2131752574, null);
            } else {
                N0 = org.telegram.messenger.gd.N0(2131752566, null);
            }
            String N02 = org.telegram.messenger.gd.N0(2131752573, null);
            String N03 = org.telegram.messenger.gd.N0(2131754950, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.U = N0;
            t1Var.S = N02;
            alertDialog$Builder.k(N03, new oi0(this, 22));
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
            za1Var.showDialog(t1Var);
            TextView textView = (TextView) t1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, null);
            }
        }
    }
}
