package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;
public final class vm implements Runnable {
    public final int f42171a;
    public final jn f42172b;
    public final MessageObject f42173c;

    public vm(jn jnVar, MessageObject messageObject, int i10) {
        this.f42171a = i10;
        this.f42172b = jnVar;
        this.f42173c = messageObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f42171a) {
            case 0:
                jn jnVar = this.f42172b;
                xn xnVar = jnVar.f38085a;
                xnVar.Q7();
                UndoView undoView = xnVar.f43356v3;
                if (undoView != null) {
                    if (xnVar.V.getVisibility() == 0 && xnVar.O.getVisibility() != 0) {
                        i10 = 16;
                    } else {
                        i10 = 17;
                    }
                    MessageObject messageObject = this.f42173c;
                    undoView.k(0L, i10, messageObject.getDiceEmoji(), null, null, new vm(jnVar, messageObject, 2));
                    return;
                }
                return;
            case 1:
                xn xnVar2 = this.f42172b.f38085a;
                xnVar2.f43338tb = this.f42173c.getId();
                xnVar2.f43351ub = 0;
                return;
            default:
                xn xnVar3 = this.f42172b.f38085a;
                if (xnVar3.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.f42173c.getDiceEmoji(), xnVar3.Q5, xnVar3.f43223k5, xnVar3.U3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = xnVar3.C8();
                    xnVar3.getSendMessagesHelper().sendMessage(of2);
                    return;
                }
                return;
        }
    }
}
