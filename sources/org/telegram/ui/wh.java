package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wh implements Runnable {
    public final int f43529a;
    public final eo f43530b;
    public final int f43531c;
    public final TLObject d;
    public final TLRPC.TL_error f43532e;
    public final int f43533f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f43534n;
    public final TLRPC.Chat f43535r;
    public final int f43536s;
    public final MessageObject v;

    public wh(eo eoVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f43529a = i13;
        this.f43530b = eoVar;
        this.f43531c = i10;
        this.d = tLObject;
        this.f43532e = tL_error;
        this.f43533f = i11;
        this.h = messageObject;
        this.f43534n = tL_messages_getDiscussionMessage;
        this.f43535r = chat;
        this.f43536s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f43529a) {
            case 0:
                eo eoVar = this.f43530b;
                eoVar.k8(new wh(eoVar, this.f43531c, this.d, this.f43532e, this.f43533f, this.h, this.f43534n, this.f43535r, this.f43536s, this.v, 1));
                return;
            default:
                eo eoVar2 = this.f43530b;
                if (this.f43531c == eoVar2.f37270fc) {
                    eoVar2.f37293hc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        eoVar2.f37354mc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.f43532e.text)) {
                        MessagesController.showCantOpenAlert(eoVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        eoVar2.f37306ic = 0;
                        eoVar2.f37318jc = false;
                        eoVar2.f37483x0.f1();
                        return;
                    }
                    eoVar2.Ca(eoVar2.f37342lc, eoVar2.f37354mc, this.f43533f, this.h, this.f43534n, this.f43535r, this.f43536s, this.v);
                    return;
                }
                return;
        }
    }
}
