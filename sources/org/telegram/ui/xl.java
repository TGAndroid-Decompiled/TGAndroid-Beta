package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class xl implements Runnable {
    public final int f53894a;
    public final mm f53895b;
    public final TLRPC.Chat f53896c;

    public xl(mm mmVar, TLRPC.Chat chat, int i7) {
        this.f53894a = i7;
        this.f53895b = mmVar;
        this.f53896c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i7 = this.f53894a;
        TLRPC.Chat chat = this.f53896c;
        mm mmVar = this.f53895b;
        switch (i7) {
            case 0:
                mmVar.n(chat);
                return;
            case 1:
                mmVar.a(chat);
                return;
            case 2:
                mmVar.f49937a.Na(chat);
                return;
            default:
                org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(mmVar.f49937a);
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
                b02.Q(2131623990, 36, org.telegram.messenger.gd.a0(null, null, 2131742572, str)).k(true);
                return;
        }
    }
}
