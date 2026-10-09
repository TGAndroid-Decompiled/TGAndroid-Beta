package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;
public final class xm implements Runnable {
    public final int f44061a;
    public final ln f44062b;
    public final MessageObject f44063c;

    public xm(ln lnVar, MessageObject messageObject, int i10) {
        this.f44061a = i10;
        this.f44062b = lnVar;
        this.f44063c = messageObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f44061a) {
            case 0:
                ln lnVar = this.f44062b;
                zn znVar = lnVar.f39634a;
                znVar.T7();
                UndoView undoView = znVar.y3;
                if (undoView != null) {
                    if (znVar.Y.getVisibility() == 0 && znVar.R.getVisibility() != 0) {
                        i10 = 16;
                    } else {
                        i10 = 17;
                    }
                    int i11 = i10;
                    MessageObject messageObject = this.f44063c;
                    undoView.k(0L, i11, messageObject.getDiceEmoji(), null, null, new xm(lnVar, messageObject, 2));
                    return;
                }
                return;
            case 1:
                zn znVar2 = this.f44062b.f39634a;
                znVar2.f44985wb = this.f44063c.getId();
                znVar2.f44999xb = 0;
                return;
            default:
                zn znVar3 = this.f44062b.f39634a;
                if (znVar3.i7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.f44063c.getDiceEmoji(), znVar3.T5, znVar3.f44866n5, znVar3.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = znVar3.H8();
                    znVar3.getSendMessagesHelper().sendMessage(of2);
                    return;
                }
                return;
        }
    }
}
