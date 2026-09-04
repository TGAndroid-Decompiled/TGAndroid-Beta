package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class v81 implements Runnable {
    public final int f41450a;
    public final i91 f41451b;

    public v81(i91 i91Var, int i10) {
        this.f41450a = i10;
        this.f41451b = i91Var;
    }

    @Override
    public final void run() {
        switch (this.f41450a) {
            case 0:
                this.f41451b.f37268c.Y2.N(true);
                return;
            case 1:
                of.f.s(this.f41451b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            case 2:
                i91 i91Var = this.f41451b;
                i91Var.f37268c.postOnAnimation(new v81(i91Var, 3));
                return;
            case 3:
                this.f41451b.i0();
                return;
            default:
                MessagesController.getInstance(this.f41451b.currentAccount).deleteUserPhoto(null);
                return;
        }
    }
}
