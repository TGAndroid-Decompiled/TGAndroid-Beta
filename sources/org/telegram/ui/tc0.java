package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class tc0 implements Runnable {
    public final int f41950a;
    public final ig0 f41951b;

    public tc0(ig0 ig0Var, int i10) {
        this.f41950a = i10;
        this.f41951b = ig0Var;
    }

    @Override
    public final void run() {
        switch (this.f41950a) {
            case 0:
                this.f41951b.f38197c0 = false;
                return;
            case 1:
                ig0 ig0Var = this.f41951b;
                ig0Var.f38219v0 = false;
                ig0Var.B1(true, true);
                return;
            default:
                ig0 ig0Var2 = this.f41951b;
                if (ig0Var2.getParentActivity() != null && !ig0Var2.getParentActivity().isFinishing() && ig0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ig0Var2.getParentActivity());
                    alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new zc0(ig0Var2, 1));
                    alertDialog$Builder.p();
                    return;
                }
                return;
        }
    }
}
