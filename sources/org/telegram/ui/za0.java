package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class za0 implements Runnable {
    public final int f43353a;
    public final ab0 f43354b;
    public final AccountInstance f43355c;
    public final long d;
    public final org.telegram.ui.ActionBar.n2 f43356e;

    public za0(ab0 ab0Var, AccountInstance accountInstance, long j3, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f43353a = i10;
        this.f43354b = ab0Var;
        this.f43355c = accountInstance;
        this.d = j3;
        this.f43356e = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f43353a) {
            case 0:
                AndroidUtilities.runOnUIThread(new za0(this.f43354b, this.f43355c, this.d, this.f43356e, 1));
                return;
            default:
                AccountInstance accountInstance = this.f43355c;
                MessagesController messagesController = accountInstance.getMessagesController();
                long j3 = this.d;
                long j10 = -j3;
                boolean z10 = false;
                ChatObject.Call groupCall = messagesController.getGroupCall(j10, false);
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j10));
                accountInstance.getMessagesController().getInputPeer(j3);
                org.telegram.ui.Components.voip.d2.l(chat, null, false, Boolean.valueOf((groupCall == null || !groupCall.call.rtmp_stream) ? true : true), this.f43354b.f34375g, this.f43356e, accountInstance);
                return;
        }
    }
}
