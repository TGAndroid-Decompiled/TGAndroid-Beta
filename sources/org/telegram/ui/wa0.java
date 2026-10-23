package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class wa0 implements Runnable {
    public final int f42985a;
    public final gb0 f42986b;

    public wa0(gb0 gb0Var, int i10) {
        this.f42985a = i10;
        this.f42986b = gb0Var;
    }

    @Override
    public final void run() {
        switch (this.f42985a) {
            case 0:
                gb0 gb0Var = this.f42986b;
                gb0Var.f37558r.d.clearFocus();
                AndroidUtilities.hideKeyboard(gb0Var.f37558r.d);
                return;
            case 1:
                pf.d.r(this.f42986b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
            default:
                gb0 gb0Var2 = this.f42986b;
                gb0Var2.f37558r.d.requestFocus();
                AndroidUtilities.showKeyboard(gb0Var2.f37558r.d);
                return;
        }
    }
}
