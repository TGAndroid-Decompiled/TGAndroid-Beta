package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yg implements Runnable {
    public final int f54185a;
    public final bn f54186b;
    public final int f54187c;
    public final TLObject d;
    public final TLRPC.TL_error f54188e;
    public final int f54189f;
    public final org.telegram.messenger.gj h;
    public final TLRPC.TL_messages_getDiscussionMessage f54190n;
    public final TLRPC.Chat f54191r;
    public final int f54192s;
    public final org.telegram.messenger.gj f54193w;

    public yg(bn bnVar, int i7, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.messenger.gj gjVar, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i11, org.telegram.messenger.gj gjVar2, int i12) {
        this.f54185a = i12;
        this.f54186b = bnVar;
        this.f54187c = i7;
        this.d = tLObject;
        this.f54188e = tL_error;
        this.f54189f = i10;
        this.h = gjVar;
        this.f54190n = tL_messages_getDiscussionMessage;
        this.f54191r = chat;
        this.f54192s = i11;
        this.f54193w = gjVar2;
    }

    @Override
    public final void run() {
        switch (this.f54185a) {
            case 0:
                bn bnVar = this.f54186b;
                bnVar.y8(new yg(bnVar, this.f54187c, this.d, this.f54188e, this.f54189f, this.h, this.f54190n, this.f54191r, this.f54192s, this.f54193w, 1));
                return;
            default:
                bn bnVar2 = this.f54186b;
                if (this.f54187c == bnVar2.Mc) {
                    bnVar2.Oc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        bnVar2.Tc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.f54188e.text)) {
                        org.telegram.messenger.np.d5(org.telegram.messenger.hd.N0(2131752433, null), bnVar2);
                        bnVar2.Pc = 0;
                        bnVar2.Qc = false;
                        bnVar2.A0.g1();
                        return;
                    }
                    bnVar2.ab(bnVar2.Sc, bnVar2.Tc, this.f54189f, this.h, this.f54190n, this.f54191r, this.f54192s, this.f54193w);
                    return;
                }
                return;
        }
    }
}
