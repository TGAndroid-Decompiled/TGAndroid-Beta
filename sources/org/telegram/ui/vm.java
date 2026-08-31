package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;
public final class vm implements Runnable {
    public final int f42255a;
    public final jn f42256b;
    public final MessageObject f42257c;

    public vm(jn jnVar, MessageObject messageObject, int i10) {
        this.f42255a = i10;
        this.f42256b = jnVar;
        this.f42257c = messageObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f42255a) {
            case 0:
                jn jnVar = this.f42256b;
                xn xnVar = jnVar.f38188a;
                xnVar.Q7();
                UndoView undoView = xnVar.f43378v3;
                if (undoView != null) {
                    if (xnVar.V.getVisibility() == 0 && xnVar.O.getVisibility() != 0) {
                        i10 = 16;
                    } else {
                        i10 = 17;
                    }
                    MessageObject messageObject = this.f42257c;
                    undoView.k(0L, i10, messageObject.getDiceEmoji(), null, null, new vm(jnVar, messageObject, 2));
                    return;
                }
                return;
            case 1:
                xn xnVar2 = this.f42256b.f38188a;
                xnVar2.f43360tb = this.f42257c.getId();
                xnVar2.f43373ub = 0;
                return;
            default:
                xn xnVar3 = this.f42256b.f38188a;
                if (xnVar3.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.f42257c.getDiceEmoji(), xnVar3.Q5, xnVar3.f43245k5, xnVar3.U3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = xnVar3.C8();
                    xnVar3.getSendMessagesHelper().sendMessage(of2);
                    return;
                }
                return;
        }
    }
}
