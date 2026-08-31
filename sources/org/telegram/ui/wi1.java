package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class wi1 extends org.telegram.ui.ActionBar.j {
    public final yi1 f42829a;

    public wi1(yi1 yi1Var) {
        this.f42829a = yi1Var;
    }

    @Override
    public final void b(int i10) {
        yi1 yi1Var = this.f42829a;
        MessageObject messageObject = yi1Var.f43645n;
        if (i10 == -1) {
            yi1Var.finishFragment();
        } else if (i10 == 1) {
            if (messageObject != null) {
                messageObject.messageOwner.with_my_score = false;
                yi1Var.showDialog(org.telegram.ui.Components.mq0.N0(yi1Var.getParentActivity(), messageObject, null, false, yi1Var.h));
            }
        } else if (i10 == 2) {
            yi1.V(yi1Var.d, messageObject, yi1Var.getParentActivity(), yi1Var.f43646r, yi1Var.f43643e);
        }
    }
}
