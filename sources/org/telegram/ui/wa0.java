package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class wa0 implements Runnable {
    public final int f43314a;
    public final xa0 f43315b;
    public final AccountInstance f43316c;
    public final long d;
    public final org.telegram.ui.ActionBar.m2 f43317e;

    public wa0(xa0 xa0Var, AccountInstance accountInstance, long j3, org.telegram.ui.ActionBar.m2 m2Var, int i10) {
        this.f43314a = i10;
        this.f43315b = xa0Var;
        this.f43316c = accountInstance;
        this.d = j3;
        this.f43317e = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f43314a) {
            case 0:
                AndroidUtilities.runOnUIThread(new wa0(this.f43315b, this.f43316c, this.d, this.f43317e, 1));
                return;
            default:
                AccountInstance accountInstance = this.f43316c;
                MessagesController messagesController = accountInstance.getMessagesController();
                long j3 = this.d;
                long j10 = -j3;
                boolean z10 = false;
                ChatObject.Call groupCall = messagesController.getGroupCall(j10, false);
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j10));
                accountInstance.getMessagesController().getInputPeer(j3);
                org.telegram.ui.Components.voip.g2.l(chat, null, false, Boolean.valueOf((groupCall == null || !groupCall.call.rtmp_stream) ? true : true), this.f43315b.f44064g, this.f43317e, accountInstance);
                return;
        }
    }
}
