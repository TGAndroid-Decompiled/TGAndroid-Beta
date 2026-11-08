package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class wl implements Runnable {
    public final int f51463a;
    public final lm f51464b;
    public final TLRPC.Chat f51465c;

    public wl(lm lmVar, TLRPC.Chat chat, int i7) {
        this.f51463a = i7;
        this.f51464b = lmVar;
        this.f51465c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i7 = this.f51463a;
        TLRPC.Chat chat = this.f51465c;
        lm lmVar = this.f51464b;
        switch (i7) {
            case 0:
                lmVar.m(chat);
                return;
            case 1:
                lmVar.a(chat);
                return;
            case 2:
                lmVar.f47557a.Ka(chat);
                return;
            default:
                org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(lmVar.f47557a);
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
                a02.Q(2131623989, 36, org.telegram.messenger.id.a0(null, null, 2131742839, str)).k(true);
                return;
        }
    }
}
