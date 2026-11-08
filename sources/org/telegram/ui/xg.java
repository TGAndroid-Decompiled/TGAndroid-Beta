package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xg implements Runnable {
    public final int f51852a;
    public final an f51853b;
    public final int f51854c;
    public final TLObject d;
    public final TLRPC.TL_error f51855e;
    public final int f51856f;
    public final org.telegram.messenger.ij h;
    public final TLRPC.TL_messages_getDiscussionMessage f51857n;
    public final TLRPC.Chat f51858r;
    public final int f51859s;
    public final org.telegram.messenger.ij f51860w;

    public xg(an anVar, int i7, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.messenger.ij ijVar, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i11, org.telegram.messenger.ij ijVar2, int i12) {
        this.f51852a = i12;
        this.f51853b = anVar;
        this.f51854c = i7;
        this.d = tLObject;
        this.f51855e = tL_error;
        this.f51856f = i10;
        this.h = ijVar;
        this.f51857n = tL_messages_getDiscussionMessage;
        this.f51858r = chat;
        this.f51859s = i11;
        this.f51860w = ijVar2;
    }

    @Override
    public final void run() {
        switch (this.f51852a) {
            case 0:
                an anVar = this.f51853b;
                anVar.w8(new xg(anVar, this.f51854c, this.d, this.f51855e, this.f51856f, this.h, this.f51857n, this.f51858r, this.f51859s, this.f51860w, 1));
                return;
            default:
                an anVar2 = this.f51853b;
                if (this.f51854c == anVar2.Ic) {
                    anVar2.Kc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        anVar2.Pc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.f51855e.text)) {
                        org.telegram.messenger.qp.R4(org.telegram.messenger.id.M0(2131752445, null), anVar2);
                        anVar2.Lc = 0;
                        anVar2.Mc = false;
                        anVar2.f44043z0.g1();
                        return;
                    }
                    anVar2.Xa(anVar2.Oc, anVar2.Pc, this.f51856f, this.h, this.f51857n, this.f51858r, this.f51859s, this.f51860w);
                    return;
                }
                return;
        }
    }
}
