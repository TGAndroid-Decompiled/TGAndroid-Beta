package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class sh implements Runnable {
    public final int f43507a = 1;
    public final un f43508b;
    public final int f43509c;
    public final MessageObject d;

    public sh(un unVar, int i10, MessageObject messageObject) {
        this.f43508b = unVar;
        this.f43509c = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f43507a) {
            case 0:
                this.f43508b.f44497z4 = null;
                this.d.messageOwner.replies.read_max_id = this.f43509c;
                return;
            default:
                un unVar = this.f43508b;
                org.telegram.ui.Components.wc.b0(unVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f43509c).disableAds(false);
                MessageObject messageObject = this.d;
                unVar.Oa(messageObject);
                unVar.Qa(messageObject);
                return;
        }
    }

    public sh(un unVar, MessageObject messageObject, int i10) {
        this.f43508b = unVar;
        this.d = messageObject;
        this.f43509c = i10;
    }
}
