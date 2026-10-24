package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class sc0 implements Runnable {
    public final int f41342a;
    public final hg0 f41343b;

    public sc0(hg0 hg0Var, int i10) {
        this.f41342a = i10;
        this.f41343b = hg0Var;
    }

    @Override
    public final void run() {
        switch (this.f41342a) {
            case 0:
                this.f41343b.f37838c0 = false;
                return;
            case 1:
                hg0 hg0Var = this.f41343b;
                hg0Var.f37860v0 = false;
                hg0Var.B1(true, true);
                return;
            default:
                hg0 hg0Var2 = this.f41343b;
                if (hg0Var2.getParentActivity() != null && !hg0Var2.getParentActivity().isFinishing() && hg0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hg0Var2.getParentActivity());
                    alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new yc0(hg0Var2, 1));
                    alertDialog$Builder.p();
                    return;
                }
                return;
        }
    }
}
