package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;
public final class xm implements Runnable {
    public final int f44107a;
    public final ln f44108b;
    public final MessageObject f44109c;

    public xm(ln lnVar, MessageObject messageObject, int i10) {
        this.f44107a = i10;
        this.f44108b = lnVar;
        this.f44109c = messageObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f44107a) {
            case 0:
                ln lnVar = this.f44108b;
                zn znVar = lnVar.f39680a;
                znVar.T7();
                UndoView undoView = znVar.y3;
                if (undoView != null) {
                    if (znVar.Y.getVisibility() == 0 && znVar.R.getVisibility() != 0) {
                        i10 = 16;
                    } else {
                        i10 = 17;
                    }
                    int i11 = i10;
                    MessageObject messageObject = this.f44109c;
                    undoView.k(0L, i11, messageObject.getDiceEmoji(), null, null, new xm(lnVar, messageObject, 2));
                    return;
                }
                return;
            case 1:
                zn znVar2 = this.f44108b.f39680a;
                znVar2.f45031wb = this.f44109c.getId();
                znVar2.f45045xb = 0;
                return;
            default:
                zn znVar3 = this.f44108b.f39680a;
                if (znVar3.i7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.f44109c.getDiceEmoji(), znVar3.T5, znVar3.f44912n5, znVar3.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = znVar3.H8();
                    znVar3.getSendMessagesHelper().sendMessage(of2);
                    return;
                }
                return;
        }
    }
}
