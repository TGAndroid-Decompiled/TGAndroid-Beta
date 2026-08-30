package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;
public final class vm implements Runnable {
    public final int f39210a;
    public final jn f39211b;
    public final MessageObject f39212c;

    public vm(jn jnVar, MessageObject messageObject, int i10) {
        this.f39210a = i10;
        this.f39211b = jnVar;
        this.f39212c = messageObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f39210a) {
            case 0:
                jn jnVar = this.f39211b;
                xn xnVar = jnVar.f35381a;
                xnVar.Q7();
                UndoView undoView = xnVar.f40209v3;
                if (undoView != null) {
                    if (xnVar.V.getVisibility() == 0 && xnVar.O.getVisibility() != 0) {
                        i10 = 16;
                    } else {
                        i10 = 17;
                    }
                    MessageObject messageObject = this.f39212c;
                    undoView.k(0L, i10, messageObject.getDiceEmoji(), null, null, new vm(jnVar, messageObject, 2));
                    return;
                }
                return;
            case 1:
                xn xnVar2 = this.f39211b.f35381a;
                xnVar2.f40191tb = this.f39212c.getId();
                xnVar2.f40204ub = 0;
                return;
            default:
                xn xnVar3 = this.f39211b.f35381a;
                if (xnVar3.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.f39212c.getDiceEmoji(), xnVar3.Q5, xnVar3.f40076k5, xnVar3.U3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = xnVar3.C8();
                    xnVar3.getSendMessagesHelper().sendMessage(of2);
                    return;
                }
                return;
        }
    }
}
