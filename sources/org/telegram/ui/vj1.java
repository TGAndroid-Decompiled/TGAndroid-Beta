package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class vj1 extends org.telegram.ui.ActionBar.j {
    public final xj1 f40721a;

    public vj1(xj1 xj1Var) {
        this.f40721a = xj1Var;
    }

    @Override
    public final void b(int i10) {
        xj1 xj1Var = this.f40721a;
        MessageObject messageObject = xj1Var.f41587n;
        if (i10 == -1) {
            xj1Var.finishFragment();
        } else if (i10 == 1) {
            if (messageObject != null) {
                messageObject.messageOwner.with_my_score = false;
                xj1Var.showDialog(org.telegram.ui.Components.ir0.O0(xj1Var.getParentActivity(), messageObject, null, false, xj1Var.h));
            }
        } else if (i10 == 2) {
            xj1.V(xj1Var.d, messageObject, xj1Var.getParentActivity(), xj1Var.f41588r, xj1Var.e);
        }
    }
}
