package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class w81 implements Runnable {
    public final int f43112a;
    public final i91 f43113b;

    public w81(i91 i91Var, int i10) {
        this.f43112a = i10;
        this.f43113b = i91Var;
    }

    @Override
    public final void run() {
        switch (this.f43112a) {
            case 0:
                this.f43113b.f38582c.W2.N(true);
                return;
            case 1:
                of.f.s(this.f43113b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            case 2:
                i91 i91Var = this.f43113b;
                i91Var.f38582c.postOnAnimation(new w81(i91Var, 3));
                return;
            case 3:
                this.f43113b.i0();
                return;
            default:
                MessagesController.getInstance(this.f43113b.currentAccount).deleteUserPhoto(null);
                return;
        }
    }
}
