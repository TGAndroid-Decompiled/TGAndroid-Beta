package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xg implements Runnable {
    public final int f51859a;
    public final an f51860b;
    public final int f51861c;
    public final TLObject d;
    public final TLRPC.TL_error f51862e;
    public final int f51863f;
    public final org.telegram.messenger.ij h;
    public final TLRPC.TL_messages_getDiscussionMessage f51864n;
    public final TLRPC.Chat f51865r;
    public final int f51866s;
    public final org.telegram.messenger.ij f51867w;

    public xg(an anVar, int i7, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.messenger.ij ijVar, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i11, org.telegram.messenger.ij ijVar2, int i12) {
        this.f51859a = i12;
        this.f51860b = anVar;
        this.f51861c = i7;
        this.d = tLObject;
        this.f51862e = tL_error;
        this.f51863f = i10;
        this.h = ijVar;
        this.f51864n = tL_messages_getDiscussionMessage;
        this.f51865r = chat;
        this.f51866s = i11;
        this.f51867w = ijVar2;
    }

    @Override
    public final void run() {
        switch (this.f51859a) {
            case 0:
                an anVar = this.f51860b;
                anVar.w8(new xg(anVar, this.f51861c, this.d, this.f51862e, this.f51863f, this.h, this.f51864n, this.f51865r, this.f51866s, this.f51867w, 1));
                return;
            default:
                an anVar2 = this.f51860b;
                if (this.f51861c == anVar2.Ic) {
                    anVar2.Kc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        anVar2.Pc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.f51862e.text)) {
                        org.telegram.messenger.qp.R4(org.telegram.messenger.hd.M0(2131752445, null), anVar2);
                        anVar2.Lc = 0;
                        anVar2.Mc = false;
                        anVar2.f44037z0.g1();
                        return;
                    }
                    anVar2.Xa(anVar2.Oc, anVar2.Pc, this.f51863f, this.h, this.f51864n, this.f51865r, this.f51866s, this.f51867w);
                    return;
                }
                return;
        }
    }
}
