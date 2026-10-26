package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;
public final class rm implements Runnable {
    public final int f43184a;
    public final fn f43185b;
    public final MessageObject f43186c;

    public rm(fn fnVar, MessageObject messageObject, int i10) {
        this.f43184a = i10;
        this.f43185b = fnVar;
        this.f43186c = messageObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f43184a) {
            case 0:
                fn fnVar = this.f43185b;
                un unVar = fnVar.f39423a;
                unVar.X7();
                UndoView undoView = unVar.K3;
                if (undoView != null) {
                    if (unVar.Y.getVisibility() == 0 && unVar.R.getVisibility() != 0) {
                        i10 = 16;
                    } else {
                        i10 = 17;
                    }
                    int i11 = i10;
                    MessageObject messageObject = this.f43186c;
                    undoView.k(0L, i11, messageObject.getDiceEmoji(), null, null, new rm(fnVar, messageObject, 2));
                    return;
                }
                return;
            case 1:
                un unVar2 = this.f43185b.f39423a;
                unVar2.Sb = this.f43186c.getId();
                unVar2.Tb = 0;
                return;
            default:
                un unVar3 = this.f43185b.f39423a;
                if (unVar3.m7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.f43186c.getDiceEmoji(), unVar3.f44252f6, unVar3.f44501z5, unVar3.f44298j4, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = unVar3.L8();
                    unVar3.getSendMessagesHelper().sendMessage(of2);
                    return;
                }
                return;
        }
    }
}
