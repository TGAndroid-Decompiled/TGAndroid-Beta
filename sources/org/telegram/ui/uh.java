package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class uh implements Runnable {
    public final int f38940a = 1;
    public final xn f38941b;
    public final int f38942c;
    public final MessageObject d;

    public uh(xn xnVar, int i10, MessageObject messageObject) {
        this.f38941b = xnVar;
        this.f38942c = i10;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f38940a) {
            case 0:
                this.f38941b.f40075k4 = null;
                this.d.messageOwner.replies.read_max_id = this.f38942c;
                return;
            default:
                xn xnVar = this.f38941b;
                org.telegram.ui.Components.qc.a0(xnVar).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f38942c).disableAds(false);
                MessageObject messageObject = this.d;
                xnVar.Fa(messageObject);
                xnVar.Ha(messageObject);
                return;
        }
    }

    public uh(xn xnVar, MessageObject messageObject, int i10) {
        this.f38941b = xnVar;
        this.d = messageObject;
        this.f38942c = i10;
    }
}
