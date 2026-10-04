package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sh implements Runnable {
    public final int f40482a;
    public final yn f40483b;
    public final int f40484c;
    public final TLObject d;
    public final TLRPC.TL_error f40485e;
    public final int f40486f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f40487n;
    public final TLRPC.Chat f40488r;
    public final int f40489s;
    public final MessageObject v;

    public sh(yn ynVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f40482a = i13;
        this.f40483b = ynVar;
        this.f40484c = i10;
        this.d = tLObject;
        this.f40485e = tL_error;
        this.f40486f = i11;
        this.h = messageObject;
        this.f40487n = tL_messages_getDiscussionMessage;
        this.f40488r = chat;
        this.f40489s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f40482a) {
            case 0:
                yn ynVar = this.f40483b;
                ynVar.h8(new sh(ynVar, this.f40484c, this.d, this.f40485e, this.f40486f, this.h, this.f40487n, this.f40488r, this.f40489s, this.v, 1));
                return;
            default:
                yn ynVar2 = this.f40483b;
                if (this.f40484c == ynVar2.f43301cc) {
                    ynVar2.ec = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        ynVar2.f43388jc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.f40485e.text)) {
                        MessagesController.showCantOpenAlert(ynVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        ynVar2.f43339fc = 0;
                        ynVar2.gc = false;
                        ynVar2.f43526v0.h1();
                        return;
                    }
                    ynVar2.xa(ynVar2.f43376ic, ynVar2.f43388jc, this.f40486f, this.h, this.f40487n, this.f40488r, this.f40489s, this.v);
                    return;
                }
                return;
        }
    }
}
