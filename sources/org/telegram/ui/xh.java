package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class xh implements Runnable {
    public final int f39274a = 1;
    public final xn f39275b;
    public final int f39276c;
    public final MessageObject d;

    public xh(xn xnVar, int i10, MessageObject messageObject) {
        this.f39275b = xnVar;
        this.f39276c = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f39274a) {
            case 0:
                this.f39275b.f39474n4 = null;
                this.d.messageOwner.replies.read_max_id = this.f39276c;
                return;
            default:
                xn xnVar = this.f39275b;
                org.telegram.ui.Components.xc.a0(xnVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f39276c).disableAds(false);
                MessageObject messageObject = this.d;
                xnVar.Fa(messageObject);
                xnVar.Ha(messageObject);
                return;
        }
    }

    public xh(xn xnVar, MessageObject messageObject, int i10) {
        this.f39275b = xnVar;
        this.d = messageObject;
        this.f39276c = i10;
    }
}
