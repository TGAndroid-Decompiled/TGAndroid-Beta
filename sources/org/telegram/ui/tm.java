package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;
public final class tm implements Runnable {
    public final int f43670a;
    public final hn f43671b;
    public final MessageObject f43672c;

    public tm(hn hnVar, MessageObject messageObject, int i10) {
        this.f43670a = i10;
        this.f43671b = hnVar;
        this.f43672c = messageObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f43670a) {
            case 0:
                hn hnVar = this.f43671b;
                wn wnVar = hnVar.f39938a;
                wnVar.Z7();
                UndoView undoView = wnVar.K3;
                if (undoView != null) {
                    if (wnVar.Y.getVisibility() == 0 && wnVar.R.getVisibility() != 0) {
                        i10 = 16;
                    } else {
                        i10 = 17;
                    }
                    int i11 = i10;
                    MessageObject messageObject = this.f43672c;
                    undoView.k(0L, i11, messageObject.getDiceEmoji(), null, null, new tm(hnVar, messageObject, 2));
                    return;
                }
                return;
            case 1:
                wn wnVar2 = this.f43671b.f39938a;
                wnVar2.Wb = this.f43672c.getId();
                wnVar2.Xb = 0;
                return;
            default:
                wn wnVar3 = this.f43671b.f39938a;
                if (wnVar3.o7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.f43672c.getDiceEmoji(), wnVar3.f45168j6, wnVar3.D5, wnVar3.f45166j4, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = wnVar3.O8();
                    wnVar3.getSendMessagesHelper().sendMessage(of2);
                    return;
                }
                return;
        }
    }
}
