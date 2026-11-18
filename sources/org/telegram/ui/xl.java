package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class xl implements Runnable {
    public final int f53877a;
    public final mm f53878b;
    public final TLRPC.Chat f53879c;

    public xl(mm mmVar, TLRPC.Chat chat, int i7) {
        this.f53877a = i7;
        this.f53878b = mmVar;
        this.f53879c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i7 = this.f53877a;
        TLRPC.Chat chat = this.f53879c;
        mm mmVar = this.f53878b;
        switch (i7) {
            case 0:
                mmVar.n(chat);
                return;
            case 1:
                mmVar.a(chat);
                return;
            case 2:
                mmVar.f49922a.Na(chat);
                return;
            default:
                org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(mmVar.f49922a);
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
