package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class xl implements Runnable {
    public final int f53992a;
    public final mm f53993b;
    public final TLRPC.Chat f53994c;

    public xl(mm mmVar, TLRPC.Chat chat, int i7) {
        this.f53992a = i7;
        this.f53993b = mmVar;
        this.f53994c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i7 = this.f53992a;
        TLRPC.Chat chat = this.f53994c;
        mm mmVar = this.f53993b;
        switch (i7) {
            case 0:
                mmVar.l(chat);
                return;
            case 1:
                mmVar.a(chat);
                return;
            case 2:
                mmVar.f50079a.Na(chat);
                return;
            default:
                org.telegram.ui.Components.kc b02 = org.telegram.ui.Components.kc.b0(mmVar.f50079a);
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
                b02.Q(2131623990, 36, org.telegram.messenger.gd.a0(null, null, 2131742565, str)).k(true);
                return;
        }
    }
}
