package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ra0 implements Runnable {
    public final int f40707a;
    public final cb0 f40708b;

    public ra0(cb0 cb0Var, int i10) {
        this.f40707a = i10;
        this.f40708b = cb0Var;
    }

    @Override
    public final void run() {
        switch (this.f40707a) {
            case 0:
                cb0 cb0Var = this.f40708b;
                cb0Var.f35915r.f22405b.requestFocus();
                AndroidUtilities.showKeyboard(cb0Var.f35915r.f22405b);
                return;
            case 1:
                cb0 cb0Var2 = this.f40708b;
                cb0Var2.f35915r.f22405b.clearFocus();
                AndroidUtilities.hideKeyboard(cb0Var2.f35915r.f22405b);
                return;
            default:
                pf.d.r(this.f40708b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
