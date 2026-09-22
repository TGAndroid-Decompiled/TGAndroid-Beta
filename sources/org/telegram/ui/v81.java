package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class v81 implements Runnable {
    public final int f38456a;
    public final i91 f38457b;

    public v81(i91 i91Var, int i10) {
        this.f38456a = i10;
        this.f38457b = i91Var;
    }

    @Override
    public final void run() {
        switch (this.f38456a) {
            case 0:
                this.f38457b.f34526c.Y2.N(true);
                return;
            case 1:
                nf.f.s(this.f38457b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            case 2:
                i91 i91Var = this.f38457b;
                i91Var.f34526c.postOnAnimation(new v81(i91Var, 3));
                return;
            case 3:
                this.f38457b.i0();
                return;
            default:
                MessagesController.getInstance(this.f38457b.currentAccount).deleteUserPhoto(null);
                return;
        }
    }
}
