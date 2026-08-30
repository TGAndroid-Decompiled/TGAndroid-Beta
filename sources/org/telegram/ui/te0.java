package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class te0 implements org.telegram.ui.ActionBar.c2 {
    public final int f38644a;
    public final ze0 f38645b;

    public te0(ze0 ze0Var, int i10) {
        this.f38644a = i10;
        this.f38645b = ze0Var;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f38644a) {
            case 0:
                ze0 ze0Var = this.f38645b;
                ze0Var.c(true);
                ze0Var.L.u1(0, true, null, true);
                ze0Var.o();
                return;
            case 1:
                ze0 ze0Var2 = this.f38645b;
                ze0Var2.L.m0.popup = false;
                ze0Var2.h(null);
                return;
            case 2:
                ze0 ze0Var3 = this.f38645b;
                ng0 ng0Var = ze0Var3.L;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ng0Var.getParentActivity());
                alertDialog$Builder.f19503a.O = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.f19503a.Q = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new te0(ze0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new te0(ze0Var3, 4));
                ng0Var.showDialog(alertDialog$Builder.f19503a);
                return;
            case 3:
                ze0 ze0Var4 = this.f38645b;
                ze0Var4.L.m0.popup = false;
                ze0Var4.h(null);
                return;
            default:
                ze0 ze0Var5 = this.f38645b;
                ze0Var5.c(true);
                ze0Var5.L.u1(0, true, null, true);
                return;
        }
    }
}
