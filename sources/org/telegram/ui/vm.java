package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;
public final class vm implements Runnable {
    public final int f41770a;
    public final kn f41771b;
    public final MessageObject f41772c;

    public vm(kn knVar, MessageObject messageObject, int i10) {
        this.f41770a = i10;
        this.f41771b = knVar;
        this.f41772c = messageObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f41770a) {
            case 0:
                kn knVar = this.f41771b;
                yn ynVar = knVar.f38002a;
                ynVar.Q7();
                UndoView undoView = ynVar.f43541w3;
                if (undoView != null) {
                    if (ynVar.W.getVisibility() == 0 && ynVar.P.getVisibility() != 0) {
                        i10 = 16;
                    } else {
                        i10 = 17;
                    }
                    MessageObject messageObject = this.f41772c;
                    undoView.k(0L, i10, messageObject.getDiceEmoji(), null, null, new vm(knVar, messageObject, 2));
                    return;
                }
                return;
            case 1:
                yn ynVar2 = this.f41771b.f38002a;
                ynVar2.f43510tb = this.f41772c.getId();
                ynVar2.f43523ub = 0;
                return;
            default:
                yn ynVar3 = this.f41771b.f38002a;
                if (ynVar3.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.f41772c.getDiceEmoji(), ynVar3.R5, ynVar3.f43404l5, ynVar3.V3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = ynVar3.D8();
                    ynVar3.getSendMessagesHelper().sendMessage(of2);
                    return;
                }
                return;
        }
    }
}
