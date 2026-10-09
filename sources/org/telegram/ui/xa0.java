package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class xa0 implements Runnable {
    public final int f43890a;
    public final ya0 f43891b;
    public final AccountInstance f43892c;
    public final long d;
    public final org.telegram.ui.ActionBar.n2 f43893e;

    public xa0(ya0 ya0Var, AccountInstance accountInstance, long j3, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f43890a = i10;
        this.f43891b = ya0Var;
        this.f43892c = accountInstance;
        this.d = j3;
        this.f43893e = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f43890a) {
            case 0:
                AndroidUtilities.runOnUIThread(new xa0(this.f43891b, this.f43892c, this.d, this.f43893e, 1));
                return;
            default:
                AccountInstance accountInstance = this.f43892c;
                MessagesController messagesController = accountInstance.getMessagesController();
                long j3 = this.d;
                long j10 = -j3;
                boolean z10 = false;
                ChatObject.Call groupCall = messagesController.getGroupCall(j10, false);
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j10));
                accountInstance.getMessagesController().getInputPeer(j3);
                org.telegram.ui.Components.voip.f2.l(chat, null, false, Boolean.valueOf((groupCall == null || !groupCall.call.rtmp_stream) ? true : true), this.f43891b.f44302g, this.f43893e, accountInstance);
                return;
        }
    }
}
