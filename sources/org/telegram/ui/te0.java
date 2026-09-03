package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class te0 implements org.telegram.ui.ActionBar.c2 {
    public final int f41525a;
    public final af0 f41526b;

    public te0(af0 af0Var, int i10) {
        this.f41525a = i10;
        this.f41526b = af0Var;
    }

    @Override
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f41525a) {
            case 0:
                af0 af0Var = this.f41526b;
                af0Var.c(true);
                af0Var.L.u1(0, true, null, true);
                af0Var.o();
                return;
            case 1:
                af0 af0Var2 = this.f41526b;
                af0Var2.L.m0.popup = false;
                af0Var2.h(null);
                return;
            case 2:
                af0 af0Var3 = this.f41526b;
                og0 og0Var = af0Var3.L;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(og0Var.getParentActivity());
                alertDialog$Builder.f21168a.O = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.f21168a.Q = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new te0(af0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new te0(af0Var3, 4));
                og0Var.showDialog(alertDialog$Builder.f21168a);
                return;
            case 3:
                af0 af0Var4 = this.f41526b;
                af0Var4.L.m0.popup = false;
                af0Var4.h(null);
                return;
            default:
                af0 af0Var5 = this.f41526b;
                af0Var5.c(true);
                af0Var5.L.u1(0, true, null, true);
                return;
        }
    }
}
