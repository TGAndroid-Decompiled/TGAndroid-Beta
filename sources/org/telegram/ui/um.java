package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;
public final class um implements Runnable {
    public final int f38481a;
    public final in f38482b;
    public final MessageObject f38483c;

    public um(in inVar, MessageObject messageObject, int i10) {
        this.f38481a = i10;
        this.f38482b = inVar;
        this.f38483c = messageObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f38481a) {
            case 0:
                in inVar = this.f38482b;
                wn wnVar = inVar.f34543a;
                wnVar.Q7();
                UndoView undoView = wnVar.y3;
                if (undoView != null) {
                    if (wnVar.Y.getVisibility() == 0 && wnVar.R.getVisibility() != 0) {
                        i10 = 16;
                    } else {
                        i10 = 17;
                    }
                    MessageObject messageObject = this.f38483c;
                    undoView.k(0L, i10, messageObject.getDiceEmoji(), null, null, new um(inVar, messageObject, 2));
                    return;
                }
                return;
            case 1:
                wn wnVar2 = this.f38482b.f34543a;
                wnVar2.f39664vb = this.f38483c.getId();
                wnVar2.f39678wb = 0;
                return;
            default:
                wn wnVar3 = this.f38482b.f34543a;
                if (wnVar3.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.f38483c.getDiceEmoji(), wnVar3.T5, wnVar3.f39559n5, wnVar3.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = wnVar3.C8();
                    wnVar3.getSendMessagesHelper().sendMessage(of2);
                    return;
                }
                return;
        }
    }
}
