package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;
public final class xm implements Runnable {
    public final int f39643a;
    public final ln f39644b;
    public final MessageObject f39645c;

    public xm(ln lnVar, MessageObject messageObject, int i10) {
        this.f39643a = i10;
        this.f39644b = lnVar;
        this.f39645c = messageObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f39643a) {
            case 0:
                ln lnVar = this.f39644b;
                zn znVar = lnVar.f35505a;
                znVar.Q7();
                UndoView undoView = znVar.y3;
                if (undoView != null) {
                    if (znVar.Y.getVisibility() == 0 && znVar.R.getVisibility() != 0) {
                        i10 = 16;
                    } else {
                        i10 = 17;
                    }
                    MessageObject messageObject = this.f39645c;
                    undoView.k(0L, i10, messageObject.getDiceEmoji(), null, null, new xm(lnVar, messageObject, 2));
                    return;
                }
                return;
            case 1:
                zn znVar2 = this.f39644b.f35505a;
                znVar2.f40535vb = this.f39645c.getId();
                znVar2.f40549wb = 0;
                return;
            default:
                zn znVar3 = this.f39644b.f35505a;
                if (znVar3.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.f39645c.getDiceEmoji(), znVar3.T5, znVar3.f40430n5, znVar3.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = znVar3.C8();
                    znVar3.getSendMessagesHelper().sendMessage(of2);
                    return;
                }
                return;
        }
    }
}
