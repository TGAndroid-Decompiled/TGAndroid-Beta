package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xg implements Runnable {
    public final int f53226a;
    public final an f53227b;
    public final int f53228c;
    public final TLObject d;
    public final TLRPC.TL_error f53229e;
    public final int f53230f;
    public final org.telegram.messenger.gj h;
    public final TLRPC.TL_messages_getDiscussionMessage f53231n;
    public final TLRPC.Chat f53232r;
    public final int f53233s;
    public final org.telegram.messenger.gj f53234w;

    public xg(an anVar, int i7, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.messenger.gj gjVar, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i11, org.telegram.messenger.gj gjVar2, int i12) {
        this.f53226a = i12;
        this.f53227b = anVar;
        this.f53228c = i7;
        this.d = tLObject;
        this.f53229e = tL_error;
        this.f53230f = i10;
        this.h = gjVar;
        this.f53231n = tL_messages_getDiscussionMessage;
        this.f53232r = chat;
        this.f53233s = i11;
        this.f53234w = gjVar2;
    }

    @Override
    public final void run() {
        switch (this.f53226a) {
            case 0:
                an anVar = this.f53227b;
                anVar.y8(new xg(anVar, this.f53228c, this.d, this.f53229e, this.f53230f, this.h, this.f53231n, this.f53232r, this.f53233s, this.f53234w, 1));
                return;
            default:
                an anVar2 = this.f53227b;
                if (this.f53228c == anVar2.Lc) {
                    anVar2.Nc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        anVar2.Sc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.f53229e.text)) {
                        org.telegram.messenger.np.S4(org.telegram.messenger.hd.M0(2131752445, null), anVar2);
                        anVar2.Oc = 0;
                        anVar2.Pc = false;
                        anVar2.A0.g1();
                        return;
                    }
                    anVar2.ab(anVar2.Rc, anVar2.Sc, this.f53230f, this.h, this.f53231n, this.f53232r, this.f53233s, this.f53234w);
                    return;
                }
                return;
        }
    }
}
