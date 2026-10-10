package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sh implements Runnable {
    public final int f41739a;
    public final zn f41740b;
    public final int f41741c;
    public final TLObject d;
    public final TLRPC.TL_error f41742e;
    public final int f41743f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f41744n;
    public final TLRPC.Chat f41745r;
    public final int f41746s;
    public final MessageObject v;

    public sh(zn znVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f41739a = i13;
        this.f41740b = znVar;
        this.f41741c = i10;
        this.d = tLObject;
        this.f41742e = tL_error;
        this.f41743f = i11;
        this.h = messageObject;
        this.f41744n = tL_messages_getDiscussionMessage;
        this.f41745r = chat;
        this.f41746s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f41739a) {
            case 0:
                zn znVar = this.f41740b;
                znVar.k8(new sh(znVar, this.f41741c, this.d, this.f41742e, this.f41743f, this.h, this.f41744n, this.f41745r, this.f41746s, this.v, 1));
                return;
            default:
                zn znVar2 = this.f41740b;
                if (this.f41741c == znVar2.f44821fc) {
                    znVar2.f44844hc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        znVar2.f44905mc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.f41742e.text)) {
                        MessagesController.showCantOpenAlert(znVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        znVar2.f44857ic = 0;
                        znVar2.f44869jc = false;
                        znVar2.f45034x0.f1();
                        return;
                    }
                    znVar2.Ca(znVar2.f44893lc, znVar2.f44905mc, this.f41743f, this.h, this.f41744n, this.f41745r, this.f41746s, this.v);
                    return;
                }
                return;
        }
    }
}
