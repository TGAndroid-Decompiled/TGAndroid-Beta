package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yg implements Runnable {
    public final int f54367a;
    public final bn f54368b;
    public final int f54369c;
    public final TLObject d;
    public final TLRPC.TL_error f54370e;
    public final int f54371f;
    public final org.telegram.messenger.fj h;
    public final TLRPC.TL_messages_getDiscussionMessage f54372n;
    public final TLRPC.Chat f54373r;
    public final int f54374s;
    public final org.telegram.messenger.fj f54375w;

    public yg(bn bnVar, int i7, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.messenger.fj fjVar, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i11, org.telegram.messenger.fj fjVar2, int i12) {
        this.f54367a = i12;
        this.f54368b = bnVar;
        this.f54369c = i7;
        this.d = tLObject;
        this.f54370e = tL_error;
        this.f54371f = i10;
        this.h = fjVar;
        this.f54372n = tL_messages_getDiscussionMessage;
        this.f54373r = chat;
        this.f54374s = i11;
        this.f54375w = fjVar2;
    }

    @Override
    public final void run() {
        switch (this.f54367a) {
            case 0:
                bn bnVar = this.f54368b;
                bnVar.y8(new yg(bnVar, this.f54369c, this.d, this.f54370e, this.f54371f, this.h, this.f54372n, this.f54373r, this.f54374s, this.f54375w, 1));
                return;
            default:
                bn bnVar2 = this.f54368b;
                if (this.f54369c == bnVar2.Mc) {
                    bnVar2.Oc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        bnVar2.Tc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.f54370e.text)) {
                        org.telegram.messenger.mp.d5(org.telegram.messenger.gd.N0(2131752433, null), bnVar2);
                        bnVar2.Pc = 0;
                        bnVar2.Qc = false;
                        bnVar2.A0.g1();
                        return;
                    }
                    bnVar2.ab(bnVar2.Sc, bnVar2.Tc, this.f54371f, this.h, this.f54372n, this.f54373r, this.f54374s, this.f54375w);
                    return;
                }
                return;
        }
    }
}
