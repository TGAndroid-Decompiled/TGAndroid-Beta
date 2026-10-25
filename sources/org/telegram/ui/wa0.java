package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class wa0 implements Runnable {
    public final int f45054a;
    public final db0 f45055b;

    public wa0(db0 db0Var, int i10) {
        this.f45054a = i10;
        this.f45055b = db0Var;
    }

    @Override
    public final void run() {
        switch (this.f45054a) {
            case 0:
                qf.d.r(this.f45055b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
            case 1:
                db0 db0Var = this.f45055b;
                db0Var.f38817r.d.requestFocus();
                AndroidUtilities.showKeyboard(db0Var.f38817r.d);
                return;
            default:
                db0 db0Var2 = this.f45055b;
                db0Var2.f38817r.d.clearFocus();
                AndroidUtilities.hideKeyboard(db0Var2.f38817r.d);
                return;
        }
    }
}
