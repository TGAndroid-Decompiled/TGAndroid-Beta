package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class th implements Runnable {
    public final int f37670a;
    public final bo f37671b;
    public final int f37672c;
    public final TLObject d;
    public final TLRPC.TL_error e;
    public final int f37673f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f37674n;
    public final TLRPC.Chat f37675r;
    public final int f37676s;
    public final MessageObject v;

    public th(bo boVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f37670a = i13;
        this.f37671b = boVar;
        this.f37672c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f37673f = i11;
        this.h = messageObject;
        this.f37674n = tL_messages_getDiscussionMessage;
        this.f37675r = chat;
        this.f37676s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f37670a) {
            case 0:
                bo boVar = this.f37671b;
                boVar.h8(new th(boVar, this.f37672c, this.d, this.e, this.f37673f, this.h, this.f37674n, this.f37675r, this.f37676s, this.v, 1));
                return;
            default:
                bo boVar2 = this.f37671b;
                if (this.f37672c == boVar2.ec) {
                    boVar2.gc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        boVar2.f32379lc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                        MessagesController.showCantOpenAlert(boVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        boVar2.f32330hc = 0;
                        boVar2.f32343ic = false;
                        boVar2.f32519x0.f1();
                        return;
                    }
                    boVar2.ya(boVar2.f32368kc, boVar2.f32379lc, this.f37673f, this.h, this.f37674n, this.f37675r, this.f37676s, this.v);
                    return;
                }
                return;
        }
    }
}
