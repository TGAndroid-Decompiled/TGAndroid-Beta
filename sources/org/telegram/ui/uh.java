package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uh implements Runnable {
    public final int f41118a;
    public final co f41119b;
    public final int f41120c;
    public final TLObject d;
    public final TLRPC.TL_error f41121e;
    public final int f41122f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f41123n;
    public final TLRPC.Chat f41124r;
    public final int f41125s;
    public final MessageObject v;

    public uh(co coVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f41118a = i13;
        this.f41119b = coVar;
        this.f41120c = i10;
        this.d = tLObject;
        this.f41121e = tL_error;
        this.f41122f = i11;
        this.h = messageObject;
        this.f41123n = tL_messages_getDiscussionMessage;
        this.f41124r = chat;
        this.f41125s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f41118a) {
            case 0:
                co coVar = this.f41119b;
                coVar.h8(new uh(coVar, this.f41120c, this.d, this.f41121e, this.f41122f, this.h, this.f41123n, this.f41124r, this.f41125s, this.v, 1));
                return;
            default:
                co coVar2 = this.f41119b;
                if (this.f41120c == coVar2.f35288fc) {
                    coVar2.f35311hc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        coVar2.f35372mc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.f41121e.text)) {
                        MessagesController.showCantOpenAlert(coVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        coVar2.f35324ic = 0;
                        coVar2.f35336jc = false;
                        coVar2.f35500x0.e1();
                        return;
                    }
                    coVar2.ya(coVar2.f35360lc, coVar2.f35372mc, this.f41122f, this.h, this.f41123n, this.f41124r, this.f41125s, this.v);
                    return;
                }
                return;
        }
    }
}
