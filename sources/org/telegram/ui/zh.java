package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class zh implements Runnable {
    public final int f43783a = 1;
    public final yn f43784b;
    public final int f43785c;
    public final MessageObject d;

    public zh(yn ynVar, int i10, MessageObject messageObject) {
        this.f43784b = ynVar;
        this.f43785c = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f43783a) {
            case 0:
                this.f43784b.l4 = null;
                this.d.messageOwner.replies.read_max_id = this.f43785c;
                return;
            default:
                yn ynVar = this.f43784b;
                org.telegram.ui.Components.yc.a0(ynVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f43785c).disableAds(false);
                MessageObject messageObject = this.d;
                ynVar.Ea(messageObject);
                ynVar.Ga(messageObject);
                return;
        }
    }

    public zh(yn ynVar, MessageObject messageObject, int i10) {
        this.f43784b = ynVar;
        this.d = messageObject;
        this.f43785c = i10;
    }
}
