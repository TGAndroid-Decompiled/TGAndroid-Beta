package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class wd1 implements View.OnClickListener {
    public final re1 f42536a;

    public wd1(re1 re1Var) {
        this.f42536a = re1Var;
    }

    @Override
    public final void onClick(View view) {
        re1 re1Var = this.f42536a;
        if (re1Var.M == 1) {
            org.telegram.ui.Components.f5.i0(re1Var, -re1Var.f41150a, null, re1Var.g(), null, false, re1Var.J, new va(this, 5), re1Var.getResourceProvider());
            return;
        }
        re1Var.getMessagesController().addUserToChat(re1Var.f41150a, re1Var.getUserConfig().getCurrentUser(), 0, null, re1Var, false, new pd1(re1Var, 2), new qd1(re1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        re1Var.O0(false);
    }
}
