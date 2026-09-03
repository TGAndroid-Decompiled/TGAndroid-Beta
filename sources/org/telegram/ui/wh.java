package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class wh implements Runnable {
    public final int f39698a = 1;
    public final zn f39699b;
    public final int f39700c;
    public final MessageObject d;

    public wh(zn znVar, int i10, MessageObject messageObject) {
        this.f39699b = znVar;
        this.f39700c = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f39698a) {
            case 0:
                this.f39699b.f40641k4 = null;
                this.d.messageOwner.replies.read_max_id = this.f39700c;
                return;
            default:
                zn znVar = this.f39699b;
                org.telegram.ui.Components.qc.a0(znVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f39700c).disableAds(false);
                MessageObject messageObject = this.d;
                znVar.Fa(messageObject);
                znVar.Ha(messageObject);
                return;
        }
    }

    public wh(zn znVar, MessageObject messageObject, int i10) {
        this.f39699b = znVar;
        this.d = messageObject;
        this.f39700c = i10;
    }
}
