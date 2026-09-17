package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vh implements Runnable {
    public final int f38419a;
    public final bo f38420b;
    public final int f38421c;
    public final TLObject d;
    public final TLRPC.TL_error e;
    public final int f38422f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f38423n;
    public final TLRPC.Chat f38424r;
    public final int f38425s;
    public final MessageObject v;

    public vh(bo boVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f38419a = i13;
        this.f38420b = boVar;
        this.f38421c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f38422f = i11;
        this.h = messageObject;
        this.f38423n = tL_messages_getDiscussionMessage;
        this.f38424r = chat;
        this.f38425s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f38419a) {
            case 0:
                bo boVar = this.f38420b;
                boVar.h8(new vh(boVar, this.f38421c, this.d, this.e, this.f38422f, this.h, this.f38423n, this.f38424r, this.f38425s, this.v, 1));
                return;
            default:
                bo boVar2 = this.f38420b;
                if (this.f38421c == boVar2.f32289fc) {
                    boVar2.f32313hc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        boVar2.f32374mc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                        MessagesController.showCantOpenAlert(boVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        boVar2.f32326ic = 0;
                        boVar2.f32338jc = false;
                        boVar2.f32502x0.g1();
                        return;
                    }
                    boVar2.ya(boVar2.f32362lc, boVar2.f32374mc, this.f38422f, this.h, this.f38423n, this.f38424r, this.f38425s, this.v);
                    return;
                }
                return;
        }
    }
}
