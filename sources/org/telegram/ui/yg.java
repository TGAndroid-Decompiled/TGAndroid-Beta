package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yg implements Runnable {
    public final int f54161a;
    public final bn f54162b;
    public final int f54163c;
    public final TLObject d;
    public final TLRPC.TL_error f54164e;
    public final int f54165f;
    public final org.telegram.messenger.gj h;
    public final TLRPC.TL_messages_getDiscussionMessage f54166n;
    public final TLRPC.Chat f54167r;
    public final int f54168s;
    public final org.telegram.messenger.gj f54169w;

    public yg(bn bnVar, int i7, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.messenger.gj gjVar, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i11, org.telegram.messenger.gj gjVar2, int i12) {
        this.f54161a = i12;
        this.f54162b = bnVar;
        this.f54163c = i7;
        this.d = tLObject;
        this.f54164e = tL_error;
        this.f54165f = i10;
        this.h = gjVar;
        this.f54166n = tL_messages_getDiscussionMessage;
        this.f54167r = chat;
        this.f54168s = i11;
        this.f54169w = gjVar2;
    }

    @Override
    public final void run() {
        switch (this.f54161a) {
            case 0:
                bn bnVar = this.f54162b;
                bnVar.y8(new yg(bnVar, this.f54163c, this.d, this.f54164e, this.f54165f, this.h, this.f54166n, this.f54167r, this.f54168s, this.f54169w, 1));
                return;
            default:
                bn bnVar2 = this.f54162b;
                if (this.f54163c == bnVar2.Mc) {
                    bnVar2.Oc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        bnVar2.Tc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.f54164e.text)) {
                        org.telegram.messenger.np.d5(org.telegram.messenger.hd.N0(2131752433, null), bnVar2);
                        bnVar2.Pc = 0;
                        bnVar2.Qc = false;
                        bnVar2.A0.g1();
                        return;
                    }
                    bnVar2.ab(bnVar2.Sc, bnVar2.Tc, this.f54165f, this.h, this.f54166n, this.f54167r, this.f54168s, this.f54169w);
                    return;
                }
                return;
        }
    }
}
