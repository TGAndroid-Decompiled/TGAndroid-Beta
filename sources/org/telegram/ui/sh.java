package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sh implements Runnable {
    public final int f40481a;
    public final yn f40482b;
    public final int f40483c;
    public final TLObject d;
    public final TLRPC.TL_error f40484e;
    public final int f40485f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f40486n;
    public final TLRPC.Chat f40487r;
    public final int f40488s;
    public final MessageObject v;

    public sh(yn ynVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f40481a = i13;
        this.f40482b = ynVar;
        this.f40483c = i10;
        this.d = tLObject;
        this.f40484e = tL_error;
        this.f40485f = i11;
        this.h = messageObject;
        this.f40486n = tL_messages_getDiscussionMessage;
        this.f40487r = chat;
        this.f40488s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f40481a) {
            case 0:
                yn ynVar = this.f40482b;
                ynVar.h8(new sh(ynVar, this.f40483c, this.d, this.f40484e, this.f40485f, this.h, this.f40486n, this.f40487r, this.f40488s, this.v, 1));
                return;
            default:
                yn ynVar2 = this.f40482b;
                if (this.f40483c == ynVar2.f43300cc) {
                    ynVar2.ec = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        ynVar2.f43387jc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.f40484e.text)) {
                        MessagesController.showCantOpenAlert(ynVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        ynVar2.f43338fc = 0;
                        ynVar2.gc = false;
                        ynVar2.f43525v0.h1();
                        return;
                    }
                    ynVar2.xa(ynVar2.f43375ic, ynVar2.f43387jc, this.f40485f, this.h, this.f40486n, this.f40487r, this.f40488s, this.v);
                    return;
                }
                return;
        }
    }
}
