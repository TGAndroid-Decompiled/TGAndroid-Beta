package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ze0 implements org.telegram.ui.ActionBar.a2 {
    public final int f43761a;
    public final ff0 f43762b;

    public ze0(ff0 ff0Var, int i10) {
        this.f43761a = i10;
        this.f43762b = ff0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f43761a) {
            case 0:
                ff0 ff0Var = this.f43762b;
                ff0Var.c(true);
                ff0Var.O.u1(0, true, null, true);
                ff0Var.o();
                return;
            case 1:
                ff0 ff0Var2 = this.f43762b;
                ff0Var2.O.f41212p0.popup = false;
                ff0Var2.h(null);
                return;
            case 2:
                ff0 ff0Var3 = this.f43762b;
                ug0 ug0Var = ff0Var3.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ug0Var.getParentActivity());
                alertDialog$Builder.f20367a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.f20367a.T = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new ze0(ff0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new ze0(ff0Var3, 4));
                ug0Var.showDialog(alertDialog$Builder.f20367a);
                return;
            case 3:
                ff0 ff0Var4 = this.f43762b;
                ff0Var4.O.f41212p0.popup = false;
                ff0Var4.h(null);
                return;
            default:
                ff0 ff0Var5 = this.f43762b;
                ff0Var5.c(true);
                ff0Var5.O.u1(0, true, null, true);
                return;
        }
    }
}
