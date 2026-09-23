package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class y30 extends r4 {
    public final f60 U;

    public y30(f60 f60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = f60Var;
    }

    @Override
    public final void c() {
        f60 f60Var = this.U;
        AccountInstance accountInstance = f60Var.d;
        z30 z30Var = f60Var.f33101b;
        long dialogId = z30Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            z30Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}
