package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ve0 implements org.telegram.ui.ActionBar.c2 {
    public final int f39080a;
    public final bf0 f39081b;

    public ve0(bf0 bf0Var, int i10) {
        this.f39080a = i10;
        this.f39081b = bf0Var;
    }

    @Override
    public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f39080a) {
            case 0:
                bf0 bf0Var = this.f39081b;
                bf0Var.c(true);
                bf0Var.L.u1(0, true, null, true);
                bf0Var.o();
                return;
            case 1:
                bf0 bf0Var2 = this.f39081b;
                bf0Var2.L.m0.popup = false;
                bf0Var2.h(null);
                return;
            case 2:
                bf0 bf0Var3 = this.f39081b;
                pg0 pg0Var = bf0Var3.L;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pg0Var.getParentActivity());
                alertDialog$Builder.f19478a.O = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.f19478a.Q = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new ve0(bf0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new ve0(bf0Var3, 4));
                pg0Var.showDialog(alertDialog$Builder.f19478a);
                return;
            case 3:
                bf0 bf0Var4 = this.f39081b;
                bf0Var4.L.m0.popup = false;
                bf0Var4.h(null);
                return;
            default:
                bf0 bf0Var5 = this.f39081b;
                bf0Var5.c(true);
                bf0Var5.L.u1(0, true, null, true);
                return;
        }
    }
}
