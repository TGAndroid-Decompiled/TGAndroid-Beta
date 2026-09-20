package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;
public final class xm implements Runnable {
    public final int f39623a;
    public final ln f39624b;
    public final MessageObject f39625c;

    public xm(ln lnVar, MessageObject messageObject, int i10) {
        this.f39623a = i10;
        this.f39624b = lnVar;
        this.f39625c = messageObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f39623a) {
            case 0:
                ln lnVar = this.f39624b;
                zn znVar = lnVar.f35482a;
                znVar.Q7();
                UndoView undoView = znVar.y3;
                if (undoView != null) {
                    if (znVar.Y.getVisibility() == 0 && znVar.R.getVisibility() != 0) {
                        i10 = 16;
                    } else {
                        i10 = 17;
                    }
                    MessageObject messageObject = this.f39625c;
                    undoView.k(0L, i10, messageObject.getDiceEmoji(), null, null, new xm(lnVar, messageObject, 2));
                    return;
                }
                return;
            case 1:
                zn znVar2 = this.f39624b.f35482a;
                znVar2.f40514vb = this.f39625c.getId();
                znVar2.f40528wb = 0;
                return;
            default:
                zn znVar3 = this.f39624b.f35482a;
                if (znVar3.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.f39625c.getDiceEmoji(), znVar3.T5, znVar3.f40409n5, znVar3.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = znVar3.C8();
                    znVar3.getSendMessagesHelper().sendMessage(of2);
                    return;
                }
                return;
        }
    }
}
