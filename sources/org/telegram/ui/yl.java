package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class yl implements Runnable {
    public final int f52139a;
    public final nm f52140b;
    public final TLRPC.Chat f52141c;

    public yl(nm nmVar, TLRPC.Chat chat, int i7) {
        this.f52139a = i7;
        this.f52140b = nmVar;
        this.f52141c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i7 = this.f52139a;
        TLRPC.Chat chat = this.f52141c;
        nm nmVar = this.f52140b;
        switch (i7) {
            case 0:
                nmVar.m(chat);
                return;
            case 1:
                nmVar.a(chat);
                return;
            case 2:
                nmVar.f48207a.Ma(chat);
                return;
            default:
                org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(nmVar.f48207a);
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
