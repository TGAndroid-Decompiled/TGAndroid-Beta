package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ra0 implements Runnable {
    public final int f40673a;
    public final cb0 f40674b;

    public ra0(cb0 cb0Var, int i10) {
        this.f40673a = i10;
        this.f40674b = cb0Var;
    }

    @Override
    public final void run() {
        switch (this.f40673a) {
            case 0:
                cb0 cb0Var = this.f40674b;
                cb0Var.f35869r.f22398b.requestFocus();
                AndroidUtilities.showKeyboard(cb0Var.f35869r.f22398b);
                return;
            case 1:
                cb0 cb0Var2 = this.f40674b;
                cb0Var2.f35869r.f22398b.clearFocus();
                AndroidUtilities.hideKeyboard(cb0Var2.f35869r.f22398b);
                return;
            default:
                pf.d.r(this.f40674b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
