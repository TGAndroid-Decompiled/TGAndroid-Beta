package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class w30 extends t4 {
    public final c60 R;

    public w30(c60 c60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.R = c60Var;
    }

    @Override
    public final void c() {
        c60 c60Var = this.R;
        AccountInstance accountInstance = c60Var.d;
        x30 x30Var = c60Var.f33101b;
        long dialogId = x30Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            x30Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}
