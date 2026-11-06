package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class wl implements Runnable {
    public final int f51451a;
    public final lm f51452b;
    public final TLRPC.Chat f51453c;

    public wl(lm lmVar, TLRPC.Chat chat, int i7) {
        this.f51451a = i7;
        this.f51452b = lmVar;
        this.f51453c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i7 = this.f51451a;
        TLRPC.Chat chat = this.f51453c;
        lm lmVar = this.f51452b;
        switch (i7) {
            case 0:
                lmVar.m(chat);
                return;
            case 1:
                lmVar.a(chat);
                return;
            case 2:
                lmVar.f47534a.Ka(chat);
                return;
            default:
                org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(lmVar.f47534a);
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
