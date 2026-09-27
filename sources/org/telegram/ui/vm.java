package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;
public final class vm implements Runnable {
    public final int f38637a;
    public final jn f38638b;
    public final MessageObject f38639c;

    public vm(jn jnVar, MessageObject messageObject, int i10) {
        this.f38637a = i10;
        this.f38638b = jnVar;
        this.f38639c = messageObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f38637a) {
            case 0:
                jn jnVar = this.f38638b;
                xn xnVar = jnVar.f34766a;
                xnVar.Q7();
                UndoView undoView = xnVar.y3;
                if (undoView != null) {
                    if (xnVar.Y.getVisibility() == 0 && xnVar.R.getVisibility() != 0) {
                        i10 = 16;
                    } else {
                        i10 = 17;
                    }
                    MessageObject messageObject = this.f38639c;
                    undoView.k(0L, i10, messageObject.getDiceEmoji(), null, null, new vm(jnVar, messageObject, 2));
                    return;
                }
                return;
            case 1:
                xn xnVar2 = this.f38638b.f34766a;
                xnVar2.f39961vb = this.f38639c.getId();
                xnVar2.f39975wb = 0;
                return;
            default:
                xn xnVar3 = this.f38638b.f34766a;
                if (xnVar3.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.f38639c.getDiceEmoji(), xnVar3.T5, xnVar3.f39856n5, xnVar3.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = xnVar3.C8();
                    xnVar3.getSendMessagesHelper().sendMessage(of2);
                    return;
                }
                return;
        }
    }
}
