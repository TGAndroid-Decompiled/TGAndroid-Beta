package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;
public final class zm implements Runnable {
    public final int f40276a;
    public final nn f40277b;
    public final MessageObject f40278c;

    public zm(nn nnVar, MessageObject messageObject, int i10) {
        this.f40276a = i10;
        this.f40277b = nnVar;
        this.f40278c = messageObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f40276a) {
            case 0:
                nn nnVar = this.f40277b;
                bo boVar = nnVar.f36139a;
                boVar.Q7();
                UndoView undoView = boVar.y3;
                if (undoView != null) {
                    if (boVar.Y.getVisibility() == 0 && boVar.R.getVisibility() != 0) {
                        i10 = 16;
                    } else {
                        i10 = 17;
                    }
                    MessageObject messageObject = this.f40278c;
                    undoView.k(0L, i10, messageObject.getDiceEmoji(), null, null, new zm(nnVar, messageObject, 2));
                    return;
                }
                return;
            case 1:
                bo boVar2 = this.f40277b.f36139a;
                boVar2.f32490vb = this.f40278c.getId();
                boVar2.f32504wb = 0;
                return;
            default:
                bo boVar3 = this.f40277b.f36139a;
                if (boVar3.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.f40278c.getDiceEmoji(), boVar3.T5, boVar3.f32385n5, boVar3.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = boVar3.C8();
                    boVar3.getSendMessagesHelper().sendMessage(of2);
                    return;
                }
                return;
        }
    }
}
