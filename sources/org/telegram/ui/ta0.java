package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ta0 implements Runnable {
    public final int f38015a;
    public final ua0 f38016b;
    public final AccountInstance f38017c;
    public final long d;
    public final org.telegram.ui.ActionBar.m2 e;

    public ta0(ua0 ua0Var, AccountInstance accountInstance, long j3, org.telegram.ui.ActionBar.m2 m2Var, int i10) {
        this.f38015a = i10;
        this.f38016b = ua0Var;
        this.f38017c = accountInstance;
        this.d = j3;
        this.e = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f38015a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ta0(this.f38016b, this.f38017c, this.d, this.e, 1));
                return;
            default:
                AccountInstance accountInstance = this.f38017c;
                MessagesController messagesController = accountInstance.getMessagesController();
                long j3 = this.d;
                long j10 = -j3;
                boolean z10 = false;
                ChatObject.Call groupCall = messagesController.getGroupCall(j10, false);
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j10));
                accountInstance.getMessagesController().getInputPeer(j3);
                org.telegram.ui.Components.voip.g2.l(chat, null, false, Boolean.valueOf((groupCall == null || !groupCall.call.rtmp_stream) ? true : true), this.f38016b.f38365g, this.e, accountInstance);
                return;
        }
    }
}
