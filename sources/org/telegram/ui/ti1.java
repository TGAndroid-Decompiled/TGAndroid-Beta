package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class ti1 extends org.telegram.ui.ActionBar.j {
    public final vi1 f38676a;

    public ti1(vi1 vi1Var) {
        this.f38676a = vi1Var;
    }

    @Override
    public final void b(int i10) {
        vi1 vi1Var = this.f38676a;
        MessageObject messageObject = vi1Var.f39192n;
        if (i10 == -1) {
            vi1Var.finishFragment();
        } else if (i10 == 1) {
            if (messageObject != null) {
                messageObject.messageOwner.with_my_score = false;
                vi1Var.showDialog(org.telegram.ui.Components.lq0.N0(vi1Var.getParentActivity(), messageObject, null, false, vi1Var.h));
            }
        } else if (i10 == 2) {
            vi1.V(vi1Var.d, messageObject, vi1Var.getParentActivity(), vi1Var.f39193r, vi1Var.e);
        }
    }
}
