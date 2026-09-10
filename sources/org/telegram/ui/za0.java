package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class za0 implements Runnable {
    public final int f39245a;
    public final ab0 f39246b;
    public final AccountInstance f39247c;
    public final long d;
    public final org.telegram.ui.ActionBar.p2 e;

    public za0(ab0 ab0Var, AccountInstance accountInstance, long j3, org.telegram.ui.ActionBar.p2 p2Var, int i10) {
        this.f39245a = i10;
        this.f39246b = ab0Var;
        this.f39247c = accountInstance;
        this.d = j3;
        this.e = p2Var;
    }

    @Override
    public final void run() {
        switch (this.f39245a) {
            case 0:
                AndroidUtilities.runOnUIThread(new za0(this.f39246b, this.f39247c, this.d, this.e, 1));
                return;
            default:
                AccountInstance accountInstance = this.f39247c;
                MessagesController messagesController = accountInstance.getMessagesController();
                long j3 = this.d;
                long j10 = -j3;
                boolean z10 = false;
                ChatObject.Call groupCall = messagesController.getGroupCall(j10, false);
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j10));
                accountInstance.getMessagesController().getInputPeer(j3);
                org.telegram.ui.Components.voip.e2.l(chat, null, false, Boolean.valueOf((groupCall == null || !groupCall.call.rtmp_stream) ? true : true), this.f39246b.f30859g, this.e, accountInstance);
                return;
        }
    }
}
