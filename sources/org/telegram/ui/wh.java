package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wh implements Runnable {
    public final int f41597a;
    public final fo f41598b;
    public final int f41599c;
    public final TLObject d;
    public final TLRPC.TL_error e;
    public final int f41600f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f41601n;
    public final TLRPC.Chat f41602r;
    public final int f41603s;
    public final MessageObject v;

    public wh(fo foVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f41597a = i13;
        this.f41598b = foVar;
        this.f41599c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f41600f = i11;
        this.h = messageObject;
        this.f41601n = tL_messages_getDiscussionMessage;
        this.f41602r = chat;
        this.f41603s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f41597a) {
            case 0:
                fo foVar = this.f41598b;
                foVar.k8(new wh(foVar, this.f41599c, this.d, this.e, this.f41600f, this.h, this.f41601n, this.f41602r, this.f41603s, this.v, 1));
                return;
            default:
                fo foVar2 = this.f41598b;
                if (this.f41599c == foVar2.fc) {
                    foVar2.hc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        foVar2.f36031mc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                        MessagesController.showCantOpenAlert(foVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        foVar2.f35982ic = 0;
                        foVar2.f35995jc = false;
                        foVar2.f36160x0.f1();
                        return;
                    }
                    foVar2.Ca(foVar2.f36019lc, foVar2.f36031mc, this.f41600f, this.h, this.f41601n, this.f41602r, this.f41603s, this.v);
                    return;
                }
                return;
        }
    }
}
