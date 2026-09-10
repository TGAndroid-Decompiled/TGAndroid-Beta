package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class rj1 extends org.telegram.ui.ActionBar.k {
    public final tj1 f36380a;

    public rj1(tj1 tj1Var) {
        this.f36380a = tj1Var;
    }

    @Override
    public final void b(int i10) {
        tj1 tj1Var = this.f36380a;
        MessageObject messageObject = tj1Var.f36957n;
        if (i10 == -1) {
            tj1Var.finishFragment();
        } else if (i10 == 1) {
            if (messageObject != null) {
                messageObject.messageOwner.with_my_score = false;
                tj1Var.showDialog(org.telegram.ui.Components.sq0.N0(tj1Var.getParentActivity(), messageObject, null, false, tj1Var.h));
            }
        } else if (i10 == 2) {
            tj1.V(tj1Var.d, messageObject, tj1Var.getParentActivity(), tj1Var.f36958r, tj1Var.e);
        }
    }
}
