package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class uh implements Runnable {
    public final int f41832a = 1;
    public final xn f41833b;
    public final int f41834c;
    public final MessageObject d;

    public uh(xn xnVar, int i10, MessageObject messageObject) {
        this.f41833b = xnVar;
        this.f41834c = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f41832a) {
            case 0:
                this.f41833b.f43222k4 = null;
                this.d.messageOwner.replies.read_max_id = this.f41834c;
                return;
            default:
                xn xnVar = this.f41833b;
                org.telegram.ui.Components.qc.a0(xnVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f41834c).disableAds(false);
                MessageObject messageObject = this.d;
                xnVar.Fa(messageObject);
                xnVar.Ha(messageObject);
                return;
        }
    }

    public uh(xn xnVar, MessageObject messageObject, int i10) {
        this.f41833b = xnVar;
        this.d = messageObject;
        this.f41834c = i10;
    }
}
