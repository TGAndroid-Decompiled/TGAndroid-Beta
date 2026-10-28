package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class th implements Runnable {
    public final int f43643a = 1;
    public final wn f43644b;
    public final int f43645c;
    public final MessageObject d;

    public th(wn wnVar, int i10, MessageObject messageObject) {
        this.f43644b = wnVar;
        this.f43645c = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f43643a) {
            case 0:
                this.f43644b.f45368z4 = null;
                this.d.messageOwner.replies.read_max_id = this.f43645c;
                return;
            default:
                wn wnVar = this.f43644b;
                org.telegram.ui.Components.wc.b0(wnVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f43645c).disableAds(false);
                MessageObject messageObject = this.d;
                wnVar.Ra(messageObject);
                wnVar.Ta(messageObject);
                return;
        }
    }

    public th(wn wnVar, MessageObject messageObject, int i10) {
        this.f43644b = wnVar;
        this.d = messageObject;
        this.f43645c = i10;
    }
}
