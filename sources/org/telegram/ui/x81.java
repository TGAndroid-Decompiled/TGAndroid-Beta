package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class x81 implements Runnable {
    public final int f38611a;
    public final k91 f38612b;

    public x81(k91 k91Var, int i10) {
        this.f38611a = i10;
        this.f38612b = k91Var;
    }

    @Override
    public final void run() {
        switch (this.f38611a) {
            case 0:
                this.f38612b.f34298c.Y2.N(true);
                return;
            case 1:
                nf.f.s(this.f38612b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            case 2:
                k91 k91Var = this.f38612b;
                k91Var.f34298c.postOnAnimation(new x81(k91Var, 3));
                return;
            case 3:
                this.f38612b.i0();
                return;
            default:
                MessagesController.getInstance(this.f38612b.currentAccount).deleteUserPhoto(null);
                return;
        }
    }
}
