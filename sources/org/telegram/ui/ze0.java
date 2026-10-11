package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ze0 implements org.telegram.ui.ActionBar.z1 {
    public final int f44645a;
    public final ff0 f44646b;

    public ze0(ff0 ff0Var, int i10) {
        this.f44645a = i10;
        this.f44646b = ff0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f44645a) {
            case 0:
                ff0 ff0Var = this.f44646b;
                ff0Var.c(true);
                ff0Var.O.u1(0, true, null, true);
                ff0Var.o();
                return;
            case 1:
                ff0 ff0Var2 = this.f44646b;
                ff0Var2.O.f43031p0.popup = false;
                ff0Var2.h(null);
                return;
            case 2:
                ff0 ff0Var3 = this.f44646b;
                vg0 vg0Var = ff0Var3.O;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vg0Var.getParentActivity());
                alertDialog$Builder.f20368a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
                alertDialog$Builder.f20368a.T = LocaleController.getString("TosDecline", R.string.TosDecline);
                alertDialog$Builder.k(LocaleController.getString("SignUp", R.string.SignUp), new ze0(ff0Var3, 3));
                alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new ze0(ff0Var3, 4));
                vg0Var.showDialog(alertDialog$Builder.f20368a);
                return;
            case 3:
                ff0 ff0Var4 = this.f44646b;
                ff0Var4.O.f43031p0.popup = false;
                ff0Var4.h(null);
                return;
            default:
                ff0 ff0Var5 = this.f44646b;
                ff0Var5.c(true);
                ff0Var5.O.u1(0, true, null, true);
                return;
        }
    }
}
