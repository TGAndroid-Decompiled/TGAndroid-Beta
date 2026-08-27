package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class ua0 implements Runnable {

    public final int f43174a;

    public final fb0 f43175b;

    public ua0(fb0 fb0Var, int i10) {
        this.f43174a = i10;
        this.f43175b = fb0Var;
    }

    @Override
    public final void run() {
        switch (this.f43174a) {
            case 0:
                fb0 fb0Var = this.f43175b;
                fb0Var.f38060r.f24370b.requestFocus();
                AndroidUtilities.showKeyboard(fb0Var.f38060r.f24370b);
                break;
            case 1:
                fb0 fb0Var2 = this.f43175b;
                fb0Var2.f38060r.f24370b.clearFocus();
                AndroidUtilities.hideKeyboard(fb0Var2.f38060r.f24370b);
                break;
            default:
                we.e.s(this.f43175b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                break;
        }
    }
}
