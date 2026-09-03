package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class x30 extends t4 {
    public final d60 R;

    public x30(d60 d60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.R = d60Var;
    }

    @Override
    public final void c() {
        d60 d60Var = this.R;
        AccountInstance accountInstance = d60Var.d;
        y30 y30Var = d60Var.f35993b;
        long dialogId = y30Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            y30Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}
