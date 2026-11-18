package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yg implements Runnable {
    public final int f54141a;
    public final bn f54142b;
    public final int f54143c;
    public final TLObject d;
    public final TLRPC.TL_error f54144e;
    public final int f54145f;
    public final org.telegram.messenger.fj h;
    public final TLRPC.TL_messages_getDiscussionMessage f54146n;
    public final TLRPC.Chat f54147r;
    public final int f54148s;
    public final org.telegram.messenger.fj f54149w;

    public yg(bn bnVar, int i7, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.messenger.fj fjVar, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i11, org.telegram.messenger.fj fjVar2, int i12) {
        this.f54141a = i12;
        this.f54142b = bnVar;
        this.f54143c = i7;
        this.d = tLObject;
        this.f54144e = tL_error;
        this.f54145f = i10;
        this.h = fjVar;
        this.f54146n = tL_messages_getDiscussionMessage;
        this.f54147r = chat;
        this.f54148s = i11;
        this.f54149w = fjVar2;
    }

    @Override
    public final void run() {
        switch (this.f54141a) {
            case 0:
                bn bnVar = this.f54142b;
                bnVar.y8(new yg(bnVar, this.f54143c, this.d, this.f54144e, this.f54145f, this.h, this.f54146n, this.f54147r, this.f54148s, this.f54149w, 1));
                return;
            default:
                bn bnVar2 = this.f54142b;
                if (this.f54143c == bnVar2.Mc) {
                    bnVar2.Oc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        bnVar2.Tc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.f54144e.text)) {
                        org.telegram.messenger.mp.d5(org.telegram.messenger.gd.M0(2131752434, null), bnVar2);
                        bnVar2.Pc = 0;
                        bnVar2.Qc = false;
                        bnVar2.A0.g1();
                        return;
                    }
                    bnVar2.ab(bnVar2.Sc, bnVar2.Tc, this.f54145f, this.h, this.f54146n, this.f54147r, this.f54148s, this.f54149w);
                    return;
                }
                return;
        }
    }
}
