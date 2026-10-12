package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class y81 implements Runnable {
    public final int f44324a;
    public final k91 f44325b;

    public y81(k91 k91Var, int i10) {
        this.f44324a = i10;
        this.f44325b = k91Var;
    }

    @Override
    public final void run() {
        switch (this.f44324a) {
            case 0:
                this.f44325b.f39417c.W2.N(true);
                return;
            case 1:
                of.f.s(this.f44325b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            case 2:
                k91 k91Var = this.f44325b;
                k91Var.f39417c.postOnAnimation(new y81(k91Var, 3));
                return;
            case 3:
                this.f44325b.i0();
                return;
            default:
                MessagesController.getInstance(this.f44325b.currentAccount).deleteUserPhoto(null);
                return;
        }
    }
}
