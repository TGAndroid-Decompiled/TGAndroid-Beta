package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class th implements Runnable {
    public final int f37781a;
    public final zn f37782b;
    public final int f37783c;
    public final TLObject d;
    public final TLRPC.TL_error e;
    public final int f37784f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f37785n;
    public final TLRPC.Chat f37786r;
    public final int f37787s;
    public final MessageObject v;

    public th(zn znVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f37781a = i13;
        this.f37782b = znVar;
        this.f37783c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f37784f = i11;
        this.h = messageObject;
        this.f37785n = tL_messages_getDiscussionMessage;
        this.f37786r = chat;
        this.f37787s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f37781a) {
            case 0:
                zn znVar = this.f37782b;
                znVar.h8(new th(znVar, this.f37783c, this.d, this.e, this.f37784f, this.h, this.f37785n, this.f37786r, this.f37787s, this.v, 1));
                return;
            default:
                zn znVar2 = this.f37782b;
                if (this.f37783c == znVar2.ec) {
                    znVar2.gc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        znVar2.f40411lc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                        MessagesController.showCantOpenAlert(znVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        znVar2.f40362hc = 0;
                        znVar2.f40375ic = false;
                        znVar2.f40551x0.g1();
                        return;
                    }
                    znVar2.ya(znVar2.f40400kc, znVar2.f40411lc, this.f37784f, this.h, this.f37785n, this.f37786r, this.f37787s, this.v);
                    return;
                }
                return;
        }
    }
}
