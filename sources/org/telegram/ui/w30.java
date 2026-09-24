package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class w30 extends q4 {
    public final d60 U;

    public w30(d60 d60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = d60Var;
    }

    @Override
    public final void c() {
        d60 d60Var = this.U;
        AccountInstance accountInstance = d60Var.d;
        x30 x30Var = d60Var.f32921b;
        long dialogId = x30Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            x30Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}
