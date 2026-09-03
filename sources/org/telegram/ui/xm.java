package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;
public final class xm implements Runnable {
    public final int f40020a;
    public final ln f40021b;
    public final MessageObject f40022c;

    public xm(ln lnVar, MessageObject messageObject, int i10) {
        this.f40020a = i10;
        this.f40021b = lnVar;
        this.f40022c = messageObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f40020a) {
            case 0:
                ln lnVar = this.f40021b;
                zn znVar = lnVar.f35808a;
                znVar.Q7();
                UndoView undoView = znVar.f40775v3;
                if (undoView != null) {
                    if (znVar.V.getVisibility() == 0 && znVar.O.getVisibility() != 0) {
                        i10 = 16;
                    } else {
                        i10 = 17;
                    }
                    MessageObject messageObject = this.f40022c;
                    undoView.k(0L, i10, messageObject.getDiceEmoji(), null, null, new xm(lnVar, messageObject, 2));
                    return;
                }
                return;
            case 1:
                zn znVar2 = this.f40021b.f35808a;
                znVar2.f40757tb = this.f40022c.getId();
                znVar2.f40770ub = 0;
                return;
            default:
                zn znVar3 = this.f40021b.f35808a;
                if (znVar3.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.f40022c.getDiceEmoji(), znVar3.Q5, znVar3.f40642k5, znVar3.U3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = znVar3.C8();
                    znVar3.getSendMessagesHelper().sendMessage(of2);
                    return;
                }
                return;
        }
    }
}
