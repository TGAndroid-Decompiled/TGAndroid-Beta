package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class r71 implements Runnable {
    public final int f42880a;
    public final f81 f42881b;

    public r71(f81 f81Var, int i10) {
        this.f42880a = i10;
        this.f42881b = f81Var;
    }

    @Override
    public final void run() {
        switch (this.f42880a) {
            case 0:
                MessagesController.getInstance(this.f42881b.currentAccount).deleteUserPhoto(null);
                return;
            case 1:
                qf.d.r(this.f42881b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                return;
            default:
                this.f42881b.f39260c.f32504g3.O(true);
                return;
        }
    }
}
