package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class zh implements Runnable {
    public final int f44674a = 1;
    public final zn f44675b;
    public final int f44676c;
    public final MessageObject d;

    public zh(zn znVar, int i10, MessageObject messageObject) {
        this.f44675b = znVar;
        this.f44676c = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f44674a) {
            case 0:
                this.f44675b.f44911n4 = null;
                this.d.messageOwner.replies.read_max_id = this.f44676c;
                return;
            default:
                zn znVar = this.f44675b;
                org.telegram.ui.Components.ad.a0(znVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f44676c).disableAds(false);
                MessageObject messageObject = this.d;
                znVar.Ja(messageObject);
                znVar.La(messageObject);
                return;
        }
    }

    public zh(zn znVar, MessageObject messageObject, int i10) {
        this.f44675b = znVar;
        this.d = messageObject;
        this.f44676c = i10;
    }
}
