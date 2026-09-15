package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;
public final class zm implements Runnable {
    public final int f40235a;
    public final nn f40236b;
    public final MessageObject f40237c;

    public zm(nn nnVar, MessageObject messageObject, int i10) {
        this.f40235a = i10;
        this.f40236b = nnVar;
        this.f40237c = messageObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f40235a) {
            case 0:
                nn nnVar = this.f40236b;
                bo boVar = nnVar.f36012a;
                boVar.Q7();
                UndoView undoView = boVar.y3;
                if (undoView != null) {
                    if (boVar.Y.getVisibility() == 0 && boVar.R.getVisibility() != 0) {
                        i10 = 16;
                    } else {
                        i10 = 17;
                    }
                    MessageObject messageObject = this.f40237c;
                    undoView.k(0L, i10, messageObject.getDiceEmoji(), null, null, new zm(nnVar, messageObject, 2));
                    return;
                }
                return;
            case 1:
                bo boVar2 = this.f40236b.f36012a;
                boVar2.f32522wb = this.f40237c.getId();
                boVar2.f32535xb = 0;
                return;
            default:
                bo boVar3 = this.f40236b.f36012a;
                if (boVar3.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.f40237c.getDiceEmoji(), boVar3.T5, boVar3.f32403n5, boVar3.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = boVar3.C8();
                    boVar3.getSendMessagesHelper().sendMessage(of2);
                    return;
                }
                return;
        }
    }
}
