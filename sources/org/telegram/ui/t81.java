package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class t81 implements Runnable {
    public final int f37689a;
    public final g91 f37690b;

    public t81(g91 g91Var, int i10) {
        this.f37689a = i10;
        this.f37690b = g91Var;
    }

    @Override
    public final void run() {
        switch (this.f37689a) {
            case 0:
                this.f37690b.f33925c.Y2.N(true);
                return;
            case 1:
                nf.f.s(this.f37690b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            case 2:
                g91 g91Var = this.f37690b;
                g91Var.f33925c.postOnAnimation(new t81(g91Var, 3));
                return;
            case 3:
                this.f37690b.i0();
                return;
            default:
                MessagesController.getInstance(this.f37690b.currentAccount).deleteUserPhoto(null);
                return;
        }
    }
}
