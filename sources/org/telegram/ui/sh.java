package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sh implements Runnable {
    public final int f40487a;
    public final yn f40488b;
    public final int f40489c;
    public final TLObject d;
    public final TLRPC.TL_error f40490e;
    public final int f40491f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f40492n;
    public final TLRPC.Chat f40493r;
    public final int f40494s;
    public final MessageObject v;

    public sh(yn ynVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f40487a = i13;
        this.f40488b = ynVar;
        this.f40489c = i10;
        this.d = tLObject;
        this.f40490e = tL_error;
        this.f40491f = i11;
        this.h = messageObject;
        this.f40492n = tL_messages_getDiscussionMessage;
        this.f40493r = chat;
        this.f40494s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f40487a) {
            case 0:
                yn ynVar = this.f40488b;
                ynVar.h8(new sh(ynVar, this.f40489c, this.d, this.f40490e, this.f40491f, this.h, this.f40492n, this.f40493r, this.f40494s, this.v, 1));
                return;
            default:
                yn ynVar2 = this.f40488b;
                if (this.f40489c == ynVar2.f43308cc) {
                    ynVar2.ec = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        ynVar2.f43395jc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.f40490e.text)) {
                        MessagesController.showCantOpenAlert(ynVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        ynVar2.f43346fc = 0;
                        ynVar2.gc = false;
                        ynVar2.f43533v0.h1();
                        return;
                    }
                    ynVar2.xa(ynVar2.f43383ic, ynVar2.f43395jc, this.f40491f, this.h, this.f40492n, this.f40493r, this.f40494s, this.v);
                    return;
                }
                return;
        }
    }
}
