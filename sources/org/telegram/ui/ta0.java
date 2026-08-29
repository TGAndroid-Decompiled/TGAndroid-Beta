package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ta0 implements Runnable {
    public final int f42625a;
    public final eb0 f42626b;

    public ta0(eb0 eb0Var, int i10) {
        this.f42625a = i10;
        this.f42626b = eb0Var;
    }

    @Override
    public final void run() {
        switch (this.f42625a) {
            case 0:
                eb0 eb0Var = this.f42626b;
                eb0Var.f37780r.f24387b.requestFocus();
                AndroidUtilities.showKeyboard(eb0Var.f37780r.f24387b);
                return;
            case 1:
                eb0 eb0Var2 = this.f42626b;
                eb0Var2.f37780r.f24387b.clearFocus();
                AndroidUtilities.hideKeyboard(eb0Var2.f37780r.f24387b);
                return;
            default:
                ye.d.s(this.f42626b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                return;
        }
    }
}
