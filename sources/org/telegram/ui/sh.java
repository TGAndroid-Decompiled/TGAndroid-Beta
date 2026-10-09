package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sh implements Runnable {
    public final int f41693a;
    public final zn f41694b;
    public final int f41695c;
    public final TLObject d;
    public final TLRPC.TL_error f41696e;
    public final int f41697f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f41698n;
    public final TLRPC.Chat f41699r;
    public final int f41700s;
    public final MessageObject v;

    public sh(zn znVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f41693a = i13;
        this.f41694b = znVar;
        this.f41695c = i10;
        this.d = tLObject;
        this.f41696e = tL_error;
        this.f41697f = i11;
        this.h = messageObject;
        this.f41698n = tL_messages_getDiscussionMessage;
        this.f41699r = chat;
        this.f41700s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f41693a) {
            case 0:
                zn znVar = this.f41694b;
                znVar.k8(new sh(znVar, this.f41695c, this.d, this.f41696e, this.f41697f, this.h, this.f41698n, this.f41699r, this.f41700s, this.v, 1));
                return;
            default:
                zn znVar2 = this.f41694b;
                if (this.f41695c == znVar2.f44775fc) {
                    znVar2.f44798hc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        znVar2.f44859mc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.f41696e.text)) {
                        MessagesController.showCantOpenAlert(znVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        znVar2.f44811ic = 0;
                        znVar2.f44823jc = false;
                        znVar2.f44988x0.f1();
                        return;
                    }
                    znVar2.Ca(znVar2.f44847lc, znVar2.f44859mc, this.f41697f, this.h, this.f41698n, this.f41699r, this.f41700s, this.v);
                    return;
                }
                return;
        }
    }
}
