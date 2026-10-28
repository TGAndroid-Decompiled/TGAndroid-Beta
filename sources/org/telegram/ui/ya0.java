package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ya0 implements Runnable {
    public final int f45945a;
    public final fb0 f45946b;

    public ya0(fb0 fb0Var, int i10) {
        this.f45945a = i10;
        this.f45946b = fb0Var;
    }

    @Override
    public final void run() {
        switch (this.f45945a) {
            case 0:
                qf.d.r(this.f45946b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
            case 1:
                fb0 fb0Var = this.f45946b;
                fb0Var.f39318r.d.requestFocus();
                AndroidUtilities.showKeyboard(fb0Var.f39318r.d);
                return;
            default:
                fb0 fb0Var2 = this.f45946b;
                fb0Var2.f39318r.d.clearFocus();
                AndroidUtilities.hideKeyboard(fb0Var2.f39318r.d);
                return;
        }
    }
}
