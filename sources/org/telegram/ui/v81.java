package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class v81 implements Runnable {
    public final int f42903a;
    public final h91 f42904b;

    public v81(h91 h91Var, int i10) {
        this.f42903a = i10;
        this.f42904b = h91Var;
    }

    @Override
    public final void run() {
        switch (this.f42903a) {
            case 0:
                this.f42904b.f38353c.W2.N(true);
                return;
            case 1:
                of.f.s(this.f42904b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            case 2:
                h91 h91Var = this.f42904b;
                h91Var.f38353c.postOnAnimation(new v81(h91Var, 3));
                return;
            case 3:
                this.f42904b.i0();
                return;
            default:
                MessagesController.getInstance(this.f42904b.currentAccount).deleteUserPhoto(null);
                return;
        }
    }
}
