package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class xh implements Runnable {
    public final int f40020a = 1;
    public final wn f40021b;
    public final int f40022c;
    public final MessageObject d;

    public xh(wn wnVar, int i10, MessageObject messageObject) {
        this.f40021b = wnVar;
        this.f40022c = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f40020a) {
            case 0:
                this.f40021b.f39666n4 = null;
                this.d.messageOwner.replies.read_max_id = this.f40022c;
                return;
            default:
                wn wnVar = this.f40021b;
                org.telegram.ui.Components.yc.a0(wnVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f40022c).disableAds(false);
                MessageObject messageObject = this.d;
                wnVar.Fa(messageObject);
                wnVar.Ha(messageObject);
                return;
        }
    }

    public xh(wn wnVar, MessageObject messageObject, int i10) {
        this.f40021b = wnVar;
        this.d = messageObject;
        this.f40022c = i10;
    }
}
