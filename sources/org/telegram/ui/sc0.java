package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class sc0 implements Runnable {
    public final int f43295a;
    public final ig0 f43296b;

    public sc0(ig0 ig0Var, int i10) {
        this.f43295a = i10;
        this.f43296b = ig0Var;
    }

    @Override
    public final void run() {
        switch (this.f43295a) {
            case 0:
                this.f43296b.f40145c0 = false;
                return;
            case 1:
                ig0 ig0Var = this.f43296b;
                ig0Var.f40169w0 = false;
                ig0Var.C1(true, true);
                return;
            default:
                ig0 ig0Var2 = this.f43296b;
                if (ig0Var2.getParentActivity() != null && !ig0Var2.getParentActivity().isFinishing() && ig0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ig0Var2.getParentActivity());
                    alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new vc0(ig0Var2, 1));
                    alertDialog$Builder.p();
                    return;
                }
                return;
        }
    }
}
