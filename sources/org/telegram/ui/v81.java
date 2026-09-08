package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class v81 implements Runnable {
    public final int f41477a;
    public final i91 f41478b;

    public v81(i91 i91Var, int i10) {
        this.f41477a = i10;
        this.f41478b = i91Var;
    }

    @Override
    public final void run() {
        switch (this.f41477a) {
            case 0:
                this.f41478b.f37295c.Y2.N(true);
                return;
            case 1:
                of.f.s(this.f41478b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            case 2:
                i91 i91Var = this.f41478b;
                i91Var.f37295c.postOnAnimation(new v81(i91Var, 3));
                return;
            case 3:
                this.f41478b.i0();
                return;
            default:
                MessagesController.getInstance(this.f41478b.currentAccount).deleteUserPhoto(null);
                return;
        }
    }
}
