package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class wj0 implements Runnable {
    public final int f43697a;
    public final dk0 f43698b;

    public wj0(dk0 dk0Var, int i10) {
        this.f43697a = i10;
        this.f43698b = dk0Var;
    }

    @Override
    public final void run() {
        switch (this.f43697a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f43698b.f37032b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f43698b.d.getEditText());
                return;
        }
    }
}
