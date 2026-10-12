package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ya0 implements Runnable {
    public final int f44378a;
    public final za0 f44379b;
    public final AccountInstance f44380c;
    public final long d;
    public final org.telegram.ui.ActionBar.m2 f44381e;

    public ya0(za0 za0Var, AccountInstance accountInstance, long j3, org.telegram.ui.ActionBar.m2 m2Var, int i10) {
        this.f44378a = i10;
        this.f44379b = za0Var;
        this.f44380c = accountInstance;
        this.d = j3;
        this.f44381e = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f44378a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ya0(this.f44379b, this.f44380c, this.d, this.f44381e, 1));
                return;
            default:
                AccountInstance accountInstance = this.f44380c;
                MessagesController messagesController = accountInstance.getMessagesController();
                long j3 = this.d;
                long j10 = -j3;
                boolean z10 = false;
                ChatObject.Call groupCall = messagesController.getGroupCall(j10, false);
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j10));
                accountInstance.getMessagesController().getInputPeer(j3);
                org.telegram.ui.Components.voip.g2.l(chat, null, false, Boolean.valueOf((groupCall == null || !groupCall.call.rtmp_stream) ? true : true), this.f44379b.f44686g, this.f44381e, accountInstance);
                return;
        }
    }
}
