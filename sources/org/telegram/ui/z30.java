package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class z30 extends p4 {
    public final g60 U;

    public z30(g60 g60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = g60Var;
    }

    @Override
    public final void c() {
        g60 g60Var = this.U;
        AccountInstance accountInstance = g60Var.d;
        a40 a40Var = g60Var.f37871b;
        long dialogId = a40Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            a40Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}
