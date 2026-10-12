package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wh implements Runnable {
    public final int f43524a;
    public final eo f43525b;
    public final int f43526c;
    public final TLObject d;
    public final TLRPC.TL_error f43527e;
    public final int f43528f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f43529n;
    public final TLRPC.Chat f43530r;
    public final int f43531s;
    public final MessageObject v;

    public wh(eo eoVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f43524a = i13;
        this.f43525b = eoVar;
        this.f43526c = i10;
        this.d = tLObject;
        this.f43527e = tL_error;
        this.f43528f = i11;
        this.h = messageObject;
        this.f43529n = tL_messages_getDiscussionMessage;
        this.f43530r = chat;
        this.f43531s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f43524a) {
            case 0:
                eo eoVar = this.f43525b;
                eoVar.k8(new wh(eoVar, this.f43526c, this.d, this.f43527e, this.f43528f, this.h, this.f43529n, this.f43530r, this.f43531s, this.v, 1));
                return;
            default:
                eo eoVar2 = this.f43525b;
                if (this.f43526c == eoVar2.f37265fc) {
                    eoVar2.f37288hc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        eoVar2.f37349mc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.f43527e.text)) {
                        MessagesController.showCantOpenAlert(eoVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        eoVar2.f37301ic = 0;
                        eoVar2.f37313jc = false;
                        eoVar2.f37478x0.f1();
                        return;
                    }
                    eoVar2.Ca(eoVar2.f37337lc, eoVar2.f37349mc, this.f43528f, this.h, this.f43529n, this.f43530r, this.f43531s, this.v);
                    return;
                }
                return;
        }
    }
}
