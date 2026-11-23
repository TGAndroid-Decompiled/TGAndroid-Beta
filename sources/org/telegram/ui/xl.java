package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class xl implements Runnable {
    public final int f53898a;
    public final mm f53899b;
    public final TLRPC.Chat f53900c;

    public xl(mm mmVar, TLRPC.Chat chat, int i7) {
        this.f53898a = i7;
        this.f53899b = mmVar;
        this.f53900c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i7 = this.f53898a;
        TLRPC.Chat chat = this.f53900c;
        mm mmVar = this.f53899b;
        switch (i7) {
            case 0:
                mmVar.n(chat);
                return;
            case 1:
                mmVar.a(chat);
                return;
            case 2:
                mmVar.f49941a.Na(chat);
                return;
            default:
                org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(mmVar.f49941a);
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
                b02.Q(2131623990, 36, org.telegram.messenger.hd.a0(null, null, 2131742570, str)).k(true);
                return;
        }
    }
}
