package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;
public final class vm implements Runnable {
    public final int f41771a;
    public final kn f41772b;
    public final MessageObject f41773c;

    public vm(kn knVar, MessageObject messageObject, int i10) {
        this.f41771a = i10;
        this.f41772b = knVar;
        this.f41773c = messageObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f41771a) {
            case 0:
                kn knVar = this.f41772b;
                yn ynVar = knVar.f38003a;
                ynVar.Q7();
                UndoView undoView = ynVar.f43542w3;
                if (undoView != null) {
                    if (ynVar.W.getVisibility() == 0 && ynVar.P.getVisibility() != 0) {
                        i10 = 16;
                    } else {
                        i10 = 17;
                    }
                    MessageObject messageObject = this.f41773c;
                    undoView.k(0L, i10, messageObject.getDiceEmoji(), null, null, new vm(knVar, messageObject, 2));
                    return;
                }
                return;
            case 1:
                yn ynVar2 = this.f41772b.f38003a;
                ynVar2.f43511tb = this.f41773c.getId();
                ynVar2.f43524ub = 0;
                return;
            default:
                yn ynVar3 = this.f41772b.f38003a;
                if (ynVar3.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.f41773c.getDiceEmoji(), ynVar3.R5, ynVar3.f43405l5, ynVar3.V3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = ynVar3.D8();
                    ynVar3.getSendMessagesHelper().sendMessage(of2);
                    return;
                }
                return;
        }
    }
}
