package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wh implements Runnable {
    public final int f38189a;
    public final eo f38190b;
    public final int f38191c;
    public final TLObject d;
    public final TLRPC.TL_error e;
    public final int f38192f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f38193n;
    public final TLRPC.Chat f38194r;
    public final int f38195s;
    public final MessageObject v;

    public wh(eo eoVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f38189a = i13;
        this.f38190b = eoVar;
        this.f38191c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f38192f = i11;
        this.h = messageObject;
        this.f38193n = tL_messages_getDiscussionMessage;
        this.f38194r = chat;
        this.f38195s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f38189a) {
            case 0:
                eo eoVar = this.f38190b;
                eoVar.h8(new wh(eoVar, this.f38191c, this.d, this.e, this.f38192f, this.h, this.f38193n, this.f38194r, this.f38195s, this.v, 1));
                return;
            default:
                eo eoVar2 = this.f38190b;
                if (this.f38191c == eoVar2.f32330fc) {
                    eoVar2.f32353hc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        eoVar2.f32414mc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                        MessagesController.showCantOpenAlert(eoVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        eoVar2.f32366ic = 0;
                        eoVar2.f32378jc = false;
                        eoVar2.f32542x0.e1();
                        return;
                    }
                    eoVar2.ya(eoVar2.f32402lc, eoVar2.f32414mc, this.f38192f, this.h, this.f38193n, this.f38194r, this.f38195s, this.v);
                    return;
                }
                return;
        }
    }
}
