package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class y30 extends v4 {
    public final e60 R;

    public y30(e60 e60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.R = e60Var;
    }

    @Override
    public final void c() {
        e60 e60Var = this.R;
        AccountInstance accountInstance = e60Var.d;
        z30 z30Var = e60Var.f33620b;
        long dialogId = z30Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            z30Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}
