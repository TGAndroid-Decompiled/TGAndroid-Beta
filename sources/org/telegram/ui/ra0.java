package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ra0 implements Runnable {
    public final int f40682a;
    public final cb0 f40683b;

    public ra0(cb0 cb0Var, int i10) {
        this.f40682a = i10;
        this.f40683b = cb0Var;
    }

    @Override
    public final void run() {
        switch (this.f40682a) {
            case 0:
                cb0 cb0Var = this.f40683b;
                cb0Var.f35902r.f22401b.requestFocus();
                AndroidUtilities.showKeyboard(cb0Var.f35902r.f22401b);
                return;
            case 1:
                cb0 cb0Var2 = this.f40683b;
                cb0Var2.f35902r.f22401b.clearFocus();
                AndroidUtilities.hideKeyboard(cb0Var2.f35902r.f22401b);
                return;
            default:
                pf.d.r(this.f40683b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
