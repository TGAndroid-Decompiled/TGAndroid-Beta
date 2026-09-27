package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ye0 implements org.telegram.ui.ActionBar.b2 {
    public final int f40198a;
    public final ef0 f40199b;

    public ye0(ef0 ef0Var, int i10) {
        this.f40198a = i10;
        this.f40199b = ef0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f40198a) {
            case 0:
                ef0 ef0Var = this.f40199b;
                ef0Var.c(true);
                ef0Var.O.u1(0, true, null, true);
                ef0Var.o();
                return;
            case 1:
                ef0 ef0Var2 = this.f40199b;
                ef0Var2.O.f37803p0.popup = false;
                ef0Var2.h(null);
                return;
            case 2:
                ef0 ef0Var3 = this.f40199b;
                tg0 tg0Var = ef0Var3.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tg0Var.getParentActivity());
                alertDialog$Builder.f18655a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.f18655a.T = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new ye0(ef0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new ye0(ef0Var3, 4));
                tg0Var.showDialog(alertDialog$Builder.f18655a);
                return;
            case 3:
                ef0 ef0Var4 = this.f40199b;
                ef0Var4.O.f37803p0.popup = false;
                ef0Var4.h(null);
                return;
            default:
                ef0 ef0Var5 = this.f40199b;
                ef0Var5.c(true);
                ef0Var5.O.u1(0, true, null, true);
                return;
        }
    }
}
