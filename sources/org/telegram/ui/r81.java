package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class r81 implements Runnable {
    public final int f37046a;
    public final e91 f37047b;

    public r81(e91 e91Var, int i10) {
        this.f37046a = i10;
        this.f37047b = e91Var;
    }

    @Override
    public final void run() {
        switch (this.f37046a) {
            case 0:
                this.f37047b.f33285c.Y2.N(true);
                return;
            case 1:
                nf.f.s(this.f37047b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            case 2:
                e91 e91Var = this.f37047b;
                e91Var.f33285c.postOnAnimation(new r81(e91Var, 3));
                return;
            case 3:
                this.f37047b.i0();
                return;
            default:
                MessagesController.getInstance(this.f37047b.currentAccount).deleteUserPhoto(null);
                return;
        }
    }
}
