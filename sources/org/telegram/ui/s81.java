package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class s81 implements Runnable {
    public final int f37295a;
    public final f91 f37296b;

    public s81(f91 f91Var, int i10) {
        this.f37295a = i10;
        this.f37296b = f91Var;
    }

    @Override
    public final void run() {
        switch (this.f37295a) {
            case 0:
                this.f37296b.f33546c.Y2.N(true);
                return;
            case 1:
                nf.f.s(this.f37296b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            case 2:
                f91 f91Var = this.f37296b;
                f91Var.f33546c.postOnAnimation(new s81(f91Var, 3));
                return;
            case 3:
                this.f37296b.i0();
                return;
            default:
                MessagesController.getInstance(this.f37296b.currentAccount).deleteUserPhoto(null);
                return;
        }
    }
}
