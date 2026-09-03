package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class we1 implements View.OnClickListener {
    public final sf1 f42418a;

    public we1(sf1 sf1Var) {
        this.f42418a = sf1Var;
    }

    @Override
    public final void onClick(View view) {
        sf1 sf1Var = this.f42418a;
        if (sf1Var.J == 1) {
            org.telegram.ui.Components.z4.j0(sf1Var, -sf1Var.f41188a, null, sf1Var.g(), null, false, sf1Var.G, new ta(this, 5), sf1Var.getResourceProvider());
            return;
        }
        sf1Var.getMessagesController().addUserToChat(sf1Var.f41188a, sf1Var.getUserConfig().getCurrentUser(), 0, null, sf1Var, false, new qe1(sf1Var, 2), new re1(sf1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        sf1Var.O0(false);
    }
}
