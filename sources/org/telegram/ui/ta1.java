package org.telegram.ui;

import android.view.View;
public final class ta1 implements View.OnClickListener {
    public final nb1 f41604a;

    public ta1(nb1 nb1Var) {
        this.f41604a = nb1Var;
    }

    @Override
    public final void onClick(View view) {
        nb1 nb1Var = this.f41604a;
        if (nb1Var.M == 1) {
            org.telegram.ui.Components.s4.i0(nb1Var, -nb1Var.f39797a, null, nb1Var.g(), null, false, nb1Var.J, new ra(this, 5), nb1Var.getResourceProvider());
            return;
        }
        nb1Var.getMessagesController().m(nb1Var.f39797a, nb1Var.getUserConfig().f(), 0, null, nb1Var, false, new la1(nb1Var, 2), new ma1(nb1Var), null);
        org.telegram.messenger.at.e().k(org.telegram.messenger.at.I4, new Object[0]);
        nb1Var.S0(false);
    }
}
