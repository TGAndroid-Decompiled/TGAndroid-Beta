package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class za0 implements Runnable {
    public final int f43380a;
    public final ab0 f43381b;
    public final AccountInstance f43382c;
    public final long d;
    public final org.telegram.ui.ActionBar.n2 f43383e;

    public za0(ab0 ab0Var, AccountInstance accountInstance, long j3, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f43380a = i10;
        this.f43381b = ab0Var;
        this.f43382c = accountInstance;
        this.d = j3;
        this.f43383e = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f43380a) {
            case 0:
                AndroidUtilities.runOnUIThread(new za0(this.f43381b, this.f43382c, this.d, this.f43383e, 1));
                return;
            default:
                AccountInstance accountInstance = this.f43382c;
                MessagesController messagesController = accountInstance.getMessagesController();
                long j3 = this.d;
                long j10 = -j3;
                boolean z10 = false;
                ChatObject.Call groupCall = messagesController.getGroupCall(j10, false);
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j10));
                accountInstance.getMessagesController().getInputPeer(j3);
                org.telegram.ui.Components.voip.d2.l(chat, null, false, Boolean.valueOf((groupCall == null || !groupCall.call.rtmp_stream) ? true : true), this.f43381b.f34402g, this.f43383e, accountInstance);
                return;
        }
    }
}
