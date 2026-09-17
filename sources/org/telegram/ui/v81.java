package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class v81 implements Runnable {
    public final int f41478a;
    public final i91 f41479b;

    public v81(i91 i91Var, int i10) {
        this.f41478a = i10;
        this.f41479b = i91Var;
    }

    @Override
    public final void run() {
        switch (this.f41478a) {
            case 0:
                this.f41479b.f37296c.Y2.N(true);
                return;
            case 1:
                of.f.s(this.f41479b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            case 2:
                i91 i91Var = this.f41479b;
                i91Var.f37296c.postOnAnimation(new v81(i91Var, 3));
                return;
            case 3:
                this.f41479b.i0();
                return;
            default:
                MessagesController.getInstance(this.f41479b.currentAccount).deleteUserPhoto(null);
                return;
        }
    }
}
