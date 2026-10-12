package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ya0 implements Runnable {
    public final int f44383a;
    public final za0 f44384b;
    public final AccountInstance f44385c;
    public final long d;
    public final org.telegram.ui.ActionBar.m2 f44386e;

    public ya0(za0 za0Var, AccountInstance accountInstance, long j3, org.telegram.ui.ActionBar.m2 m2Var, int i10) {
        this.f44383a = i10;
        this.f44384b = za0Var;
        this.f44385c = accountInstance;
        this.d = j3;
        this.f44386e = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f44383a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ya0(this.f44384b, this.f44385c, this.d, this.f44386e, 1));
                return;
            default:
                AccountInstance accountInstance = this.f44385c;
                MessagesController messagesController = accountInstance.getMessagesController();
                long j3 = this.d;
                long j10 = -j3;
                boolean z10 = false;
                ChatObject.Call groupCall = messagesController.getGroupCall(j10, false);
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j10));
                accountInstance.getMessagesController().getInputPeer(j3);
                org.telegram.ui.Components.voip.g2.l(chat, null, false, Boolean.valueOf((groupCall == null || !groupCall.call.rtmp_stream) ? true : true), this.f44384b.f44691g, this.f44386e, accountInstance);
                return;
        }
    }
}
