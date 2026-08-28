package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class rc0 implements Runnable {
    public final int f42362a;
    public final fg0 f42363b;

    public rc0(fg0 fg0Var, int i9) {
        this.f42362a = i9;
        this.f42363b = fg0Var;
    }

    @Override
    public final void run() {
        switch (this.f42362a) {
            case 0:
                fg0 fg0Var = this.f42363b;
                fg0Var.f38277n0 = false;
                fg0Var.x1(true, true);
                return;
            case 1:
                this.f42363b.Y = false;
                return;
            default:
                fg0 fg0Var2 = this.f42363b;
                if (fg0Var2.getParentActivity() != null && !fg0Var2.getParentActivity().isFinishing() && fg0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg0Var2.getParentActivity());
                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new wc0(fg0Var2, 1));
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
