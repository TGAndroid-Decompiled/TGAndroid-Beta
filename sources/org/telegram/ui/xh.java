package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class xh implements Runnable {
    public final int f39921a = 1;
    public final wn f39922b;
    public final int f39923c;
    public final MessageObject d;

    public xh(wn wnVar, int i10, MessageObject messageObject) {
        this.f39922b = wnVar;
        this.f39923c = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f39921a) {
            case 0:
                this.f39922b.f39572n4 = null;
                this.d.messageOwner.replies.read_max_id = this.f39923c;
                return;
            default:
                wn wnVar = this.f39922b;
                org.telegram.ui.Components.xc.a0(wnVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f39923c).disableAds(false);
                MessageObject messageObject = this.d;
                wnVar.Fa(messageObject);
                wnVar.Ha(messageObject);
                return;
        }
    }

    public xh(wn wnVar, MessageObject messageObject, int i10) {
        this.f39922b = wnVar;
        this.d = messageObject;
        this.f39923c = i10;
    }
}
