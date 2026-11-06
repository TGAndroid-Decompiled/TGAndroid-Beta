package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xg implements Runnable {
    public final int f51844a;
    public final an f51845b;
    public final int f51846c;
    public final TLObject d;
    public final TLRPC.TL_error f51847e;
    public final int f51848f;
    public final org.telegram.messenger.ij h;
    public final TLRPC.TL_messages_getDiscussionMessage f51849n;
    public final TLRPC.Chat f51850r;
    public final int f51851s;
    public final org.telegram.messenger.ij f51852w;

    public xg(an anVar, int i7, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.messenger.ij ijVar, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i11, org.telegram.messenger.ij ijVar2, int i12) {
        this.f51844a = i12;
        this.f51845b = anVar;
        this.f51846c = i7;
        this.d = tLObject;
        this.f51847e = tL_error;
        this.f51848f = i10;
        this.h = ijVar;
        this.f51849n = tL_messages_getDiscussionMessage;
        this.f51850r = chat;
        this.f51851s = i11;
        this.f51852w = ijVar2;
    }

    @Override
    public final void run() {
        switch (this.f51844a) {
            case 0:
                an anVar = this.f51845b;
                anVar.w8(new xg(anVar, this.f51846c, this.d, this.f51847e, this.f51848f, this.h, this.f51849n, this.f51850r, this.f51851s, this.f51852w, 1));
                return;
            default:
                an anVar2 = this.f51845b;
                if (this.f51846c == anVar2.Ic) {
                    anVar2.Kc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        anVar2.Pc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.f51847e.text)) {
                        org.telegram.messenger.qp.R4(org.telegram.messenger.hd.M0(2131752445, null), anVar2);
                        anVar2.Lc = 0;
                        anVar2.Mc = false;
                        anVar2.f44013z0.g1();
                        return;
                    }
                    anVar2.Xa(anVar2.Oc, anVar2.Pc, this.f51848f, this.h, this.f51849n, this.f51850r, this.f51851s, this.f51852w);
                    return;
                }
                return;
        }
    }
}
