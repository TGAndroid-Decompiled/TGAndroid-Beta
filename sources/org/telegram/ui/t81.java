package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class t81 implements Runnable {
    public final int f37684a;
    public final g91 f37685b;

    public t81(g91 g91Var, int i10) {
        this.f37684a = i10;
        this.f37685b = g91Var;
    }

    @Override
    public final void run() {
        switch (this.f37684a) {
            case 0:
                this.f37685b.f33921c.Y2.N(true);
                return;
            case 1:
                nf.f.s(this.f37685b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            case 2:
                g91 g91Var = this.f37685b;
                g91Var.f33921c.postOnAnimation(new t81(g91Var, 3));
                return;
            case 3:
                this.f37685b.i0();
                return;
            default:
                MessagesController.getInstance(this.f37685b.currentAccount).deleteUserPhoto(null);
                return;
        }
    }
}
