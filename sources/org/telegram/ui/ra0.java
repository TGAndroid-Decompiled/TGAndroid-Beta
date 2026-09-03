package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ra0 implements Runnable {
    public final int f37785a;
    public final sa0 f37786b;
    public final AccountInstance f37787c;
    public final long d;
    public final org.telegram.ui.ActionBar.p2 e;

    public ra0(sa0 sa0Var, AccountInstance accountInstance, long j10, org.telegram.ui.ActionBar.p2 p2Var, int i10) {
        this.f37785a = i10;
        this.f37786b = sa0Var;
        this.f37787c = accountInstance;
        this.d = j10;
        this.e = p2Var;
    }

    @Override
    public final void run() {
        switch (this.f37785a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ra0(this.f37786b, this.f37787c, this.d, this.e, 1));
                return;
            default:
                AccountInstance accountInstance = this.f37787c;
                MessagesController messagesController = accountInstance.getMessagesController();
                long j10 = this.d;
                long j11 = -j10;
                boolean z4 = false;
                ChatObject.Call groupCall = messagesController.getGroupCall(j11, false);
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j11));
                accountInstance.getMessagesController().getInputPeer(j10);
                org.telegram.ui.Components.voip.f2.l(chat, null, false, Boolean.valueOf((groupCall == null || !groupCall.call.rtmp_stream) ? true : true), this.f37786b.f38142g, this.e, accountInstance);
                return;
        }
    }
}
