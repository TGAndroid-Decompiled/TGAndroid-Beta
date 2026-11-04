package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tg implements Runnable {
    public final int f49792a;
    public final wm f49793b;
    public final int f49794c;
    public final TLObject d;
    public final TLRPC.TL_error f49795e;
    public final int f49796f;
    public final org.telegram.messenger.zi h;
    public final TLRPC.TL_messages_getDiscussionMessage f49797n;
    public final TLRPC.Chat f49798r;
    public final int f49799s;
    public final org.telegram.messenger.zi f49800w;

    public tg(wm wmVar, int i3, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.messenger.zi ziVar, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i11, org.telegram.messenger.zi ziVar2, int i12) {
        this.f49792a = i12;
        this.f49793b = wmVar;
        this.f49794c = i3;
        this.d = tLObject;
        this.f49795e = tL_error;
        this.f49796f = i10;
        this.h = ziVar;
        this.f49797n = tL_messages_getDiscussionMessage;
        this.f49798r = chat;
        this.f49799s = i11;
        this.f49800w = ziVar2;
    }

    @Override
    public final void run() {
        switch (this.f49792a) {
            case 0:
                wm wmVar = this.f49793b;
                wmVar.w8(new tg(wmVar, this.f49794c, this.d, this.f49795e, this.f49796f, this.h, this.f49797n, this.f49798r, this.f49799s, this.f49800w, 1));
                return;
            default:
                wm wmVar2 = this.f49793b;
                if (this.f49794c == wmVar2.Jc) {
                    wmVar2.Lc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        wmVar2.Qc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.f49795e.text)) {
                        org.telegram.messenger.hp.R4(org.telegram.messenger.bd.M0(2131752445, null), wmVar2);
                        wmVar2.Mc = 0;
                        wmVar2.Nc = false;
                        wmVar2.A0.g1();
                        return;
                    }
                    wmVar2.Xa(wmVar2.Pc, wmVar2.Qc, this.f49796f, this.h, this.f49797n, this.f49798r, this.f49799s, this.f49800w);
                    return;
                }
                return;
        }
    }
}
