package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class vc0 implements Runnable {

    public final int f43425a;

    public final ig0 f43426b;

    public vc0(ig0 ig0Var, int i10) {
        this.f43425a = i10;
        this.f43426b = ig0Var;
    }

    @Override
    public final void run() {
        switch (this.f43425a) {
            case 0:
                ig0 ig0Var = this.f43426b;
                ig0Var.f39097n0 = false;
                ig0Var.x1(true, true);
                break;
            case 1:
                this.f43426b.Y = false;
                break;
            default:
                ig0 ig0Var2 = this.f43426b;
                if (ig0Var2.getParentActivity() != null && !ig0Var2.getParentActivity().isFinishing() && ig0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ig0Var2.getParentActivity());
                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ad0(ig0Var2, 1));
                    alertDialog$Builder.o();
                    break;
                }
                break;
        }
    }
}
