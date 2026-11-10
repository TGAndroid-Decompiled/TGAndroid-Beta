package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class yl implements Runnable {
    public final int f52063a;
    public final nm f52064b;
    public final TLRPC.Chat f52065c;

    public yl(nm nmVar, TLRPC.Chat chat, int i7) {
        this.f52063a = i7;
        this.f52064b = nmVar;
        this.f52065c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i7 = this.f52063a;
        TLRPC.Chat chat = this.f52065c;
        nm nmVar = this.f52064b;
        switch (i7) {
            case 0:
                nmVar.m(chat);
                return;
            case 1:
                nmVar.a(chat);
                return;
            case 2:
                nmVar.f48227a.Ma(chat);
                return;
            default:
                org.telegram.ui.Components.gc a02 = org.telegram.ui.Components.gc.a0(nmVar.f48227a);
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
                a02.Q(2131623989, 36, org.telegram.messenger.id.a0(null, null, 2131742836, str)).k(true);
                return;
        }
    }
}
