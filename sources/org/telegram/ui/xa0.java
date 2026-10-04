package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class xa0 implements Runnable {
    public final int f42820a;
    public final ya0 f42821b;
    public final AccountInstance f42822c;
    public final long d;
    public final org.telegram.ui.ActionBar.n2 f42823e;

    public xa0(ya0 ya0Var, AccountInstance accountInstance, long j3, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f42820a = i10;
        this.f42821b = ya0Var;
        this.f42822c = accountInstance;
        this.d = j3;
        this.f42823e = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f42820a) {
            case 0:
                AndroidUtilities.runOnUIThread(new xa0(this.f42821b, this.f42822c, this.d, this.f42823e, 1));
                return;
            default:
                AccountInstance accountInstance = this.f42822c;
                MessagesController messagesController = accountInstance.getMessagesController();
                long j3 = this.d;
                long j10 = -j3;
                boolean z10 = false;
                ChatObject.Call groupCall = messagesController.getGroupCall(j10, false);
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j10));
                accountInstance.getMessagesController().getInputPeer(j3);
                org.telegram.ui.Components.voip.g2.l(chat, null, false, Boolean.valueOf((groupCall == null || !groupCall.call.rtmp_stream) ? true : true), this.f42821b.f43117g, this.f42823e, accountInstance);
                return;
        }
    }
}
