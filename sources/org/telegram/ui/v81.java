package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class v81 implements Runnable {
    public final int f38435a;
    public final i91 f38436b;

    public v81(i91 i91Var, int i10) {
        this.f38435a = i10;
        this.f38436b = i91Var;
    }

    @Override
    public final void run() {
        switch (this.f38435a) {
            case 0:
                this.f38436b.f34506c.Y2.N(true);
                return;
            case 1:
                nf.f.s(this.f38436b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            case 2:
                i91 i91Var = this.f38436b;
                i91Var.f34506c.postOnAnimation(new v81(i91Var, 3));
                return;
            case 3:
                this.f38436b.i0();
                return;
            default:
                MessagesController.getInstance(this.f38436b.currentAccount).deleteUserPhoto(null);
                return;
        }
    }
}
