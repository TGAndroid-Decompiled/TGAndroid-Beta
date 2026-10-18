package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class sh implements Runnable {
    public final int f41098a = 1;
    public final sn f41099b;
    public final int f41100c;
    public final MessageObject d;

    public sh(sn snVar, int i10, MessageObject messageObject) {
        this.f41099b = snVar;
        this.f41100c = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f41098a) {
            case 0:
                this.f41099b.f41296n4 = null;
                this.d.messageOwner.replies.read_max_id = this.f41100c;
                return;
            default:
                sn snVar = this.f41099b;
                org.telegram.ui.Components.xc.a0(snVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f41100c).disableAds(false);
                MessageObject messageObject = this.d;
                snVar.Ja(messageObject);
                snVar.La(messageObject);
                return;
        }
    }

    public sh(sn snVar, MessageObject messageObject, int i10) {
        this.f41099b = snVar;
        this.d = messageObject;
        this.f41100c = i10;
    }
}
