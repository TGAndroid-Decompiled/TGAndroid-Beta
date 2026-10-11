package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class zh implements Runnable {
    public final int f44698a = 1;
    public final zn f44699b;
    public final int f44700c;
    public final MessageObject d;

    public zh(zn znVar, int i10, MessageObject messageObject) {
        this.f44699b = znVar;
        this.f44700c = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f44698a) {
            case 0:
                this.f44699b.f44900n4 = null;
                this.d.messageOwner.replies.read_max_id = this.f44700c;
                return;
            default:
                zn znVar = this.f44699b;
                org.telegram.ui.Components.ad.a0(znVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f44700c).disableAds(false);
                MessageObject messageObject = this.d;
                znVar.Ja(messageObject);
                znVar.La(messageObject);
                return;
        }
    }

    public zh(zn znVar, MessageObject messageObject, int i10) {
        this.f44699b = znVar;
        this.d = messageObject;
        this.f44700c = i10;
    }
}
