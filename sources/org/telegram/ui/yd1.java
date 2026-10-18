package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class yd1 implements View.OnClickListener {
    public final te1 f43379a;

    public yd1(te1 te1Var) {
        this.f43379a = te1Var;
    }

    @Override
    public final void onClick(View view) {
        te1 te1Var = this.f43379a;
        if (te1Var.M == 1) {
            org.telegram.ui.Components.f5.i0(te1Var, -te1Var.f41670a, null, te1Var.g(), null, false, te1Var.J, new xa(this, 5), te1Var.getResourceProvider());
            return;
        }
        te1Var.getMessagesController().addUserToChat(te1Var.f41670a, te1Var.getUserConfig().getCurrentUser(), 0, null, te1Var, false, new rd1(te1Var, 2), new sd1(te1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        te1Var.O0(false);
    }
}
