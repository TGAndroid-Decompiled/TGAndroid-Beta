package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yg implements Runnable {
    public final int f54193a;
    public final bn f54194b;
    public final int f54195c;
    public final TLObject d;
    public final TLRPC.TL_error f54196e;
    public final int f54197f;
    public final org.telegram.messenger.fj h;
    public final TLRPC.TL_messages_getDiscussionMessage f54198n;
    public final TLRPC.Chat f54199r;
    public final int f54200s;
    public final org.telegram.messenger.fj f54201w;

    public yg(bn bnVar, int i7, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.messenger.fj fjVar, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i11, org.telegram.messenger.fj fjVar2, int i12) {
        this.f54193a = i12;
        this.f54194b = bnVar;
        this.f54195c = i7;
        this.d = tLObject;
        this.f54196e = tL_error;
        this.f54197f = i10;
        this.h = fjVar;
        this.f54198n = tL_messages_getDiscussionMessage;
        this.f54199r = chat;
        this.f54200s = i11;
        this.f54201w = fjVar2;
    }

    @Override
    public final void run() {
        switch (this.f54193a) {
            case 0:
                bn bnVar = this.f54194b;
                bnVar.y8(new yg(bnVar, this.f54195c, this.d, this.f54196e, this.f54197f, this.h, this.f54198n, this.f54199r, this.f54200s, this.f54201w, 1));
                return;
            default:
                bn bnVar2 = this.f54194b;
                if (this.f54195c == bnVar2.Mc) {
                    bnVar2.Oc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        bnVar2.Tc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.f54196e.text)) {
                        org.telegram.messenger.mp.d5(org.telegram.messenger.gd.M0(2131752434, null), bnVar2);
                        bnVar2.Pc = 0;
                        bnVar2.Qc = false;
                        bnVar2.A0.g1();
                        return;
                    }
                    bnVar2.ab(bnVar2.Sc, bnVar2.Tc, this.f54197f, this.h, this.f54198n, this.f54199r, this.f54200s, this.f54201w);
                    return;
                }
                return;
        }
    }
}
