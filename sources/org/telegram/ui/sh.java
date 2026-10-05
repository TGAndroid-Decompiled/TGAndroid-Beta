package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sh implements Runnable {
    public final int f40496a;
    public final yn f40497b;
    public final int f40498c;
    public final TLObject d;
    public final TLRPC.TL_error f40499e;
    public final int f40500f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f40501n;
    public final TLRPC.Chat f40502r;
    public final int f40503s;
    public final MessageObject v;

    public sh(yn ynVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f40496a = i13;
        this.f40497b = ynVar;
        this.f40498c = i10;
        this.d = tLObject;
        this.f40499e = tL_error;
        this.f40500f = i11;
        this.h = messageObject;
        this.f40501n = tL_messages_getDiscussionMessage;
        this.f40502r = chat;
        this.f40503s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f40496a) {
            case 0:
                yn ynVar = this.f40497b;
                ynVar.h8(new sh(ynVar, this.f40498c, this.d, this.f40499e, this.f40500f, this.h, this.f40501n, this.f40502r, this.f40503s, this.v, 1));
                return;
            default:
                yn ynVar2 = this.f40497b;
                if (this.f40498c == ynVar2.f43301cc) {
                    ynVar2.ec = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        ynVar2.f43388jc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.f40499e.text)) {
                        MessagesController.showCantOpenAlert(ynVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        ynVar2.f43339fc = 0;
                        ynVar2.gc = false;
                        ynVar2.f43526v0.g1();
                        return;
                    }
                    ynVar2.xa(ynVar2.f43376ic, ynVar2.f43388jc, this.f40500f, this.h, this.f40501n, this.f40502r, this.f40503s, this.v);
                    return;
                }
                return;
        }
    }
}
