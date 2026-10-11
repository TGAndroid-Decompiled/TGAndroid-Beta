package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sh implements Runnable {
    public final int f41738a;
    public final zn f41739b;
    public final int f41740c;
    public final TLObject d;
    public final TLRPC.TL_error f41741e;
    public final int f41742f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f41743n;
    public final TLRPC.Chat f41744r;
    public final int f41745s;
    public final MessageObject v;

    public sh(zn znVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f41738a = i13;
        this.f41739b = znVar;
        this.f41740c = i10;
        this.d = tLObject;
        this.f41741e = tL_error;
        this.f41742f = i11;
        this.h = messageObject;
        this.f41743n = tL_messages_getDiscussionMessage;
        this.f41744r = chat;
        this.f41745s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f41738a) {
            case 0:
                zn znVar = this.f41739b;
                znVar.k8(new sh(znVar, this.f41740c, this.d, this.f41741e, this.f41742f, this.h, this.f41743n, this.f41744r, this.f41745s, this.v, 1));
                return;
            default:
                zn znVar2 = this.f41739b;
                if (this.f41740c == znVar2.f44776fc) {
                    znVar2.f44799hc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        znVar2.f44860mc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.f41741e.text)) {
                        MessagesController.showCantOpenAlert(znVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        znVar2.f44812ic = 0;
                        znVar2.f44824jc = false;
                        znVar2.f44989x0.f1();
                        return;
                    }
                    znVar2.Ca(znVar2.f44848lc, znVar2.f44860mc, this.f41742f, this.h, this.f41743n, this.f41744r, this.f41745s, this.v);
                    return;
                }
                return;
        }
    }
}
