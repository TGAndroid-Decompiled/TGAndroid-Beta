package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sh implements Runnable {
    public final int f41695a;
    public final zn f41696b;
    public final int f41697c;
    public final TLObject d;
    public final TLRPC.TL_error f41698e;
    public final int f41699f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f41700n;
    public final TLRPC.Chat f41701r;
    public final int f41702s;
    public final MessageObject v;

    public sh(zn znVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f41695a = i13;
        this.f41696b = znVar;
        this.f41697c = i10;
        this.d = tLObject;
        this.f41698e = tL_error;
        this.f41699f = i11;
        this.h = messageObject;
        this.f41700n = tL_messages_getDiscussionMessage;
        this.f41701r = chat;
        this.f41702s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f41695a) {
            case 0:
                zn znVar = this.f41696b;
                znVar.k8(new sh(znVar, this.f41697c, this.d, this.f41698e, this.f41699f, this.h, this.f41700n, this.f41701r, this.f41702s, this.v, 1));
                return;
            default:
                zn znVar2 = this.f41696b;
                if (this.f41697c == znVar2.f44777fc) {
                    znVar2.f44800hc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        znVar2.f44861mc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.f41698e.text)) {
                        MessagesController.showCantOpenAlert(znVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        znVar2.f44813ic = 0;
                        znVar2.f44825jc = false;
                        znVar2.f44990x0.f1();
                        return;
                    }
                    znVar2.Ca(znVar2.f44849lc, znVar2.f44861mc, this.f41699f, this.h, this.f41700n, this.f41701r, this.f41702s, this.v);
                    return;
                }
                return;
        }
    }
}
