package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sh implements Runnable {
    public final int f37460a;
    public final xn f37461b;
    public final int f37462c;
    public final TLObject d;
    public final TLRPC.TL_error e;
    public final int f37463f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f37464n;
    public final TLRPC.Chat f37465r;
    public final int f37466s;
    public final MessageObject v;

    public sh(xn xnVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f37460a = i13;
        this.f37461b = xnVar;
        this.f37462c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f37463f = i11;
        this.h = messageObject;
        this.f37464n = tL_messages_getDiscussionMessage;
        this.f37465r = chat;
        this.f37466s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f37460a) {
            case 0:
                xn xnVar = this.f37461b;
                xnVar.h8(new sh(xnVar, this.f37462c, this.d, this.e, this.f37463f, this.h, this.f37464n, this.f37465r, this.f37466s, this.v, 1));
                return;
            default:
                xn xnVar2 = this.f37461b;
                if (this.f37462c == xnVar2.ec) {
                    xnVar2.gc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        xnVar2.f39837lc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                        MessagesController.showCantOpenAlert(xnVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        xnVar2.f39788hc = 0;
                        xnVar2.f39801ic = false;
                        xnVar2.f39977x0.g1();
                        return;
                    }
                    xnVar2.ya(xnVar2.f39826kc, xnVar2.f39837lc, this.f37463f, this.h, this.f37464n, this.f37465r, this.f37466s, this.v);
                    return;
                }
                return;
        }
    }
}
