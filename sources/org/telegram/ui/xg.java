package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xg implements Runnable {
    public final int f51861a;
    public final an f51862b;
    public final int f51863c;
    public final TLObject d;
    public final TLRPC.TL_error f51864e;
    public final int f51865f;
    public final org.telegram.messenger.ij h;
    public final TLRPC.TL_messages_getDiscussionMessage f51866n;
    public final TLRPC.Chat f51867r;
    public final int f51868s;
    public final org.telegram.messenger.ij f51869w;

    public xg(an anVar, int i7, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.messenger.ij ijVar, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i11, org.telegram.messenger.ij ijVar2, int i12) {
        this.f51861a = i12;
        this.f51862b = anVar;
        this.f51863c = i7;
        this.d = tLObject;
        this.f51864e = tL_error;
        this.f51865f = i10;
        this.h = ijVar;
        this.f51866n = tL_messages_getDiscussionMessage;
        this.f51867r = chat;
        this.f51868s = i11;
        this.f51869w = ijVar2;
    }

    @Override
    public final void run() {
        switch (this.f51861a) {
            case 0:
                an anVar = this.f51862b;
                anVar.w8(new xg(anVar, this.f51863c, this.d, this.f51864e, this.f51865f, this.h, this.f51866n, this.f51867r, this.f51868s, this.f51869w, 1));
                return;
            default:
                an anVar2 = this.f51862b;
                if (this.f51863c == anVar2.Ic) {
                    anVar2.Kc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        anVar2.Pc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.f51864e.text)) {
                        org.telegram.messenger.qp.R4(org.telegram.messenger.hd.M0(2131752445, null), anVar2);
                        anVar2.Lc = 0;
                        anVar2.Mc = false;
                        anVar2.f44038z0.g1();
                        return;
                    }
                    anVar2.Xa(anVar2.Oc, anVar2.Pc, this.f51865f, this.h, this.f51866n, this.f51867r, this.f51868s, this.f51869w);
                    return;
                }
                return;
        }
    }
}
