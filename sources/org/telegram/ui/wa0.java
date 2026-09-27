package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class wa0 implements Runnable {
    public final int f38865a;
    public final xa0 f38866b;
    public final AccountInstance f38867c;
    public final long d;
    public final org.telegram.ui.ActionBar.o2 e;

    public wa0(xa0 xa0Var, AccountInstance accountInstance, long j3, org.telegram.ui.ActionBar.o2 o2Var, int i10) {
        this.f38865a = i10;
        this.f38866b = xa0Var;
        this.f38867c = accountInstance;
        this.d = j3;
        this.e = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f38865a) {
            case 0:
                AndroidUtilities.runOnUIThread(new wa0(this.f38866b, this.f38867c, this.d, this.e, 1));
                return;
            default:
                AccountInstance accountInstance = this.f38867c;
                MessagesController messagesController = accountInstance.getMessagesController();
                long j3 = this.d;
                long j10 = -j3;
                boolean z10 = false;
                ChatObject.Call groupCall = messagesController.getGroupCall(j10, false);
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j10));
                accountInstance.getMessagesController().getInputPeer(j3);
                org.telegram.ui.Components.voip.g2.l(chat, null, false, Boolean.valueOf((groupCall == null || !groupCall.call.rtmp_stream) ? true : true), this.f38866b.f39594g, this.e, accountInstance);
                return;
        }
    }
}
