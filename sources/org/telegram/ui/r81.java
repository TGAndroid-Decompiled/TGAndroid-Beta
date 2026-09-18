package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class r81 implements Runnable {
    public final int f36988a;
    public final f91 f36989b;

    public r81(f91 f91Var, int i10) {
        this.f36988a = i10;
        this.f36989b = f91Var;
    }

    @Override
    public final void run() {
        switch (this.f36988a) {
            case 0:
                this.f36989b.f33483c.Y2.N(true);
                return;
            case 1:
                nf.f.s(this.f36989b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            case 2:
                f91 f91Var = this.f36989b;
                f91Var.f33483c.postOnAnimation(new r81(f91Var, 3));
                return;
            case 3:
                this.f36989b.i0();
                return;
            default:
                MessagesController.getInstance(this.f36989b.currentAccount).deleteUserPhoto(null);
                return;
        }
    }
}
