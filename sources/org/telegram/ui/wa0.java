package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class wa0 implements Runnable {
    public final int f45057a;
    public final db0 f45058b;

    public wa0(db0 db0Var, int i10) {
        this.f45057a = i10;
        this.f45058b = db0Var;
    }

    @Override
    public final void run() {
        switch (this.f45057a) {
            case 0:
                qf.d.r(this.f45058b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
            case 1:
                db0 db0Var = this.f45058b;
                db0Var.f38820r.d.requestFocus();
                AndroidUtilities.showKeyboard(db0Var.f38820r.d);
                return;
            default:
                db0 db0Var2 = this.f45058b;
                db0Var2.f38820r.d.clearFocus();
                AndroidUtilities.hideKeyboard(db0Var2.f38820r.d);
                return;
        }
    }
}
