package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class th implements Runnable {
    public final int f37721a;
    public final zn f37722b;
    public final int f37723c;
    public final TLObject d;
    public final TLRPC.TL_error e;
    public final int f37724f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f37725n;
    public final TLRPC.Chat f37726r;
    public final int f37727s;
    public final MessageObject v;

    public th(zn znVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f37721a = i13;
        this.f37722b = znVar;
        this.f37723c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f37724f = i11;
        this.h = messageObject;
        this.f37725n = tL_messages_getDiscussionMessage;
        this.f37726r = chat;
        this.f37727s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f37721a) {
            case 0:
                zn znVar = this.f37722b;
                znVar.h8(new th(znVar, this.f37723c, this.d, this.e, this.f37724f, this.h, this.f37725n, this.f37726r, this.f37727s, this.v, 1));
                return;
            default:
                zn znVar2 = this.f37722b;
                if (this.f37723c == znVar2.ec) {
                    znVar2.gc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        znVar2.f40348lc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                        MessagesController.showCantOpenAlert(znVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        znVar2.f40299hc = 0;
                        znVar2.f40312ic = false;
                        znVar2.f40488x0.g1();
                        return;
                    }
                    znVar2.ya(znVar2.f40337kc, znVar2.f40348lc, this.f37724f, this.h, this.f37725n, this.f37726r, this.f37727s, this.v);
                    return;
                }
                return;
        }
    }
}
