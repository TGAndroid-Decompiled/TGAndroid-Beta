package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class wj1 extends org.telegram.ui.ActionBar.j {
    public final yj1 f41611a;

    public wj1(yj1 yj1Var) {
        this.f41611a = yj1Var;
    }

    @Override
    public final void b(int i10) {
        yj1 yj1Var = this.f41611a;
        MessageObject messageObject = yj1Var.f42183n;
        if (i10 == -1) {
            yj1Var.finishFragment();
        } else if (i10 == 1) {
            if (messageObject != null) {
                messageObject.messageOwner.with_my_score = false;
                yj1Var.showDialog(org.telegram.ui.Components.jr0.O0(yj1Var.getParentActivity(), messageObject, null, false, yj1Var.h));
            }
        } else if (i10 == 2) {
            yj1.V(yj1Var.d, messageObject, yj1Var.getParentActivity(), yj1Var.f42184r, yj1Var.e);
        }
    }
}
