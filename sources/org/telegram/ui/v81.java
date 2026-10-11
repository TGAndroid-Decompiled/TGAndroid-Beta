package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class v81 implements Runnable {
    public final int f42937a;
    public final h91 f42938b;

    public v81(h91 h91Var, int i10) {
        this.f42937a = i10;
        this.f42938b = h91Var;
    }

    @Override
    public final void run() {
        switch (this.f42937a) {
            case 0:
                this.f42938b.f38387c.W2.N(true);
                return;
            case 1:
                of.f.s(this.f42938b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            case 2:
                h91 h91Var = this.f42938b;
                h91Var.f38387c.postOnAnimation(new v81(h91Var, 3));
                return;
            case 3:
                this.f42938b.i0();
                return;
            default:
                MessagesController.getInstance(this.f42938b.currentAccount).deleteUserPhoto(null);
                return;
        }
    }
}
