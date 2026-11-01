package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class z31 implements View.OnClickListener {
    public final k41 f43809a;
    public final TLRPC.TL_authorization f43810b;
    public final SessionsActivity f43811c;
    public final a41 d;

    public z31(a41 a41Var, k41 k41Var, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
        this.d = a41Var;
        this.f43809a = k41Var;
        this.f43810b = tL_authorization;
        this.f43811c = sessionsActivity;
    }

    @Override
    public final void onClick(View view) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.d.f35561j1.getParentActivity());
        String L0 = org.telegram.messenger.dd.L0(2131744229, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
        x1Var.T = L0;
        x1Var.R = org.telegram.messenger.dd.L0(2131754073, null);
        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131744234, null), new a7(this, this.f43809a, this.f43810b, 21));
        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
        this.f43811c.showDialog(x1Var);
        TextView textView = (TextView) x1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, null);
        }
    }
}
