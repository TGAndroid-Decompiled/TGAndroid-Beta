package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yg implements Runnable {
    public final int f54181a;
    public final bn f54182b;
    public final int f54183c;
    public final TLObject d;
    public final TLRPC.TL_error f54184e;
    public final int f54185f;
    public final org.telegram.messenger.fj h;
    public final TLRPC.TL_messages_getDiscussionMessage f54186n;
    public final TLRPC.Chat f54187r;
    public final int f54188s;
    public final org.telegram.messenger.fj f54189w;

    public yg(bn bnVar, int i7, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.messenger.fj fjVar, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i11, org.telegram.messenger.fj fjVar2, int i12) {
        this.f54181a = i12;
        this.f54182b = bnVar;
        this.f54183c = i7;
        this.d = tLObject;
        this.f54184e = tL_error;
        this.f54185f = i10;
        this.h = fjVar;
        this.f54186n = tL_messages_getDiscussionMessage;
        this.f54187r = chat;
        this.f54188s = i11;
        this.f54189w = fjVar2;
    }

    @Override
    public final void run() {
        switch (this.f54181a) {
            case 0:
                bn bnVar = this.f54182b;
                bnVar.y8(new yg(bnVar, this.f54183c, this.d, this.f54184e, this.f54185f, this.h, this.f54186n, this.f54187r, this.f54188s, this.f54189w, 1));
                return;
            default:
                bn bnVar2 = this.f54182b;
                if (this.f54183c == bnVar2.Mc) {
                    bnVar2.Oc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        bnVar2.Tc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.f54184e.text)) {
                        org.telegram.messenger.mp.d5(org.telegram.messenger.gd.N0(2131752433, null), bnVar2);
                        bnVar2.Pc = 0;
                        bnVar2.Qc = false;
                        bnVar2.A0.g1();
                        return;
                    }
                    bnVar2.ab(bnVar2.Sc, bnVar2.Tc, this.f54185f, this.h, this.f54186n, this.f54187r, this.f54188s, this.f54189w);
                    return;
                }
                return;
        }
    }
}
