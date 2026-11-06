package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class wl implements Runnable {
    public final int f51458a;
    public final lm f51459b;
    public final TLRPC.Chat f51460c;

    public wl(lm lmVar, TLRPC.Chat chat, int i7) {
        this.f51458a = i7;
        this.f51459b = lmVar;
        this.f51460c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i7 = this.f51458a;
        TLRPC.Chat chat = this.f51460c;
        lm lmVar = this.f51459b;
        switch (i7) {
            case 0:
                lmVar.m(chat);
                return;
            case 1:
                lmVar.a(chat);
                return;
            case 2:
                lmVar.f47561a.Ka(chat);
                return;
            default:
                org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(lmVar.f47561a);
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
                a02.Q(2131623989, 36, org.telegram.messenger.hd.a0(null, null, 2131742837, str)).k(true);
                return;
        }
    }
}
