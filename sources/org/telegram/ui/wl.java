package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class wl implements Runnable {
    public final int f52928a;
    public final lm f52929b;
    public final TLRPC.Chat f52930c;

    public wl(lm lmVar, TLRPC.Chat chat, int i7) {
        this.f52928a = i7;
        this.f52929b = lmVar;
        this.f52930c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i7 = this.f52928a;
        TLRPC.Chat chat = this.f52930c;
        lm lmVar = this.f52929b;
        switch (i7) {
            case 0:
                lmVar.n(chat);
                return;
            case 1:
                lmVar.a(chat);
                return;
            case 2:
                lmVar.f49005a.Na(chat);
                return;
            default:
                org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(lmVar.f49005a);
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
                a02.Q(2131623990, 36, org.telegram.messenger.hd.a0(null, null, 2131742836, str)).k(true);
                return;
        }
    }
}
