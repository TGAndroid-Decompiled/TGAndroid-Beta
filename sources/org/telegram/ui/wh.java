package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wh implements Runnable {
    public final int f41286a;
    public final fo f41287b;
    public final int f41288c;
    public final TLObject d;
    public final TLRPC.TL_error e;
    public final int f41289f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f41290n;
    public final TLRPC.Chat f41291r;
    public final int f41292s;
    public final MessageObject v;

    public wh(fo foVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f41286a = i13;
        this.f41287b = foVar;
        this.f41288c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f41289f = i11;
        this.h = messageObject;
        this.f41290n = tL_messages_getDiscussionMessage;
        this.f41291r = chat;
        this.f41292s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f41286a) {
            case 0:
                fo foVar = this.f41287b;
                foVar.k8(new wh(foVar, this.f41288c, this.d, this.e, this.f41289f, this.h, this.f41290n, this.f41291r, this.f41292s, this.v, 1));
                return;
            default:
                fo foVar2 = this.f41287b;
                if (this.f41288c == foVar2.fc) {
                    foVar2.hc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        foVar2.f35732mc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                        MessagesController.showCantOpenAlert(foVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        foVar2.f35683ic = 0;
                        foVar2.f35696jc = false;
                        foVar2.f35861x0.f1();
                        return;
                    }
                    foVar2.Ca(foVar2.f35720lc, foVar2.f35732mc, this.f41289f, this.h, this.f41290n, this.f41291r, this.f41292s, this.v);
                    return;
                }
                return;
        }
    }
}
