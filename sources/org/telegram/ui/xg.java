package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xg implements Runnable {
    public final int f53225a;
    public final an f53226b;
    public final int f53227c;
    public final TLObject d;
    public final TLRPC.TL_error f53228e;
    public final int f53229f;
    public final org.telegram.messenger.gj h;
    public final TLRPC.TL_messages_getDiscussionMessage f53230n;
    public final TLRPC.Chat f53231r;
    public final int f53232s;
    public final org.telegram.messenger.gj f53233w;

    public xg(an anVar, int i7, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.messenger.gj gjVar, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i11, org.telegram.messenger.gj gjVar2, int i12) {
        this.f53225a = i12;
        this.f53226b = anVar;
        this.f53227c = i7;
        this.d = tLObject;
        this.f53228e = tL_error;
        this.f53229f = i10;
        this.h = gjVar;
        this.f53230n = tL_messages_getDiscussionMessage;
        this.f53231r = chat;
        this.f53232s = i11;
        this.f53233w = gjVar2;
    }

    @Override
    public final void run() {
        switch (this.f53225a) {
            case 0:
                an anVar = this.f53226b;
                anVar.y8(new xg(anVar, this.f53227c, this.d, this.f53228e, this.f53229f, this.h, this.f53230n, this.f53231r, this.f53232s, this.f53233w, 1));
                return;
            default:
                an anVar2 = this.f53226b;
                if (this.f53227c == anVar2.Lc) {
                    anVar2.Nc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        anVar2.Sc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.f53228e.text)) {
                        org.telegram.messenger.np.S4(org.telegram.messenger.hd.M0(2131752445, null), anVar2);
                        anVar2.Oc = 0;
                        anVar2.Pc = false;
                        anVar2.A0.g1();
                        return;
                    }
                    anVar2.ab(anVar2.Rc, anVar2.Sc, this.f53229f, this.h, this.f53230n, this.f53231r, this.f53232s, this.f53233w);
                    return;
                }
                return;
        }
    }
}
