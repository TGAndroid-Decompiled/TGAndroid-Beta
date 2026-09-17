package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uh implements Runnable {
    public final int f41119a;
    public final co f41120b;
    public final int f41121c;
    public final TLObject d;
    public final TLRPC.TL_error f41122e;
    public final int f41123f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f41124n;
    public final TLRPC.Chat f41125r;
    public final int f41126s;
    public final MessageObject v;

    public uh(co coVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f41119a = i13;
        this.f41120b = coVar;
        this.f41121c = i10;
        this.d = tLObject;
        this.f41122e = tL_error;
        this.f41123f = i11;
        this.h = messageObject;
        this.f41124n = tL_messages_getDiscussionMessage;
        this.f41125r = chat;
        this.f41126s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f41119a) {
            case 0:
                co coVar = this.f41120b;
                coVar.h8(new uh(coVar, this.f41121c, this.d, this.f41122e, this.f41123f, this.h, this.f41124n, this.f41125r, this.f41126s, this.v, 1));
                return;
            default:
                co coVar2 = this.f41120b;
                if (this.f41121c == coVar2.f35289fc) {
                    coVar2.f35312hc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        coVar2.f35373mc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.f41122e.text)) {
                        MessagesController.showCantOpenAlert(coVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        coVar2.f35325ic = 0;
                        coVar2.f35337jc = false;
                        coVar2.f35501x0.e1();
                        return;
                    }
                    coVar2.ya(coVar2.f35361lc, coVar2.f35373mc, this.f41123f, this.h, this.f41124n, this.f41125r, this.f41126s, this.v);
                    return;
                }
                return;
        }
    }
}
