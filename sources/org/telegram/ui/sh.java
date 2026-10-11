package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sh implements Runnable {
    public final int f41772a;
    public final zn f41773b;
    public final int f41774c;
    public final TLObject d;
    public final TLRPC.TL_error f41775e;
    public final int f41776f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f41777n;
    public final TLRPC.Chat f41778r;
    public final int f41779s;
    public final MessageObject v;

    public sh(zn znVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f41772a = i13;
        this.f41773b = znVar;
        this.f41774c = i10;
        this.d = tLObject;
        this.f41775e = tL_error;
        this.f41776f = i11;
        this.h = messageObject;
        this.f41777n = tL_messages_getDiscussionMessage;
        this.f41778r = chat;
        this.f41779s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f41772a) {
            case 0:
                zn znVar = this.f41773b;
                znVar.k8(new sh(znVar, this.f41774c, this.d, this.f41775e, this.f41776f, this.h, this.f41777n, this.f41778r, this.f41779s, this.v, 1));
                return;
            default:
                zn znVar2 = this.f41773b;
                if (this.f41774c == znVar2.f44810fc) {
                    znVar2.f44833hc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        znVar2.f44894mc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.f41775e.text)) {
                        MessagesController.showCantOpenAlert(znVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        znVar2.f44846ic = 0;
                        znVar2.f44858jc = false;
                        znVar2.f45023x0.f1();
                        return;
                    }
                    znVar2.Ca(znVar2.f44882lc, znVar2.f44894mc, this.f41776f, this.h, this.f41777n, this.f41778r, this.f41779s, this.v);
                    return;
                }
                return;
        }
    }
}
