package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class th implements Runnable {
    public final int f37757a;
    public final zn f37758b;
    public final int f37759c;
    public final TLObject d;
    public final TLRPC.TL_error e;
    public final int f37760f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f37761n;
    public final TLRPC.Chat f37762r;
    public final int f37763s;
    public final MessageObject v;

    public th(zn znVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f37757a = i13;
        this.f37758b = znVar;
        this.f37759c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f37760f = i11;
        this.h = messageObject;
        this.f37761n = tL_messages_getDiscussionMessage;
        this.f37762r = chat;
        this.f37763s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f37757a) {
            case 0:
                zn znVar = this.f37758b;
                znVar.h8(new th(znVar, this.f37759c, this.d, this.e, this.f37760f, this.h, this.f37761n, this.f37762r, this.f37763s, this.v, 1));
                return;
            default:
                zn znVar2 = this.f37758b;
                if (this.f37759c == znVar2.ec) {
                    znVar2.gc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        znVar2.f40390lc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                        MessagesController.showCantOpenAlert(znVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        znVar2.f40341hc = 0;
                        znVar2.f40354ic = false;
                        znVar2.f40530x0.g1();
                        return;
                    }
                    znVar2.ya(znVar2.f40379kc, znVar2.f40390lc, this.f37760f, this.h, this.f37761n, this.f37762r, this.f37763s, this.v);
                    return;
                }
                return;
        }
    }
}
