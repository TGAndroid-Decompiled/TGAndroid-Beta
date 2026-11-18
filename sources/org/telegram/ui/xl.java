package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class xl implements Runnable {
    public final int f53845a;
    public final mm f53846b;
    public final TLRPC.Chat f53847c;

    public xl(mm mmVar, TLRPC.Chat chat, int i7) {
        this.f53845a = i7;
        this.f53846b = mmVar;
        this.f53847c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i7 = this.f53845a;
        TLRPC.Chat chat = this.f53847c;
        mm mmVar = this.f53846b;
        switch (i7) {
            case 0:
                mmVar.n(chat);
                return;
            case 1:
                mmVar.a(chat);
                return;
            case 2:
                mmVar.f49896a.Na(chat);
                return;
            default:
                org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(mmVar.f49896a);
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
                b02.Q(2131623990, 36, org.telegram.messenger.gd.a0(null, null, 2131742578, str)).k(true);
                return;
        }
    }
}
