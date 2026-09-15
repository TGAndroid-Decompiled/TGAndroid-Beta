package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class th implements Runnable {
    public final int f37677a;
    public final bo f37678b;
    public final int f37679c;
    public final TLObject d;
    public final TLRPC.TL_error e;
    public final int f37680f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f37681n;
    public final TLRPC.Chat f37682r;
    public final int f37683s;
    public final MessageObject v;

    public th(bo boVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f37677a = i13;
        this.f37678b = boVar;
        this.f37679c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f37680f = i11;
        this.h = messageObject;
        this.f37681n = tL_messages_getDiscussionMessage;
        this.f37682r = chat;
        this.f37683s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f37677a) {
            case 0:
                bo boVar = this.f37678b;
                boVar.h8(new th(boVar, this.f37679c, this.d, this.e, this.f37680f, this.h, this.f37681n, this.f37682r, this.f37683s, this.v, 1));
                return;
            default:
                bo boVar2 = this.f37678b;
                if (this.f37679c == boVar2.f32311fc) {
                    boVar2.f32335hc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        boVar2.f32396mc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                        MessagesController.showCantOpenAlert(boVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        boVar2.f32348ic = 0;
                        boVar2.f32360jc = false;
                        boVar2.f32524x0.f1();
                        return;
                    }
                    boVar2.ya(boVar2.f32384lc, boVar2.f32396mc, this.f37680f, this.h, this.f37681n, this.f37682r, this.f37683s, this.v);
                    return;
                }
                return;
        }
    }
}
