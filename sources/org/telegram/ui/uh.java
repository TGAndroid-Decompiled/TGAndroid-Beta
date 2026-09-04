package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uh implements Runnable {
    public final int f41091a;
    public final co f41092b;
    public final int f41093c;
    public final TLObject d;
    public final TLRPC.TL_error f41094e;
    public final int f41095f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f41096n;
    public final TLRPC.Chat f41097r;
    public final int f41098s;
    public final MessageObject v;

    public uh(co coVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f41091a = i13;
        this.f41092b = coVar;
        this.f41093c = i10;
        this.d = tLObject;
        this.f41094e = tL_error;
        this.f41095f = i11;
        this.h = messageObject;
        this.f41096n = tL_messages_getDiscussionMessage;
        this.f41097r = chat;
        this.f41098s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f41091a) {
            case 0:
                co coVar = this.f41092b;
                coVar.h8(new uh(coVar, this.f41093c, this.d, this.f41094e, this.f41095f, this.h, this.f41096n, this.f41097r, this.f41098s, this.v, 1));
                return;
            default:
                co coVar2 = this.f41092b;
                if (this.f41093c == coVar2.f35261fc) {
                    coVar2.f35284hc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        coVar2.f35345mc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.f41094e.text)) {
                        MessagesController.showCantOpenAlert(coVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        coVar2.f35297ic = 0;
                        coVar2.f35309jc = false;
                        coVar2.f35473x0.e1();
                        return;
                    }
                    coVar2.ya(coVar2.f35333lc, coVar2.f35345mc, this.f41095f, this.h, this.f41096n, this.f41097r, this.f41098s, this.v);
                    return;
                }
                return;
        }
    }
}
