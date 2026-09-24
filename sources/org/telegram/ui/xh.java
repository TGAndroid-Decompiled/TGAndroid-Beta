package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class xh implements Runnable {
    public final int f39906a = 1;
    public final wn f39907b;
    public final int f39908c;
    public final MessageObject d;

    public xh(wn wnVar, int i10, MessageObject messageObject) {
        this.f39907b = wnVar;
        this.f39908c = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f39906a) {
            case 0:
                this.f39907b.f39558n4 = null;
                this.d.messageOwner.replies.read_max_id = this.f39908c;
                return;
            default:
                wn wnVar = this.f39907b;
                org.telegram.ui.Components.yc.a0(wnVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f39908c).disableAds(false);
                MessageObject messageObject = this.d;
                wnVar.Fa(messageObject);
                wnVar.Ha(messageObject);
                return;
        }
    }

    public xh(wn wnVar, MessageObject messageObject, int i10) {
        this.f39907b = wnVar;
        this.d = messageObject;
        this.f39908c = i10;
    }
}
