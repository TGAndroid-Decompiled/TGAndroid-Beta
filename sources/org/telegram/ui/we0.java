package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class we0 implements org.telegram.ui.ActionBar.a2 {
    public final int f38604a;
    public final cf0 f38605b;

    public we0(cf0 cf0Var, int i10) {
        this.f38604a = i10;
        this.f38605b = cf0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f38604a) {
            case 0:
                cf0 cf0Var = this.f38605b;
                cf0Var.c(true);
                cf0Var.O.u1(0, true, null, true);
                cf0Var.o();
                return;
            case 1:
                cf0 cf0Var2 = this.f38605b;
                cf0Var2.O.f36837p0.popup = false;
                cf0Var2.h(null);
                return;
            case 2:
                cf0 cf0Var3 = this.f38605b;
                rg0 rg0Var = cf0Var3.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rg0Var.getParentActivity());
                alertDialog$Builder.f18409a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.f18409a.T = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new we0(cf0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new we0(cf0Var3, 4));
                rg0Var.showDialog(alertDialog$Builder.f18409a);
                return;
            case 3:
                cf0 cf0Var4 = this.f38605b;
                cf0Var4.O.f36837p0.popup = false;
                cf0Var4.h(null);
                return;
            default:
                cf0 cf0Var5 = this.f38605b;
                cf0Var5.c(true);
                cf0Var5.O.u1(0, true, null, true);
                return;
        }
    }
}
