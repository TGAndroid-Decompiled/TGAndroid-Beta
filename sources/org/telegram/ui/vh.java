package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vh implements Runnable {
    public final int f38424a;
    public final bo f38425b;
    public final int f38426c;
    public final TLObject d;
    public final TLRPC.TL_error e;
    public final int f38427f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f38428n;
    public final TLRPC.Chat f38429r;
    public final int f38430s;
    public final MessageObject v;

    public vh(bo boVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f38424a = i13;
        this.f38425b = boVar;
        this.f38426c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f38427f = i11;
        this.h = messageObject;
        this.f38428n = tL_messages_getDiscussionMessage;
        this.f38429r = chat;
        this.f38430s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f38424a) {
            case 0:
                bo boVar = this.f38425b;
                boVar.h8(new vh(boVar, this.f38426c, this.d, this.e, this.f38427f, this.h, this.f38428n, this.f38429r, this.f38430s, this.v, 1));
                return;
            default:
                bo boVar2 = this.f38425b;
                if (this.f38426c == boVar2.ec) {
                    boVar2.gc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        boVar2.f32366lc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                        MessagesController.showCantOpenAlert(boVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        boVar2.f32317hc = 0;
                        boVar2.f32330ic = false;
                        boVar2.f32506x0.g1();
                        return;
                    }
                    boVar2.ya(boVar2.f32355kc, boVar2.f32366lc, this.f38427f, this.h, this.f38428n, this.f38429r, this.f38430s, this.v);
                    return;
                }
                return;
        }
    }
}
