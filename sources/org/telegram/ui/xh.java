package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class xh implements Runnable {
    public final int f39923a = 1;
    public final wn f39924b;
    public final int f39925c;
    public final MessageObject d;

    public xh(wn wnVar, int i10, MessageObject messageObject) {
        this.f39924b = wnVar;
        this.f39925c = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f39923a) {
            case 0:
                this.f39924b.f39574n4 = null;
                this.d.messageOwner.replies.read_max_id = this.f39925c;
                return;
            default:
                wn wnVar = this.f39924b;
                org.telegram.ui.Components.xc.a0(wnVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f39925c).disableAds(false);
                MessageObject messageObject = this.d;
                wnVar.Fa(messageObject);
                wnVar.Ha(messageObject);
                return;
        }
    }

    public xh(wn wnVar, MessageObject messageObject, int i10) {
        this.f39924b = wnVar;
        this.d = messageObject;
        this.f39925c = i10;
    }
}
