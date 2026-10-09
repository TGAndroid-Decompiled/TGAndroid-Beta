package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class xa0 implements Runnable {
    public final int f43892a;
    public final ya0 f43893b;
    public final AccountInstance f43894c;
    public final long d;
    public final org.telegram.ui.ActionBar.n2 f43895e;

    public xa0(ya0 ya0Var, AccountInstance accountInstance, long j3, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f43892a = i10;
        this.f43893b = ya0Var;
        this.f43894c = accountInstance;
        this.d = j3;
        this.f43895e = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f43892a) {
            case 0:
                AndroidUtilities.runOnUIThread(new xa0(this.f43893b, this.f43894c, this.d, this.f43895e, 1));
                return;
            default:
                AccountInstance accountInstance = this.f43894c;
                MessagesController messagesController = accountInstance.getMessagesController();
                long j3 = this.d;
                long j10 = -j3;
                boolean z10 = false;
                ChatObject.Call groupCall = messagesController.getGroupCall(j10, false);
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j10));
                accountInstance.getMessagesController().getInputPeer(j3);
                org.telegram.ui.Components.voip.f2.l(chat, null, false, Boolean.valueOf((groupCall == null || !groupCall.call.rtmp_stream) ? true : true), this.f43893b.f44304g, this.f43895e, accountInstance);
                return;
        }
    }
}
