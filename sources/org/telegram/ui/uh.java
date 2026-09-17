package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uh implements Runnable {
    public final int f41092a;
    public final co f41093b;
    public final int f41094c;
    public final TLObject d;
    public final TLRPC.TL_error f41095e;
    public final int f41096f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f41097n;
    public final TLRPC.Chat f41098r;
    public final int f41099s;
    public final MessageObject v;

    public uh(co coVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f41092a = i13;
        this.f41093b = coVar;
        this.f41094c = i10;
        this.d = tLObject;
        this.f41095e = tL_error;
        this.f41096f = i11;
        this.h = messageObject;
        this.f41097n = tL_messages_getDiscussionMessage;
        this.f41098r = chat;
        this.f41099s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f41092a) {
            case 0:
                co coVar = this.f41093b;
                coVar.h8(new uh(coVar, this.f41094c, this.d, this.f41095e, this.f41096f, this.h, this.f41097n, this.f41098r, this.f41099s, this.v, 1));
                return;
            default:
                co coVar2 = this.f41093b;
                if (this.f41094c == coVar2.f35262fc) {
                    coVar2.f35285hc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        coVar2.f35346mc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.f41095e.text)) {
                        MessagesController.showCantOpenAlert(coVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        coVar2.f35298ic = 0;
                        coVar2.f35310jc = false;
                        coVar2.f35474x0.e1();
                        return;
                    }
                    coVar2.ya(coVar2.f35334lc, coVar2.f35346mc, this.f41096f, this.h, this.f41097n, this.f41098r, this.f41099s, this.v);
                    return;
                }
                return;
        }
    }
}
