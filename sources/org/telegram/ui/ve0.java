package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ve0 implements org.telegram.ui.ActionBar.z1 {
    public final int f38686a;
    public final bf0 f38687b;

    public ve0(bf0 bf0Var, int i10) {
        this.f38686a = i10;
        this.f38687b = bf0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f38686a) {
            case 0:
                bf0 bf0Var = this.f38687b;
                bf0Var.c(true);
                bf0Var.O.u1(0, true, null, true);
                bf0Var.o();
                return;
            case 1:
                bf0 bf0Var2 = this.f38687b;
                bf0Var2.O.f36889p0.popup = false;
                bf0Var2.h(null);
                return;
            case 2:
                bf0 bf0Var3 = this.f38687b;
                qg0 qg0Var = bf0Var3.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qg0Var.getParentActivity());
                alertDialog$Builder.f18647a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.f18647a.T = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new ve0(bf0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new ve0(bf0Var3, 4));
                qg0Var.showDialog(alertDialog$Builder.f18647a);
                return;
            case 3:
                bf0 bf0Var4 = this.f38687b;
                bf0Var4.O.f36889p0.popup = false;
                bf0Var4.h(null);
                return;
            default:
                bf0 bf0Var5 = this.f38687b;
                bf0Var5.c(true);
                bf0Var5.O.u1(0, true, null, true);
                return;
        }
    }
}
