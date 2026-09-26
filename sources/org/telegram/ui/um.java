package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;
public final class um implements Runnable {
    public final int f38500a;
    public final in f38501b;
    public final MessageObject f38502c;

    public um(in inVar, MessageObject messageObject, int i10) {
        this.f38500a = i10;
        this.f38501b = inVar;
        this.f38502c = messageObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f38500a) {
            case 0:
                in inVar = this.f38501b;
                wn wnVar = inVar.f34557a;
                wnVar.Q7();
                UndoView undoView = wnVar.y3;
                if (undoView != null) {
                    if (wnVar.Y.getVisibility() == 0 && wnVar.R.getVisibility() != 0) {
                        i10 = 16;
                    } else {
                        i10 = 17;
                    }
                    MessageObject messageObject = this.f38502c;
                    undoView.k(0L, i10, messageObject.getDiceEmoji(), null, null, new um(inVar, messageObject, 2));
                    return;
                }
                return;
            case 1:
                wn wnVar2 = this.f38501b.f34557a;
                wnVar2.f39679vb = this.f38502c.getId();
                wnVar2.f39693wb = 0;
                return;
            default:
                wn wnVar3 = this.f38501b.f34557a;
                if (wnVar3.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.f38502c.getDiceEmoji(), wnVar3.T5, wnVar3.f39574n5, wnVar3.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = wnVar3.C8();
                    wnVar3.getSendMessagesHelper().sendMessage(of2);
                    return;
                }
                return;
        }
    }
}
