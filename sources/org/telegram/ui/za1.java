package org.telegram.ui;

import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class za1 extends org.telegram.ui.ActionBar.j {
    public final bb1 f54515a;

    public za1(bb1 bb1Var) {
        this.f54515a = bb1Var;
    }

    @Override
    public final void b(int i7) {
        String N0;
        org.telegram.ui.ActionBar.r4 r4Var;
        bb1 bb1Var = this.f54515a;
        if (i7 == -1) {
            if (bb1Var.H >= 0) {
                r4Var = ((org.telegram.ui.ActionBar.g2) bb1Var).parentLayout;
                if (r4Var.getFragmentStack().size() == 1) {
                    bb1Var.N0();
                    return;
                }
            }
            bb1Var.finishFragment();
        } else if (i7 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bb1Var.getParentActivity());
            TL_account.Password password = bb1Var.V;
            if (password != null && password.has_password) {
                N0 = org.telegram.messenger.hd.N0(2131752574, null);
            } else {
                N0 = org.telegram.messenger.hd.N0(2131752566, null);
            }
            String N02 = org.telegram.messenger.hd.N0(2131752573, null);
            String N03 = org.telegram.messenger.hd.N0(2131754950, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
            t1Var.U = N0;
            t1Var.S = N02;
            alertDialog$Builder.k(N03, new qi0(this, 22));
            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
            bb1Var.showDialog(t1Var);
            TextView textView = (TextView) t1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29622q7, null);
            }
        }
    }
}
